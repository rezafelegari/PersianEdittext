# PersianEdittext
[![](https://jitpack.io/v/rezafelegari/Android-Link-Preview.svg)](https://jitpack.io/#rezafelegari/Android-Link-Preview)

# Persian EditText

Simple Persian EditText for Android

## Intro
<a href="https://imgflip.com/gif/2jvsei"><img src="https://i.imgflip.com/2jvsei.gif" title="made at imgflip.com"/></a>
## Usage

Add EditText to your layout via XML
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".MainActivity">


    <com.example.persianlibrary.PersianEdittext
        android:id="@+id/edt_username"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:gravity="center"
        android:layoutDirection="rtl"
        android:padding="10dp"
        app:hint="نام کاربری"
        app:icon_tv="@drawable/arroba" />

    <com.example.persianlibrary.PersianEdittext
        android:id="@+id/edt_password"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:gravity="center"
        android:layoutDirection="rtl"
        android:padding="10dp"
        app:hint="رمز عبور"
        app:icon_tv="@drawable/arroba">


    </com.example.persianlibrary.PersianEdittext>

</LinearLayout>

```
Add EditText to your layout programatically

```
public class MainActivity extends AppCompatActivity {

    PersianEdittext edt_username;
    PersianEdittext edt_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    
        edt_username = findViewById(R.id.edt_username);
        edt_password = findViewById(R.id.edt_password);
      

    }
}
```

## Download

Jitpack : 
```
allprojects {
    repositories {
        google()
        jcenter()
        maven { url 'https://jitpack.io' }
    }
}
```
Grandle :
```
dependencies {
     implementation 'com.github.rezafelegari:Android-Link-Preview:1.1'
}
```
