package com.roxstudio.proxycomponent;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ListActivity;
import android.app.TabActivity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.roxstudio.utils.Util;

@SuppressLint({ "NewApi", "MissingSuperCall", "Recycle" })
@SuppressWarnings("deprecation")
public class Proxied<T extends Activity> {
	
	public static final String PROXIED_ACTIVITY_CLASS_NAME = "PROXIED_ACTIVITY_CLASS_NAME";
	public static final String PROXIED_LOADER_CLASS_NAME = "PROXIED_LOADER_CLASS_NAME";
	
	protected _S_ proxy;
	protected String loaderClassName;
	
	public final Activity asActivity() {
		return (Activity) proxy;
	}
	
	@SuppressWarnings("unchecked")
	public static final <T extends Activity> Proxied<T> createInstance(Activity activity, Class<T> cls) {
		_S_ s = (_S_) activity;
		Intent intent = s.getIntent();
		String clsName = intent.getStringExtra(PROXIED_ACTIVITY_CLASS_NAME);
		String ldrClsName = intent.getStringExtra(Proxied.PROXIED_LOADER_CLASS_NAME);
		if (clsName == null) {
			try {
				PackageManager pm = (PackageManager) s._s_(new Object[] { 46 } );
				ComponentName cn = (ComponentName) s._s_(new Object[] { 3026 } );
				ActivityInfo info = pm.getActivityInfo(cn, PackageManager.GET_META_DATA);
				clsName = info.metaData.getString(Proxied.PROXIED_ACTIVITY_CLASS_NAME);
				ldrClsName = info.metaData.getString(Proxied.PROXIED_LOADER_CLASS_NAME);
			} catch (NameNotFoundException ex) {}
		}
		ClassLoader cl = null;
		if (ldrClsName != null) {
			cl = (ClassLoader) Util.invoke(null, Util.getClass(ldrClsName, null), 
					"getProxiedClassLoader", "Landroid.content.Context;", activity);
		}
		Proxied<T> proxied = (Proxied<T>) Util.createInstance(Util.getClass(clsName, cl), null);
		proxied.proxy = s;
		proxied.loaderClassName = ldrClsName; 
		return proxied;
	}
	
	public static final android.content.Intent toProxyIntent(android.content.Context context, android.content.Intent a0) {
		ComponentName cn = a0.getComponent();
		Class<?> cls = Util.getClass(cn.getClassName(), null);
		if (Proxied.class.isAssignableFrom(cls)) {
			Class<?> superCls = cls.getSuperclass();
			while (!superCls.equals(Proxied.class)) {
				cls = superCls;
				superCls = cls.getSuperclass();
			}
			Class<?> proxyCls = ProxyActivity.class;
			Type type = cls.getGenericSuperclass();
			if (type instanceof ParameterizedType) {
				ParameterizedType pt = (ParameterizedType) type;
				Class<?> activityCls = (Class<?>) pt.getActualTypeArguments()[0];
				if (FragmentActivity.class.equals(activityCls)) { 
					proxyCls = ProxyFragmentActivity.class;
				} else if (TabActivity.class.equals(activityCls)) { 
					proxyCls = ProxyTabActivity.class;
				} else if (ListActivity.class.equals(activityCls)) {
					proxyCls = ProxyListActivity.class;
				}
			}
			a0.setClassName(cn.getPackageName(), proxyCls.getName());
			a0.putExtra(PROXIED_ACTIVITY_CLASS_NAME, cls.getName());
			String ldrClsName;
			if (context instanceof _S_ && (ldrClsName = ((_S_) context).getProxiedLoaderClassName()) != null) {
				a0.putExtra(PROXIED_LOADER_CLASS_NAME, ldrClsName);
			}
		}
		return a0;
	}
	
	public static final void startActivities(Activity activity, Intent[] intents) {
		for (Intent intent: intents) toProxyIntent(activity, intent);
		activity.startActivities(intents);
	}
	
	public static final void startActivities(Activity activity, Intent[] intents, Bundle options) {
		for (Intent intent: intents) toProxyIntent(activity, intent);
		activity.startActivities(intents, options);
	}
	
	public static final void startActivity(Activity activity, Intent intent) {
		activity.startActivity(toProxyIntent(activity, intent));
	}
	
	public static final void startActivity(Activity activity, Intent intent, Bundle options) {
		activity.startActivity(toProxyIntent(activity, intent), options);
	}
	
	public static void startActivityForResult(Activity activity, Intent intent, int requestCode) {
		activity.startActivityForResult(toProxyIntent(activity, intent), requestCode);
	}
	
	public static void startActivityForResult(Activity activity, Intent intent, int requestCode, Bundle options) {
		activity.startActivityForResult(toProxyIntent(activity, intent), requestCode, options);
	}
	
	static interface _S_ {
		public Object _s_(Object[] args);
		public Intent getIntent();
		public String getProxiedLoaderClassName();
	}

///////////////////////// From Activity & its Subclass ///////////////////////////
	
	/** from class android.content.Context */
	public boolean bindService(android.content.Intent a0, android.content.ServiceConnection a1, int a2) {
		return (Boolean) proxy._s_(new Object[] { 0, a0, a1, a2 } );
	}

//	/** from class android.content.Context */
//	public boolean bindServiceAsUser(android.content.Intent a0, android.content.ServiceConnection a1, int a2, android.os.UserHandle a3) {
//		return (Boolean) proxy._s_(new Object[] { 1, a0, a1, a2, a3 } );
//	}
//
	/** from class android.content.Context */
	public int checkCallingOrSelfPermission(String a0) {
		return (Integer) proxy._s_(new Object[] { 2, a0 } );
	}

	/** from class android.content.Context */
	public int checkCallingOrSelfUriPermission(android.net.Uri a0, int a1) {
		return (Integer) proxy._s_(new Object[] { 3, a0, a1 } );
	}

	/** from class android.content.Context */
	public int checkCallingPermission(String a0) {
		return (Integer) proxy._s_(new Object[] { 4, a0 } );
	}

	/** from class android.content.Context */
	public int checkCallingUriPermission(android.net.Uri a0, int a1) {
		return (Integer) proxy._s_(new Object[] { 5, a0, a1 } );
	}

	/** from class android.content.Context */
	public int checkPermission(String a0, int a1, int a2) {
		return (Integer) proxy._s_(new Object[] { 6, a0, a1, a2 } );
	}

	/** from class android.content.Context */
	public int checkUriPermission(android.net.Uri a0, int a1, int a2, int a3) {
		return (Integer) proxy._s_(new Object[] { 7, a0, a1, a2, a3 } );
	}

	/** from class android.content.Context */
	public int checkUriPermission(android.net.Uri a0, String a1, String a2, int a3, int a4, int a5) {
		return (Integer) proxy._s_(new Object[] { 8, a0, a1, a2, a3, a4, a5 } );
	}

	/** from class android.content.Context */
	public void clearWallpaper() throws java.io.IOException {
		proxy._s_(new Object[] { 9 } );
	}

	/** from class android.content.Context */
	public android.content.Context createConfigurationContext(android.content.res.Configuration a0) {
		return (android.content.Context) proxy._s_(new Object[] { 10, a0 } );
	}

	/** from class android.content.Context */
	public android.content.Context createDisplayContext(android.view.Display a0) {
		return (android.content.Context) proxy._s_(new Object[] { 11, a0 } );
	}

	/** from class android.content.Context */
	public android.content.Context createPackageContext(String a0, int a1) throws android.content.pm.PackageManager.NameNotFoundException {
		return (android.content.Context) proxy._s_(new Object[] { 12, a0, a1 } );
	}

//	/** from class android.content.Context */
//	public android.content.Context createPackageContextAsUser(String a0, int a1, android.os.UserHandle a2) throws android.content.pm.PackageManager.NameNotFoundException {
//		return (android.content.Context) proxy._s_(new Object[] { 13, a0, a1, a2 } );
//	}
//
	/** from class android.content.Context */
	public String[] databaseList() {
		return (String[]) proxy._s_(new Object[] { 14 } );
	}

	/** from class android.content.Context */
	public boolean deleteDatabase(String a0) {
		return (Boolean) proxy._s_(new Object[] { 15, a0 } );
	}

