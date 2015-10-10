package com.roxstudio.proxycomponent;

import android.annotation.SuppressLint;
import android.app.ListActivity;

@SuppressLint({ "NewApi", "MissingSuperCall" })
@SuppressWarnings("deprecation")
final public class ProxyListActivity extends ListActivity implements Proxied._S_ {
	
	private Proxied<ListActivity> proxied;
	
	/** from class android.content.Context */
	public boolean bindService(android.content.Intent a0, android.content.ServiceConnection a1, int a2) {
		return proxied != null ? proxied.bindService(a0, a1, a2) : super.bindService(a0, a1, a2);
	}

//	/** from class android.content.Context */
//	public boolean bindServiceAsUser(android.content.Intent a0, android.content.ServiceConnection a1, int a2, android.os.UserHandle a3) {
//		return proxied != null ? proxied.bindServiceAsUser(a0, a1, a2, a3) : super.bindServiceAsUser(a0, a1, a2, a3);
//	}

	/** from class android.content.Context */
	public int checkCallingOrSelfPermission(String a0) {
		return proxied != null ? proxied.checkCallingOrSelfPermission(a0) : super.checkCallingOrSelfPermission(a0);
	}

	/** from class android.content.Context */
	public int checkCallingOrSelfUriPermission(android.net.Uri a0, int a1) {
		return proxied != null ? proxied.checkCallingOrSelfUriPermission(a0, a1) : super.checkCallingOrSelfUriPermission(a0, a1);
	}

	/** from class android.content.Context */
	public int checkCallingPermission(String a0) {
		return proxied != null ? proxied.checkCallingPermission(a0) : super.checkCallingPermission(a0);
	}

	/** from class android.content.Context */
	public int checkCallingUriPermission(android.net.Uri a0, int a1) {
		return proxied != null ? proxied.checkCallingUriPermission(a0, a1) : super.checkCallingUriPermission(a0, a1);
	}

	/** from class android.content.Context */
	public int checkPermission(String a0, int a1, int a2) {
		return proxied != null ? proxied.checkPermission(a0, a1, a2) : super.checkPermission(a0, a1, a2);
	}

	/** from class android.content.Context */
	public int checkUriPermission(android.net.Uri a0, int a1, int a2, int a3) {
		return proxied != null ? proxied.checkUriPermission(a0, a1, a2, a3) : super.checkUriPermission(a0, a1, a2, a3);
	}

	/** from class android.content.Context */
	public int checkUriPermission(android.net.Uri a0, String a1, String a2, int a3, int a4, int a5) {
		return proxied != null ? proxied.checkUriPermission(a0, a1, a2, a3, a4, a5) : super.checkUriPermission(a0, a1, a2, a3, a4, a5);
	}

	/** from class android.content.Context */
	public void clearWallpaper() throws java.io.IOException {
		if (proxied != null) proxied.clearWallpaper(); else super.clearWallpaper();
	}

	/** from class android.content.Context */
	public android.content.Context createConfigurationContext(android.content.res.Configuration a0) {
		return proxied != null ? proxied.createConfigurationContext(a0) : super.createConfigurationContext(a0);
	}

	/** from class android.content.Context */
	public android.content.Context createDisplayContext(android.view.Display a0) {
		return proxied != null ? proxied.createDisplayContext(a0) : super.createDisplayContext(a0);
	}

	/** from class android.content.Context */
	public android.content.Context createPackageContext(String a0, int a1) throws android.content.pm.PackageManager.NameNotFoundException {
		return proxied != null ? proxied.createPackageContext(a0, a1) : super.createPackageContext(a0, a1);
	}

//	/** from class android.content.Context */
//	public android.content.Context createPackageContextAsUser(String a0, int a1, android.os.UserHandle a2) throws android.content.pm.PackageManager.NameNotFoundException {
//		return proxied != null ? proxied.createPackageContextAsUser(a0, a1, a2) : super.createPackageContextAsUser(a0, a1, a2);
//	}

	/** from class android.content.Context */
	public String[] databaseList() {
		return proxied != null ? proxied.databaseList() : super.databaseList();
	}

	/** from class android.content.Context */
	public boolean deleteDatabase(String a0) {
		return proxied != null ? proxied.deleteDatabase(a0) : super.deleteDatabase(a0);
	}

	/** from class android.content.Context */
	public boolean deleteFile(String a0) {
		return proxied != null ? proxied.deleteFile(a0) : super.deleteFile(a0);
	}

	/** from class android.content.Context */
	public void enforceCallingOrSelfPermission(String a0, String a1) {
		if (proxied != null) proxied.enforceCallingOrSelfPermission(a0, a1); else super.enforceCallingOrSelfPermission(a0, a1);
	}

	/** from class android.content.Context */
	public void enforceCallingOrSelfUriPermission(android.net.Uri a0, int a1, String a2) {
		if (proxied != null) proxied.enforceCallingOrSelfUriPermission(a0, a1, a2); else super.enforceCallingOrSelfUriPermission(a0, a1, a2);
	}

	/** from class android.content.Context */
	public void enforceCallingPermission(String a0, String a1) {
		if (proxied != null) proxied.enforceCallingPermission(a0, a1); else super.enforceCallingPermission(a0, a1);
	}

	/** from class android.content.Context */
	public void enforceCallingUriPermission(android.net.Uri a0, int a1, String a2) {
		if (proxied != null) proxied.enforceCallingUriPermission(a0, a1, a2); else super.enforceCallingUriPermission(a0, a1, a2);
	}

	/** from class android.content.Context */
	public void enforcePermission(String a0, int a1, int a2, String a3) {
		if (proxied != null) proxied.enforcePermission(a0, a1, a2, a3); else super.enforcePermission(a0, a1, a2, a3);
	}

	/** from class android.content.Context */
	public void enforceUriPermission(android.net.Uri a0, int a1, int a2, int a3, String a4) {
		if (proxied != null) proxied.enforceUriPermission(a0, a1, a2, a3, a4); else super.enforceUriPermission(a0, a1, a2, a3, a4);
	}

	/** from class android.content.Context */
	public void enforceUriPermission(android.net.Uri a0, String a1, String a2, int a3, int a4, int a5, String a6) {
		if (proxied != null) proxied.enforceUriPermission(a0, a1, a2, a3, a4, a5, a6); else super.enforceUriPermission(a0, a1, a2, a3, a4, a5, a6);
	}

	/** from class android.content.Context */
	public String[] fileList() {
		return proxied != null ? proxied.fileList() : super.fileList();
	}

	/** from class android.content.Context */
	public android.content.Context getApplicationContext() {
		return proxied != null ? proxied.getApplicationContext() : super.getApplicationContext();
	}

	/** from class android.content.Context */
	public android.content.pm.ApplicationInfo getApplicationInfo() {
		return proxied != null ? proxied.getApplicationInfo() : super.getApplicationInfo();
	}

	/** from class android.content.Context */
	public android.content.res.AssetManager getAssets() {
		return proxied != null ? proxied.getAssets() : super.getAssets();
	}

//	/** from class android.content.Context */
//	public String getBasePackageName() {
//		return proxied != null ? proxied.getBasePackageName() : super.getBasePackageName();
//	}

	/** from class android.content.Context */
	public java.io.File getCacheDir() {
		return proxied != null ? proxied.getCacheDir() : super.getCacheDir();
	}

	/** from class android.content.Context */
	public ClassLoader getClassLoader() {
		return proxied != null ? proxied.getClassLoader() : super.getClassLoader();
	}

	/** from class android.content.Context */
	public android.content.ContentResolver getContentResolver() {
		return proxied != null ? proxied.getContentResolver() : super.getContentResolver();
	}

	/** from class android.content.Context */
	public java.io.File getDatabasePath(String a0) {
		return proxied != null ? proxied.getDatabasePath(a0) : super.getDatabasePath(a0);
	}

	/** from class android.content.Context */
	public java.io.File getDir(String a0, int a1) {
		return proxied != null ? proxied.getDir(a0, a1) : super.getDir(a0, a1);
	}

//	/** from class android.content.Context */
//	public android.view.DisplayAdjustments getDisplayAdjustments(int a0) {
//		return proxied != null ? proxied.getDisplayAdjustments(a0) : super.getDisplayAdjustments(a0);
//	}

	/** from class android.content.Context */
	public java.io.File getExternalCacheDir() {
		return proxied != null ? proxied.getExternalCacheDir() : super.getExternalCacheDir();
	}

	/** from class android.content.Context */
	public java.io.File[] getExternalCacheDirs() {
		return proxied != null ? proxied.getExternalCacheDirs() : super.getExternalCacheDirs();
	}

	/** from class android.content.Context */
	public java.io.File getExternalFilesDir(String a0) {
		return proxied != null ? proxied.getExternalFilesDir(a0) : super.getExternalFilesDir(a0);
	}

	/** from class android.content.Context */
	public java.io.File[] getExternalFilesDirs(String a0) {
		return proxied != null ? proxied.getExternalFilesDirs(a0) : super.getExternalFilesDirs(a0);
	}

	/** from class android.content.Context */
	public java.io.File getFileStreamPath(String a0) {
		return proxied != null ? proxied.getFileStreamPath(a0) : super.getFileStreamPath(a0);
	}

	/** from class android.content.Context */
	public java.io.File getFilesDir() {
		return proxied != null ? proxied.getFilesDir() : super.getFilesDir();
	}

	/** from class android.content.Context */
	public android.os.Looper getMainLooper() {
		return proxied != null ? proxied.getMainLooper() : super.getMainLooper();
	}

	/** from class android.content.Context */
	public java.io.File getObbDir() {
		return proxied != null ? proxied.getObbDir() : super.getObbDir();
	}

	/** from class android.content.Context */
	public java.io.File[] getObbDirs() {
		return proxied != null ? proxied.getObbDirs() : super.getObbDirs();
	}

//	/** from class android.content.Context */
//	public String getOpPackageName() {
//		return proxied != null ? proxied.getOpPackageName() : super.getOpPackageName();
//	}

	/** from class android.content.Context */
	public String getPackageCodePath() {
		return proxied != null ? proxied.getPackageCodePath() : super.getPackageCodePath();
	}

	/** from class android.content.Context */
	public android.content.pm.PackageManager getPackageManager() {
		return proxied != null ? proxied.getPackageManager() : super.getPackageManager();
	}

	/** from class android.content.Context */
	public String getPackageName() {
		return proxied != null ? proxied.getPackageName() : super.getPackageName();
	}

	/** from class android.content.Context */
	public String getPackageResourcePath() {
		return proxied != null ? proxied.getPackageResourcePath() : super.getPackageResourcePath();
	}

