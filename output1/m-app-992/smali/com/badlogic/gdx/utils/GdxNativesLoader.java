public class com.badlogic.gdx.utils.GdxNativesLoader {
	 /* # static fields */
	 public static Boolean disableNativesLoading;
	 public static Boolean is64Bit;
	 public static Boolean isLinux;
	 public static Boolean isMac;
	 public static Boolean isWindows;
	 public static java.io.File nativesDir;
	 private static Boolean nativesLoaded;
	 public static java.lang.String path;
	 /* # direct methods */
	 static com.badlogic.gdx.utils.GdxNativesLoader ( ) {
		 /* .locals 3 */
		 int v0 = 0; // const/4 v0, 0x0
		 final String v2 = "os.name"; // const-string v2, "os.name"
		 com.badlogic.gdx.utils.GdxNativesLoader.disableNativesLoading = (v0!= 0);
		 com.badlogic.gdx.utils.GdxNativesLoader.nativesLoaded = (v0!= 0);
		 final String v0 = "os.name"; // const-string v0, "os.name"
		 java.lang.System .getProperty ( v2 );
		 final String v1 = "Windows"; // const-string v1, "Windows"
		 v0 = 		 (( java.lang.String ) v0 ).contains ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
		 com.badlogic.gdx.utils.GdxNativesLoader.isWindows = (v0!= 0);
		 final String v0 = "os.name"; // const-string v0, "os.name"
		 java.lang.System .getProperty ( v2 );
		 final String v1 = "Linux"; // const-string v1, "Linux"
		 v0 = 		 (( java.lang.String ) v0 ).contains ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
		 com.badlogic.gdx.utils.GdxNativesLoader.isLinux = (v0!= 0);
		 final String v0 = "os.name"; // const-string v0, "os.name"
		 java.lang.System .getProperty ( v2 );
		 final String v1 = "Mac"; // const-string v1, "Mac"
		 v0 = 		 (( java.lang.String ) v0 ).contains ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
		 com.badlogic.gdx.utils.GdxNativesLoader.isMac = (v0!= 0);
		 final String v0 = "os.arch"; // const-string v0, "os.arch"
		 java.lang.System .getProperty ( v0 );
		 final String v1 = "amd64"; // const-string v1, "amd64"
		 v0 = 		 (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 com.badlogic.gdx.utils.GdxNativesLoader.is64Bit = (v0!= 0);
		 /* new-instance v0, Ljava/io/File; */
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v2 = "java.io.tmpdir"; // const-string v2, "java.io.tmpdir"
		 java.lang.System .getProperty ( v2 );
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v2 = "/libgdx/"; // const-string v2, "/libgdx/"
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v2 = "gdx.dll"; // const-string v2, "gdx.dll"
		 com.badlogic.gdx.utils.GdxNativesLoader .crc ( v2 );
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
		 return;
	 } // .end method
	 public com.badlogic.gdx.utils.GdxNativesLoader ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 private static java.lang.String crc ( java.lang.String p0 ) {
		 /* .locals 5 */
		 /* const-class v0, Lcom/badlogic/gdx/utils/GdxNativesLoader; */
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v2 = "/"; // const-string v2, "/"
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 (( java.lang.Class ) v0 ).getResourceAsStream ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;
		 /* if-nez v0, :cond_0 */
		 final String v0 = "Basket"; // const-string v0, "Basket"
	 } // :goto_0
} // :cond_0
/* new-instance v1, Ljava/util/zip/CRC32; */
/* invoke-direct {v1}, Ljava/util/zip/CRC32;-><init>()V */
/* const/16 v2, 0x1000 */
/* new-array v2, v2, [B */
} // :goto_1
try { // :try_start_0
v3 = (( java.io.InputStream ) v0 ).read ( v2 ); // invoke-virtual {v0, v2}, Ljava/io/InputStream;->read([B)I
int v4 = -1; // const/4 v4, -0x1
/* if-eq v3, v4, :cond_1 */
int v4 = 0; // const/4 v4, 0x0
(( java.util.zip.CRC32 ) v1 ).update ( v2, v4, v3 ); // invoke-virtual {v1, v2, v4, v3}, Ljava/util/zip/CRC32;->update([BII)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v2 */
try { // :try_start_1
	 (( java.io.InputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/InputStream;->close()V
	 /* :try_end_1 */
	 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
} // :cond_1
} // :goto_2
(( java.util.zip.CRC32 ) v1 ).getValue ( ); // invoke-virtual {v1}, Ljava/util/zip/CRC32;->getValue()J
/* move-result-wide v0 */
java.lang.Long .toString ( v0,v1 );
/* :catch_1 */
/* move-exception v0 */
} // .end method
public static java.lang.String extractLibrary ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 7 */
int v6 = 0; // const/4 v6, 0x0
/* sget-boolean v0, Lcom/badlogic/gdx/utils/GdxNativesLoader;->is64Bit:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* move-object v0, p1 */
} // :goto_0
/* new-instance v1, Ljava/io/File; */
v2 = com.badlogic.gdx.utils.GdxNativesLoader.nativesDir;
/* invoke-direct {v1, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
try { // :try_start_0
/* const-class v2, Lcom/badlogic/gdx/utils/GdxNativesLoader; */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "/"; // const-string v4, "/"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.lang.Class ) v2 ).getResourceAsStream ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;
/* if-nez v0, :cond_1 */
/* move-object v0, v6 */
} // :goto_1
} // :cond_0
/* move-object v0, p0 */
} // :cond_1
v2 = com.badlogic.gdx.utils.GdxNativesLoader.nativesDir;
(( java.io.File ) v2 ).mkdirs ( ); // invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z
/* new-instance v2, Ljava/io/FileOutputStream; */
/* invoke-direct {v2, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V */
/* const/16 v3, 0x1000 */
/* new-array v3, v3, [B */
} // :goto_2
v4 = (( java.io.InputStream ) v0 ).read ( v3 ); // invoke-virtual {v0, v3}, Ljava/io/InputStream;->read([B)I
int v5 = -1; // const/4 v5, -0x1
/* if-eq v4, v5, :cond_2 */
int v5 = 0; // const/4 v5, 0x0
(( java.io.FileOutputStream ) v2 ).write ( v3, v5, v4 ); // invoke-virtual {v2, v3, v5, v4}, Ljava/io/FileOutputStream;->write([BII)V
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
} // :goto_3
v0 = (( java.io.File ) v1 ).exists ( ); // invoke-virtual {v1}, Ljava/io/File;->exists()Z
if ( v0 != null) { // if-eqz v0, :cond_3
(( java.io.File ) v1 ).getAbsolutePath ( ); // invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
} // :cond_2
try { // :try_start_1
(( java.io.InputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/InputStream;->close()V
(( java.io.FileOutputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
} // :cond_3
/* move-object v0, v6 */
} // .end method
public static void load ( ) {
/* .locals 3 */
final String v2 = "libgdx.dylib"; // const-string v2, "libgdx.dylib"
/* sget-boolean v0, Lcom/badlogic/gdx/utils/GdxNativesLoader;->disableNativesLoading:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = java.lang.System.out;
final String v1 = "So you don\'t like our native lib loading? Good, you are on your own now.We don\'t give support from here on out"; // const-string v1, "So you don\'t like our native lib loading? Good, you are on your own now.We don\'t give support from here on out"
(( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
} // :cond_0
} // :goto_0
return;
} // :cond_1
/* sget-boolean v0, Lcom/badlogic/gdx/utils/GdxNativesLoader;->nativesLoaded:Z */
/* if-nez v0, :cond_0 */
final String v0 = "java.vm.name"; // const-string v0, "java.vm.name"
java.lang.System .getProperty ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_2
final String v1 = "Dalvik"; // const-string v1, "Dalvik"
v0 = (( java.lang.String ) v0 ).contains ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
/* if-nez v0, :cond_4 */
} // :cond_2
/* sget-boolean v0, Lcom/badlogic/gdx/utils/GdxNativesLoader;->isWindows:Z */
if ( v0 != null) { // if-eqz v0, :cond_6
final String v0 = "gdx.dll"; // const-string v0, "gdx.dll"
final String v1 = "gdx-64.dll"; // const-string v1, "gdx-64.dll"
v0 = com.badlogic.gdx.utils.GdxNativesLoader .loadLibrary ( v0,v1 );
com.badlogic.gdx.utils.GdxNativesLoader.nativesLoaded = (v0!= 0);
} // :cond_3
} // :goto_1
/* sget-boolean v0, Lcom/badlogic/gdx/utils/GdxNativesLoader;->nativesLoaded:Z */
/* if-nez v0, :cond_0 */
} // :cond_4
/* sget-boolean v0, Lcom/badlogic/gdx/utils/GdxNativesLoader;->is64Bit:Z */
if ( v0 != null) { // if-eqz v0, :cond_5
/* sget-boolean v0, Lcom/badlogic/gdx/utils/GdxNativesLoader;->isMac:Z */
if ( v0 != null) { // if-eqz v0, :cond_8
} // :cond_5
final String v0 = "gdx"; // const-string v0, "gdx"
java.lang.System .loadLibrary ( v0 );
} // :goto_2
int v0 = 1; // const/4 v0, 0x1
com.badlogic.gdx.utils.GdxNativesLoader.nativesLoaded = (v0!= 0);
} // :cond_6
/* sget-boolean v0, Lcom/badlogic/gdx/utils/GdxNativesLoader;->isMac:Z */
if ( v0 != null) { // if-eqz v0, :cond_7
final String v0 = "libgdx.dylib"; // const-string v0, "libgdx.dylib"
final String v0 = "libgdx.dylib"; // const-string v0, "libgdx.dylib"
v0 = com.badlogic.gdx.utils.GdxNativesLoader .loadLibrary ( v2,v2 );
com.badlogic.gdx.utils.GdxNativesLoader.nativesLoaded = (v0!= 0);
} // :cond_7
/* sget-boolean v0, Lcom/badlogic/gdx/utils/GdxNativesLoader;->isLinux:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
final String v0 = "libgdx.so"; // const-string v0, "libgdx.so"
final String v1 = "libgdx-64.so"; // const-string v1, "libgdx-64.so"
v0 = com.badlogic.gdx.utils.GdxNativesLoader .loadLibrary ( v0,v1 );
com.badlogic.gdx.utils.GdxNativesLoader.nativesLoaded = (v0!= 0);
} // :cond_8
final String v0 = "gdx-64"; // const-string v0, "gdx-64"
java.lang.System .loadLibrary ( v0 );
} // .end method
public static Boolean loadLibrary ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 1 */
com.badlogic.gdx.utils.GdxNativesLoader .extractLibrary ( p0,p1 );
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = com.badlogic.gdx.utils.GdxNativesLoader.path;
java.lang.System .load ( v0 );
} // :cond_0
v0 = com.badlogic.gdx.utils.GdxNativesLoader.path;
if ( v0 != null) { // if-eqz v0, :cond_1
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