	/** from class android.content.Context */
	public boolean deleteFile(String a0) {
		return (Boolean) proxy._s_(new Object[] { 16, a0 } );
	}

	/** from class android.content.Context */
	public void enforceCallingOrSelfPermission(String a0, String a1) {
		proxy._s_(new Object[] { 17, a0, a1 } );
	}

	/** from class android.content.Context */
	public void enforceCallingOrSelfUriPermission(android.net.Uri a0, int a1, String a2) {
		proxy._s_(new Object[] { 18, a0, a1, a2 } );
	}

	/** from class android.content.Context */
	public void enforceCallingPermission(String a0, String a1) {
		proxy._s_(new Object[] { 19, a0, a1 } );
	}

	/** from class android.content.Context */
	public void enforceCallingUriPermission(android.net.Uri a0, int a1, String a2) {
		proxy._s_(new Object[] { 20, a0, a1, a2 } );
	}

	/** from class android.content.Context */
	public void enforcePermission(String a0, int a1, int a2, String a3) {
		proxy._s_(new Object[] { 21, a0, a1, a2, a3 } );
	}

	/** from class android.content.Context */
	public void enforceUriPermission(android.net.Uri a0, int a1, int a2, int a3, String a4) {
		proxy._s_(new Object[] { 22, a0, a1, a2, a3, a4 } );
	}

	/** from class android.content.Context */
	public void enforceUriPermission(android.net.Uri a0, String a1, String a2, int a3, int a4, int a5, String a6) {
		proxy._s_(new Object[] { 23, a0, a1, a2, a3, a4, a5, a6 } );
	}

	/** from class android.content.Context */
	public String[] fileList() {
		return (String[]) proxy._s_(new Object[] { 24 } );
	}

	/** from class android.content.Context */
	public android.content.Context getApplicationContext() {
		return (android.content.Context) proxy._s_(new Object[] { 25 } );
	}

	/** from class android.content.Context */
	public android.content.pm.ApplicationInfo getApplicationInfo() {
		return (android.content.pm.ApplicationInfo) proxy._s_(new Object[] { 26 } );
	}

	/** from class android.content.Context */
	public android.content.res.AssetManager getAssets() {
		return (android.content.res.AssetManager) proxy._s_(new Object[] { 27 } );
	}

//	/** from class android.content.Context */
//	public String getBasePackageName() {
//		return (String) proxy._s_(new Object[] { 28 } );
//	}

	/** from class android.content.Context */
	public java.io.File getCacheDir() {
		return (java.io.File) proxy._s_(new Object[] { 29 } );
	}

	/** from class android.content.Context */
	public ClassLoader getClassLoader() {
		return (ClassLoader) proxy._s_(new Object[] { 30 } );
	}

	/** from class android.content.Context */
	public android.content.ContentResolver getContentResolver() {
		return (android.content.ContentResolver) proxy._s_(new Object[] { 31 } );
	}

	/** from class android.content.Context */
	public java.io.File getDatabasePath(String a0) {
		return (java.io.File) proxy._s_(new Object[] { 32, a0 } );
	}

	/** from class android.content.Context */
	public java.io.File getDir(String a0, int a1) {
		return (java.io.File) proxy._s_(new Object[] { 33, a0, a1 } );
	}

//	/** from class android.content.Context */
//	public android.view.DisplayAdjustments getDisplayAdjustments(int a0) {
//		return (android.view.DisplayAdjustments) proxy._s_(new Object[] { 34, a0 } );
//	}

	/** from class android.content.Context */
	public java.io.File getExternalCacheDir() {
		return (java.io.File) proxy._s_(new Object[] { 35 } );
	}

	/** from class android.content.Context */
	public java.io.File[] getExternalCacheDirs() {
		return (java.io.File[]) proxy._s_(new Object[] { 36 } );
	}

	/** from class android.content.Context */
	public java.io.File getExternalFilesDir(String a0) {
		return (java.io.File) proxy._s_(new Object[] { 37, a0 } );
	}

	/** from class android.content.Context */
	public java.io.File[] getExternalFilesDirs(String a0) {
		return (java.io.File[]) proxy._s_(new Object[] { 38, a0 } );
	}

	/** from class android.content.Context */
	public java.io.File getFileStreamPath(String a0) {
		return (java.io.File) proxy._s_(new Object[] { 39, a0 } );
	}

	/** from class android.content.Context */
	public java.io.File getFilesDir() {
		return (java.io.File) proxy._s_(new Object[] { 40 } );
	}

	/** from class android.content.Context */
	public android.os.Looper getMainLooper() {
		return (android.os.Looper) proxy._s_(new Object[] { 41 } );
	}

	/** from class android.content.Context */
	public java.io.File getObbDir() {
		return (java.io.File) proxy._s_(new Object[] { 42 } );
	}

	/** from class android.content.Context */
	public java.io.File[] getObbDirs() {
		return (java.io.File[]) proxy._s_(new Object[] { 43 } );
	}

//	/** from class android.content.Context */
//	public String getOpPackageName() {
//		return (String) proxy._s_(new Object[] { 44 } );
//	}

	/** from class android.content.Context */
	public String getPackageCodePath() {
		return (String) proxy._s_(new Object[] { 45 } );
	}

	/** from class android.content.Context */
	public android.content.pm.PackageManager getPackageManager() {
		return (android.content.pm.PackageManager) proxy._s_(new Object[] { 46 } );
	}

	/** from class android.content.Context */
	public String getPackageName() {
		return (String) proxy._s_(new Object[] { 47 } );
	}

	/** from class android.content.Context */
	public String getPackageResourcePath() {
		return (String) proxy._s_(new Object[] { 48 } );
	}

	/** from class android.content.Context */
	public android.content.res.Resources getResources() {
		return (android.content.res.Resources) proxy._s_(new Object[] { 49 } );
	}

	/** from class android.content.Context */
	public android.content.SharedPreferences getSharedPreferences(String a0, int a1) {
		return (android.content.SharedPreferences) proxy._s_(new Object[] { 50, a0, a1 } );
	}

//	/** from class android.content.Context */
//	public java.io.File getSharedPrefsFile(String a0) {
//		return (java.io.File) proxy._s_(new Object[] { 51, a0 } );
//	}

	/** from class android.content.Context */
	public final String getString(int a0) {
		return ((android.content.Context) proxy).getString(a0);
	}

	/** from class android.content.Context */
	public final String getString(int a0, Object[] a1) {
		return ((android.content.Context) proxy).getString(a0, a1);
	}

	/** from class android.content.Context */
	public Object getSystemService(String a0) {
		return (Object) proxy._s_(new Object[] { 54, a0 } );
	}

	/** from class android.content.Context */
	public final CharSequence getText(int a0) {
		return ((android.content.Context) proxy).getText(a0);
	}

	/** from class android.content.Context */
	public android.content.res.Resources.Theme getTheme() {
		return (android.content.res.Resources.Theme) proxy._s_(new Object[] { 56 } );
	}

//	/** from class android.content.Context */
//	public int getThemeResId() {
//		return (Integer) proxy._s_(new Object[] { 57 } );
//	}

//	/** from class android.content.Context */
//	public int getUserId() {
//		return (Integer) proxy._s_(new Object[] { 58 } );
//	}

	/** from class android.content.Context */
	public android.graphics.drawable.Drawable getWallpaper() {
		return (android.graphics.drawable.Drawable) proxy._s_(new Object[] { 59 } );
	}

	/** from class android.content.Context */
	public int getWallpaperDesiredMinimumHeight() {
		return (Integer) proxy._s_(new Object[] { 60 } );
	}

	/** from class android.content.Context */
	public int getWallpaperDesiredMinimumWidth() {
		return (Integer) proxy._s_(new Object[] { 61 } );
	}

	/** from class android.content.Context */
	public void grantUriPermission(String a0, android.net.Uri a1, int a2) {
		proxy._s_(new Object[] { 62, a0, a1, a2 } );
	}

	/** from class android.content.Context */
	public boolean isRestricted() {
		return (Boolean) proxy._s_(new Object[] { 63 } );
	}