	/** from class android.content.Context */
	public android.content.res.Resources getResources() {
		return proxied != null ? proxied.getResources() : super.getResources();
	}

	/** from class android.content.Context */
	public android.content.SharedPreferences getSharedPreferences(String a0, int a1) {
		return proxied != null ? proxied.getSharedPreferences(a0, a1) : super.getSharedPreferences(a0, a1);
	}

//	/** from class android.content.Context */
//	public java.io.File getSharedPrefsFile(String a0) {
//		return proxied != null ? proxied.getSharedPrefsFile(a0) : super.getSharedPrefsFile(a0);
//	}

	/** from class android.content.Context */
	public Object getSystemService(String a0) {
		return proxied != null ? proxied.getSystemService(a0) : super.getSystemService(a0);
	}

	/** from class android.content.Context */
	public android.content.res.Resources.Theme getTheme() {
		return proxied != null ? proxied.getTheme() : super.getTheme();
	}

//	/** from class android.content.Context */
//	public int getThemeResId() {
//		return proxied != null ? proxied.getThemeResId() : super.getThemeResId();
//	}

//	/** from class android.content.Context */
//	public int getUserId() {
//		return proxied != null ? proxied.getUserId() : super.getUserId();
//	}

	/** from class android.content.Context */
	public android.graphics.drawable.Drawable getWallpaper() {
		return proxied != null ? proxied.getWallpaper() : super.getWallpaper();
	}

	/** from class android.content.Context */
	public int getWallpaperDesiredMinimumHeight() {
		return proxied != null ? proxied.getWallpaperDesiredMinimumHeight() : super.getWallpaperDesiredMinimumHeight();
	}

	/** from class android.content.Context */
	public int getWallpaperDesiredMinimumWidth() {
		return proxied != null ? proxied.getWallpaperDesiredMinimumWidth() : super.getWallpaperDesiredMinimumWidth();
	}

	/** from class android.content.Context */
	public void grantUriPermission(String a0, android.net.Uri a1, int a2) {
		if (proxied != null) proxied.grantUriPermission(a0, a1, a2); else super.grantUriPermission(a0, a1, a2);
	}

	/** from class android.content.Context */
	public boolean isRestricted() {
		return proxied != null ? proxied.isRestricted() : super.isRestricted();
	}

	/** from class android.content.Context */
	public java.io.FileInputStream openFileInput(String a0) throws java.io.FileNotFoundException {
		return proxied != null ? proxied.openFileInput(a0) : super.openFileInput(a0);
	}

	/** from class android.content.Context */
	public java.io.FileOutputStream openFileOutput(String a0, int a1) throws java.io.FileNotFoundException {
		return proxied != null ? proxied.openFileOutput(a0, a1) : super.openFileOutput(a0, a1);
	}

	/** from class android.content.Context */
	public android.database.sqlite.SQLiteDatabase openOrCreateDatabase(String a0, int a1, android.database.sqlite.SQLiteDatabase.CursorFactory a2) {
		return proxied != null ? proxied.openOrCreateDatabase(a0, a1, a2) : super.openOrCreateDatabase(a0, a1, a2);
	}

	/** from class android.content.Context */
	public android.database.sqlite.SQLiteDatabase openOrCreateDatabase(String a0, int a1, android.database.sqlite.SQLiteDatabase.CursorFactory a2, android.database.DatabaseErrorHandler a3) {
		return proxied != null ? proxied.openOrCreateDatabase(a0, a1, a2, a3) : super.openOrCreateDatabase(a0, a1, a2, a3);
	}

	/** from class android.content.Context */
	public android.graphics.drawable.Drawable peekWallpaper() {
		return proxied != null ? proxied.peekWallpaper() : super.peekWallpaper();
	}

	/** from class android.content.Context */
	public void registerComponentCallbacks(android.content.ComponentCallbacks a0) {
		if (proxied != null) proxied.registerComponentCallbacks(a0); else super.registerComponentCallbacks(a0);
	}

	/** from class android.content.Context */
	public android.content.Intent registerReceiver(android.content.BroadcastReceiver a0, android.content.IntentFilter a1) {
		return proxied != null ? proxied.registerReceiver(a0, a1) : super.registerReceiver(a0, a1);
	}

	/** from class android.content.Context */
	public android.content.Intent registerReceiver(android.content.BroadcastReceiver a0, android.content.IntentFilter a1, String a2, android.os.Handler a3) {
		return proxied != null ? proxied.registerReceiver(a0, a1, a2, a3) : super.registerReceiver(a0, a1, a2, a3);
	}

//	/** from class android.content.Context */
//	public android.content.Intent registerReceiverAsUser(android.content.BroadcastReceiver a0, android.os.UserHandle a1, android.content.IntentFilter a2, String a3, android.os.Handler a4) {
//		return proxied != null ? proxied.registerReceiverAsUser(a0, a1, a2, a3, a4) : super.registerReceiverAsUser(a0, a1, a2, a3, a4);
//	}

	/** from class android.content.Context */
	public void removeStickyBroadcast(android.content.Intent a0) {
		if (proxied != null) proxied.removeStickyBroadcast(a0); else super.removeStickyBroadcast(a0);
	}

	/** from class android.content.Context */
	public void removeStickyBroadcastAsUser(android.content.Intent a0, android.os.UserHandle a1) {
		if (proxied != null) proxied.removeStickyBroadcastAsUser(a0, a1); else super.removeStickyBroadcastAsUser(a0, a1);
	}

	/** from class android.content.Context */
	public void revokeUriPermission(android.net.Uri a0, int a1) {
		if (proxied != null) proxied.revokeUriPermission(a0, a1); else super.revokeUriPermission(a0, a1);
	}

	/** from class android.content.Context */
	public void sendBroadcast(android.content.Intent a0) {
		if (proxied != null) proxied.sendBroadcast(a0); else super.sendBroadcast(a0);
	}

	/** from class android.content.Context */
	public void sendBroadcast(android.content.Intent a0, String a1) {
		if (proxied != null) proxied.sendBroadcast(a0, a1); else super.sendBroadcast(a0, a1);
	}

//	/** from class android.content.Context */
//	public void sendBroadcast(android.content.Intent a0, String a1, int a2) {
//		if (proxied != null) proxied.sendBroadcast(a0, a1, a2); else super.sendBroadcast(a0, a1, a2);
//	}

	/** from class android.content.Context */
	public void sendBroadcastAsUser(android.content.Intent a0, android.os.UserHandle a1) {
		if (proxied != null) proxied.sendBroadcastAsUser(a0, a1); else super.sendBroadcastAsUser(a0, a1);
	}

	/** from class android.content.Context */
	public void sendBroadcastAsUser(android.content.Intent a0, android.os.UserHandle a1, String a2) {
		if (proxied != null) proxied.sendBroadcastAsUser(a0, a1, a2); else super.sendBroadcastAsUser(a0, a1, a2);
	}

	/** from class android.content.Context */
	public void sendOrderedBroadcast(android.content.Intent a0, String a1) {
		if (proxied != null) proxied.sendOrderedBroadcast(a0, a1); else super.sendOrderedBroadcast(a0, a1);
	}

//	/** from class android.content.Context */
//	public void sendOrderedBroadcast(android.content.Intent a0, String a1, int a2, android.content.BroadcastReceiver a3, android.os.Handler a4, int a5, String a6, android.os.Bundle a7) {
//		if (proxied != null) proxied.sendOrderedBroadcast(a0, a1, a2, a3, a4, a5, a6, a7); else super.sendOrderedBroadcast(a0, a1, a2, a3, a4, a5, a6, a7);
//	}

	/** from class android.content.Context */
	public void sendOrderedBroadcast(android.content.Intent a0, String a1, android.content.BroadcastReceiver a2, android.os.Handler a3, int a4, String a5, android.os.Bundle a6) {
		if (proxied != null) proxied.sendOrderedBroadcast(a0, a1, a2, a3, a4, a5, a6); else super.sendOrderedBroadcast(a0, a1, a2, a3, a4, a5, a6);
	}

	/** from class android.content.Context */
	public void sendOrderedBroadcastAsUser(android.content.Intent a0, android.os.UserHandle a1, String a2, android.content.BroadcastReceiver a3, android.os.Handler a4, int a5, String a6, android.os.Bundle a7) {
		if (proxied != null) proxied.sendOrderedBroadcastAsUser(a0, a1, a2, a3, a4, a5, a6, a7); else super.sendOrderedBroadcastAsUser(a0, a1, a2, a3, a4, a5, a6, a7);
	}

	/** from class android.content.Context */
	public void sendStickyBroadcast(android.content.Intent a0) {
		if (proxied != null) proxied.sendStickyBroadcast(a0); else super.sendStickyBroadcast(a0);
	}

	/** from class android.content.Context */
	public void sendStickyBroadcastAsUser(android.content.Intent a0, android.os.UserHandle a1) {
		if (proxied != null) proxied.sendStickyBroadcastAsUser(a0, a1); else super.sendStickyBroadcastAsUser(a0, a1);
	}

	/** from class android.content.Context */
	public void sendStickyOrderedBroadcast(android.content.Intent a0, android.content.BroadcastReceiver a1, android.os.Handler a2, int a3, String a4, android.os.Bundle a5) {
		if (proxied != null) proxied.sendStickyOrderedBroadcast(a0, a1, a2, a3, a4, a5); else super.sendStickyOrderedBroadcast(a0, a1, a2, a3, a4, a5);
	}

	/** from class android.content.Context */
	public void sendStickyOrderedBroadcastAsUser(android.content.Intent a0, android.os.UserHandle a1, android.content.BroadcastReceiver a2, android.os.Handler a3, int a4, String a5, android.os.Bundle a6) {
		if (proxied != null) proxied.sendStickyOrderedBroadcastAsUser(a0, a1, a2, a3, a4, a5, a6); else super.sendStickyOrderedBroadcastAsUser(a0, a1, a2, a3, a4, a5, a6);
	}

	/** from class android.content.Context */
	public void setTheme(int a0) {
		if (proxied != null) proxied.setTheme(a0); else super.setTheme(a0);
	}

	/** from class android.content.Context */
	public void setWallpaper(android.graphics.Bitmap a0) throws java.io.IOException {
		if (proxied != null) proxied.setWallpaper(a0); else super.setWallpaper(a0);
	}

	/** from class android.content.Context */
	public void setWallpaper(java.io.InputStream a0) throws java.io.IOException {
		if (proxied != null) proxied.setWallpaper(a0); else super.setWallpaper(a0);
	}

	/** from class android.content.Context */
	public void startActivities(android.content.Intent[] a0) {
		if (proxied != null) proxied.startActivities(a0); else super.startActivities(a0);
	}

