package com.cellcom;

import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import android.app.Activity;
import android.app.ActivityGroup;
import android.app.ListActivity;
import android.app.TabActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;

import com.roxstudio.proxycomponent.Proxied;
import com.roxstudio.utils.Util;

/**
 * @author nwang
 * 
 *	android基本布局、组件等等操作！
 */
public class MainActivity extends Proxied<Activity> {
    /** Called when the activity is first created. */
	
	private Button frameLayout;
	private Button relativeLayout;
	private Button relativeAndLinear;
	private Button tableLayout;
	//选项卡按钮
	private Button tabWidget;
	private Button checkbox;
	private Button radionGroup;
	private Button spinner;
	private Button autoCompleteTextView;
	private Button datePicker;
	private Button progressBar;
	private Button ratingBar;
	private Button imageShow;
	private Button gridView;
	private Button tabDemo;
	private Button menu1;
	private Button menu2;
	private Button menu3;
	private Button bundle;
	private Button alertDialog;
	private Button notification;
	
	public static final ClassLoader getProxiedClassLoader(Context context) {
		Object ldr2 = context.getClassLoader();
		return (ClassLoader) ldr2;
	}
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        
//        genActivityCode(ListActivity.class);
        
        
        
        frameLayout=(Button)findViewById(R.id.frameLayout);
        relativeLayout=(Button)findViewById(R.id.relativeLayout);
        relativeAndLinear=(Button)findViewById(R.id.relativeAndLinear);
        tableLayout=(Button)findViewById(R.id.tableLayout);
        tabWidget=(Button)findViewById(R.id.tabWidget);
        checkbox=(Button)findViewById(R.id.checkbox);
        radionGroup=(Button)findViewById(R.id.radioGroup);
        spinner=(Button)findViewById(R.id.spinner);
        autoCompleteTextView=(Button)findViewById(R.id.autoCompleteTextView);
        datePicker=(Button)findViewById(R.id.datePicker);
        progressBar=(Button)findViewById(R.id.progressBar);
        ratingBar=(Button)findViewById(R.id.ratingBar);
        imageShow=(Button)findViewById(R.id.imageShow);
        gridView=(Button)findViewById(R.id.gridView);
        tabDemo=(Button)findViewById(R.id.tabDemo);
        menu1=(Button)findViewById(R.id.menu1);
        menu2=(Button)findViewById(R.id.menu2);
        menu3=(Button)findViewById(R.id.menu3);
        bundle=(Button)findViewById(R.id.bundle);
        alertDialog=(Button)findViewById(R.id.alertDialog);
        notification=(Button)findViewById(R.id.notification);
        