	/** from class android.content.Context */
	public final android.content.res.TypedArray obtainStyledAttributes(int a0, int[] a1) throws android.content.res.Resources.NotFoundException {
		return ((android.content.Context) proxy).obtainStyledAttributes(a0, a1);
	}

	/** from class android.content.Context */
	public final android.content.res.TypedArray obtainStyledAttributes(android.util.AttributeSet a0, int[] a1) {
		return ((android.content.Context) proxy).obtainStyledAttributes(a0, a1);
	}

	/** from class android.content.Context */
	public final android.content.res.TypedArray obtainStyledAttributes(android.util.AttributeSet a0, int[] a1, int a2, int a3) {
		return ((android.content.Context) proxy).obtainStyledAttributes(a0, a1, a2, a3);
	}

	/** from class android.content.Context */
	public final android.content.res.TypedArray obtainStyledAttributes(int[] a0) {
		return ((android.content.Context) proxy).obtainStyledAttributes(a0);
	}

	/** from class android.content.Context */
	public java.io.FileInputStream openFileInput(String a0) throws java.io.FileNotFoundException {
		return (java.io.FileInputStream) proxy._s_(new Object[] { 68, a0 } );
	}

	/** from class android.content.Context */
	public java.io.FileOutputStream openFileOutput(String a0, int a1) throws java.io.FileNotFoundException {
		return (java.io.FileOutputStream) proxy._s_(new Object[] { 69, a0, a1 } );
	}

	/** from class android.content.Context */
	public android.database.sqlite.SQLiteDatabase openOrCreateDatabase(String a0, int a1, android.database.sqlite.SQLiteDatabase.CursorFactory a2) {
		return (android.database.sqlite.SQLiteDatabase) proxy._s_(new Object[] { 70, a0, a1, a2 } );
	}

	/** from class android.content.Context */
	public android.database.sqlite.SQLiteDatabase openOrCreateDatabase(String a0, int a1, android.database.sqlite.SQLiteDatabase.CursorFactory a2, android.database.DatabaseErrorHandler a3) {
		return (android.database.sqlite.SQLiteDatabase) proxy._s_(new Object[] { 71, a0, a1, a2, a3 } );
	}

	/** from class android.content.Context */
	public android.graphics.drawable.Drawable peekWallpaper() {
		return (android.graphics.drawable.Drawable) proxy._s_(new Object[] { 72 } );
	}

	/** from class android.content.Context */
	public void registerComponentCallbacks(android.content.ComponentCallbacks a0) {
		proxy._s_(new Object[] { 73, a0 } );
	}

	/** from class android.content.Context */
	public android.content.Intent registerReceiver(android.content.BroadcastReceiver a0, android.content.IntentFilter a1) {
		return (android.content.Intent) proxy._s_(new Object[] { 74, a0, a1 } );
	}

	/** from class android.content.Context */
	public android.content.Intent registerReceiver(android.content.BroadcastReceiver a0, android.content.IntentFilter a1, String a2, android.os.Handler a3) {
		return (android.content.Intent) proxy._s_(new Object[] { 75, a0, a1, a2, a3 } );
	}

//	/** from class android.content.Context */
//	public android.content.Intent registerReceiverAsUser(android.content.BroadcastReceiver a0, android.os.UserHandle a1, android.content.IntentFilter a2, String a3, android.os.Handler a4) {
//		return (android.content.Intent) proxy._s_(new Object[] { 76, a0, a1, a2, a3, a4 } );
//	}

	/** from class android.content.Context */
	public void removeStickyBroadcast(android.content.Intent a0) {
		proxy._s_(new Object[] { 77, a0 } );
	}

	/** from class android.content.Context */
	public void removeStickyBroadcastAsUser(android.content.Intent a0, android.os.UserHandle a1) {
		proxy._s_(new Object[] { 78, a0, a1 } );
	}

	/** from class android.content.Context */
	public void revokeUriPermission(android.net.Uri a0, int a1) {
		proxy._s_(new Object[] { 79, a0, a1 } );
	}

	/** from class android.content.Context */
	public void sendBroadcast(android.content.Intent a0) {
		proxy._s_(new Object[] { 80, a0 } );
	}

	/** from class android.content.Context */
	public void sendBroadcast(android.content.Intent a0, String a1) {
		proxy._s_(new Object[] { 81, a0, a1 } );
	}

//	/** from class android.content.Context */
//	public void sendBroadcast(android.content.Intent a0, String a1, int a2) {
//		proxy._s_(new Object[] { 82, a0, a1, a2 } );
//	}

	/** from class android.content.Context */
	public void sendBroadcastAsUser(android.content.Intent a0, android.os.UserHandle a1) {
		proxy._s_(new Object[] { 83, a0, a1 } );
	}

	/** from class android.content.Context */
	public void sendBroadcastAsUser(android.content.Intent a0, android.os.UserHandle a1, String a2) {
		proxy._s_(new Object[] { 84, a0, a1, a2 } );
	}

	/** from class android.content.Context */
	public void sendOrderedBroadcast(android.content.Intent a0, String a1) {
		proxy._s_(new Object[] { 85, a0, a1 } );
	}

//	/** from class android.content.Context */
//	public void sendOrderedBroadcast(android.content.Intent a0, String a1, int a2, android.content.BroadcastReceiver a3, android.os.Handler a4, int a5, String a6, android.os.Bundle a7) {
//		proxy._s_(new Object[] { 86, a0, a1, a2, a3, a4, a5, a6, a7 } );
//	}

	/** from class android.content.Context */
	public void sendOrderedBroadcast(android.content.Intent a0, String a1, android.content.BroadcastReceiver a2, android.os.Handler a3, int a4, String a5, android.os.Bundle a6) {
		proxy._s_(new Object[] { 87, a0, a1, a2, a3, a4, a5, a6 } );
	}

	/** from class android.content.Context */
	public void sendOrderedBroadcastAsUser(android.content.Intent a0, android.os.UserHandle a1, String a2, android.content.BroadcastReceiver a3, android.os.Handler a4, int a5, String a6, android.os.Bundle a7) {
		proxy._s_(new Object[] { 88, a0, a1, a2, a3, a4, a5, a6, a7 } );
	}

	/** from class android.content.Context */
	public void sendStickyBroadcast(android.content.Intent a0) {
		proxy._s_(new Object[] { 89, a0 } );
	}

	/** from class android.content.Context */
	public void sendStickyBroadcastAsUser(android.content.Intent a0, android.os.UserHandle a1) {
		proxy._s_(new Object[] { 90, a0, a1 } );
	}

	/** from class android.content.Context */
	public void sendStickyOrderedBroadcast(android.content.Intent a0, android.content.BroadcastReceiver a1, android.os.Handler a2, int a3, String a4, android.os.Bundle a5) {
		proxy._s_(new Object[] { 91, a0, a1, a2, a3, a4, a5 } );
	}

	/** from class android.content.Context */
	public void sendStickyOrderedBroadcastAsUser(android.content.Intent a0, android.os.UserHandle a1, android.content.BroadcastReceiver a2, android.os.Handler a3, int a4, String a5, android.os.Bundle a6) {
		proxy._s_(new Object[] { 92, a0, a1, a2, a3, a4, a5, a6 } );
	}

	/** from class android.content.Context */
	public void setTheme(int a0) {
		proxy._s_(new Object[] { 93, a0 } );
	}

	/** from class android.content.Context */
	public void setWallpaper(android.graphics.Bitmap a0) throws java.io.IOException {
		proxy._s_(new Object[] { 94, a0 } );
	}

	/** from class android.content.Context */
	public void setWallpaper(java.io.InputStream a0) throws java.io.IOException {
		proxy._s_(new Object[] { 95, a0 } );
	}

	/** from class android.content.Context */
	public void startActivities(android.content.Intent[] a0) {
		proxy._s_(new Object[] { 96, a0 } );
	}

	/** from class android.content.Context */
	public void startActivities(android.content.Intent[] a0, android.os.Bundle a1) {
		proxy._s_(new Object[] { 97, a0, a1 } );
	}

//	/** from class android.content.Context */
//	public void startActivitiesAsUser(android.content.Intent[] a0, android.os.Bundle a1, android.os.UserHandle a2) {
//		proxy._s_(new Object[] { 98, a0, a1, a2 } );
//	}