	/** from class android.content.Context */
	public void startActivities(android.content.Intent[] a0, android.os.Bundle a1) {
		if (proxied != null) proxied.startActivities(a0, a1); else super.startActivities(a0, a1);
	}

//	/** from class android.content.Context */
//	public void startActivitiesAsUser(android.content.Intent[] a0, android.os.Bundle a1, android.os.UserHandle a2) {
//		if (proxied != null) proxied.startActivitiesAsUser(a0, a1, a2); else super.startActivitiesAsUser(a0, a1, a2);
//	}

	/** from class android.content.Context */
	public void startActivity(android.content.Intent a0) {
		if (proxied != null) proxied.startActivity(a0); else super.startActivity(a0);
	}

	/** from class android.content.Context */
	public void startActivity(android.content.Intent a0, android.os.Bundle a1) {
		if (proxied != null) proxied.startActivity(a0, a1); else super.startActivity(a0, a1);
	}

//	/** from class android.content.Context */
//	public void startActivityAsUser(android.content.Intent a0, android.os.Bundle a1, android.os.UserHandle a2) {
//		if (proxied != null) proxied.startActivityAsUser(a0, a1, a2); else super.startActivityAsUser(a0, a1, a2);
//	}

//	/** from class android.content.Context */
//	public void startActivityAsUser(android.content.Intent a0, android.os.UserHandle a1) {
//		if (proxied != null) proxied.startActivityAsUser(a0, a1); else super.startActivityAsUser(a0, a1);
//	}

	/** from class android.content.Context */
	public boolean startInstrumentation(android.content.ComponentName a0, String a1, android.os.Bundle a2) {
		return proxied != null ? proxied.startInstrumentation(a0, a1, a2) : super.startInstrumentation(a0, a1, a2);
	}

	/** from class android.content.Context */
	public void startIntentSender(android.content.IntentSender a0, android.content.Intent a1, int a2, int a3, int a4) throws android.content.IntentSender.SendIntentException {
		if (proxied != null) proxied.startIntentSender(a0, a1, a2, a3, a4); else super.startIntentSender(a0, a1, a2, a3, a4);
	}

	/** from class android.content.Context */
	public void startIntentSender(android.content.IntentSender a0, android.content.Intent a1, int a2, int a3, int a4, android.os.Bundle a5) throws android.content.IntentSender.SendIntentException {
		if (proxied != null) proxied.startIntentSender(a0, a1, a2, a3, a4, a5); else super.startIntentSender(a0, a1, a2, a3, a4, a5);
	}

	/** from class android.content.Context */
	public android.content.ComponentName startService(android.content.Intent a0) {
		return proxied != null ? proxied.startService(a0) : super.startService(a0);
	}

//	/** from class android.content.Context */
//	public android.content.ComponentName startServiceAsUser(android.content.Intent a0, android.os.UserHandle a1) {
//		return proxied != null ? proxied.startServiceAsUser(a0, a1) : super.startServiceAsUser(a0, a1);
//	}

	/** from class android.content.Context */
	public boolean stopService(android.content.Intent a0) {
		return proxied != null ? proxied.stopService(a0) : super.stopService(a0);
	}

//	/** from class android.content.Context */
//	public boolean stopServiceAsUser(android.content.Intent a0, android.os.UserHandle a1) {
//		return proxied != null ? proxied.stopServiceAsUser(a0, a1) : super.stopServiceAsUser(a0, a1);
//	}

	/** from class android.content.Context */
	public void unbindService(android.content.ServiceConnection a0) {
		if (proxied != null) proxied.unbindService(a0); else super.unbindService(a0);
	}

	/** from class android.content.Context */
	public void unregisterComponentCallbacks(android.content.ComponentCallbacks a0) {
		if (proxied != null) proxied.unregisterComponentCallbacks(a0); else super.unregisterComponentCallbacks(a0);
	}

	/** from class android.content.Context */
	public void unregisterReceiver(android.content.BroadcastReceiver a0) {
		if (proxied != null) proxied.unregisterReceiver(a0); else super.unregisterReceiver(a0);
	}

//	/** from class android.content.ContextWrapper */
//	protected void attachBaseContext(android.content.Context a0) {
//		if (proxied != null) proxied.attachBaseContext(a0); else super.attachBaseContext(a0);
//	}

	/** from class android.content.ContextWrapper */
	public android.content.Context getBaseContext() {
		return proxied != null ? proxied.getBaseContext() : super.getBaseContext();
	}

	/** from class android.view.ContextThemeWrapper */
	public void applyOverrideConfiguration(android.content.res.Configuration a0) {
		if (proxied != null) proxied.applyOverrideConfiguration(a0); else super.applyOverrideConfiguration(a0);
	}

	/** from class android.view.ContextThemeWrapper */
	protected void onApplyThemeResource(android.content.res.Resources.Theme a0, int a1, boolean a2) {
		if (proxied != null) proxied.onApplyThemeResource(a0, a1, a2); else super.onApplyThemeResource(a0, a1, a2);
	}

	/** from class android.app.Activity */
	public void addContentView(android.view.View a0, android.view.ViewGroup.LayoutParams a1) {
		if (proxied != null) proxied.addContentView(a0, a1); else super.addContentView(a0, a1);
	}

	/** from class android.app.Activity */
	public void closeContextMenu() {
		if (proxied != null) proxied.closeContextMenu(); else super.closeContextMenu();
	}

	/** from class android.app.Activity */
	public void closeOptionsMenu() {
		if (proxied != null) proxied.closeOptionsMenu(); else super.closeOptionsMenu();
	}

//	/** from class android.app.Activity */
//	public void convertFromTranslucent() {
//		if (proxied != null) proxied.convertFromTranslucent(); else super.convertFromTranslucent();
//	}

//	/** from class android.app.Activity */
//	public void convertToTranslucent(android.app.Activity.TranslucentConversionListener a0) {
//		if (proxied != null) proxied.convertToTranslucent(a0); else super.convertToTranslucent(a0);
//	}

	/** from class android.app.Activity */
	public android.app.PendingIntent createPendingResult(int a0, android.content.Intent a1, int a2) {
		return proxied != null ? proxied.createPendingResult(a0, a1, a2) : super.createPendingResult(a0, a1, a2);
	}

	/** from class android.app.Activity */
	public boolean dispatchGenericMotionEvent(android.view.MotionEvent a0) {
		return proxied != null ? proxied.dispatchGenericMotionEvent(a0) : super.dispatchGenericMotionEvent(a0);
	}

	/** from class android.app.Activity */
	public boolean dispatchKeyEvent(android.view.KeyEvent a0) {
		return proxied != null ? proxied.dispatchKeyEvent(a0) : super.dispatchKeyEvent(a0);
	}

	/** from class android.app.Activity */
	public boolean dispatchKeyShortcutEvent(android.view.KeyEvent a0) {
		return proxied != null ? proxied.dispatchKeyShortcutEvent(a0) : super.dispatchKeyShortcutEvent(a0);
	}

