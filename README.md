# ScannerProto
[![Gitter](https://badges.gitter.im/SMU_Graduation-project/community.svg)](https://gitter.im/SMU_Graduation-project/community?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge)

=====수정 한 부분=====
-----------------------------------------------------------------------------------

1. [AndroidManifest.xml]에서 수정
<activity
  android:name=".SplashActivity"
  android:screenOrientation="fullSensor"
  android:theme="@style/SplashTheme">
  <intent-filter>
    <action android:name="android.intent.action.MAIN" />
    <category android:name="android.intent.category.LAUNCHER" />
  </intent-filter>
</activity>
<activity android:name=".camerascan" />
<activity android:name=".imagescan" />
<activity android:name=".stored" />
<activity android:name=".MainActivity"/>
        
-----------------------------------------------------------------------------------

2. [styles.xml]에 추가
<style name="SplashTheme" parent="Theme.AppCompat.NoActionBar">
        <item name="android:windowBackground">@mipmap/splash</item>
</style>
*minmap폴더에 로딩으로 쓸 이미지 넣기!

-----------------------------------------------------------------------------------

3. [SplashActivity]추가

  *추가시 xml파일은 추가 하지 않는다.
  
  -----------------------------------------------------------------------------------