        //FrameLayout布局使用
        frameLayout.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent=new Intent();
				intent.setClass(MainActivity.this.asActivity(), FrameLayoutActivity.class);
				startActivity(intent);
			}
		});
        
        //RelativeLayout布局使用
        relativeLayout.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=new Intent();
				intent.setClass(MainActivity.this.asActivity(), RelativeLayoutActivity.class);
				startActivity(intent);
			}
		});
        
        //RelativeLayout和LinearLayout综合使用
        relativeAndLinear.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=new Intent();
				intent.setClass(MainActivity.this.asActivity(), RelativeAndLinearActivity.class);
				startActivity(intent);
			}
		});
        
        //TableLayout布局使用
        tableLayout.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent=new Intent();
				intent.setClass(MainActivity.this.asActivity(), TableLayoutActivity.class);
				startActivity(intent);
			}
		});
        
        //切换选项卡TabWidget
        tabWidget.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=new Intent();
				intent.setClass(MainActivity.this.asActivity(), TabWidgetActivity.class);
				startActivity(intent);
			}
		});
        
        //多选控件CheckBox
        checkbox.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=new Intent();
				intent.setClass(MainActivity.this.asActivity(), CheckBoxActivity.class);
				startActivity(intent);
			}
		});
        
        //单选控件RadioGroup使用
        radionGroup.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=new Intent();
				intent.setClass(MainActivity.this.asActivity(), RadioGroupActivity.class);
				startActivity(intent);
			}
		});
        
        //下拉框使用
        spinner.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=new Intent();
				intent.setClass(MainActivity.this.asActivity(), SpinnerActivity.class);
				startActivity(intent);
			}
		});
        
        //自动提示框
        autoCompleteTextView.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent =new Intent();
				intent.setClass(MainActivity.this.asActivity(), AutoCompleteTextViewActivity.class);
				startActivity(intent);
			}
		});
        
        //日期选择器使用
        datePicker.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=new Intent();
				intent.setClass(MainActivity.this.asActivity(), DatePickerActivity.class);
				startActivity(intent);
			}
		});
        
        //进度条使用
        progressBar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=new Intent();
				intent.setClass(MainActivity.this.asActivity(), ProgressBarHandlerActivity.class);
				startActivity(intent);
			}
		});
        
        //评分组件RatingBar
        ratingBar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=new Intent();
				intent.setClass(MainActivity.this.asActivity(), RatingBarActivity.class);
				startActivity(intent);
			}
		});
        
        //浏览图片
        imageShow.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=new Intent();
				intent.setClass(MainActivity.this.asActivity(), ImageShowActivity.class);
				startActivity(intent);
			}
		});
        
        //网络视图
        gridView.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=new Intent();
				intent.setClass(MainActivity.this.asActivity(), GridViewActivity.class);
				startActivity(intent);
			}
		});
        
        //标签控件tab
        tabDemo.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=new Intent();
				intent.setClass(MainActivity.this.asActivity(), TabDemoActivity.class);
				startActivity(intent);
			}
		});
        
        //OptionsMenu菜单
        menu1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=new Intent();
				intent.setClass(MainActivity.this.asActivity(), OptionsMenuActivity.class);
				startActivity(intent);
			}
		});
        
      //ContextMenu菜单
        menu2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=new Intent();
				intent.setClass(MainActivity.this.asActivity(), ContextMenuActivity.class);
				startActivity(intent);
			}
		});
        
      //SubMenu菜单
        menu3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=new Intent();
				intent.setClass(MainActivity.this.asActivity(), SubMenuActivity.class);
				startActivity(intent);
			}
		});
        
        //Activity值传递
        bundle.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=new Intent();
				intent.setClass(MainActivity.this.asActivity(), Bundle1Activity.class);
				startActivity(intent);
			}
		});
        
        //4中对话框
        alertDialog.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=new Intent();
				intent.setClass(MainActivity.this.asActivity(), AlertDialogActivity.class);
				startActivity(intent);
			}
		});
        
        //Notification状态栏提示
        notification.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=new Intent();
				intent.setClass(MainActivity.this.asActivity(), NotificationActivity.class);
				startActivity(intent);
			}
		});
    }
    
    private static final Map<String, String> subst = Util.newMap(String.class, String.class);
    private static final String methodTempl = 
    		"\t/** from class ${class} */\r\n" +
    		"\t${modifier} ${returnType} ${name}(${parameters})${throw} {\r\n" +
    		"${body}\t}\r\n\r\n";
    private static final String caseTempl = 
    		"\t\t\tcase ${index}: ${body}\r\n";
    private static final HashMap<Class, Integer> classIndices = Util.newMap(
    		Class.class, Integer.class, 
    		ActivityGroup.class, 4, 
    		TabActivity.class, 5,
    		FragmentActivity.class, 6,
    		ListActivity.class, 7);
	private static HashMap<String, Integer> methodIndices = new HashMap<String, Integer>();
    
    void genActivityCode(Class<?> cls) {
    	StringBuilder sb1 = new StringBuilder(), sb11 = new StringBuilder(), sb2 = new StringBuilder();
    	sb11.append("\t@Override\r\n\tpublic Object _s_(Object[] a) {\r\n\t\ttry {\r\n\t\t\tswitch ((Integer) a[0]) {\r\n");
    	ArrayList<Class<?>> classes = new ArrayList<Class<?>>();
    	while (cls != Object.class) {
    		classes.add(cls);
    		cls = cls.getSuperclass();
    	}
    	for (int i = classes.size(); --i >= 0;) {
    		cls = classes.get(i);
    		Integer baseIndex = classIndices.get(cls);
    		if (baseIndex == null) baseIndex = classes.size() - 1 - i;
    		int j = 0;
    		sb11.append("\t\t\t/**** ").append("from class ").append(className(cls, false)).append(" ****/\r\n");
    		for (Method m: cls.getDeclaredMethods()) {
    			int modifier = m.getModifiers() & ~Modifier.ABSTRACT;
    			if ((modifier & (Modifier.PROTECTED | Modifier.PUBLIC)) == 0) continue;
    			String methodSign = m.getName() + "@" + Util.getSignature(m.getParameterTypes());
    			if (methodIndices.containsKey(methodSign)) continue;
    			int index = baseIndex * 1000 + (j++);
    			methodIndices.put(methodSign, index);
    			if ((modifier & Modifier.FINAL) == 0) { // not final
    				Util.mapPut(subst,
        					"class", cls.getName(), 
    						"modifier", Modifier.toString(modifier),
        		    		"returnType", className(m.getReturnType(), false),
        		    		"name", m.getName(),
        		    		"parameters", parameters(m.getParameterTypes()),
        		    		"throw", exceptions(m.getExceptionTypes()),
    						"body", proxyBody(m));
    				sb1.append(Util.substitute(methodTempl, subst));
    				Util.mapPut(subst,
    						"index", Integer.toString(index), 
    						"body", caseBody(m));
    				sb11.append(Util.substitute(caseTempl, subst));
    				Util.mapPut(subst, 
    						"modifier", Modifier.toString(modifier),
    						"name", m.getName(),
        		    		"body", body(m, true));
    				sb2.append(Util.substitute(methodTempl, subst));
    			} else {
        			Util.mapPut(subst, 
        					"class", cls.getName(), 
        		    		"modifier", Modifier.toString(modifier),
        		    		"returnType", className(m.getReturnType(), false),
        		    		"name", m.getName(),
        		    		"parameters", parameters(m.getParameterTypes()),
        		    		"throw", exceptions(m.getExceptionTypes()),
        		    		"body", body(m, false));
        			sb2.append(Util.substitute(methodTempl, subst));
    			}
    		}
    	}
    	sb11.append("\t\t\t}\r\n\t\t} catch (Throwable ex) {\r\n\t\t\tthrow new RuntimeException(ex);\r\n\t\t}\r\n\t\treturn null;\r\n\t}\r\n\r\n");
    	Util.writeToFile(sb1.toString() + sb11.toString(), new File("/sdcard/ProxyActivity.txt"));
    	Util.writeToFile(sb2.toString(), new File("/sdcard/Proxied.txt"));
    }
    
    String parameters(Class<?>[] parameterTypes) {
    	StringBuilder sb = new StringBuilder();
    	int i = 0;
    	for (Class<?> c: parameterTypes) {
    		if (i > 0) sb.append(", ");
    		sb.append(className(c, false)).append(" a").append(i);
    		i++;
    	}
    	return sb.toString();
    }
    
    private static final HashMap<Class, Class> BOX = Util.newMap(
			Class.class, Class.class, 
			byte.class, Byte.class,
			char.class, Character.class,
			double.class, Double.class,
			float.class, Float.class,
			int.class, Integer.class,
			long.class, Long.class,
			short.class, Short.class,
			void.class, Void.class,
			boolean.class, Boolean.class);
    
    String className(Class<?> cls, boolean boxed) {
    	StringBuilder sb = new StringBuilder();
		int dimensions = 0;
		while (cls.isArray()) {
			cls = cls.getComponentType();
			dimensions++;
		}
		String clsName = cls.getName().replace('$', '.');
		if (cls.isPrimitive() && dimensions == 0 && boxed) {
			clsName = BOX.get(cls).getName();
		}
		if (clsName.startsWith("java.lang.")) clsName = clsName.substring(10);
		sb.append(clsName);
		while (--dimensions >= 0) sb.append("[]");
		return sb.toString();
    }
    
    String exceptions(Class<?>[] exceptionTypes) {
    	if (exceptionTypes.length == 0) return "";
    	StringBuilder sb = new StringBuilder(" throws ");
    	boolean first = true;
    	for (Class<?> cls: exceptionTypes) {
    		if (first) first = false; else sb.append(", "); 
    		sb.append(className(cls, false));
    	}
    	return sb.toString();
    }
    
    String body(Method m, boolean isSuper) {
    	StringBuilder sb = new StringBuilder("\t\t");
    	if (isSuper) {
	    	if (m.getReturnType() != Void.TYPE) {
	    		sb.append("return ").append('(').append(className(m.getReturnType(), true)).append(") ");
	    	}
	    	int index = methodIndices.get(m.getName() + "@" + Util.getSignature(m.getParameterTypes()));
    		sb.append("proxy._s_(new Object[] { ").append(index);
        	for (int i = 0, n = m.getParameterTypes().length; i < n; i++) {
        		sb.append(", ").append("a").append(i);
        	}
        	sb.append(" } );\r\n");
    	} else {
	    	if (m.getReturnType() != Void.TYPE) sb.append("return ");
	    	sb.append("((").append(className(m.getDeclaringClass(), false)).append(") proxy).")
	    			.append(m.getName()).append('(');
        	for (int i = 0, n = m.getParameterTypes().length; i < n; i++) {
        		if (i > 0) sb.append(", ");
        		sb.append("a").append(i);
        	}
        	sb.append(");\r\n");
    	}
    	return sb.toString();
    }
    
    private static final String proxyBodyTempl1 = "\t\treturn proxied != null ? proxied.${name}(${args}) : super.${name}(${args});\r\n";
    private static final String proxyBodyTempl2 = "\t\tif (proxied != null) proxied.${name}(${args}); else super.${name}(${args});\r\n";
    String proxyBody(Method m) {
    	StringBuilder args = new StringBuilder();
    	for (int i = 0, n = m.getParameterTypes().length; i < n; i++) {
    		if (i > 0) args.append(", ");
    		args.append("a").append(i);
    	}
		HashMap<String, String> subst = Util.newMap(String.class, String.class, "name", m.getName(), "args", args.toString());
    	return m.getReturnType() != Void.TYPE ? Util.substitute(proxyBodyTempl1, subst) 
    			: Util.substitute(proxyBodyTempl2, subst);
    }
    
    String caseBody(Method m) {
    	StringBuilder sb = new StringBuilder();
    	boolean isVoid = m.getReturnType() == Void.TYPE;
    	if (!isVoid) sb.append("return ");
    	sb.append("super.").append(m.getName()).append('(');
    	Class<?>[] pt = m.getParameterTypes();
    	for (int i = 0, n = pt.length; i < n; i++) {
    		if (i > 0) sb.append(", ");
    		sb.append('(').append(className(pt[i], true)).append(") a[").append(i + 1).append(']');
    	}
    	sb.append(");");
    	if (isVoid) sb.append(" break;");
    	return sb.toString();
    }
    
}