	/** from class android.app.Activity */
	public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent a0) {
		return proxied != null ? proxied.dispatchPopulateAccessibilityEvent(a0) : super.dispatchPopulateAccessibilityEvent(a0);
	}

	/** from class android.app.Activity */
	public boolean dispatchTouchEvent(android.view.MotionEvent a0) {
		return proxied != null ? proxied.dispatchTouchEvent(a0) : super.dispatchTouchEvent(a0);
	}

	/** from class android.app.Activity */
	public boolean dispatchTrackballEvent(android.view.MotionEvent a0) {
		return proxied != null ? proxied.dispatchTrackballEvent(a0) : super.dispatchTrackballEvent(a0);
	}

	/** from class android.app.Activity */
	public void dump(String a0, java.io.FileDescriptor a1, java.io.PrintWriter a2, String[] a3) {
		if (proxied != null) proxied.dump(a0, a1, a2, a3); else super.dump(a0, a1, a2, a3);
	}

	/** from class android.app.Activity */
	public android.view.View findViewById(int a0) {
		return proxied != null ? proxied.findViewById(a0) : super.findViewById(a0);
	}

	/** from class android.app.Activity */
	public void finish() {
		if (proxied != null) proxied.finish(); else super.finish();
	}

	/** from class android.app.Activity */
	public void finishActivity(int a0) {
		if (proxied != null) proxied.finishActivity(a0); else super.finishActivity(a0);
	}

	/** from class android.app.Activity */
	public void finishActivityFromChild(android.app.Activity a0, int a1) {
		if (proxied != null) proxied.finishActivityFromChild(a0, a1); else super.finishActivityFromChild(a0, a1);
	}

	/** from class android.app.Activity */
	public void finishAffinity() {
		if (proxied != null) proxied.finishAffinity(); else super.finishAffinity();
	}

	/** from class android.app.Activity */
	public void finishFromChild(android.app.Activity a0) {
		if (proxied != null) proxied.finishFromChild(a0); else super.finishFromChild(a0);
	}

	/** from class android.app.Activity */
	public android.app.ActionBar getActionBar() {
		return proxied != null ? proxied.getActionBar() : super.getActionBar();
	}

	/** from class android.app.Activity */
	public android.content.ComponentName getCallingActivity() {
		return proxied != null ? proxied.getCallingActivity() : super.getCallingActivity();
	}

	/** from class android.app.Activity */
	public String getCallingPackage() {
		return proxied != null ? proxied.getCallingPackage() : super.getCallingPackage();
	}

	/** from class android.app.Activity */
	public int getChangingConfigurations() {
		return proxied != null ? proxied.getChangingConfigurations() : super.getChangingConfigurations();
	}

	/** from class android.app.Activity */
	public android.content.ComponentName getComponentName() {
		return proxied != null ? proxied.getComponentName() : super.getComponentName();
	}

	/** from class android.app.Activity */
	public android.view.View getCurrentFocus() {
		return proxied != null ? proxied.getCurrentFocus() : super.getCurrentFocus();
	}

	/** from class android.app.Activity */
	public android.app.FragmentManager getFragmentManager() {
		return proxied != null ? proxied.getFragmentManager() : super.getFragmentManager();
	}

	/** from class android.app.Activity */
	public android.content.Intent getIntent() {
		return proxied != null ? proxied.getIntent() : super.getIntent();
	}

	/** from class android.app.Activity */
	public Object getLastNonConfigurationInstance() {
		return proxied != null ? proxied.getLastNonConfigurationInstance() : super.getLastNonConfigurationInstance();
	}

	/** from class android.app.Activity */
	public android.view.LayoutInflater getLayoutInflater() {
		return proxied != null ? proxied.getLayoutInflater() : super.getLayoutInflater();
	}

	/** from class android.app.Activity */
	public android.app.LoaderManager getLoaderManager() {
		return proxied != null ? proxied.getLoaderManager() : super.getLoaderManager();
	}

	/** from class android.app.Activity */
	public String getLocalClassName() {
		return proxied != null ? proxied.getLocalClassName() : super.getLocalClassName();
	}

	/** from class android.app.Activity */
	public android.view.MenuInflater getMenuInflater() {
		return proxied != null ? proxied.getMenuInflater() : super.getMenuInflater();
	}

	/** from class android.app.Activity */
	public android.content.Intent getParentActivityIntent() {
		return proxied != null ? proxied.getParentActivityIntent() : super.getParentActivityIntent();
	}

	/** from class android.app.Activity */
	public android.content.SharedPreferences getPreferences(int a0) {
		return proxied != null ? proxied.getPreferences(a0) : super.getPreferences(a0);
	}

	/** from class android.app.Activity */
	public int getRequestedOrientation() {
		return proxied != null ? proxied.getRequestedOrientation() : super.getRequestedOrientation();
	}

	/** from class android.app.Activity */
	public int getTaskId() {
		return proxied != null ? proxied.getTaskId() : super.getTaskId();
	}

	/** from class android.app.Activity */
	public android.view.Window getWindow() {
		return proxied != null ? proxied.getWindow() : super.getWindow();
	}

	/** from class android.app.Activity */
	public android.view.WindowManager getWindowManager() {
		return proxied != null ? proxied.getWindowManager() : super.getWindowManager();
	}

	/** from class android.app.Activity */
	public boolean hasWindowFocus() {
		return proxied != null ? proxied.hasWindowFocus() : super.hasWindowFocus();
	}

	/** from class android.app.Activity */
	public void invalidateOptionsMenu() {
		if (proxied != null) proxied.invalidateOptionsMenu(); else super.invalidateOptionsMenu();
	}

	/** from class android.app.Activity */
	public boolean isChangingConfigurations() {
		return proxied != null ? proxied.isChangingConfigurations() : super.isChangingConfigurations();
	}

	/** from class android.app.Activity */
	public boolean isDestroyed() {
		return proxied != null ? proxied.isDestroyed() : super.isDestroyed();
	}

	/** from class android.app.Activity */
	public boolean isFinishing() {
		return proxied != null ? proxied.isFinishing() : super.isFinishing();
	}

	/** from class android.app.Activity */
	public boolean isImmersive() {
		return proxied != null ? proxied.isImmersive() : super.isImmersive();
	}

	/** from class android.app.Activity */
	public boolean isTaskRoot() {
		return proxied != null ? proxied.isTaskRoot() : super.isTaskRoot();
	}

	/** from class android.app.Activity */
	public boolean moveTaskToBack(boolean a0) {
		return proxied != null ? proxied.moveTaskToBack(a0) : super.moveTaskToBack(a0);
	}

	/** from class android.app.Activity */
	public boolean navigateUpTo(android.content.Intent a0) {
		return proxied != null ? proxied.navigateUpTo(a0) : super.navigateUpTo(a0);
	}

	/** from class android.app.Activity */
	public boolean navigateUpToFromChild(android.app.Activity a0, android.content.Intent a1) {
		return proxied != null ? proxied.navigateUpToFromChild(a0, a1) : super.navigateUpToFromChild(a0, a1);
	}

	/** from class android.app.Activity */
	public void onActionModeFinished(android.view.ActionMode a0) {
		if (proxied != null) proxied.onActionModeFinished(a0); else super.onActionModeFinished(a0);
	}

	/** from class android.app.Activity */
	public void onActionModeStarted(android.view.ActionMode a0) {
		if (proxied != null) proxied.onActionModeStarted(a0); else super.onActionModeStarted(a0);
	}

	/** from class android.app.Activity */
	protected void onActivityResult(int a0, int a1, android.content.Intent a2) {
		if (proxied != null) proxied.onActivityResult(a0, a1, a2); else super.onActivityResult(a0, a1, a2);
	}

	/** from class android.app.Activity */
	public void onAttachFragment(android.app.Fragment a0) {
		if (proxied != null) proxied.onAttachFragment(a0); else super.onAttachFragment(a0);
	}

	/** from class android.app.Activity */
	public void onAttachedToWindow() {
		if (proxied != null) proxied.onAttachedToWindow(); else super.onAttachedToWindow();
	}

	/** from class android.app.Activity */
	public void onBackPressed() {
		if (proxied != null) proxied.onBackPressed(); else super.onBackPressed();
	}

	/** from class android.app.Activity */
	protected void onChildTitleChanged(android.app.Activity a0, CharSequence a1) {
		if (proxied != null) proxied.onChildTitleChanged(a0, a1); else super.onChildTitleChanged(a0, a1);
	}

	/** from class android.app.Activity */
	public void onConfigurationChanged(android.content.res.Configuration a0) {
		if (proxied != null) proxied.onConfigurationChanged(a0); else super.onConfigurationChanged(a0);
	}

	/** from class android.app.Activity */
	public void onContentChanged() {
		if (proxied != null) proxied.onContentChanged(); else super.onContentChanged();
	}

	/** from class android.app.Activity */
	public boolean onContextItemSelected(android.view.MenuItem a0) {
		return proxied != null ? proxied.onContextItemSelected(a0) : super.onContextItemSelected(a0);
	}

	/** from class android.app.Activity */
	public void onContextMenuClosed(android.view.Menu a0) {
		if (proxied != null) proxied.onContextMenuClosed(a0); else super.onContextMenuClosed(a0);
	}

	/** from class android.app.Activity */
	protected void onCreate(android.os.Bundle a0) {
		proxied = Proxied.createInstance(this, ListActivity.class);
		if (proxied != null) proxied.onCreate(a0); else super.onCreate(a0);
	}

	/** from class android.app.Activity */
	public void onCreateContextMenu(android.view.ContextMenu a0, android.view.View a1, android.view.ContextMenu.ContextMenuInfo a2) {
		if (proxied != null) proxied.onCreateContextMenu(a0, a1, a2); else super.onCreateContextMenu(a0, a1, a2);
	}

	/** from class android.app.Activity */
	public CharSequence onCreateDescription() {
		return proxied != null ? proxied.onCreateDescription() : super.onCreateDescription();
	}

	/** from class android.app.Activity */
	protected android.app.Dialog onCreateDialog(int a0) {
		return proxied != null ? proxied.onCreateDialog(a0) : super.onCreateDialog(a0);
	}

	/** from class android.app.Activity */
	protected android.app.Dialog onCreateDialog(int a0, android.os.Bundle a1) {
		return proxied != null ? proxied.onCreateDialog(a0, a1) : super.onCreateDialog(a0, a1);
	}

	/** from class android.app.Activity */
	public void onCreateNavigateUpTaskStack(android.app.TaskStackBuilder a0) {
		if (proxied != null) proxied.onCreateNavigateUpTaskStack(a0); else super.onCreateNavigateUpTaskStack(a0);
	}

	/** from class android.app.Activity */
	public boolean onCreateOptionsMenu(android.view.Menu a0) {
		return proxied != null ? proxied.onCreateOptionsMenu(a0) : super.onCreateOptionsMenu(a0);
	}

	/** from class android.app.Activity */
	public boolean onCreatePanelMenu(int a0, android.view.Menu a1) {
		return proxied != null ? proxied.onCreatePanelMenu(a0, a1) : super.onCreatePanelMenu(a0, a1);
	}

	/** from class android.app.Activity */
	public android.view.View onCreatePanelView(int a0) {
		return proxied != null ? proxied.onCreatePanelView(a0) : super.onCreatePanelView(a0);
	}

	/** from class android.app.Activity */
	public boolean onCreateThumbnail(android.graphics.Bitmap a0, android.graphics.Canvas a1) {
		return proxied != null ? proxied.onCreateThumbnail(a0, a1) : super.onCreateThumbnail(a0, a1);
	}

	/** from class android.app.Activity */
	public android.view.View onCreateView(android.view.View a0, String a1, android.content.Context a2, android.util.AttributeSet a3) {
		return proxied != null ? proxied.onCreateView(a0, a1, a2, a3) : super.onCreateView(a0, a1, a2, a3);
	}

	/** from class android.app.Activity */
	public android.view.View onCreateView(String a0, android.content.Context a1, android.util.AttributeSet a2) {
		return proxied != null ? proxied.onCreateView(a0, a1, a2) : super.onCreateView(a0, a1, a2);
	}

	/** from class android.app.Activity */
	protected void onDestroy() {
		if (proxied != null) proxied.onDestroy(); else super.onDestroy();
	}

	/** from class android.app.Activity */
	public void onDetachedFromWindow() {
		if (proxied != null) proxied.onDetachedFromWindow(); else super.onDetachedFromWindow();
	}

	/** from class android.app.Activity */
	public boolean onGenericMotionEvent(android.view.MotionEvent a0) {
		return proxied != null ? proxied.onGenericMotionEvent(a0) : super.onGenericMotionEvent(a0);
	}

	/** from class android.app.Activity */
	public boolean onKeyDown(int a0, android.view.KeyEvent a1) {
		return proxied != null ? proxied.onKeyDown(a0, a1) : super.onKeyDown(a0, a1);
	}

	/** from class android.app.Activity */
	public boolean onKeyLongPress(int a0, android.view.KeyEvent a1) {
		return proxied != null ? proxied.onKeyLongPress(a0, a1) : super.onKeyLongPress(a0, a1);
	}

	/** from class android.app.Activity */
	public boolean onKeyMultiple(int a0, int a1, android.view.KeyEvent a2) {
		return proxied != null ? proxied.onKeyMultiple(a0, a1, a2) : super.onKeyMultiple(a0, a1, a2);
	}

	/** from class android.app.Activity */
	public boolean onKeyShortcut(int a0, android.view.KeyEvent a1) {
		return proxied != null ? proxied.onKeyShortcut(a0, a1) : super.onKeyShortcut(a0, a1);
	}

	/** from class android.app.Activity */
	public boolean onKeyUp(int a0, android.view.KeyEvent a1) {
		return proxied != null ? proxied.onKeyUp(a0, a1) : super.onKeyUp(a0, a1);
	}

	/** from class android.app.Activity */
	public void onLowMemory() {
		if (proxied != null) proxied.onLowMemory(); else super.onLowMemory();
	}

	/** from class android.app.Activity */
	public boolean onMenuItemSelected(int a0, android.view.MenuItem a1) {
		return proxied != null ? proxied.onMenuItemSelected(a0, a1) : super.onMenuItemSelected(a0, a1);
	}

	/** from class android.app.Activity */
	public boolean onMenuOpened(int a0, android.view.Menu a1) {
		return proxied != null ? proxied.onMenuOpened(a0, a1) : super.onMenuOpened(a0, a1);
	}

	/** from class android.app.Activity */
	public boolean onNavigateUp() {
		return proxied != null ? proxied.onNavigateUp() : super.onNavigateUp();
	}

	/** from class android.app.Activity */
	public boolean onNavigateUpFromChild(android.app.Activity a0) {
		return proxied != null ? proxied.onNavigateUpFromChild(a0) : super.onNavigateUpFromChild(a0);
	}

	/** from class android.app.Activity */
	protected void onNewIntent(android.content.Intent a0) {
		if (proxied != null) proxied.onNewIntent(a0); else super.onNewIntent(a0);
	}

	/** from class android.app.Activity */
	public boolean onOptionsItemSelected(android.view.MenuItem a0) {
		return proxied != null ? proxied.onOptionsItemSelected(a0) : super.onOptionsItemSelected(a0);
	}

	/** from class android.app.Activity */
	public void onOptionsMenuClosed(android.view.Menu a0) {
		if (proxied != null) proxied.onOptionsMenuClosed(a0); else super.onOptionsMenuClosed(a0);
	}

	/** from class android.app.Activity */
	public void onPanelClosed(int a0, android.view.Menu a1) {
		if (proxied != null) proxied.onPanelClosed(a0, a1); else super.onPanelClosed(a0, a1);
	}

	/** from class android.app.Activity */
	protected void onPause() {
		if (proxied != null) proxied.onPause(); else super.onPause();
	}

	/** from class android.app.Activity */
	protected void onPostCreate(android.os.Bundle a0) {
		if (proxied != null) proxied.onPostCreate(a0); else super.onPostCreate(a0);
	}

	/** from class android.app.Activity */
	protected void onPostResume() {
		if (proxied != null) proxied.onPostResume(); else super.onPostResume();
	}

	/** from class android.app.Activity */
	protected void onPrepareDialog(int a0, android.app.Dialog a1) {
		if (proxied != null) proxied.onPrepareDialog(a0, a1); else super.onPrepareDialog(a0, a1);
	}

	/** from class android.app.Activity */
	protected void onPrepareDialog(int a0, android.app.Dialog a1, android.os.Bundle a2) {
		if (proxied != null) proxied.onPrepareDialog(a0, a1, a2); else super.onPrepareDialog(a0, a1, a2);
	}

	/** from class android.app.Activity */
	public void onPrepareNavigateUpTaskStack(android.app.TaskStackBuilder a0) {
		if (proxied != null) proxied.onPrepareNavigateUpTaskStack(a0); else super.onPrepareNavigateUpTaskStack(a0);
	}

	/** from class android.app.Activity */
	public boolean onPrepareOptionsMenu(android.view.Menu a0) {
		return proxied != null ? proxied.onPrepareOptionsMenu(a0) : super.onPrepareOptionsMenu(a0);
	}

	/** from class android.app.Activity */
	public boolean onPreparePanel(int a0, android.view.View a1, android.view.Menu a2) {
		return proxied != null ? proxied.onPreparePanel(a0, a1, a2) : super.onPreparePanel(a0, a1, a2);
	}

	/** from class android.app.Activity */
	public void onProvideAssistData(android.os.Bundle a0) {
		if (proxied != null) proxied.onProvideAssistData(a0); else super.onProvideAssistData(a0);
	}

	/** from class android.app.Activity */
	protected void onRestart() {
		if (proxied != null) proxied.onRestart(); else super.onRestart();
	}

	/** from class android.app.Activity */
	protected void onRestoreInstanceState(android.os.Bundle a0) {
		if (proxied != null) proxied.onRestoreInstanceState(a0); else super.onRestoreInstanceState(a0);
	}

	/** from class android.app.Activity */
	protected void onResume() {
		if (proxied != null) proxied.onResume(); else super.onResume();
	}

	/** from class android.app.Activity */
	public Object onRetainNonConfigurationInstance() {
		return proxied != null ? proxied.onRetainNonConfigurationInstance() : super.onRetainNonConfigurationInstance();
	}

	/** from class android.app.Activity */
	protected void onSaveInstanceState(android.os.Bundle a0) {
		if (proxied != null) proxied.onSaveInstanceState(a0); else super.onSaveInstanceState(a0);
	}

	/** from class android.app.Activity */
	public boolean onSearchRequested() {
		return proxied != null ? proxied.onSearchRequested() : super.onSearchRequested();
	}

	/** from class android.app.Activity */
	protected void onStart() {
		if (proxied != null) proxied.onStart(); else super.onStart();
	}

	/** from class android.app.Activity */
	protected void onStop() {
		if (proxied != null) proxied.onStop(); else super.onStop();
	}

	/** from class android.app.Activity */
	protected void onTitleChanged(CharSequence a0, int a1) {
		if (proxied != null) proxied.onTitleChanged(a0, a1); else super.onTitleChanged(a0, a1);
	}

	/** from class android.app.Activity */
	public boolean onTouchEvent(android.view.MotionEvent a0) {
		return proxied != null ? proxied.onTouchEvent(a0) : super.onTouchEvent(a0);
	}

	/** from class android.app.Activity */
	public boolean onTrackballEvent(android.view.MotionEvent a0) {
		return proxied != null ? proxied.onTrackballEvent(a0) : super.onTrackballEvent(a0);
	}

	/** from class android.app.Activity */
	public void onTrimMemory(int a0) {
		if (proxied != null) proxied.onTrimMemory(a0); else super.onTrimMemory(a0);
	}

	/** from class android.app.Activity */
	public void onUserInteraction() {
		if (proxied != null) proxied.onUserInteraction(); else super.onUserInteraction();
	}

	/** from class android.app.Activity */
	protected void onUserLeaveHint() {
		if (proxied != null) proxied.onUserLeaveHint(); else super.onUserLeaveHint();
	}

	/** from class android.app.Activity */
	public void onWindowAttributesChanged(android.view.WindowManager.LayoutParams a0) {
		if (proxied != null) proxied.onWindowAttributesChanged(a0); else super.onWindowAttributesChanged(a0);
	}

	/** from class android.app.Activity */
	public void onWindowFocusChanged(boolean a0) {
		if (proxied != null) proxied.onWindowFocusChanged(a0); else super.onWindowFocusChanged(a0);
	}

	/** from class android.app.Activity */
	public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback a0) {
		return proxied != null ? proxied.onWindowStartingActionMode(a0) : super.onWindowStartingActionMode(a0);
	}

	/** from class android.app.Activity */
	public void openContextMenu(android.view.View a0) {
		if (proxied != null) proxied.openContextMenu(a0); else super.openContextMenu(a0);
	}

	/** from class android.app.Activity */
	public void openOptionsMenu() {
		if (proxied != null) proxied.openOptionsMenu(); else super.openOptionsMenu();
	}

	/** from class android.app.Activity */
	public void overridePendingTransition(int a0, int a1) {
		if (proxied != null) proxied.overridePendingTransition(a0, a1); else super.overridePendingTransition(a0, a1);
	}

	/** from class android.app.Activity */
	public void recreate() {
		if (proxied != null) proxied.recreate(); else super.recreate();
	}

	/** from class android.app.Activity */
	public void registerForContextMenu(android.view.View a0) {
		if (proxied != null) proxied.registerForContextMenu(a0); else super.registerForContextMenu(a0);
	}

	/** from class android.app.Activity */
	public void reportFullyDrawn() {
		if (proxied != null) proxied.reportFullyDrawn(); else super.reportFullyDrawn();
	}

	/** from class android.app.Activity */
	public void setContentView(int a0) {
		if (proxied != null) proxied.setContentView(a0); else super.setContentView(a0);
	}

	/** from class android.app.Activity */
	public void setContentView(android.view.View a0) {
		if (proxied != null) proxied.setContentView(a0); else super.setContentView(a0);
	}

	/** from class android.app.Activity */
	public void setContentView(android.view.View a0, android.view.ViewGroup.LayoutParams a1) {
		if (proxied != null) proxied.setContentView(a0, a1); else super.setContentView(a0, a1);
	}

	/** from class android.app.Activity */
	public void setFinishOnTouchOutside(boolean a0) {
		if (proxied != null) proxied.setFinishOnTouchOutside(a0); else super.setFinishOnTouchOutside(a0);
	}

	/** from class android.app.Activity */
	public void setImmersive(boolean a0) {
		if (proxied != null) proxied.setImmersive(a0); else super.setImmersive(a0);
	}

	/** from class android.app.Activity */
	public void setIntent(android.content.Intent a0) {
		if (proxied != null) proxied.setIntent(a0); else super.setIntent(a0);
	}