	/** from class android.content.Context */
	public void startActivity(android.content.Intent a0) {
		proxy._s_(new Object[] { 99, a0 } );
	}

	/** from class android.content.Context */
	public void startActivity(android.content.Intent a0, android.os.Bundle a1) {
		proxy._s_(new Object[] { 100, a0, a1 } );
	}

//	/** from class android.content.Context */
//	public void startActivityAsUser(android.content.Intent a0, android.os.Bundle a1, android.os.UserHandle a2) {
//		proxy._s_(new Object[] { 101, a0, a1, a2 } );
//	}

//	/** from class android.content.Context */
//	public void startActivityAsUser(android.content.Intent a0, android.os.UserHandle a1) {
//		proxy._s_(new Object[] { 102, a0, a1 } );
//	}

	/** from class android.content.Context */
	public boolean startInstrumentation(android.content.ComponentName a0, String a1, android.os.Bundle a2) {
		return (Boolean) proxy._s_(new Object[] { 103, a0, a1, a2 } );
	}

	/** from class android.content.Context */
	public void startIntentSender(android.content.IntentSender a0, android.content.Intent a1, int a2, int a3, int a4) throws android.content.IntentSender.SendIntentException {
		proxy._s_(new Object[] { 104, a0, a1, a2, a3, a4 } );
	}

	/** from class android.content.Context */
	public void startIntentSender(android.content.IntentSender a0, android.content.Intent a1, int a2, int a3, int a4, android.os.Bundle a5) throws android.content.IntentSender.SendIntentException {
		proxy._s_(new Object[] { 105, a0, a1, a2, a3, a4, a5 } );
	}

	/** from class android.content.Context */
	public android.content.ComponentName startService(android.content.Intent a0) {
		return (android.content.ComponentName) proxy._s_(new Object[] { 106, a0 } );
	}

//	/** from class android.content.Context */
//	public android.content.ComponentName startServiceAsUser(android.content.Intent a0, android.os.UserHandle a1) {
//		return (android.content.ComponentName) proxy._s_(new Object[] { 107, a0, a1 } );
//	}

	/** from class android.content.Context */
	public boolean stopService(android.content.Intent a0) {
		return (Boolean) proxy._s_(new Object[] { 108, a0 } );
	}

//	/** from class android.content.Context */
//	public boolean stopServiceAsUser(android.content.Intent a0, android.os.UserHandle a1) {
//		return (Boolean) proxy._s_(new Object[] { 109, a0, a1 } );
//	}

	/** from class android.content.Context */
	public void unbindService(android.content.ServiceConnection a0) {
		proxy._s_(new Object[] { 110, a0 } );
	}

	/** from class android.content.Context */
	public void unregisterComponentCallbacks(android.content.ComponentCallbacks a0) {
		proxy._s_(new Object[] { 111, a0 } );
	}

	/** from class android.content.Context */
	public void unregisterReceiver(android.content.BroadcastReceiver a0) {
		proxy._s_(new Object[] { 112, a0 } );
	}

//	/** from class android.content.ContextWrapper */
//	protected void attachBaseContext(android.content.Context a0) {
//		proxy._s_(new Object[] { 1000, a0 } );
//	}

	/** from class android.content.ContextWrapper */
	public android.content.Context getBaseContext() {
		return (android.content.Context) proxy._s_(new Object[] { 1001 } );
	}

	/** from class android.view.ContextThemeWrapper */
	public void applyOverrideConfiguration(android.content.res.Configuration a0) {
		proxy._s_(new Object[] { 2000, a0 } );
	}

	/** from class android.view.ContextThemeWrapper */
	protected void onApplyThemeResource(android.content.res.Resources.Theme a0, int a1, boolean a2) {
		proxy._s_(new Object[] { 2001, a0, a1, a2 } );
	}

	/** from class android.app.Activity */
    public static final int RESULT_CANCELED    = 0;
    public static final int RESULT_OK           = -1;
    public static final int RESULT_FIRST_USER   = 1;

	/** from class android.app.Activity */
	public void addContentView(android.view.View a0, android.view.ViewGroup.LayoutParams a1) {
		proxy._s_(new Object[] { 3000, a0, a1 } );
	}

	/** from class android.app.Activity */
	public void closeContextMenu() {
		proxy._s_(new Object[] { 3001 } );
	}

	/** from class android.app.Activity */
	public void closeOptionsMenu() {
		proxy._s_(new Object[] { 3002 } );
	}

//	/** from class android.app.Activity */
//	public void convertFromTranslucent() {
//		proxy._s_(new Object[] { 3003 } );
//	}

//	/** from class android.app.Activity */
//	public void convertToTranslucent(android.app.Activity.TranslucentConversionListener a0) {
//		proxy._s_(new Object[] { 3004, a0 } );
//	}

	/** from class android.app.Activity */
	public android.app.PendingIntent createPendingResult(int a0, android.content.Intent a1, int a2) {
		return (android.app.PendingIntent) proxy._s_(new Object[] { 3005, a0, a1, a2 } );
	}

	/** from class android.app.Activity */
	public final void dismissDialog(int a0) {
		((android.app.Activity) proxy).dismissDialog(a0);
	}

	/** from class android.app.Activity */
	public boolean dispatchGenericMotionEvent(android.view.MotionEvent a0) {
		return (Boolean) proxy._s_(new Object[] { 3007, a0 } );
	}

	/** from class android.app.Activity */
	public boolean dispatchKeyEvent(android.view.KeyEvent a0) {
		return (Boolean) proxy._s_(new Object[] { 3008, a0 } );
	}

	/** from class android.app.Activity */
	public boolean dispatchKeyShortcutEvent(android.view.KeyEvent a0) {
		return (Boolean) proxy._s_(new Object[] { 3009, a0 } );
	}

	/** from class android.app.Activity */
	public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent a0) {
		return (Boolean) proxy._s_(new Object[] { 3010, a0 } );
	}

	/** from class android.app.Activity */
	public boolean dispatchTouchEvent(android.view.MotionEvent a0) {
		return (Boolean) proxy._s_(new Object[] { 3011, a0 } );
	}

	/** from class android.app.Activity */
	public boolean dispatchTrackballEvent(android.view.MotionEvent a0) {
		return (Boolean) proxy._s_(new Object[] { 3012, a0 } );
	}

	/** from class android.app.Activity */
	public void dump(String a0, java.io.FileDescriptor a1, java.io.PrintWriter a2, String[] a3) {
		proxy._s_(new Object[] { 3013, a0, a1, a2, a3 } );
	}

	/** from class android.app.Activity */
	public android.view.View findViewById(int a0) {
		return (android.view.View) proxy._s_(new Object[] { 3014, a0 } );
	}

	/** from class android.app.Activity */
	public void finish() {
		proxy._s_(new Object[] { 3015 } );
	}

	/** from class android.app.Activity */
	public void finishActivity(int a0) {
		proxy._s_(new Object[] { 3016, a0 } );
	}

	/** from class android.app.Activity */
	public void finishActivityFromChild(android.app.Activity a0, int a1) {
		proxy._s_(new Object[] { 3017, a0, a1 } );
	}

	/** from class android.app.Activity */
	public void finishAffinity() {
		proxy._s_(new Object[] { 3018 } );
	}

	/** from class android.app.Activity */
	public void finishFromChild(android.app.Activity a0) {
		proxy._s_(new Object[] { 3019, a0 } );
	}

	/** from class android.app.Activity */
	public android.app.ActionBar getActionBar() {
		return (android.app.ActionBar) proxy._s_(new Object[] { 3020 } );
	}

