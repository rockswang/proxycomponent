package com.roxstudio.utils;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;

@SuppressLint({ "SimpleDateFormat", "DefaultLocale" })
final public class Util {

	public static void runWithTimeCheck(Runnable task, int timeout, TimerTask taskBlockAction) {
		Timer timer = new Timer();
		timer.schedule(taskBlockAction, timeout);
		long tm = System.currentTimeMillis();
		task.run();
		if (System.currentTimeMillis() - tm < timeout) timer.cancel(); 
	}
	
	public static final <K, V> V mapGet(Map<K, V> map, K key, V fallback) {
		V v;
		return (v = map.get(key)) != null ? v : fallback;
	}

	@SafeVarargs
	public static final <K, V> void mapListAdd(Map<K, ArrayList<V>> map, K key, V... val) {
		ArrayList<V> l;
		if ((l = map.get(key)) == null) map.put(key, l = new ArrayList<V>());
		for (V v: val) l.add(v);
	}

	public static final <K, S, V> V mapMapGet(Map<K, HashMap<S, V>> map, K key, S subkey, V fallback) {
		HashMap<S, V> m;
		V ret;
		return (m = map.get(key)) != null && (ret = m.get(subkey)) != null ? ret : fallback;
	}

	public static final <K, S, V> void mapMapAdd(Map<K, HashMap<S, V>> map, K key, S subkey, V val) {
		HashMap<S, V> m;
		if ((m = map.get(key)) == null) map.put(key, m = new HashMap<S, V>());
		m.put(subkey, val);
	}
	
	public static final <T> boolean empty(Collection<T> c) {
		return c == null || c.size() == 0;
	}

	public static final <K, V> boolean empty(Map<K, V> m) {
		return m == null || m.size() == 0;
	}

	public static final boolean empty(String s) {
		return s == null || s.length() == 0;
	}

    public static final String ifEmpty(String s, String fallback) {
    	return Util.empty(s) ? fallback : s;
    }
    
	public static final <K, V> Map<K, V> safeMap(Map<K, V> map) {
		return map != null ? map : new HashMap<K, V>(0);
	}
	
	public static final <T> Iterable<T> safeIter(Iterable<T> iter) {
		return iter != null ? iter : new ArrayList<T>(0);
	}

	@SuppressWarnings("unchecked")
	public static final <T> T[] safeArray(T[] array, Class<T> componentType) {
		return array != null ? array : (T[]) Array.newInstance(componentType, 0);
	}

	public static final int[] safeArray(int[] array) {
		return array != null ? array : new int[0];
	}
	
	public static final long[] safeArray(long[] array) {
		return array != null ? array : new long[0];
	}
	
	public static final short[] safeArray(short[] array) {
		return array != null ? array : new short[0];
	}
	
	public static final byte[] safeArray(byte[] array) {
		return array != null ? array : new byte[0];
	}
	
	public static final char[] safeArray(char[] array) {
		return array != null ? array : new char[0];
	}

	public static final boolean[] safeArray(boolean[] array) {
		return array != null ? array : new boolean[0];
	}

	public static final float[] safeArray(float[] array) {
		return array != null ? array : new float[0];
	}

	public static final double[] safeArray(double[] array) {
		return array != null ? array : new double[0];
	}

	public static final <K, V> HashMap<K, V> safePut(HashMap<K, V> map, K k, V v) {
		if (map == null) map = new HashMap<K, V>();
		map.put(k, v);
		return map;
	}
	
	public static final <K, V> HashMap<K, V> newMap(Class<K> keyClass, Class<V> valClass, Object... keyValuePairs) {
		return (HashMap<K, V>) mapPut(new HashMap<K, V>(), keyValuePairs);
	}
	
	@SuppressWarnings("unchecked")
	public static final <K, V> Map<K, V> mapPut(Map<K, V> map, Object... keyValuePairs) {
		if ((keyValuePairs.length & 1) != 0) 
			throw new IllegalArgumentException("the number of keyValuePairs arguments must be odd");
		for (int i = 0, n = keyValuePairs.length; i < n; i += 2) {
			map.put((K) keyValuePairs[i], (V) keyValuePairs[i + 1]); 
		}
		return map;
	}
	
	@SafeVarargs
	public static final <T> ArrayList<T> newList(T... values) {
		return (ArrayList<T>) listAdd(new ArrayList<T>(values.length), values);
	}
	