//	/** from class android.app.Activity */
//	public void setPersistent(boolean a0) {
//		if (proxied != null) proxied.setPersistent(a0); else super.setPersistent(a0);
//	}

	/** from class android.app.Activity */
	public void setRequestedOrientation(int a0) {
		if (proxied != null) proxied.setRequestedOrientation(a0); else super.setRequestedOrientation(a0);
	}

	/** from class android.app.Activity */
	public void setTitle(int a0) {
		if (proxied != null) proxied.setTitle(a0); else super.setTitle(a0);
	}

	/** from class android.app.Activity */
	public void setTitle(CharSequence a0) {
		if (proxied != null) proxied.setTitle(a0); else super.setTitle(a0);
	}

	/** from class android.app.Activity */
	public void setTitleColor(int a0) {
		if (proxied != null) proxied.setTitleColor(a0); else super.setTitleColor(a0);
	}

	/** from class android.app.Activity */
	public void setVisible(boolean a0) {
		if (proxied != null) proxied.setVisible(a0); else super.setVisible(a0);
	}

	/** from class android.app.Activity */
	public boolean shouldUpRecreateTask(android.content.Intent a0) {
		return proxied != null ? proxied.shouldUpRecreateTask(a0) : super.shouldUpRecreateTask(a0);
	}

	/** from class android.app.Activity */
	public android.view.ActionMode startActionMode(android.view.ActionMode.Callback a0) {
		return proxied != null ? proxied.startActionMode(a0) : super.startActionMode(a0);
	}

	/** from class android.app.Activity */
	public void startActivityForResult(android.content.Intent a0, int a1) {
		if (proxied != null) proxied.startActivityForResult(a0, a1); else super.startActivityForResult(a0, a1);
	}

	/** from class android.app.Activity */
	public void startActivityForResult(android.content.Intent a0, int a1, android.os.Bundle a2) {
		if (proxied != null) proxied.startActivityForResult(a0, a1, a2); else super.startActivityForResult(a0, a1, a2);
	}

	/** from class android.app.Activity */
	public void startActivityFromChild(android.app.Activity a0, android.content.Intent a1, int a2) {
		if (proxied != null) proxied.startActivityFromChild(a0, a1, a2); else super.startActivityFromChild(a0, a1, a2);
	}

	/** from class android.app.Activity */
	public void startActivityFromChild(android.app.Activity a0, android.content.Intent a1, int a2, android.os.Bundle a3) {
		if (proxied != null) proxied.startActivityFromChild(a0, a1, a2, a3); else super.startActivityFromChild(a0, a1, a2, a3);
	}

	/** from class android.app.Activity */
	public void startActivityFromFragment(android.app.Fragment a0, android.content.Intent a1, int a2) {
		if (proxied != null) proxied.startActivityFromFragment(a0, a1, a2); else super.startActivityFromFragment(a0, a1, a2);
	}

	/** from class android.app.Activity */
	public void startActivityFromFragment(android.app.Fragment a0, android.content.Intent a1, int a2, android.os.Bundle a3) {
		if (proxied != null) proxied.startActivityFromFragment(a0, a1, a2, a3); else super.startActivityFromFragment(a0, a1, a2, a3);
	}

	/** from class android.app.Activity */
	public boolean startActivityIfNeeded(android.content.Intent a0, int a1) {
		return proxied != null ? proxied.startActivityIfNeeded(a0, a1) : super.startActivityIfNeeded(a0, a1);
	}

	/** from class android.app.Activity */
	public boolean startActivityIfNeeded(android.content.Intent a0, int a1, android.os.Bundle a2) {
		return proxied != null ? proxied.startActivityIfNeeded(a0, a1, a2) : super.startActivityIfNeeded(a0, a1, a2);
	}

	/** from class android.app.Activity */
	public void startIntentSenderForResult(android.content.IntentSender a0, int a1, android.content.Intent a2, int a3, int a4, int a5) throws android.content.IntentSender.SendIntentException {
		if (proxied != null) proxied.startIntentSenderForResult(a0, a1, a2, a3, a4, a5); else super.startIntentSenderForResult(a0, a1, a2, a3, a4, a5);
	}

	/** from class android.app.Activity */
	public void startIntentSenderForResult(android.content.IntentSender a0, int a1, android.content.Intent a2, int a3, int a4, int a5, android.os.Bundle a6) throws android.content.IntentSender.SendIntentException {
		if (proxied != null) proxied.startIntentSenderForResult(a0, a1, a2, a3, a4, a5, a6); else super.startIntentSenderForResult(a0, a1, a2, a3, a4, a5, a6);
	}

	/** from class android.app.Activity */
	public void startIntentSenderFromChild(android.app.Activity a0, android.content.IntentSender a1, int a2, android.content.Intent a3, int a4, int a5, int a6) throws android.content.IntentSender.SendIntentException {
		if (proxied != null) proxied.startIntentSenderFromChild(a0, a1, a2, a3, a4, a5, a6); else super.startIntentSenderFromChild(a0, a1, a2, a3, a4, a5, a6);
	}

	/** from class android.app.Activity */
	public void startIntentSenderFromChild(android.app.Activity a0, android.content.IntentSender a1, int a2, android.content.Intent a3, int a4, int a5, int a6, android.os.Bundle a7) throws android.content.IntentSender.SendIntentException {
		if (proxied != null) proxied.startIntentSenderFromChild(a0, a1, a2, a3, a4, a5, a6, a7); else super.startIntentSenderFromChild(a0, a1, a2, a3, a4, a5, a6, a7);
	}

	/** from class android.app.Activity */
	public void startManagingCursor(android.database.Cursor a0) {
		if (proxied != null) proxied.startManagingCursor(a0); else super.startManagingCursor(a0);
	}

	/** from class android.app.Activity */
	public boolean startNextMatchingActivity(android.content.Intent a0) {
		return proxied != null ? proxied.startNextMatchingActivity(a0) : super.startNextMatchingActivity(a0);
	}

	/** from class android.app.Activity */
	public boolean startNextMatchingActivity(android.content.Intent a0, android.os.Bundle a1) {
		return proxied != null ? proxied.startNextMatchingActivity(a0, a1) : super.startNextMatchingActivity(a0, a1);
	}

	/** from class android.app.Activity */
	public void startSearch(String a0, boolean a1, android.os.Bundle a2, boolean a3) {
		if (proxied != null) proxied.startSearch(a0, a1, a2, a3); else super.startSearch(a0, a1, a2, a3);
	}

	/** from class android.app.Activity */
	public void stopManagingCursor(android.database.Cursor a0) {
		if (proxied != null) proxied.stopManagingCursor(a0); else super.stopManagingCursor(a0);
	}

	/** from class android.app.Activity */
	public void takeKeyEvents(boolean a0) {
		if (proxied != null) proxied.takeKeyEvents(a0); else super.takeKeyEvents(a0);
	}

	/** from class android.app.Activity */
	public void triggerSearch(String a0, android.os.Bundle a1) {
		if (proxied != null) proxied.triggerSearch(a0, a1); else super.triggerSearch(a0, a1);
	}

	/** from class android.app.Activity */
	public void unregisterForContextMenu(android.view.View a0) {
		if (proxied != null) proxied.unregisterForContextMenu(a0); else super.unregisterForContextMenu(a0);
	}

	/** from class android.app.ListActivity */
	public android.widget.ListAdapter getListAdapter() {
		return proxied != null ? proxied.getListAdapter() : super.getListAdapter();
	}

	/** from class android.app.ListActivity */
	public android.widget.ListView getListView() {
		return proxied != null ? proxied.getListView() : super.getListView();
	}

	/** from class android.app.ListActivity */
	public long getSelectedItemId() {
		return proxied != null ? proxied.getSelectedItemId() : super.getSelectedItemId();
	}

	/** from class android.app.ListActivity */
	public int getSelectedItemPosition() {
		return proxied != null ? proxied.getSelectedItemPosition() : super.getSelectedItemPosition();
	}

	/** from class android.app.ListActivity */
	protected void onListItemClick(android.widget.ListView a0, android.view.View a1, int a2, long a3) {
		if (proxied != null) proxied.onListItemClick(a0, a1, a2, a3); else super.onListItemClick(a0, a1, a2, a3);
	}

	/** from class android.app.ListActivity */
	public void setListAdapter(android.widget.ListAdapter a0) {
		if (proxied != null) proxied.setListAdapter(a0); else super.setListAdapter(a0);
	}

	/** from class android.app.ListActivity */
	public void setSelection(int a0) {
		if (proxied != null) proxied.setSelection(a0); else super.setSelection(a0);
	}

	@Override
	public Object _s_(Object[] a) {
		try {
			switch ((Integer) a[0]) {
			/**** from class android.content.Context ****/
			case 0: return super.bindService((android.content.Intent) a[1], (android.content.ServiceConnection) a[2], (Integer) a[3]);
//			case 1: return super.bindServiceAsUser((android.content.Intent) a[1], (android.content.ServiceConnection) a[2], (Integer) a[3], (android.os.UserHandle) a[4]);
			case 2: return super.checkCallingOrSelfPermission((String) a[1]);
			case 3: return super.checkCallingOrSelfUriPermission((android.net.Uri) a[1], (Integer) a[2]);
			case 4: return super.checkCallingPermission((String) a[1]);
			case 5: return super.checkCallingUriPermission((android.net.Uri) a[1], (Integer) a[2]);
			case 6: return super.checkPermission((String) a[1], (Integer) a[2], (Integer) a[3]);
			case 7: return super.checkUriPermission((android.net.Uri) a[1], (Integer) a[2], (Integer) a[3], (Integer) a[4]);
			case 8: return super.checkUriPermission((android.net.Uri) a[1], (String) a[2], (String) a[3], (Integer) a[4], (Integer) a[5], (Integer) a[6]);
			case 9: super.clearWallpaper(); break;
			case 10: return super.createConfigurationContext((android.content.res.Configuration) a[1]);
			case 11: return super.createDisplayContext((android.view.Display) a[1]);
			case 12: return super.createPackageContext((String) a[1], (Integer) a[2]);
//			case 13: return super.createPackageContextAsUser((String) a[1], (Integer) a[2], (android.os.UserHandle) a[3]);
			case 14: return super.databaseList();
			case 15: return super.deleteDatabase((String) a[1]);
			case 16: return super.deleteFile((String) a[1]);
			case 17: super.enforceCallingOrSelfPermission((String) a[1], (String) a[2]); break;
			case 18: super.enforceCallingOrSelfUriPermission((android.net.Uri) a[1], (Integer) a[2], (String) a[3]); break;
			case 19: super.enforceCallingPermission((String) a[1], (String) a[2]); break;
			case 20: super.enforceCallingUriPermission((android.net.Uri) a[1], (Integer) a[2], (String) a[3]); break;
			case 21: super.enforcePermission((String) a[1], (Integer) a[2], (Integer) a[3], (String) a[4]); break;
			case 22: super.enforceUriPermission((android.net.Uri) a[1], (Integer) a[2], (Integer) a[3], (Integer) a[4], (String) a[5]); break;
			case 23: super.enforceUriPermission((android.net.Uri) a[1], (String) a[2], (String) a[3], (Integer) a[4], (Integer) a[5], (Integer) a[6], (String) a[7]); break;
			case 24: return super.fileList();
			case 25: return super.getApplicationContext();
			case 26: return super.getApplicationInfo();
			case 27: return super.getAssets();
//			case 28: return super.getBasePackageName();
			case 29: return super.getCacheDir();
			case 30: return super.getClassLoader();
			case 31: return super.getContentResolver();
			case 32: return super.getDatabasePath((String) a[1]);
			case 33: return super.getDir((String) a[1], (Integer) a[2]);
//			case 34: return super.getDisplayAdjustments((Integer) a[1]);
			case 35: return super.getExternalCacheDir();
			case 36: return super.getExternalCacheDirs();
			case 37: return super.getExternalFilesDir((String) a[1]);
			case 38: return super.getExternalFilesDirs((String) a[1]);
			case 39: return super.getFileStreamPath((String) a[1]);
			case 40: return super.getFilesDir();
			case 41: return super.getMainLooper();
			case 42: return super.getObbDir();
			case 43: return super.getObbDirs();
//			case 44: return super.getOpPackageName();
			case 45: return super.getPackageCodePath();
			case 46: return super.getPackageManager();
			case 47: return super.getPackageName();
			case 48: return super.getPackageResourcePath();
			case 49: return super.getResources();
			case 50: return super.getSharedPreferences((String) a[1], (Integer) a[2]);
//			case 51: return super.getSharedPrefsFile((String) a[1]);
			case 54: return super.getSystemService((String) a[1]);
			case 56: return super.getTheme();
//			case 57: return super.getThemeResId();
//			case 58: return super.getUserId();
			case 59: return super.getWallpaper();
			case 60: return super.getWallpaperDesiredMinimumHeight();
			case 61: return super.getWallpaperDesiredMinimumWidth();
			case 62: super.grantUriPermission((String) a[1], (android.net.Uri) a[2], (Integer) a[3]); break;
			case 63: return super.isRestricted();
			case 68: return super.openFileInput((String) a[1]);
			case 69: return super.openFileOutput((String) a[1], (Integer) a[2]);
			case 70: return super.openOrCreateDatabase((String) a[1], (Integer) a[2], (android.database.sqlite.SQLiteDatabase.CursorFactory) a[3]);
			case 71: return super.openOrCreateDatabase((String) a[1], (Integer) a[2], (android.database.sqlite.SQLiteDatabase.CursorFactory) a[3], (android.database.DatabaseErrorHandler) a[4]);
			case 72: return super.peekWallpaper();
			case 73: super.registerComponentCallbacks((android.content.ComponentCallbacks) a[1]); break;
			case 74: return super.registerReceiver((android.content.BroadcastReceiver) a[1], (android.content.IntentFilter) a[2]);
			case 75: return super.registerReceiver((android.content.BroadcastReceiver) a[1], (android.content.IntentFilter) a[2], (String) a[3], (android.os.Handler) a[4]);
//			case 76: return super.registerReceiverAsUser((android.content.BroadcastReceiver) a[1], (android.os.UserHandle) a[2], (android.content.IntentFilter) a[3], (String) a[4], (android.os.Handler) a[5]);
			case 77: super.removeStickyBroadcast((android.content.Intent) a[1]); break;
			case 78: super.removeStickyBroadcastAsUser((android.content.Intent) a[1], (android.os.UserHandle) a[2]); break;
			case 79: super.revokeUriPermission((android.net.Uri) a[1], (Integer) a[2]); break;
			case 80: super.sendBroadcast((android.content.Intent) a[1]); break;
			case 81: super.sendBroadcast((android.content.Intent) a[1], (String) a[2]); break;
//			case 82: super.sendBroadcast((android.content.Intent) a[1], (String) a[2], (Integer) a[3]); break;
			case 83: super.sendBroadcastAsUser((android.content.Intent) a[1], (android.os.UserHandle) a[2]); break;
			case 84: super.sendBroadcastAsUser((android.content.Intent) a[1], (android.os.UserHandle) a[2], (String) a[3]); break;
			case 85: super.sendOrderedBroadcast((android.content.Intent) a[1], (String) a[2]); break;
//			case 86: super.sendOrderedBroadcast((android.content.Intent) a[1], (String) a[2], (Integer) a[3], (android.content.BroadcastReceiver) a[4], (android.os.Handler) a[5], (Integer) a[6], (String) a[7], (android.os.Bundle) a[8]); break;
			case 87: super.sendOrderedBroadcast((android.content.Intent) a[1], (String) a[2], (android.content.BroadcastReceiver) a[3], (android.os.Handler) a[4], (Integer) a[5], (String) a[6], (android.os.Bundle) a[7]); break;
			case 88: super.sendOrderedBroadcastAsUser((android.content.Intent) a[1], (android.os.UserHandle) a[2], (String) a[3], (android.content.BroadcastReceiver) a[4], (android.os.Handler) a[5], (Integer) a[6], (String) a[7], (android.os.Bundle) a[8]); break;
			case 89: super.sendStickyBroadcast((android.content.Intent) a[1]); break;
			case 90: super.sendStickyBroadcastAsUser((android.content.Intent) a[1], (android.os.UserHandle) a[2]); break;
			case 91: super.sendStickyOrderedBroadcast((android.content.Intent) a[1], (android.content.BroadcastReceiver) a[2], (android.os.Handler) a[3], (Integer) a[4], (String) a[5], (android.os.Bundle) a[6]); break;
			case 92: super.sendStickyOrderedBroadcastAsUser((android.content.Intent) a[1], (android.os.UserHandle) a[2], (android.content.BroadcastReceiver) a[3], (android.os.Handler) a[4], (Integer) a[5], (String) a[6], (android.os.Bundle) a[7]); break;
			case 93: super.setTheme((Integer) a[1]); break;
			case 94: super.setWallpaper((android.graphics.Bitmap) a[1]); break;
			case 95: super.setWallpaper((java.io.InputStream) a[1]); break;
			case 96: 
				for (android.content.Intent i: (android.content.Intent[]) a[1]) Proxied.toProxyIntent(this, i);
				super.startActivities((android.content.Intent[]) a[1]); 
				break;
			case 97:
				for (android.content.Intent i: (android.content.Intent[]) a[1]) Proxied.toProxyIntent(this, i);
				super.startActivities((android.content.Intent[]) a[1], (android.os.Bundle) a[2]); 
				break;
//			case 98: super.startActivitiesAsUser((android.content.Intent[]) a[1], (android.os.Bundle) a[2], (android.os.UserHandle) a[3]); break;
			case 99: super.startActivity(Proxied.toProxyIntent(this, (android.content.Intent) a[1])); break;
			case 100: super.startActivity(Proxied.toProxyIntent(this, (android.content.Intent) a[1]), (android.os.Bundle) a[2]); break;
//			case 101: super.startActivityAsUser((android.content.Intent) a[1], (android.os.Bundle) a[2], (android.os.UserHandle) a[3]); break;
//			case 102: super.startActivityAsUser((android.content.Intent) a[1], (android.os.UserHandle) a[2]); break;
			case 103: return super.startInstrumentation((android.content.ComponentName) a[1], (String) a[2], (android.os.Bundle) a[3]);
			case 104: super.startIntentSender((android.content.IntentSender) a[1], (android.content.Intent) a[2], (Integer) a[3], (Integer) a[4], (Integer) a[5]); break;
			case 105: super.startIntentSender((android.content.IntentSender) a[1], (android.content.Intent) a[2], (Integer) a[3], (Integer) a[4], (Integer) a[5], (android.os.Bundle) a[6]); break;
			case 106: return super.startService((android.content.Intent) a[1]);
//			case 107: return super.startServiceAsUser((android.content.Intent) a[1], (android.os.UserHandle) a[2]);
			case 108: return super.stopService((android.content.Intent) a[1]);
//			case 109: return super.stopServiceAsUser((android.content.Intent) a[1], (android.os.UserHandle) a[2]);
			case 110: super.unbindService((android.content.ServiceConnection) a[1]); break;
			case 111: super.unregisterComponentCallbacks((android.content.ComponentCallbacks) a[1]); break;
			case 112: super.unregisterReceiver((android.content.BroadcastReceiver) a[1]); break;
			/**** from class android.content.ContextWrapper ****/
//			case 1000: super.attachBaseContext((android.content.Context) a[1]); break;
			case 1001: return super.getBaseContext();
			/**** from class android.view.ContextThemeWrapper ****/
			case 2000: super.applyOverrideConfiguration((android.content.res.Configuration) a[1]); break;
			case 2001: super.onApplyThemeResource((android.content.res.Resources.Theme) a[1], (Integer) a[2], (Boolean) a[3]); break;
			/**** from class android.app.Activity ****/
			case 3000: super.addContentView((android.view.View) a[1], (android.view.ViewGroup.LayoutParams) a[2]); break;
			case 3001: super.closeContextMenu(); break;
			case 3002: super.closeOptionsMenu(); break;
//			case 3003: super.convertFromTranslucent(); break;
//			case 3004: super.convertToTranslucent((android.app.Activity.TranslucentConversionListener) a[1]); break;
			case 3005: return super.createPendingResult((Integer) a[1], (android.content.Intent) a[2], (Integer) a[3]);
			case 3007: return super.dispatchGenericMotionEvent((android.view.MotionEvent) a[1]);
			case 3008: return super.dispatchKeyEvent((android.view.KeyEvent) a[1]);
			case 3009: return super.dispatchKeyShortcutEvent((android.view.KeyEvent) a[1]);
			case 3010: return super.dispatchPopulateAccessibilityEvent((android.view.accessibility.AccessibilityEvent) a[1]);
			case 3011: return super.dispatchTouchEvent((android.view.MotionEvent) a[1]);
			case 3012: return super.dispatchTrackballEvent((android.view.MotionEvent) a[1]);
			case 3013: super.dump((String) a[1], (java.io.FileDescriptor) a[2], (java.io.PrintWriter) a[3], (String[]) a[4]); break;
			case 3014: return super.findViewById((Integer) a[1]);
			case 3015: super.finish(); break;
			case 3016: super.finishActivity((Integer) a[1]); break;
			case 3017: super.finishActivityFromChild((android.app.Activity) a[1], (Integer) a[2]); break;
			case 3018: super.finishAffinity(); break;
			case 3019: super.finishFromChild((android.app.Activity) a[1]); break;
			case 3020: return super.getActionBar();
			case 3023: return super.getCallingActivity();
			case 3024: return super.getCallingPackage();
			case 3025: return super.getChangingConfigurations();
			case 3026: return super.getComponentName();
			case 3027: return super.getCurrentFocus();
			case 3028: return super.getFragmentManager();
			case 3029: return super.getIntent();
			case 3030: return super.getLastNonConfigurationInstance();
			case 3031: return super.getLayoutInflater();
			case 3032: return super.getLoaderManager();
			case 3033: return super.getLocalClassName();
			case 3034: return super.getMenuInflater();
			case 3036: return super.getParentActivityIntent();
			case 3037: return super.getPreferences((Integer) a[1]);
			case 3038: return super.getRequestedOrientation();
			case 3039: return super.getTaskId();
			case 3043: return super.getWindow();
			case 3044: return super.getWindowManager();
			case 3045: return super.hasWindowFocus();
			case 3046: super.invalidateOptionsMenu(); break;
			case 3047: return super.isChangingConfigurations();
			case 3049: return super.isDestroyed();
			case 3050: return super.isFinishing();
			case 3051: return super.isImmersive();
			case 3053: return super.isTaskRoot();
			case 3056: return super.moveTaskToBack((Boolean) a[1]);
			case 3057: return super.navigateUpTo((android.content.Intent) a[1]);
			case 3058: return super.navigateUpToFromChild((android.app.Activity) a[1], (android.content.Intent) a[2]);
			case 3059: super.onActionModeFinished((android.view.ActionMode) a[1]); break;
			case 3060: super.onActionModeStarted((android.view.ActionMode) a[1]); break;
			case 3061: super.onActivityResult((Integer) a[1], (Integer) a[2], (android.content.Intent) a[3]); break;
			case 3062: super.onAttachFragment((android.app.Fragment) a[1]); break;
			case 3063: super.onAttachedToWindow(); break;
			case 3064: super.onBackPressed(); break;
			case 3065: super.onChildTitleChanged((android.app.Activity) a[1], (CharSequence) a[2]); break;
			case 3066: super.onConfigurationChanged((android.content.res.Configuration) a[1]); break;
			case 3067: super.onContentChanged(); break;
			case 3068: return super.onContextItemSelected((android.view.MenuItem) a[1]);
			case 3069: super.onContextMenuClosed((android.view.Menu) a[1]); break;
			case 3070: super.onCreate((android.os.Bundle) a[1]); break;
			case 3071: super.onCreateContextMenu((android.view.ContextMenu) a[1], (android.view.View) a[2], (android.view.ContextMenu.ContextMenuInfo) a[3]); break;
			case 3072: return super.onCreateDescription();
			case 3073: return super.onCreateDialog((Integer) a[1]);
			case 3074: return super.onCreateDialog((Integer) a[1], (android.os.Bundle) a[2]);
			case 3075: super.onCreateNavigateUpTaskStack((android.app.TaskStackBuilder) a[1]); break;
			case 3076: return super.onCreateOptionsMenu((android.view.Menu) a[1]);
			case 3077: return super.onCreatePanelMenu((Integer) a[1], (android.view.Menu) a[2]);
			case 3078: return super.onCreatePanelView((Integer) a[1]);
			case 3079: return super.onCreateThumbnail((android.graphics.Bitmap) a[1], (android.graphics.Canvas) a[2]);
			case 3080: return super.onCreateView((android.view.View) a[1], (String) a[2], (android.content.Context) a[3], (android.util.AttributeSet) a[4]);
			case 3081: return super.onCreateView((String) a[1], (android.content.Context) a[2], (android.util.AttributeSet) a[3]);
			case 3082: super.onDestroy(); break;
			case 3083: super.onDetachedFromWindow(); break;
			case 3084: return super.onGenericMotionEvent((android.view.MotionEvent) a[1]);
			case 3085: return super.onKeyDown((Integer) a[1], (android.view.KeyEvent) a[2]);
			case 3086: return super.onKeyLongPress((Integer) a[1], (android.view.KeyEvent) a[2]);
			case 3087: return super.onKeyMultiple((Integer) a[1], (Integer) a[2], (android.view.KeyEvent) a[3]);
			case 3088: return super.onKeyShortcut((Integer) a[1], (android.view.KeyEvent) a[2]);
			case 3089: return super.onKeyUp((Integer) a[1], (android.view.KeyEvent) a[2]);
			case 3090: super.onLowMemory(); break;
			case 3091: return super.onMenuItemSelected((Integer) a[1], (android.view.MenuItem) a[2]);
			case 3092: return super.onMenuOpened((Integer) a[1], (android.view.Menu) a[2]);
			case 3093: return super.onNavigateUp();
			case 3094: return super.onNavigateUpFromChild((android.app.Activity) a[1]);
			case 3095: super.onNewIntent((android.content.Intent) a[1]); break;
			case 3096: return super.onOptionsItemSelected((android.view.MenuItem) a[1]);
			case 3097: super.onOptionsMenuClosed((android.view.Menu) a[1]); break;
			case 3098: super.onPanelClosed((Integer) a[1], (android.view.Menu) a[2]); break;
			case 3099: super.onPause(); break;
			case 3100: super.onPostCreate((android.os.Bundle) a[1]); break;
			case 3101: super.onPostResume(); break;
			case 3102: super.onPrepareDialog((Integer) a[1], (android.app.Dialog) a[2]); break;
			case 3103: super.onPrepareDialog((Integer) a[1], (android.app.Dialog) a[2], (android.os.Bundle) a[3]); break;
			case 3104: super.onPrepareNavigateUpTaskStack((android.app.TaskStackBuilder) a[1]); break;
			case 3105: return super.onPrepareOptionsMenu((android.view.Menu) a[1]);
			case 3106: return super.onPreparePanel((Integer) a[1], (android.view.View) a[2], (android.view.Menu) a[3]);
			case 3107: super.onProvideAssistData((android.os.Bundle) a[1]); break;
			case 3108: super.onRestart(); break;
			case 3109: super.onRestoreInstanceState((android.os.Bundle) a[1]); break;
			case 3110: super.onResume(); break;
			case 3111: return super.onRetainNonConfigurationInstance();
			case 3112: super.onSaveInstanceState((android.os.Bundle) a[1]); break;
			case 3113: return super.onSearchRequested();
			case 3114: super.onStart(); break;
			case 3115: super.onStop(); break;
			case 3116: super.onTitleChanged((CharSequence) a[1], (Integer) a[2]); break;
			case 3117: return super.onTouchEvent((android.view.MotionEvent) a[1]);
			case 3118: return super.onTrackballEvent((android.view.MotionEvent) a[1]);
			case 3119: super.onTrimMemory((Integer) a[1]); break;
			case 3120: super.onUserInteraction(); break;
			case 3121: super.onUserLeaveHint(); break;
			case 3122: super.onWindowAttributesChanged((android.view.WindowManager.LayoutParams) a[1]); break;
			case 3123: super.onWindowFocusChanged((Boolean) a[1]); break;
			case 3124: return super.onWindowStartingActionMode((android.view.ActionMode.Callback) a[1]);
			case 3125: super.openContextMenu((android.view.View) a[1]); break;
			case 3126: super.openOptionsMenu(); break;
			case 3127: super.overridePendingTransition((Integer) a[1], (Integer) a[2]); break;
			case 3128: super.recreate(); break;
			case 3129: super.registerForContextMenu((android.view.View) a[1]); break;
			case 3131: super.reportFullyDrawn(); break;
			case 3134: super.setContentView((Integer) a[1]); break;
			case 3135: super.setContentView((android.view.View) a[1]); break;
			case 3136: super.setContentView((android.view.View) a[1], (android.view.ViewGroup.LayoutParams) a[2]); break;
			case 3142: super.setFinishOnTouchOutside((Boolean) a[1]); break;
			case 3143: super.setImmersive((Boolean) a[1]); break;
			case 3144: super.setIntent((android.content.Intent) a[1]); break;
//			case 3145: super.setPersistent((Boolean) a[1]); break;
			case 3150: super.setRequestedOrientation((Integer) a[1]); break;
			case 3154: super.setTitle((Integer) a[1]); break;
			case 3155: super.setTitle((CharSequence) a[1]); break;
			case 3156: super.setTitleColor((Integer) a[1]); break;
			case 3157: super.setVisible((Boolean) a[1]); break;
			case 3159: return super.shouldUpRecreateTask((android.content.Intent) a[1]);
			case 3162: return super.startActionMode((android.view.ActionMode.Callback) a[1]);
			case 3163: super.startActivityForResult(Proxied.toProxyIntent(this, (android.content.Intent) a[1]), (Integer) a[2]); break;
			case 3164: super.startActivityForResult(Proxied.toProxyIntent(this, (android.content.Intent) a[1]), (Integer) a[2], (android.os.Bundle) a[3]); break;
			case 3165: super.startActivityFromChild((android.app.Activity) a[1], (android.content.Intent) a[2], (Integer) a[3]); break;
			case 3166: super.startActivityFromChild((android.app.Activity) a[1], (android.content.Intent) a[2], (Integer) a[3], (android.os.Bundle) a[4]); break;
			case 3167: super.startActivityFromFragment((android.app.Fragment) a[1], (android.content.Intent) a[2], (Integer) a[3]); break;
			case 3168: super.startActivityFromFragment((android.app.Fragment) a[1], (android.content.Intent) a[2], (Integer) a[3], (android.os.Bundle) a[4]); break;
			case 3169: return super.startActivityIfNeeded((android.content.Intent) a[1], (Integer) a[2]);
			case 3170: return super.startActivityIfNeeded((android.content.Intent) a[1], (Integer) a[2], (android.os.Bundle) a[3]);
			case 3171: super.startIntentSenderForResult((android.content.IntentSender) a[1], (Integer) a[2], (android.content.Intent) a[3], (Integer) a[4], (Integer) a[5], (Integer) a[6]); break;
			case 3172: super.startIntentSenderForResult((android.content.IntentSender) a[1], (Integer) a[2], (android.content.Intent) a[3], (Integer) a[4], (Integer) a[5], (Integer) a[6], (android.os.Bundle) a[7]); break;
			case 3173: super.startIntentSenderFromChild((android.app.Activity) a[1], (android.content.IntentSender) a[2], (Integer) a[3], (android.content.Intent) a[4], (Integer) a[5], (Integer) a[6], (Integer) a[7]); break;
			case 3174: super.startIntentSenderFromChild((android.app.Activity) a[1], (android.content.IntentSender) a[2], (Integer) a[3], (android.content.Intent) a[4], (Integer) a[5], (Integer) a[6], (Integer) a[7], (android.os.Bundle) a[8]); break;
			case 3175: super.startManagingCursor((android.database.Cursor) a[1]); break;
			case 3176: return super.startNextMatchingActivity((android.content.Intent) a[1]);
			case 3177: return super.startNextMatchingActivity((android.content.Intent) a[1], (android.os.Bundle) a[2]);
			case 3178: super.startSearch((String) a[1], (Boolean) a[2], (android.os.Bundle) a[3], (Boolean) a[4]); break;
			case 3179: super.stopManagingCursor((android.database.Cursor) a[1]); break;
			case 3180: super.takeKeyEvents((Boolean) a[1]); break;
			case 3181: super.triggerSearch((String) a[1], (android.os.Bundle) a[2]); break;
			case 3182: super.unregisterForContextMenu((android.view.View) a[1]); break;
			/**** from class android.app.ListActivity ****/
			case 7000: return super.getListAdapter();
			case 7001: return super.getListView();
			case 7002: return super.getSelectedItemId();
			case 7003: return super.getSelectedItemPosition();
			case 7004: super.onListItemClick((android.widget.ListView) a[1], (android.view.View) a[2], (Integer) a[3], (Long) a[4]); break;
			case 7005: super.setListAdapter((android.widget.ListAdapter) a[1]); break;
			case 7006: super.setSelection((Integer) a[1]); break;
			}
		} catch (Throwable ex) {
			throw new RuntimeException(ex);
		}
		return null;
	}
	
	public String getProxiedLoaderClassName() {
		return proxied.loaderClassName;
	}

}
