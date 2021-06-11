# Bottom sheet slide up 🎉

Bottom Sheet Dialog menu slide up seperti Gojek

![alt_text](https://github.com/vjivandro/SlideUpSheetBottom/blob/main/device-2021-06-11-114600.png)
![alt_text](https://github.com/vjivandro/SlideUpSheetBottom/blob/main/device-2021-06-11-114624.png)

## Cara install

```bash
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
Add dependency

```bash
dependencies {
	        implementation 'com.github.vjivandro:SlideUpSheetBottom:Tag'
	}
```

## Cara menggunakan
Tambahkan komponen SlideLayout pada file .xml anda contoh: activity_main.xml
<com.vassa.sheetbottomslideup.view.SlideUpLayout
        tools:visibility="invisible"
        android:id="@+id/floating_slideup_sheet"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:paddingLeft="16dp"
        android:paddingRight="16dp"
        android:paddingBottom="16dp">
        
        <LinearLayout
           android:id="@+id/container_floating_menu"> 
           ... 
        </LinearLayout>
        
        <LinearLayout
           android:id="@+id/container_expanded_content"> 
           ... 
        </LinearLayout>
</com.vassa.sheetbottomslideup.view.SlideUpLayout>

memanggil komponen SlideLayout pada class activity
SlideUpBottomsheet(this, slide_conten)
            .setFloatingMenuRadiusInDp(100)
            .setFloatingMenuColor(android.R.color.white)
            .setFloatingMenu(container_floating_menu)
            .setPanel(content_expand_container)
            .build()