//	/** from class android.app.Activity */
//	public final android.os.IBinder getActivityToken() {
//		return ((android.app.Activity) proxy).getActivityToken();
//	}

	/** from class android.app.Activity */
	public final android.app.Application getApplication() {
		return ((android.app.Activity) proxy).getApplication();
	}

	/** from class android.app.Activity */
	public android.content.ComponentName getCallingActivity() {
		return (android.content.ComponentName) proxy._s_(new Object[] { 3023 } );
	}

	/** from class android.app.Activity */
	public String getCallingPackage() {
		return (String) proxy._s_(new Object[] { 3024 } );
	}

	/** from class android.app.Activity */
	public int getChangingConfigurations() {
		return (Integer) proxy._s_(new Object[] { 3025 } );
	}

	/** from class android.app.Activity */
	public android.content.ComponentName getComponentName() {
		return (android.content.ComponentName) proxy._s_(new Object[] { 3026 } );
	}

	/** from class android.app.Activity */
	public android.view.View getCurrentFocus() {
		return (android.view.View) proxy._s_(new Object[] { 3027 } );
	}

	/** from class android.app.Activity */
	public android.app.FragmentManager getFragmentManager() {
		return (android.app.FragmentManager) proxy._s_(new Object[] { 3028 } );
	}

	/** from class android.app.Activity */
	public android.content.Intent getIntent() {
		return (android.content.Intent) proxy._s_(new Object[] { 3029 } );
	}

	/** from class android.app.Activity */
	public Object getLastNonConfigurationInstance() {
		return (Object) proxy._s_(new Object[] { 3030 } );
	}

	/** from class android.app.Activity */
	public android.view.LayoutInflater getLayoutInflater() {
		return (android.view.LayoutInflater) proxy._s_(new Object[] { 3031 } );
	}

	/** from class android.app.Activity */
	public android.app.LoaderManager getLoaderManager() {
		return (android.app.LoaderManager) proxy._s_(new Object[] { 3032 } );
	}

	/** from class android.app.Activity */
	public String getLocalClassName() {
		return (String) proxy._s_(new Object[] { 3033 } );
	}

	/** from class android.app.Activity */
	public android.view.MenuInflater getMenuInflater() {
		return (android.view.MenuInflater) proxy._s_(new Object[] { 3034 } );
	}

	/** from class android.app.Activity */
	public final android.app.Activity getParent() {
		return ((android.app.Activity) proxy).getParent();
	}

	/** from class android.app.Activity */
	public android.content.Intent getParentActivityIntent() {
		return (android.content.Intent) proxy._s_(new Object[] { 3036 } );
	}

	/** from class android.app.Activity */
	public android.content.SharedPreferences getPreferences(int a0) {
		return (android.content.SharedPreferences) proxy._s_(new Object[] { 3037, a0 } );
	}

	/** from class android.app.Activity */
	public int getRequestedOrientation() {
		return (Integer) proxy._s_(new Object[] { 3038 } );
	}

	/** from class android.app.Activity */
	public int getTaskId() {
		return (Integer) proxy._s_(new Object[] { 3039 } );
	}

	/** from class android.app.Activity */
	public final CharSequence getTitle() {
		return ((android.app.Activity) proxy).getTitle();
	}

	/** from class android.app.Activity */
	public final int getTitleColor() {
		return ((android.app.Activity) proxy).getTitleColor();
	}

	/** from class android.app.Activity */
	public final int getVolumeControlStream() {
		return ((android.app.Activity) proxy).getVolumeControlStream();
	}

	/** from class android.app.Activity */
	public android.view.Window getWindow() {
		return (android.view.Window) proxy._s_(new Object[] { 3043 } );
	}

	/** from class android.app.Activity */
	public android.view.WindowManager getWindowManager() {
		return (android.view.WindowManager) proxy._s_(new Object[] { 3044 } );
	}

	/** from class android.app.Activity */
	public boolean hasWindowFocus() {
		return (Boolean) proxy._s_(new Object[] { 3045 } );
	}

	/** from class android.app.Activity */
	public void invalidateOptionsMenu() {
		proxy._s_(new Object[] { 3046 } );
	}

	/** from class android.app.Activity */
	public boolean isChangingConfigurations() {
		return (Boolean) proxy._s_(new Object[] { 3047 } );
	}

	/** from class android.app.Activity */
	public final boolean isChild() {
		return ((android.app.Activity) proxy).isChild();
	}

	/** from class android.app.Activity */
	public boolean isDestroyed() {
		return (Boolean) proxy._s_(new Object[] { 3049 } );
	}

	/** from class android.app.Activity */
	public boolean isFinishing() {
		return (Boolean) proxy._s_(new Object[] { 3050 } );
	}

	/** from class android.app.Activity */
	public boolean isImmersive() {
		return (Boolean) proxy._s_(new Object[] { 3051 } );
	}

//	/** from class android.app.Activity */
//	public final boolean isResumed() {
//		return ((android.app.Activity) proxy).isResumed();
//	}

	/** from class android.app.Activity */
	public boolean isTaskRoot() {
		return (Boolean) proxy._s_(new Object[] { 3053 } );
	}

