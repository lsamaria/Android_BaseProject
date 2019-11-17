
1. go to Manifest file and add:

<application
    android:hardwareAccelerated="true"
>

2. go to build.gradle(:Module) and add:

defaultConfig {
    vectorDrawables.useSupportLibrary = true
}

3. go to buid.gradle(:Project Name) and add:

dependencies {
    classpath 'com.android.tools.build:gradle:3.2.0-alpha18'
}

4. Inside MainActivity import these libraries:

import android.widget.Button
import android.widget.Toast
import android.util.Log

// these are for the imageView but aren't necessary
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.content.ContextCompat
import java.security.AccessController.getContext

5. in acitivty_main.xml make sure the layout uses:

xmlns:app="http://schemas.android.com/apk/res-auto" // should automatically get added from step 2
android:orientation="vertical"

 and the ImageView uses:
app:srcCompat="@drawable/some_image"