	@SafeVarargs
	public static final <T> List<T> listAdd(List<T> list, T... values) {
		for (T v: values) list.add(v);
		return list;
	}
	
	@SuppressWarnings("unchecked")
	public static final <T> T[] arraySet(T[] array, Object... indexValuePairs) {
		if ((indexValuePairs.length & 1) != 0) 
			throw new IllegalArgumentException("the number of indexValuePairs arguments must be odd");
		for (int i = 0, n = indexValuePairs.length; i < n; i += 2) {
			array[(Integer) indexValuePairs[i]] = (T) indexValuePairs[i + 1];
		}
		return array;
	}
	
	public static final String zeroPad(Number val, int len) {
		String s = val.toString();
		int l;
		if ((l = s.length()) < len) {
			StringBuilder buf = new StringBuilder();
			for (int i = len - l; --i >= 0; buf.append('0'));
			return buf.append(s).toString();
		}
		return s;
	}

	public static final String bytesToString(byte[] bb) {
		try {
			int start = bb.length >= 3 && bb[0] == 0xEF && bb[1] == 0xBB && bb[2] == 0xBF ? 3 : 0;
			return new String(bb, start, bb.length - start, "UTF-8");
		} catch (UnsupportedEncodingException e) { }
		return null;
	}
	
	public static final byte[] stringToBytes(String s) {
		try {
			return s.getBytes("UTF-8");
		} catch (UnsupportedEncodingException e) { }
		return null;
	}

