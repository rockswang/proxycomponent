# 简介
实现Android Activity的代理机制，可以实现：

1. 在AndroidManifest.xml中仅声明一个代理Activity，即可打开多个被代理Activity
2. 被代理Activity可以动态更新，即使用DexClassLoader加载的Activity

# 使用方法
1. 原派生于Activity的类，其超类需改为Proxied<Activity>
2. 类中原来需要传入Activity.this，或Context.this的地方，改为传入Activity.this.asActivity()
3. 在AndroidManifest增加ProxyActivity的声明，其它被代理Activity则可以删除
4. 如果入口Activity也需要代理，需在AndroidManifest中增加<meta-data android:name="PROXIED_ACTIVITY_CLASS_NAME" android:value="被代理Activity类名"/>