//	/** from class android.app.Activity */
//	public final android.database.Cursor managedQuery(android.net.Uri a0, String[] a1, String a2, String a3) {
//		return ((android.app.Activity) proxy).managedQuery(a0, a1, a2, a3);
//	}

	/** from class android.app.Activity */
	public final android.database.Cursor managedQuery(android.net.Uri a0, String[] a1, String a2, String[] a3, String a4) {
		return ((android.app.Activity) proxy).managedQuery(a0, a1, a2, a3, a4);
	}

	/** from class android.app.Activity */
	public boolean moveTaskToBack(boolean a0) {
		return (Boolean) proxy._s_(new Object[] { 3056, a0 } );
	}

	/** from class android.app.Activity */
	public boolean navigateUpTo(android.content.Intent a0) {
		return (Boolean) proxy._s_(new Object[] { 3057, a0 } );
	}

	/** from class android.app.Activity */
	public boolean navigateUpToFromChild(android.app.Activity a0, android.content.Intent a1) {
		return (Boolean) proxy._s_(new Object[] { 3058, a0, a1 } );
	}

	/** from class android.app.Activity */
	public void onActionModeFinished(android.view.ActionMode a0) {
		proxy._s_(new Object[] { 3059, a0 } );
	}

	/** from class android.app.Activity */
	public void onActionModeStarted(android.view.ActionMode a0) {
		proxy._s_(new Object[] { 3060, a0 } );
	}

	/** from class android.app.Activity */
	protected void onActivityResult(int a0, int a1, android.content.Intent a2) {
		proxy._s_(new Object[] { 3061, a0, a1, a2 } );
	}

	/** from class android.app.Activity */
	public void onAttachFragment(android.app.Fragment a0) {
		proxy._s_(new Object[] { 3062, a0 } );
	}

	/** from class android.app.Activity */
	public void onAttachedToWindow() {
		proxy._s_(new Object[] { 3063 } );
	}

	/** from class android.app.Activity */
	public void onBackPressed() {
		proxy._s_(new Object[] { 3064 } );
	}

	/** from class android.app.Activity */
	protected void onChildTitleChanged(android.app.Activity a0, CharSequence a1) {
		proxy._s_(new Object[] { 3065, a0, a1 } );
	}

	/** from class android.app.Activity */
	public void onConfigurationChanged(android.content.res.Configuration a0) {
		proxy._s_(new Object[] { 3066, a0 } );
	}

	/** from class android.app.Activity */
	public void onContentChanged() {
		proxy._s_(new Object[] { 3067 } );
	}

	/** from class android.app.Activity */
	public boolean onContextItemSelected(android.view.MenuItem a0) {
		return (Boolean) proxy._s_(new Object[] { 3068, a0 } );
	}

	/** from class android.app.Activity */
	public void onContextMenuClosed(android.view.Menu a0) {
		proxy._s_(new Object[] { 3069, a0 } );
	}

	/** from class android.app.Activity */
	protected void onCreate(android.os.Bundle a0) {
		proxy._s_(new Object[] { 3070, a0 } );
	}

	/** from class android.app.Activity */
	public void onCreateContextMenu(android.view.ContextMenu a0, android.view.View a1, android.view.ContextMenu.ContextMenuInfo a2) {
		proxy._s_(new Object[] { 3071, a0, a1, a2 } );
	}

	/** from class android.app.Activity */
	public CharSequence onCreateDescription() {
		return (CharSequence) proxy._s_(new Object[] { 3072 } );
	}

	/** from class android.app.Activity */
	protected android.app.Dialog onCreateDialog(int a0) {
		return (android.app.Dialog) proxy._s_(new Object[] { 3073, a0 } );
	}

	/** from class android.app.Activity */
	protected android.app.Dialog onCreateDialog(int a0, android.os.Bundle a1) {
		return (android.app.Dialog) proxy._s_(new Object[] { 3074, a0, a1 } );
	}

	/** from class android.app.Activity */
	public void onCreateNavigateUpTaskStack(android.app.TaskStackBuilder a0) {
		proxy._s_(new Object[] { 3075, a0 } );
	}

	/** from class android.app.Activity */
	public boolean onCreateOptionsMenu(android.view.Menu a0) {
		return (Boolean) proxy._s_(new Object[] { 3076, a0 } );
	}

	/** from class android.app.Activity */
	public boolean onCreatePanelMenu(int a0, android.view.Menu a1) {
		return (Boolean) proxy._s_(new Object[] { 3077, a0, a1 } );
	}

	/** from class android.app.Activity */
	public android.view.View onCreatePanelView(int a0) {
		return (android.view.View) proxy._s_(new Object[] { 3078, a0 } );
	}

	/** from class android.app.Activity */
	public boolean onCreateThumbnail(android.graphics.Bitmap a0, android.graphics.Canvas a1) {
		return (Boolean) proxy._s_(new Object[] { 3079, a0, a1 } );
	}

	/** from class android.app.Activity */
	public android.view.View onCreateView(android.view.View a0, String a1, android.content.Context a2, android.util.AttributeSet a3) {
		return (android.view.View) proxy._s_(new Object[] { 3080, a0, a1, a2, a3 } );
	}

	/** from class android.app.Activity */
	public android.view.View onCreateView(String a0, android.content.Context a1, android.util.AttributeSet a2) {
		return (android.view.View) proxy._s_(new Object[] { 3081, a0, a1, a2 } );
	}

	/** from class android.app.Activity */
	protected void onDestroy() {
		proxy._s_(new Object[] { 3082 } );
	}

	/** from class android.app.Activity */
	public void onDetachedFromWindow() {
		proxy._s_(new Object[] { 3083 } );
	}

	/** from class android.app.Activity */
	public boolean onGenericMotionEvent(android.view.MotionEvent a0) {
		return (Boolean) proxy._s_(new Object[] { 3084, a0 } );
	}

	/** from class android.app.Activity */
	public boolean onKeyDown(int a0, android.view.KeyEvent a1) {
		return (Boolean) proxy._s_(new Object[] { 3085, a0, a1 } );
	}

	/** from class android.app.Activity */
	public boolean onKeyLongPress(int a0, android.view.KeyEvent a1) {
		return (Boolean) proxy._s_(new Object[] { 3086, a0, a1 } );
	}

	/** from class android.app.Activity */
	public boolean onKeyMultiple(int a0, int a1, android.view.KeyEvent a2) {
		return (Boolean) proxy._s_(new Object[] { 3087, a0, a1, a2 } );
	}

	/** from class android.app.Activity */
	public boolean onKeyShortcut(int a0, android.view.KeyEvent a1) {
		return (Boolean) proxy._s_(new Object[] { 3088, a0, a1 } );
	}

	/** from class android.app.Activity */
	public boolean onKeyUp(int a0, android.view.KeyEvent a1) {
		return (Boolean) proxy._s_(new Object[] { 3089, a0, a1 } );
	}

	/** from class android.app.Activity */
	public void onLowMemory() {
		proxy._s_(new Object[] { 3090 } );
	}

	/** from class android.app.Activity */
	public boolean onMenuItemSelected(int a0, android.view.MenuItem a1) {
		return (Boolean) proxy._s_(new Object[] { 3091, a0, a1 } );
	}

	/** from class android.app.Activity */
	public boolean onMenuOpened(int a0, android.view.Menu a1) {
		return (Boolean) proxy._s_(new Object[] { 3092, a0, a1 } );
	}

	/** from class android.app.Activity */
	public boolean onNavigateUp() {
		return (Boolean) proxy._s_(new Object[] { 3093 } );
	}

	/** from class android.app.Activity */
	public boolean onNavigateUpFromChild(android.app.Activity a0) {
		return (Boolean) proxy._s_(new Object[] { 3094, a0 } );
	}

	/** from class android.app.Activity */
	protected void onNewIntent(android.content.Intent a0) {
		proxy._s_(new Object[] { 3095, a0 } );
	}

	/** from class android.app.Activity */
	public boolean onOptionsItemSelected(android.view.MenuItem a0) {
		return (Boolean) proxy._s_(new Object[] { 3096, a0 } );
	}

	/** from class android.app.Activity */
	public void onOptionsMenuClosed(android.view.Menu a0) {
		proxy._s_(new Object[] { 3097, a0 } );
	}

	/** from class android.app.Activity */
	public void onPanelClosed(int a0, android.view.Menu a1) {
		proxy._s_(new Object[] { 3098, a0, a1 } );
	}

	/** from class android.app.Activity */
	protected void onPause() {
		proxy._s_(new Object[] { 3099 } );
	}

	/** from class android.app.Activity */
	protected void onPostCreate(android.os.Bundle a0) {
		proxy._s_(new Object[] { 3100, a0 } );
	}

	/** from class android.app.Activity */
	protected void onPostResume() {
		proxy._s_(new Object[] { 3101 } );
	}

	/** from class android.app.Activity */
	protected void onPrepareDialog(int a0, android.app.Dialog a1) {
		proxy._s_(new Object[] { 3102, a0, a1 } );
	}

	/** from class android.app.Activity */
	protected void onPrepareDialog(int a0, android.app.Dialog a1, android.os.Bundle a2) {
		proxy._s_(new Object[] { 3103, a0, a1, a2 } );
	}

	/** from class android.app.Activity */
	public void onPrepareNavigateUpTaskStack(android.app.TaskStackBuilder a0) {
		proxy._s_(new Object[] { 3104, a0 } );
	}

	/** from class android.app.Activity */
	public boolean onPrepareOptionsMenu(android.view.Menu a0) {
		return (Boolean) proxy._s_(new Object[] { 3105, a0 } );
	}

	/** from class android.app.Activity */
	public boolean onPreparePanel(int a0, android.view.View a1, android.view.Menu a2) {
		return (Boolean) proxy._s_(new Object[] { 3106, a0, a1, a2 } );
	}

	/** from class android.app.Activity */
	public void onProvideAssistData(android.os.Bundle a0) {
		proxy._s_(new Object[] { 3107, a0 } );
	}

	/** from class android.app.Activity */
	protected void onRestart() {
		proxy._s_(new Object[] { 3108 } );
	}

	/** from class android.app.Activity */
	protected void onRestoreInstanceState(android.os.Bundle a0) {
		proxy._s_(new Object[] { 3109, a0 } );
	}

	/** from class android.app.Activity */
	protected void onResume() {
		proxy._s_(new Object[] { 3110 } );
	}

	/** from class android.app.Activity */
	public Object onRetainNonConfigurationInstance() {
		if (proxy instanceof FragmentActivity) {
			return ((FragmentActivity) proxy).onRetainNonConfigurationInstance();
		} else {
			return (Object) proxy._s_(new Object[] { 3111 } );
		}
	}

	/** from class android.app.Activity */
	protected void onSaveInstanceState(android.os.Bundle a0) {
		proxy._s_(new Object[] { 3112, a0 } );
	}

	/** from class android.app.Activity */
	public boolean onSearchRequested() {
		return (Boolean) proxy._s_(new Object[] { 3113 } );
	}

	/** from class android.app.Activity */
	protected void onStart() {
		proxy._s_(new Object[] { 3114 } );
	}

	/** from class android.app.Activity */
	protected void onStop() {
		proxy._s_(new Object[] { 3115 } );
	}

	/** from class android.app.Activity */
	protected void onTitleChanged(CharSequence a0, int a1) {
		proxy._s_(new Object[] { 3116, a0, a1 } );
	}

	/** from class android.app.Activity */
	public boolean onTouchEvent(android.view.MotionEvent a0) {
		return (Boolean) proxy._s_(new Object[] { 3117, a0 } );
	}

	/** from class android.app.Activity */
	public boolean onTrackballEvent(android.view.MotionEvent a0) {
		return (Boolean) proxy._s_(new Object[] { 3118, a0 } );
	}

	/** from class android.app.Activity */
	public void onTrimMemory(int a0) {
		proxy._s_(new Object[] { 3119, a0 } );
	}

	/** from class android.app.Activity */
	public void onUserInteraction() {
		proxy._s_(new Object[] { 3120 } );
	}

	/** from class android.app.Activity */
	protected void onUserLeaveHint() {
		proxy._s_(new Object[] { 3121 } );
	}

	/** from class android.app.Activity */
	public void onWindowAttributesChanged(android.view.WindowManager.LayoutParams a0) {
		proxy._s_(new Object[] { 3122, a0 } );
	}

	/** from class android.app.Activity */
	public void onWindowFocusChanged(boolean a0) {
		proxy._s_(new Object[] { 3123, a0 } );
	}

	/** from class android.app.Activity */
	public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback a0) {
		return (android.view.ActionMode) proxy._s_(new Object[] { 3124, a0 } );
	}

	/** from class android.app.Activity */
	public void openContextMenu(android.view.View a0) {
		proxy._s_(new Object[] { 3125, a0 } );
	}

	/** from class android.app.Activity */
	public void openOptionsMenu() {
		proxy._s_(new Object[] { 3126 } );
	}

	/** from class android.app.Activity */
	public void overridePendingTransition(int a0, int a1) {
		proxy._s_(new Object[] { 3127, a0, a1 } );
	}

	/** from class android.app.Activity */
	public void recreate() {
		proxy._s_(new Object[] { 3128 } );
	}

	/** from class android.app.Activity */
	public void registerForContextMenu(android.view.View a0) {
		proxy._s_(new Object[] { 3129, a0 } );
	}

	/** from class android.app.Activity */
	public final void removeDialog(int a0) {
		((android.app.Activity) proxy).removeDialog(a0);
	}

	/** from class android.app.Activity */
	public void reportFullyDrawn() {
		proxy._s_(new Object[] { 3131 } );
	}

	/** from class android.app.Activity */
	public final boolean requestWindowFeature(int a0) {
		return ((android.app.Activity) proxy).requestWindowFeature(a0);
	}

	/** from class android.app.Activity */
	public final void runOnUiThread(Runnable a0) {
		((android.app.Activity) proxy).runOnUiThread(a0);
	}

	/** from class android.app.Activity */
	public void setContentView(int a0) {
		proxy._s_(new Object[] { 3134, a0 } );
	}

	/** from class android.app.Activity */
	public void setContentView(android.view.View a0) {
		proxy._s_(new Object[] { 3135, a0 } );
	}

	/** from class android.app.Activity */
	public void setContentView(android.view.View a0, android.view.ViewGroup.LayoutParams a1) {
		proxy._s_(new Object[] { 3136, a0, a1 } );
	}

	/** from class android.app.Activity */
	public final void setDefaultKeyMode(int a0) {
		((android.app.Activity) proxy).setDefaultKeyMode(a0);
	}

	/** from class android.app.Activity */
	public final void setFeatureDrawable(int a0, android.graphics.drawable.Drawable a1) {
		((android.app.Activity) proxy).setFeatureDrawable(a0, a1);
	}

	/** from class android.app.Activity */
	public final void setFeatureDrawableAlpha(int a0, int a1) {
		((android.app.Activity) proxy).setFeatureDrawableAlpha(a0, a1);
	}

	/** from class android.app.Activity */
	public final void setFeatureDrawableResource(int a0, int a1) {
		((android.app.Activity) proxy).setFeatureDrawableResource(a0, a1);
	}

	/** from class android.app.Activity */
	public final void setFeatureDrawableUri(int a0, android.net.Uri a1) {
		((android.app.Activity) proxy).setFeatureDrawableUri(a0, a1);
	}

	/** from class android.app.Activity */
	public void setFinishOnTouchOutside(boolean a0) {
		proxy._s_(new Object[] { 3142, a0 } );
	}

	/** from class android.app.Activity */
	public void setImmersive(boolean a0) {
		proxy._s_(new Object[] { 3143, a0 } );
	}

	/** from class android.app.Activity */
	public void setIntent(android.content.Intent a0) {
		proxy._s_(new Object[] { 3144, a0 } );
	}