	public static final byte[] readStream(InputStream is) {
		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			BufferedInputStream bis = new BufferedInputStream(is);
			byte[] bb = new byte[100000];
			for (int len = bis.read(bb); len > 0; len = bis.read(bb)) {
				bos.write(bb, 0, len);
			}
			return bos.toByteArray();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static final String readText(InputStream is) {
		return bytesToString(readStream(is));
	}

	public static final String loadAssetsText(Context context, String name) {
		try {
			InputStream is = context.getResources().getAssets().open(name);
			String s = readText(is);
			is.close();
			return s;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static final String loadLocalText(String path) {
		try {
			InputStream is = new FileInputStream(path);
			String s = readText(is);
			is.close();
			return s;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static final boolean assetExist(Context context, String name) {
		boolean exists = false;
		try {
			InputStream is = context.getResources().getAssets().open(name);
			exists = is != null;
			is.close();
		} catch (IOException e) {
//			e.printStackTrace();
		}
		return exists;
	}
	
	public static final void writeToFile(byte[] bb, File output) {
		try {
			output.getParentFile().mkdirs();
			OutputStream os = new FileOutputStream(output);
			os.write(bb);
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static final void writeToFile(String text, File output) {
		writeToFile(stringToBytes(text), output);
	}
	
    public static final int dp2px(Context context, float dp) {
        DisplayMetrics dm = context.getResources().getDisplayMetrics();
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, dm);
    }
    
    public static final int sp2px(Context context, float sp) {
        DisplayMetrics dm = context.getResources().getDisplayMetrics();
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, sp, dm);
    }
    
    public static final float px2dp(Context context, float px) {
    	final float scale = context.getResources().getDisplayMetrics().density; 
        return px / scale;     
    }
    
    private static final HashMap<String, SimpleDateFormat> formatters = new HashMap<String, SimpleDateFormat>();
    
	public static final Date parseDate(String pattern, String dateStr) {
    	SimpleDateFormat fmt = formatters.get("pattern");
    	if (fmt == null) formatters.put(pattern, fmt = new SimpleDateFormat(pattern));
    	try {
    		return fmt.parse(dateStr);
    	} catch (Exception ex) {
    		throw new IllegalArgumentException("parseDate: pattern=" + pattern + ",dateStr=" + dateStr);
    	}
    }
    
	public static final String formatDate(String pattern, Date date) {
    	SimpleDateFormat fmt = formatters.get("pattern");
    	if (fmt == null) formatters.put(pattern, fmt = new SimpleDateFormat(pattern));
    	return fmt.format(date);
    }
    
	private static final char[] HEX = "0123456789ABCDEF".toCharArray();
	
	public static final String md5(String s, boolean upperCase) { 
		try { 
			MessageDigest digest = MessageDigest.getInstance("MD5"); 
			digest.reset(); 
			digest.update(s.getBytes("UTF-8")); 
			byte[] bb = digest.digest(); 
			StringBuilder out = new StringBuilder(); 
			for (byte b: bb) out.append(HEX[(b & 0xF0) >>> 4]).append(HEX[b & 0x0F]);
			String result = out.toString();
			return upperCase ? result : result.toLowerCase();
		} catch (Exception e) { } // should never happen
		return null;
	}
	
	public static final String md5(String s) {
		return md5(s, true);
	}
	
	
	public static final String extract(String input, Pattern ptn, int groupId) {
		String[] groups = extract(input, ptn);
		return groups != null && groupId < groups.length ? groups[groupId] : null;
	}
	
	public static final String[] extract(String input, Pattern ptn) {
		Matcher mch = ptn.matcher(input);
		String[] ret = null;
		if (mch.find()) {
			ret = new String[mch.groupCount() + 1];
			for (int i = ret.length; --i >= 0; ret[i] = mch.group(i));
		}
		return ret;
	}
	
	private static final String[][] EMPTY_ARRAY = new String[0][0];
	
	public static final String[][] extractAll(String input, Pattern ptn) {
		Matcher mch = ptn.matcher(input);
		ArrayList<String[]> ret = new ArrayList<String[]>();
		while (mch.find()) {
			String[] match = new String[mch.groupCount() + 1];
			ret.add(match);
			for (int i = match.length; --i >= 0; match[i] = mch.group(i));
		}
		return ret.toArray(EMPTY_ARRAY);
	}
	
    private static final Pattern ptnSubst = Pattern.compile("\\$(\\{[a-zA-Z0-9\\._\\-]+\\}|[a-zA-Z0-9\\._\\-]+)");
    /**
     * Valid format: ${upay.goods_name} or $goods_price
     * @param src e.g.: "You're going to buy ${upay.goods_name} with $goods_price RMBs"
     * @param substitutions e.g.: { "upay.goods_name":"20 Diamonds", "goods_price":"20" }
     * @return
     */
    public static final String substitute(String src, Map<String, String> substitutions) {
    	int index = 0;
    	StringBuilder sb = new StringBuilder();
    	Matcher mch = ptnSubst.matcher(src);
    	while (mch.find()) {
    		sb.append(src, index, mch.start());
    		String key = mch.group(1);
    		if (key.startsWith("{")) key = key.substring(1, key.length() - 1);
    		String value = substitutions.get(key);
    		sb.append(value != null ? value : mch.group());
    		index = mch.end();
    	}
    	sb.append(src, index, src.length());
    	return sb.toString();
    }
    
    public static final void unzip(InputStream is, File outDir) {
        try {
            ZipInputStream zin = new ZipInputStream(is);
            ZipEntry ze = null;
            byte[] bb = new byte[200000];
            while ((ze = zin.getNextEntry()) != null) {
                if (ze.isDirectory()) {
                    continue; // not handling dir
                } else {
                    String filename = ze.getName();
                    FileOutputStream fout = new FileOutputStream(new File(outDir, filename));
                    for (int len = zin.read(bb); len > 0; len = zin.read(bb)) {
                        fout.write(bb, 0, len);
                    }
                    zin.closeEntry();
                    fout.close();
                }
            }
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
	private static final long START_DATE = Util.parseDate("yyyyMMdd", "20140101").getTime();
    private static final char[] TABLE = {
    	'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 
    	'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 
    	'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 
    	'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 
    	'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
    	'-', 
    	'_'
    };
    private static HashMap<Character, Integer> reverseTable = null;
    
    /**
     * sn format: yyMMddHHuuuurrrrqq
     * @param sn
     * @param digitOnly
     * @return
     */
    public static final String shortenSn(String sn, boolean digitOnly) {
    	long tradeDate = Util.parseDate("yyMMddHH", sn.substring(0, 8)).getTime();
    	long high = (tradeDate - START_DATE) / 360000L + Integer.parseInt(sn.substring(16, 18)); 
    	long low = Long.parseLong(sn.substring(8, 16));
    	long shorten = high * 100000000L + low;
    	if (shorten > 99999999999999L) {
    		throw new IllegalArgumentException("trade date must be in 2014-01-01 ~ 2024-12-30");
    	}
    	if (digitOnly) return Util.zeroPad(shorten, 14);
    	StringBuilder buf = new StringBuilder();
    	for (int i = 8; --i >= 0;) {
    		buf.append(TABLE[(int) (shorten & 0x3F)]);
    		shorten >>= 6;
    	}
    	return buf.reverse().toString();
    }
    
    public static final String unshorten(String shortSn, boolean digitOnly) {
    	if (digitOnly && shortSn.length() != 14 || !digitOnly && shortSn.length() != 8) {
    		throw new IllegalArgumentException("shortSn=" + shortSn + ",digitOnly=" + digitOnly);
    	}
    	if (reverseTable == null) {
    		HashMap<Character, Integer> rt = reverseTable = new HashMap<Character, Integer>();
    		for (int i = TABLE.length; --i >= 0; rt.put(TABLE[i], i));
    	}
    	long shorten = 0L;
    	if (digitOnly) {
    		shorten = Long.parseLong(shortSn);
    	} else {
    		for (int i = 0; i < 8; i++) {
    			shorten <<= 6;
    			shorten += reverseTable.get(shortSn.charAt(i));
    		}
    	}
    	long high = shorten / 100000000L;
    	String low = Util.zeroPad(shorten % 100000000L, 8);
    	String qq = Util.zeroPad(high % 10, 2);
    	String date = Util.formatDate("yyMMddHH", new Date(high / 10L * 3600000L + START_DATE));
    	return date + low + qq;
    }
    
	public static void deleteFile(File file) {
		if (file.isDirectory()) {
			for (File child: safeArray(file.listFiles(), File.class)) {
				deleteFile(child);
			}
		}
		file.delete();
	}

	public static final Class<?> getClass(String className, ClassLoader cl) {
		try {
			return (cl != null ? cl : Util.class.getClassLoader()).loadClass(className);
		} catch (ClassNotFoundException e) {
			return null;
		}
	}
	
	/**
	 * 通过反射调用类的构造方法来创建一个该类对象
	 * @param cls 类，不可为空
	 * @param signature 构造方法的参数签名，可为null，为null则根据实参数量来查找构造方法
	 * @param args
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static final <T> T createInstance(Class<T> cls, String signature, Object... args) {
		if (signature == null && args.length == 0) {
			try {
				return cls.newInstance();
			} catch (Exception ex) {
				throw new IllegalArgumentException(ex);
			}
		}
		return (T) invoke(null, cls, "<init>", signature, args);
	}
	
	public static final boolean hasField(Object thiz, Class<?> cls, String fieldName) {
		ArrayList<MemberInfo> found = getMembers(thiz != null ? thiz.getClass() : cls, fieldName);
		for (MemberInfo mi: safeIter(found)) {
			if (mi.numArgs == -1) return true;
		}
		return false;
	}
	
	public static final Object getField(Object thiz, Class<?> cls, String fieldName, Object fallback) {
		if (thiz == null && cls == null || fieldName == null) 
			throw new NullPointerException("inst=" + thiz + ",class=" + cls + ",field=" + fieldName);
		try {
			for (MemberInfo mi: safeIter(getMembers(thiz != null ? thiz.getClass() : cls, fieldName))) {
				if (-1 == mi.numArgs) return ((Field) mi.member).get(thiz);
			}
		} catch (Exception ex) { }
		return fallback;
	}
	
	public static final void setField(Object thiz, Class<?> cls, String fieldName, Object fieldValue) {
		if (thiz == null && cls == null || fieldName == null) 
			throw new NullPointerException("inst=" + thiz + ",class=" + cls + ",field=" + fieldName);
		for (MemberInfo mi: safeIter(getMembers(thiz != null ? thiz.getClass() : cls, fieldName))) {
			if (-1 == mi.numArgs) {
				try {
					((Field) mi.member).set(thiz, fieldValue);
				} catch (Exception ex) { }
				return;
			}
		}
	}
	
	public static final boolean hasMethod(Object thiz, Class<?> cls, String methodName, String signature) {
		if (thiz == null && cls == null || methodName == null) 
			throw new NullPointerException("inst=" + thiz + ",class=" + cls + ",method=" + methodName);
		for (MemberInfo mi: safeIter(getMembers(thiz != null ? thiz.getClass() : cls, methodName))) {
			if (mi.numArgs >= 0 && (signature == null || signature.equals(mi.signature))) return true;
		}
		return false;
	}
	
	public static final Object invokeSilent(Object thiz, Class<?> cls, String methodName, String signature, Object... args) {
		try {
			return invoke(thiz, cls, methodName, signature, args);
		} catch (Exception ex) {}
		return null;
	}
	
	/**
	 * 反射调用一个实例或静态方法
	 * @param thiz 对象实例，如调用静态方法，则必须为null
	 * @param cls 类，如thiz参数不为null则此参数忽略，直接使用该实例的类
	 * @param methodName 方法名
	 * @param signature 方法参数签名，如"ILjava.lang.String;"，若为null则本方法根据传入的实参数量查找方法；
	 *  如果存在多个参数数量相同的同名方法，则必须显式指定方法签名，本方法不会自动根据实参类型进行匹配查找
	 *  内部类格式如"Ljava.util.Map$Entry;"
	 * @param args 被调用方法的实参列表
	 * @return 被调用方法的返回值
	 */
	public static final Object invoke(Object thiz, Class<?> cls, String methodName, String signature, Object... args) {
		if (thiz == null && cls == null || methodName == null) 
			throw new NullPointerException("inst=" + thiz + ",class=" + cls + ",method=" + methodName);
		ArrayList<MemberInfo> found = getMembers(thiz != null ? thiz.getClass() : cls, methodName);
		try {
			Member m = null;
			if (found == null) { // do nothing
			} else if (signature == null) {
				int len = args.length;
				for (MemberInfo mi: found) {
					if (len == mi.numArgs) {
						m = mi.member;
						break;
					}
				}
			} else {
				signature = signature.replace('/', '.');
				for (MemberInfo mi: found) {
					if (signature.equals(mi.signature)) {
						m = mi.member;
						break;
					}
				}
			}
			if (m == null) {
				StringBuilder msg = new StringBuilder().append('"').append(methodName).append('"');
				if (signature == null) {
					msg.append(" with " + args.length + " parameter(s)");
				} else {
					msg.append(" with signature \"" + signature + "\"");
				}
				throw new NoSuchMethodException(msg.toString());
			}
			return m instanceof Method ? ((Method) m).invoke(thiz, args) : ((Constructor<?>) m).newInstance(args);
		} catch (Exception ex) {
			throw new IllegalArgumentException(ex);
		}
	}
	
	/**
	 * 清除传入类对应的内部缓存，仅用于使用新的ClassLoader重新载入类之后
	 * @param cls
	 */
	public static final void removeInvocationCache(Class<?> cls) {
		mapClassMembers.remove(cls);
	}
	
	@SuppressWarnings("rawtypes")
	private static final HashMap<Class, Character> primaryTypes = Util.newMap(
			Class.class, Character.class, 
			byte.class, 'B',
			char.class, 'C',
			double.class, 'D',
			float.class, 'F',
			int.class, 'I',
			long.class, 'J',
			short.class, 'S',
			void.class, 'V',
			boolean.class, 'Z');

	public static final String getSignature(Class<?>... types) {
		StringBuilder sb = new StringBuilder();
		for (Class<?> t: types) {
			while (t.isArray()) {
				sb.append('[');
				t = t.getComponentType();
			}
			Character c;
			if ((c = primaryTypes.get(t)) != null) {
				sb.append(c);
			} else {
				sb.append('L').append(t.getName()).append(';');
			}
		}
		return sb.toString();
	}
	
	private static final HashMap<Class<?>, HashMap<String, ArrayList<MemberInfo>>> mapClassMembers = new HashMap<Class<?>, HashMap<String, ArrayList<MemberInfo>>>();

	private static final ArrayList<MemberInfo> getMembers(Class<?> cls, String name) {
		if (!mapClassMembers.containsKey(cls)) {
			HashMap<String, ArrayList<MemberInfo>> map;
			mapClassMembers.put(cls, map = new HashMap<String, ArrayList<MemberInfo>>());
			if (cls.getConstructors() != null) {
				for (Constructor<?> c: cls.getConstructors()) {
					Class<?>[] ptypes = c.getParameterTypes();
					mapListAdd(map, "<init>", new MemberInfo(getSignature(ptypes), ptypes.length, c));
				}
			}
			if (cls.getMethods() != null) {
				for (Method m: cls.getMethods()) {
					Class<?>[] ptypes = m.getParameterTypes();
					mapListAdd(map, m.getName(), new MemberInfo(getSignature(ptypes), ptypes.length, m));
				}
			}
			if (cls.getFields() != null) {
				for (Field f: cls.getFields()) {
					mapListAdd(map, f.getName(), new MemberInfo(null, -1, f));
				}
			}
		}
		return mapMapGet(mapClassMembers, cls, name, null);
	}
	
	private static class MemberInfo {
		String signature; // null for field 
		int numArgs; // -1 for field
		Member member;
		MemberInfo(String sign, int num, Member member) {
			signature = sign;
			numArgs = num;
			this.member = member;
		}
	}
	
}
