public class com.a.f.n {
	 /* # static fields */
	 public static android.app.Activity a;
	 private static com.a.f.n b;
	 /* # direct methods */
	 static com.a.f.n ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* new-instance v0, Lcom/a/f/n; */
		 /* invoke-direct {v0}, Lcom/a/f/n;-><init>()V */
		 return;
	 } // .end method
	 public com.a.f.n ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static com.a.f.n a ( ) {
		 /* .locals 1 */
		 v0 = com.a.f.n.b;
	 } // .end method
	 public static void a ( android.app.Activity p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( java.lang.String p0, java.lang.String p1, Boolean p2 ) {
		 /* .locals 3 */
		 try { // :try_start_0
			 android.os.Environment .getExternalStorageState ( );
			 final String v1 = "mounted"; // const-string v1, "mounted"
			 v0 = 			 (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
			 if ( v0 != null) { // if-eqz v0, :cond_2
				 /* new-instance v0, Ljava/lang/StringBuilder; */
				 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
				 android.os.Environment .getExternalStorageDirectory ( );
				 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
				 final String v1 = "/shyoogame"; // const-string v1, "/shyoogame"
				 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 final String v1 = "/"; // const-string v1, "/"
				 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 /* new-instance v1, Ljava/io/File; */
				 /* invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
				 v2 = 				 (( java.io.File ) v1 ).exists ( ); // invoke-virtual {v1}, Ljava/io/File;->exists()Z
				 /* if-nez v2, :cond_0 */
				 (( java.io.File ) v1 ).mkdirs ( ); // invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z
			 } // :cond_0
			 /* new-instance v1, Ljava/lang/StringBuilder; */
			 java.lang.String .valueOf ( v0 );
			 /* invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
			 (( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 } // :cond_1
	 } // :goto_0
	 /* new-instance v1, Ljava/io/FileWriter; */
	 /* invoke-direct {v1, v0, p3}, Ljava/io/FileWriter;-><init>(Ljava/lang/String;Z)V */
	 (( java.io.FileWriter ) v1 ).write ( p1 ); // invoke-virtual {v1, p1}, Ljava/io/FileWriter;->write(Ljava/lang/String;)V
	 (( java.io.FileWriter ) v1 ).flush ( ); // invoke-virtual {v1}, Ljava/io/FileWriter;->flush()V
	 (( java.io.FileWriter ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/FileWriter;->close()V
} // :goto_1
return;
} // :cond_2
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "/data/data/"; // const-string v1, "/data/data/"
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v1 = com.a.f.n.a;
(( android.app.Activity ) v1 ).getPackageName ( ); // invoke-virtual {v1}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "/files"; // const-string v1, "/files"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* new-instance v0, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v1 );
/* invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v2 = "/"; // const-string v2, "/"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* new-instance v2, Ljava/io/File; */
/* invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
v1 = (( java.io.File ) v2 ).exists ( ); // invoke-virtual {v2}, Ljava/io/File;->exists()Z
/* if-nez v1, :cond_1 */
(( java.io.File ) v2 ).mkdir ( ); // invoke-virtual {v2}, Ljava/io/File;->mkdir()Z
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
} // .end method
public Boolean a ( java.lang.String p0 ) {
/* .locals 3 */
android.os.Environment .getExternalStorageState ( );
final String v1 = "mounted"; // const-string v1, "mounted"
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
android.os.Environment .getExternalStorageDirectory ( );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = "/shyoogame"; // const-string v1, "/shyoogame"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "/"; // const-string v1, "/"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* new-instance v1, Ljava/io/File; */
/* invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
v2 = (( java.io.File ) v1 ).exists ( ); // invoke-virtual {v1}, Ljava/io/File;->exists()Z
/* if-nez v2, :cond_0 */
(( java.io.File ) v1 ).mkdirs ( ); // invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z
} // :cond_0
/* new-instance v1, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v0 );
/* invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :goto_0
/* new-instance v1, Ljava/io/File; */
/* invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
v0 = (( java.io.File ) v1 ).exists ( ); // invoke-virtual {v1}, Ljava/io/File;->exists()Z
} // :cond_1
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "/data/data/"; // const-string v1, "/data/data/"
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v1 = com.a.f.n.a;
(( android.app.Activity ) v1 ).getPackageName ( ); // invoke-virtual {v1}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "/files/"; // const-string v1, "/files/"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public java.lang.String b ( java.lang.String p0 ) {
/* .locals 6 */
int v1 = 0; // const/4 v1, 0x0
int v0 = 0; // const/4 v0, 0x0
android.os.Environment .getExternalStorageState ( );
final String v3 = "mounted"; // const-string v3, "mounted"
v2 = (( java.lang.String ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_2
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
android.os.Environment .getExternalStorageDirectory ( );
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v2 = "/shyoogame"; // const-string v2, "/shyoogame"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "/"; // const-string v2, "/"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* new-instance v1, Ljava/io/File; */
/* invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
v1 = (( java.io.File ) v1 ).exists ( ); // invoke-virtual {v1}, Ljava/io/File;->exists()Z
/* if-nez v1, :cond_0 */
} // :goto_0
} // :cond_0
int v1 = 1; // const/4 v1, 0x1
/* new-instance v3, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v2 );
/* invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :cond_1
if ( v1 != null) { // if-eqz v1, :cond_3
try { // :try_start_0
/* new-instance v1, Ljava/io/FileInputStream; */
/* invoke-direct {v1, p1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V */
} // :goto_1
/* new-instance v2, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V */
v3 = (( java.io.ByteArrayOutputStream ) v2 ).size ( ); // invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->size()I
/* add-int/lit8 v3, v3, 0x1 */
/* new-array v3, v3, [B */
} // :goto_2
v4 = (( java.io.FileInputStream ) v1 ).read ( v3 ); // invoke-virtual {v1, v3}, Ljava/io/FileInputStream;->read([B)I
int v5 = -1; // const/4 v5, -0x1
/* if-ne v4, v5, :cond_4 */
(( java.io.ByteArrayOutputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V
(( java.io.FileInputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
(( java.io.ByteArrayOutputStream ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toString()Ljava/lang/String;
/* :try_end_0 */
/* .catch Ljava/io/FileNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
} // :cond_2
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "/data/data/"; // const-string v3, "/data/data/"
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v3 = com.a.f.n.a;
(( android.app.Activity ) v3 ).getPackageName ( ); // invoke-virtual {v3}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = "/files/"; // const-string v3, "/files/"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* new-instance v3, Ljava/io/File; */
/* invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
v2 = (( java.io.File ) v3 ).exists ( ); // invoke-virtual {v3}, Ljava/io/File;->exists()Z
/* if-nez v2, :cond_1 */
} // :cond_3
try { // :try_start_1
v1 = com.a.f.n.a;
(( android.app.Activity ) v1 ).openFileInput ( p1 ); // invoke-virtual {v1, p1}, Landroid/app/Activity;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;
} // :cond_4
int v5 = 0; // const/4 v5, 0x0
(( java.io.ByteArrayOutputStream ) v2 ).write ( v3, v5, v4 ); // invoke-virtual {v2, v3, v5, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V
/* :try_end_1 */
/* .catch Ljava/io/FileNotFoundException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_1 */
/* :catch_0 */
/* move-exception v1 */
(( java.io.FileNotFoundException ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/io/FileNotFoundException;->printStackTrace()V
/* :catch_1 */
/* move-exception v1 */
} // .end method
public void c ( java.lang.String p0 ) {
/* .locals 2 */
android.os.Environment .getExternalStorageState ( );
final String v1 = "mounted"; // const-string v1, "mounted"
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
android.os.Environment .getExternalStorageDirectory ( );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = "/shyoogame"; // const-string v1, "/shyoogame"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "/"; // const-string v1, "/"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* new-instance v1, Ljava/io/File; */
/* invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
v1 = (( java.io.File ) v1 ).exists ( ); // invoke-virtual {v1}, Ljava/io/File;->exists()Z
/* if-nez v1, :cond_1 */
} // :cond_0
} // :goto_0
return;
} // :cond_1
/* new-instance v1, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v0 );
/* invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :goto_1
/* new-instance v1, Ljava/io/File; */
/* invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
v0 = (( java.io.File ) v1 ).exists ( ); // invoke-virtual {v1}, Ljava/io/File;->exists()Z
if ( v0 != null) { // if-eqz v0, :cond_0
(( java.io.File ) v1 ).delete ( ); // invoke-virtual {v1}, Ljava/io/File;->delete()Z
} // :cond_2
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "/data/data/"; // const-string v1, "/data/data/"
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v1 = com.a.f.n.a;
(( android.app.Activity ) v1 ).getPackageName ( ); // invoke-virtual {v1}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "/files/"; // const-string v1, "/files/"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