//	/** from class android.app.Activity */
//	public void setPersistent(boolean a0) {
//		proxy._s_(new Object[] { 3145, a0 } );
//	}

	/** from class android.app.Activity */
	public final void setProgress(int a0) {
		((android.app.Activity) proxy).setProgress(a0);
	}

	/** from class android.app.Activity */
	public final void setProgressBarIndeterminate(boolean a0) {
		((android.app.Activity) proxy).setProgressBarIndeterminate(a0);
	}

	/** from class android.app.Activity */
	public final void setProgressBarIndeterminateVisibility(boolean a0) {
		((android.app.Activity) proxy).setProgressBarIndeterminateVisibility(a0);
	}

	/** from class android.app.Activity */
	public final void setProgressBarVisibility(boolean a0) {
		((android.app.Activity) proxy).setProgressBarVisibility(a0);
	}

	/** from class android.app.Activity */
	public void setRequestedOrientation(int a0) {
		proxy._s_(new Object[] { 3150, a0 } );
	}

	/** from class android.app.Activity */
	public final void setResult(int a0) {
		((android.app.Activity) proxy).setResult(a0);
	}

	/** from class android.app.Activity */
	public final void setResult(int a0, android.content.Intent a1) {
		((android.app.Activity) proxy).setResult(a0, a1);
	}

	/** from class android.app.Activity */
	public final void setSecondaryProgress(int a0) {
		((android.app.Activity) proxy).setSecondaryProgress(a0);
	}

	/** from class android.app.Activity */
	public void setTitle(int a0) {
		proxy._s_(new Object[] { 3154, a0 } );
	}

	/** from class android.app.Activity */
	public void setTitle(CharSequence a0) {
		proxy._s_(new Object[] { 3155, a0 } );
	}

	/** from class android.app.Activity */
	public void setTitleColor(int a0) {
		proxy._s_(new Object[] { 3156, a0 } );
	}

	/** from class android.app.Activity */
	public void setVisible(boolean a0) {
		proxy._s_(new Object[] { 3157, a0 } );
	}

	/** from class android.app.Activity */
	public final void setVolumeControlStream(int a0) {
		((android.app.Activity) proxy).setVolumeControlStream(a0);
	}

	/** from class android.app.Activity */
	public boolean shouldUpRecreateTask(android.content.Intent a0) {
		return (Boolean) proxy._s_(new Object[] { 3159, a0 } );
	}

	/** from class android.app.Activity */
	public final void showDialog(int a0) {
		((android.app.Activity) proxy).showDialog(a0);
	}

	/** from class android.app.Activity */
	public final boolean showDialog(int a0, android.os.Bundle a1) {
		return ((android.app.Activity) proxy).showDialog(a0, a1);
	}

	/** from class android.app.Activity */
	public android.view.ActionMode startActionMode(android.view.ActionMode.Callback a0) {
		return (android.view.ActionMode) proxy._s_(new Object[] { 3162, a0 } );
	}

	/** from class android.app.Activity */
	public void startActivityForResult(android.content.Intent a0, int a1) {
		proxy._s_(new Object[] { 3163, a0, a1 } );
	}

	/** from class android.app.Activity */
	public void startActivityForResult(android.content.Intent a0, int a1, android.os.Bundle a2) {
		proxy._s_(new Object[] { 3164, a0, a1, a2 } );
	}

	/** from class android.app.Activity */
	public void startActivityFromChild(android.app.Activity a0, android.content.Intent a1, int a2) {
		proxy._s_(new Object[] { 3165, a0, a1, a2 } );
	}

	/** from class android.app.Activity */
	public void startActivityFromChild(android.app.Activity a0, android.content.Intent a1, int a2, android.os.Bundle a3) {
		proxy._s_(new Object[] { 3166, a0, a1, a2, a3 } );
	}

	/** from class android.app.Activity */
	public void startActivityFromFragment(android.app.Fragment a0, android.content.Intent a1, int a2) {
		proxy._s_(new Object[] { 3167, a0, a1, a2 } );
	}

	/** from class android.app.Activity */
	public void startActivityFromFragment(android.app.Fragment a0, android.content.Intent a1, int a2, android.os.Bundle a3) {
		proxy._s_(new Object[] { 3168, a0, a1, a2, a3 } );
	}

	/** from class android.app.Activity */
	public boolean startActivityIfNeeded(android.content.Intent a0, int a1) {
		return (Boolean) proxy._s_(new Object[] { 3169, a0, a1 } );
	}

	/** from class android.app.Activity */
	public boolean startActivityIfNeeded(android.content.Intent a0, int a1, android.os.Bundle a2) {
		return (Boolean) proxy._s_(new Object[] { 3170, a0, a1, a2 } );
	}

	/** from class android.app.Activity */
	public void startIntentSenderForResult(android.content.IntentSender a0, int a1, android.content.Intent a2, int a3, int a4, int a5) throws android.content.IntentSender.SendIntentException {
		proxy._s_(new Object[] { 3171, a0, a1, a2, a3, a4, a5 } );
	}

	/** from class android.app.Activity */
	public void startIntentSenderForResult(android.content.IntentSender a0, int a1, android.content.Intent a2, int a3, int a4, int a5, android.os.Bundle a6) throws android.content.IntentSender.SendIntentException {
		proxy._s_(new Object[] { 3172, a0, a1, a2, a3, a4, a5, a6 } );
	}

	/** from class android.app.Activity */
	public void startIntentSenderFromChild(android.app.Activity a0, android.content.IntentSender a1, int a2, android.content.Intent a3, int a4, int a5, int a6) throws android.content.IntentSender.SendIntentException {
		proxy._s_(new Object[] { 3173, a0, a1, a2, a3, a4, a5, a6 } );
	}

	/** from class android.app.Activity */
	public void startIntentSenderFromChild(android.app.Activity a0, android.content.IntentSender a1, int a2, android.content.Intent a3, int a4, int a5, int a6, android.os.Bundle a7) throws android.content.IntentSender.SendIntentException {
		proxy._s_(new Object[] { 3174, a0, a1, a2, a3, a4, a5, a6, a7 } );
	}

	/** from class android.app.Activity */
	public void startManagingCursor(android.database.Cursor a0) {
		proxy._s_(new Object[] { 3175, a0 } );
	}

	/** from class android.app.Activity */
	public boolean startNextMatchingActivity(android.content.Intent a0) {
		return (Boolean) proxy._s_(new Object[] { 3176, a0 } );
	}

	/** from class android.app.Activity */
	public boolean startNextMatchingActivity(android.content.Intent a0, android.os.Bundle a1) {
		return (Boolean) proxy._s_(new Object[] { 3177, a0, a1 } );
	}

	/** from class android.app.Activity */
	public void startSearch(String a0, boolean a1, android.os.Bundle a2, boolean a3) {
		proxy._s_(new Object[] { 3178, a0, a1, a2, a3 } );
	}

	/** from class android.app.Activity */
	public void stopManagingCursor(android.database.Cursor a0) {
		proxy._s_(new Object[] { 3179, a0 } );
	}

	/** from class android.app.Activity */
	public void takeKeyEvents(boolean a0) {
		proxy._s_(new Object[] { 3180, a0 } );
	}

	/** from class android.app.Activity */
	public void triggerSearch(String a0, android.os.Bundle a1) {
		proxy._s_(new Object[] { 3181, a0, a1 } );
	}

	/** from class android.app.Activity */
	public void unregisterForContextMenu(android.view.View a0) {
		proxy._s_(new Object[] { 3182, a0 } );
	}

	/** from class android.app.ActivityGroup */
	public android.app.Activity getCurrentActivity() {
		return (android.app.Activity) proxy._s_(new Object[] { 4000 } );
	}

	/** from class android.app.ActivityGroup */
	public final android.app.LocalActivityManager getLocalActivityManager() {
		return ((android.app.ActivityGroup) proxy).getLocalActivityManager();
	}

