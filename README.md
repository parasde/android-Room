# android-Room

Android Room library example

## build.gradle (app)

<pre>
<code>
    apply plugin: 'kotlin-kapt'
</code>
</pre>
<pre>
<code>
    def room_version = "2.2.5"
    implementation "androidx.room:room-runtime:$room_version"
    kapt "androidx.room:room-compiler:$room_version"
</code>
</pre>