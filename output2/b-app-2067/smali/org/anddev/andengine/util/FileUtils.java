public class org.anddev.andengine.util.FileUtils {
	 /* # direct methods */
	 public org.anddev.andengine.util.FileUtils ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static void copyFile ( java.io.File p0, java.io.File p1 ) {
		 /* .locals 3 */
		 /* new-instance v0, Ljava/io/FileInputStream; */
		 /* invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
		 /* new-instance v1, Ljava/io/FileOutputStream; */
		 /* invoke-direct {v1, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V */
		 try { // :try_start_0
			 org.anddev.andengine.util.StreamUtils .copy ( v0,v1 );
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 org.anddev.andengine.util.StreamUtils .close ( v0 );
			 org.anddev.andengine.util.StreamUtils .close ( v1 );
			 return;
			 /* :catchall_0 */
			 /* move-exception v2 */
			 org.anddev.andengine.util.StreamUtils .close ( v0 );
			 org.anddev.andengine.util.StreamUtils .close ( v1 );
			 /* throw v2 */
		 } // .end method
		 public static void copyToExternalStorage ( android.content.Context p0, Integer p1, java.lang.String p2 ) {
			 /* .locals 1 */
			 (( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
			 (( android.content.res.Resources ) v0 ).openRawResource ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;
			 org.anddev.andengine.util.FileUtils .copyToExternalStorage ( p0,v0,p2 );
			 return;
		 } // .end method
		 public static void copyToExternalStorage ( android.content.Context p0, java.io.InputStream p1, java.lang.String p2 ) {
			 /* .locals 2 */
			 v0 = 			 org.anddev.andengine.util.FileUtils .isExternalStorageWriteable ( );
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 org.anddev.andengine.util.FileUtils .getAbsolutePathOnExternalStorage ( p0,p2 );
				 /* new-instance v1, Ljava/io/FileOutputStream; */
				 /* invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V */
				 org.anddev.andengine.util.StreamUtils .copyAndClose ( p1,v1 );
				 return;
			 } // :cond_0
			 /* new-instance v0, Ljava/lang/IllegalStateException; */
			 final String v1 = "External Storage is not writeable."; // const-string v1, "External Storage is not writeable."
			 /* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
			 /* throw v0 */
		 } // .end method
		 public static void copyToExternalStorage ( android.content.Context p0, java.lang.String p1, java.lang.String p2 ) {
			 /* .locals 1 */
			 (( android.content.Context ) p0 ).getAssets ( ); // invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
			 (( android.content.res.AssetManager ) v0 ).open ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
			 org.anddev.andengine.util.FileUtils .copyToExternalStorage ( p0,v0,p2 );
			 return;
		 } // .end method
		 public static void copyToInternalStorage ( android.content.Context p0, Integer p1, java.lang.String p2 ) {
			 /* .locals 1 */
			 (( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
			 (( android.content.res.Resources ) v0 ).openRawResource ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;
			 org.anddev.andengine.util.FileUtils .copyToInternalStorage ( p0,v0,p2 );
			 return;
		 } // .end method
		 private static void copyToInternalStorage ( android.content.Context p0, java.io.InputStream p1, java.lang.String p2 ) {
			 /* .locals 3 */
			 /* new-instance v0, Ljava/io/FileOutputStream; */
			 /* new-instance v1, Ljava/io/File; */
			 (( android.content.Context ) p0 ).getFilesDir ( ); // invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
			 /* invoke-direct {v1, v2, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
			 /* invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V */
			 org.anddev.andengine.util.StreamUtils .copyAndClose ( p1,v0 );
			 return;
		 } // .end method
		 public static void copyToInternalStorage ( android.content.Context p0, java.lang.String p1, java.lang.String p2 ) {
			 /* .locals 1 */
			 (( android.content.Context ) p0 ).getAssets ( ); // invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
			 (( android.content.res.AssetManager ) v0 ).open ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
			 org.anddev.andengine.util.FileUtils .copyToInternalStorage ( p0,v0,p2 );
			 return;
		 } // .end method
		 public static Boolean deleteDirectory ( java.io.File p0 ) {
			 /* .locals 6 */
			 int v5 = 0; // const/4 v5, 0x0
			 v0 = 			 (( java.io.File ) p0 ).isDirectory ( ); // invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 (( java.io.File ) p0 ).list ( ); // invoke-virtual {p0}, Ljava/io/File;->list()[Ljava/lang/String;
				 /* array-length v1, v0 */
				 /* move v2, v5 */
			 } // :goto_0
			 /* if-lt v2, v1, :cond_1 */
		 } // :cond_0
		 v0 = 		 (( java.io.File ) p0 ).delete ( ); // invoke-virtual {p0}, Ljava/io/File;->delete()Z
	 } // :goto_1
} // :cond_1
/* new-instance v3, Ljava/io/File; */
/* aget-object v4, v0, v2 */
/* invoke-direct {v3, p0, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
v3 = org.anddev.andengine.util.FileUtils .deleteDirectory ( v3 );
/* if-nez v3, :cond_2 */
/* move v0, v5 */
} // :cond_2
/* add-int/lit8 v2, v2, 0x1 */
} // .end method
public static Boolean ensureDirectoriesExistOnExternalStorage ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 2 */
v0 = org.anddev.andengine.util.FileUtils .isDirectoryExistingOnExternalStorage ( p0,p1 );
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
v0 = org.anddev.andengine.util.FileUtils .isExternalStorageWriteable ( );
if ( v0 != null) { // if-eqz v0, :cond_1
org.anddev.andengine.util.FileUtils .getAbsolutePathOnExternalStorage ( p0,p1 );
/* new-instance v1, Ljava/io/File; */
/* invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
v0 = (( java.io.File ) v1 ).mkdirs ( ); // invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z
} // :cond_1
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "External Storage is not writeable."; // const-string v1, "External Storage is not writeable."
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public static java.lang.String getAbsolutePathOnExternalStorage ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 2 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
android.os.Environment .getExternalStorageDirectory ( );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = "/Android/data/"; // const-string v1, "/Android/data/"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( android.content.Context ) p0 ).getApplicationInfo ( ); // invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
v1 = this.packageName;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "/files/"; // const-string v1, "/files/"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public static java.lang.String getAbsolutePathOnInternalStorage ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 2 */
/* new-instance v0, Ljava/lang/StringBuilder; */
(( android.content.Context ) p0 ).getFilesDir ( ); // invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
(( java.io.File ) v1 ).getAbsolutePath ( ); // invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
java.lang.String .valueOf ( v1 );
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public static java.lang.String getDirectoryListOnExternalStorage ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 2 */
org.anddev.andengine.util.FileUtils .getAbsolutePathOnExternalStorage ( p0,p1 );
/* new-instance v1, Ljava/io/File; */
/* invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
(( java.io.File ) v1 ).list ( ); // invoke-virtual {v1}, Ljava/io/File;->list()[Ljava/lang/String;
} // .end method
public static java.lang.String getDirectoryListOnExternalStorage ( android.content.Context p0, java.lang.String p1, java.io.FilenameFilter p2 ) {
/* .locals 2 */
org.anddev.andengine.util.FileUtils .getAbsolutePathOnExternalStorage ( p0,p1 );
/* new-instance v1, Ljava/io/File; */
/* invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
(( java.io.File ) v1 ).list ( p2 ); // invoke-virtual {v1, p2}, Ljava/io/File;->list(Ljava/io/FilenameFilter;)[Ljava/lang/String;
} // .end method
public static Boolean isDirectoryExistingOnExternalStorage ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 2 */
v0 = org.anddev.andengine.util.FileUtils .isExternalStorageReadable ( );
if ( v0 != null) { // if-eqz v0, :cond_1
org.anddev.andengine.util.FileUtils .getAbsolutePathOnExternalStorage ( p0,p1 );
/* new-instance v1, Ljava/io/File; */
/* invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
v0 = (( java.io.File ) v1 ).exists ( ); // invoke-virtual {v1}, Ljava/io/File;->exists()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( java.io.File ) v1 ).isDirectory ( ); // invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z
if ( v0 != null) { // if-eqz v0, :cond_0
	 int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :cond_1
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "External Storage is not readable."; // const-string v1, "External Storage is not readable."
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public static Boolean isExternalStorageReadable ( ) {
/* .locals 2 */
android.os.Environment .getExternalStorageState ( );
final String v1 = "mounted"; // const-string v1, "mounted"
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_0 */
final String v1 = "mounted_ro"; // const-string v1, "mounted_ro"
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // .end method
public static Boolean isExternalStorageWriteable ( ) {
/* .locals 2 */
android.os.Environment .getExternalStorageState ( );
final String v1 = "mounted"; // const-string v1, "mounted"
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
} // .end method
public static Boolean isFileExistingOnExternalStorage ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 2 */
v0 = org.anddev.andengine.util.FileUtils .isExternalStorageReadable ( );
if ( v0 != null) { // if-eqz v0, :cond_1
org.anddev.andengine.util.FileUtils .getAbsolutePathOnExternalStorage ( p0,p1 );
/* new-instance v1, Ljava/io/File; */
/* invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
v0 = (( java.io.File ) v1 ).exists ( ); // invoke-virtual {v1}, Ljava/io/File;->exists()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( java.io.File ) v1 ).isFile ( ); // invoke-virtual {v1}, Ljava/io/File;->isFile()Z
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :cond_1
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "External Storage is not readable."; // const-string v1, "External Storage is not readable."
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public static java.io.InputStream openOnExternalStorage ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 2 */
org.anddev.andengine.util.FileUtils .getAbsolutePathOnExternalStorage ( p0,p1 );
/* new-instance v1, Ljava/io/FileInputStream; */
/* invoke-direct {v1, v0}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V */
} // .end method