//	/** from class android.app.ActivityGroup */
//	public java.util.HashMap onRetainNonConfigurationChildInstances() {
//		return (java.util.HashMap) proxy._s_(new Object[] { 4002 } );
//	}

	/** from class android.app.TabActivity */
	public android.widget.TabHost getTabHost() {
		return (android.widget.TabHost) proxy._s_(new Object[] { 5000 } );
	}

	/** from class android.app.TabActivity */
	public android.widget.TabWidget getTabWidget() {
		return (android.widget.TabWidget) proxy._s_(new Object[] { 5001 } );
	}

	/** from class android.app.TabActivity */
	public void setDefaultTab(int a0) {
		proxy._s_(new Object[] { 5002, a0 } );
	}

	/** from class android.app.TabActivity */
	public void setDefaultTab(String a0) {
		proxy._s_(new Object[] { 5003, a0 } );
	}

	/** from class android.support.v4.app.FragmentActivity */
	public Object getLastCustomNonConfigurationInstance() {
		return (Object) proxy._s_(new Object[] { 6000 } );
	}

	/** from class android.support.v4.app.FragmentActivity */
	public android.support.v4.app.FragmentManager getSupportFragmentManager() {
		return (android.support.v4.app.FragmentManager) proxy._s_(new Object[] { 6001 } );
	}

	/** from class android.support.v4.app.FragmentActivity */
	public android.support.v4.app.LoaderManager getSupportLoaderManager() {
		return (android.support.v4.app.LoaderManager) proxy._s_(new Object[] { 6002 } );
	}

	/** from class android.support.v4.app.FragmentActivity */
	public void onAttachFragment(android.support.v4.app.Fragment a0) {
		proxy._s_(new Object[] { 6003, a0 } );
	}

	/** from class android.support.v4.app.FragmentActivity */
	protected boolean onPrepareOptionsPanel(android.view.View a0, android.view.Menu a1) {
		return (Boolean) proxy._s_(new Object[] { 6004, a0, a1 } );
	}

	/** from class android.support.v4.app.FragmentActivity */
	protected void onResumeFragments() {
		proxy._s_(new Object[] { 6005 } );
	}

	/** from class android.support.v4.app.FragmentActivity */
	public Object onRetainCustomNonConfigurationInstance() {
		return (Object) proxy._s_(new Object[] { 6006 } );
	}

	/** from class android.support.v4.app.FragmentActivity */
	public void startActivityFromFragment(android.support.v4.app.Fragment a0, android.content.Intent a1, int a2) {
		proxy._s_(new Object[] { 6007, a0, a1, a2 } );
	}

	/** from class android.support.v4.app.FragmentActivity */
	public void supportInvalidateOptionsMenu() {
		proxy._s_(new Object[] { 6008 } );
	}

	/** from class android.app.ListActivity */
	public android.widget.ListAdapter getListAdapter() {
		return (android.widget.ListAdapter) proxy._s_(new Object[] { 7000 } );
	}

	/** from class android.app.ListActivity */
	public android.widget.ListView getListView() {
		return (android.widget.ListView) proxy._s_(new Object[] { 7001 } );
	}

	/** from class android.app.ListActivity */
	public long getSelectedItemId() {
		return (Long) proxy._s_(new Object[] { 7002 } );
	}

	/** from class android.app.ListActivity */
	public int getSelectedItemPosition() {
		return (Integer) proxy._s_(new Object[] { 7003 } );
	}

	/** from class android.app.ListActivity */
	protected void onListItemClick(android.widget.ListView a0, android.view.View a1, int a2, long a3) {
		proxy._s_(new Object[] { 7004, a0, a1, a2, a3 } );
	}

	/** from class android.app.ListActivity */
	public void setListAdapter(android.widget.ListAdapter a0) {
		proxy._s_(new Object[] { 7005, a0 } );
	}

	/** from class android.app.ListActivity */
	public void setSelection(int a0) {
		proxy._s_(new Object[] { 7006, a0 } );
	}

}
