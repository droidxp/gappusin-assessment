public class com.a.f.o {
	 /* # static fields */
	 static java.io.RandomAccessFile a;
	 static java.io.InputStream b;
	 public static java.lang.Thread c;
	 public static Boolean d;
	 public static Boolean e;
	 static android.os.Handler f;
	 private static java.lang.String g;
	 private static java.lang.String h;
	 private static java.lang.String i;
	 private static java.lang.String j;
	 private static com.calmei.jmsn.PlaneFightActivity k;
	 private static l;
	 /* # direct methods */
	 static com.a.f.o ( ) {
		 /* .locals 2 */
		 int v1 = 0; // const/4 v1, 0x0
		 int v0 = 0; // const/4 v0, 0x0
		 com.a.f.o.d = (v1!= 0);
		 com.a.f.o.e = (v1!= 0);
		 /* new-instance v0, Lcom/a/f/p; */
		 /* invoke-direct {v0}, Lcom/a/f/p;-><init>()V */
		 return;
	 } // .end method
	 public static java.io.File a ( java.lang.String p0 ) {
		 /* .locals 4 */
		 final String v0 = "/"; // const-string v0, "/"
		 v0 = 		 (( java.lang.String ) p0 ).lastIndexOf ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I
		 (( java.lang.String ) p0 ).substring ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;
		 android.os.Environment .getExternalStorageState ( );
		 final String v2 = "mounted"; // const-string v2, "mounted"
		 v0 = 		 (( java.lang.String ) v0 ).equals ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* new-instance v0, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
			 android.os.Environment .getExternalStorageDirectory ( );
			 (( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
			 final String v2 = "/shyoogame"; // const-string v2, "/shyoogame"
			 (( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 final String v2 = "/"; // const-string v2, "/"
			 (( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 /* new-instance v2, Ljava/io/File; */
			 /* invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
			 v0 = 			 (( java.io.File ) v2 ).exists ( ); // invoke-virtual {v2}, Ljava/io/File;->exists()Z
			 /* if-nez v0, :cond_0 */
			 (( java.io.File ) v2 ).mkdir ( ); // invoke-virtual {v2}, Ljava/io/File;->mkdir()Z
		 } // :cond_0
		 /* new-instance v0, Ljava/io/File; */
		 /* new-instance v3, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
		 (( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
	 } // :goto_0
} // :cond_1
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v2 = "/data/data/"; // const-string v2, "/data/data/"
/* invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v2 = com.a.f.o.k;
(( com.calmei.jmsn.PlaneFightActivity ) v2 ).getPackageName ( ); // invoke-virtual {v2}, Lcom/calmei/jmsn/PlaneFightActivity;->getPackageName()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "/files/"; // const-string v2, "/files/"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* new-instance v0, Ljava/io/File; */
/* invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
} // .end method
public static java.lang.String a ( ) {
/* .locals 1 */
v0 = com.a.f.o.j;
} // .end method
public static java.lang.String a ( java.lang.String p0, android.app.ProgressDialog p1 ) {
/* .locals 10 */
int v3 = 0; // const/4 v3, 0x0
/* new-instance v2, Lorg/apache/http/impl/client/DefaultHttpClient; */
/* invoke-direct {v2}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V */
final String v0 = "/"; // const-string v0, "/"
v0 = (( java.lang.String ) p0 ).lastIndexOf ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I
(( java.lang.String ) p0 ).substring ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;
android.os.Environment .getExternalStorageState ( );
final String v4 = "mounted"; // const-string v4, "mounted"
v1 = (( java.lang.String ) v1 ).equals ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_5
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
	 android.os.Environment .getExternalStorageDirectory ( );
	 (( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
	 final String v4 = "/shyoogame"; // const-string v4, "/shyoogame"
	 (( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v4 = "/"; // const-string v4, "/"
	 (( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* new-instance v4, Ljava/io/File; */
	 /* invoke-direct {v4, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
	 v1 = 	 (( java.io.File ) v4 ).exists ( ); // invoke-virtual {v4}, Ljava/io/File;->exists()Z
	 /* if-nez v1, :cond_0 */
	 (( java.io.File ) v4 ).mkdir ( ); // invoke-virtual {v4}, Ljava/io/File;->mkdir()Z
} // :cond_0
if ( v3 != null) { // if-eqz v3, :cond_1
	 (( java.io.RandomAccessFile ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/RandomAccessFile;->close()V
} // :cond_1
/* new-instance v1, Ljava/io/RandomAccessFile; */
/* new-instance v5, Ljava/lang/StringBuilder; */
/* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v5 ).append ( v4 ); // invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).append ( v0 ); // invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v6 = "rw"; // const-string v6, "rw"
/* invoke-direct {v1, v5, v6}, Ljava/io/RandomAccessFile;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* new-instance v5, Ljava/lang/StringBuilder; */
/* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v5 ).append ( v4 ); // invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :goto_0
/* const/16 v4, 0x400 */
/* new-array v4, v4, [B */
/* new-instance v5, Lorg/apache/http/client/methods/HttpGet; */
/* invoke-direct {v5, p0}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V */
(( java.io.RandomAccessFile ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/io/RandomAccessFile;->length()J
/* move-result-wide v6 */
/* const-wide/16 v8, 0x0 */
/* cmp-long v6, v6, v8 */
if ( v6 != null) { // if-eqz v6, :cond_2
final String v6 = "\u7ee7\u7eed\u66f4\u65b0"; // const-string v6, "\u7ee7\u7eed\u66f4\u65b0"
(( android.app.ProgressDialog ) p1 ).setMessage ( v6 ); // invoke-virtual {p1, v6}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V
} // :cond_2
final String v6 = "Range"; // const-string v6, "Range"
/* new-instance v7, Ljava/lang/StringBuilder; */
final String v8 = "bytes="; // const-string v8, "bytes="
/* invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.io.RandomAccessFile ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/io/RandomAccessFile;->length()J
/* move-result-wide v8 */
(( java.lang.StringBuilder ) v7 ).append ( v8, v9 ); // invoke-virtual {v7, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
final String v8 = "-"; // const-string v8, "-"
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( org.apache.http.client.methods.HttpGet ) v5 ).addHeader ( v6, v7 ); // invoke-virtual {v5, v6, v7}, Lorg/apache/http/client/methods/HttpGet;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
/* move-result-wide v5 */
/* long-to-int v5, v5 */
/* int-to-long v5, v5 */
(( java.io.RandomAccessFile ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/io/RandomAccessFile;->length()J
/* move-result-wide v7 */
/* add-long/2addr v5, v7 */
/* long-to-int v5, v5 */
(( android.app.ProgressDialog ) p1 ).setMax ( v5 ); // invoke-virtual {p1, v5}, Landroid/app/ProgressDialog;->setMax(I)V
(( java.io.RandomAccessFile ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/io/RandomAccessFile;->length()J
/* move-result-wide v5 */
(( java.io.RandomAccessFile ) v1 ).seek ( v5, v6 ); // invoke-virtual {v1, v5, v6}, Ljava/io/RandomAccessFile;->seek(J)V
if ( v2 != null) { // if-eqz v2, :cond_4
(( java.io.RandomAccessFile ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/io/RandomAccessFile;->length()J
/* move-result-wide v5 */
/* long-to-int v2, v5 */
} // :goto_1
v5 = com.a.f.o.b;
v5 = (( java.io.InputStream ) v5 ).read ( v4 ); // invoke-virtual {v5, v4}, Ljava/io/InputStream;->read([B)I
int v6 = -1; // const/4 v6, -0x1
/* if-eq v5, v6, :cond_3 */
/* sget-boolean v6, Lcom/a/f/o;->d:Z */
/* if-nez v6, :cond_7 */
} // :cond_3
v2 = com.a.f.o.b;
(( java.io.InputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/InputStream;->close()V
(( java.io.RandomAccessFile ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
/* sget-boolean v1, Lcom/a/f/o;->d:Z */
/* if-nez v1, :cond_4 */
/* new-instance v0, Landroid/os/Message; */
/* invoke-direct {v0}, Landroid/os/Message;-><init>()V */
int v1 = 2; // const/4 v1, 0x2
/* iput v1, v0, Landroid/os/Message;->what:I */
(( android.app.ProgressDialog ) p1 ).dismiss ( ); // invoke-virtual {p1}, Landroid/app/ProgressDialog;->dismiss()V
v1 = com.a.f.o.f;
(( android.os.Handler ) v1 ).sendMessage ( v0 ); // invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
/* move-object v0, v3 */
} // :cond_4
} // :cond_5
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v4 = "/data/data/"; // const-string v4, "/data/data/"
/* invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v4 = com.a.f.o.k;
(( com.calmei.jmsn.PlaneFightActivity ) v4 ).getPackageName ( ); // invoke-virtual {v4}, Lcom/calmei/jmsn/PlaneFightActivity;->getPackageName()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "/files/"; // const-string v4, "/files/"
(( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
if ( v3 != null) { // if-eqz v3, :cond_6
(( java.io.RandomAccessFile ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/RandomAccessFile;->close()V
} // :cond_6
/* new-instance v1, Ljava/io/RandomAccessFile; */
final String v4 = "rw"; // const-string v4, "rw"
/* invoke-direct {v1, v0, v4}, Ljava/io/RandomAccessFile;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* goto/16 :goto_0 */
} // :cond_7
int v6 = 0; // const/4 v6, 0x0
(( java.io.RandomAccessFile ) v1 ).write ( v4, v6, v5 ); // invoke-virtual {v1, v4, v6, v5}, Ljava/io/RandomAccessFile;->write([BII)V
/* add-int/2addr v2, v5 */
(( android.app.ProgressDialog ) p1 ).setProgress ( v2 ); // invoke-virtual {p1, v2}, Landroid/app/ProgressDialog;->setProgress(I)V
} // .end method
public static void a ( com.calmei.jmsn.PlaneFightActivity p0 ) {
/* .locals 0 */
com.a.f.o .b ( p0 );
com.a.f.j .c ( );
return;
} // .end method
protected static void a ( java.io.File p0 ) {
/* .locals 3 */
/* new-instance v0, Landroid/content/Intent; */
/* invoke-direct {v0}, Landroid/content/Intent;-><init>()V */
final String v1 = "android.intent.action.VIEW"; // const-string v1, "android.intent.action.VIEW"
(( android.content.Intent ) v0 ).setAction ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
android.net.Uri .fromFile ( p0 );
final String v2 = "application/vnd.android.package-archive"; // const-string v2, "application/vnd.android.package-archive"
(( android.content.Intent ) v0 ).setDataAndType ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;
v1 = com.a.f.o.k;
(( com.calmei.jmsn.PlaneFightActivity ) v1 ).startActivity ( v0 ); // invoke-virtual {v1, v0}, Lcom/calmei/jmsn/PlaneFightActivity;->startActivity(Landroid/content/Intent;)V
return;
} // .end method
public static void b ( ) {
/* .locals 3 */
/* new-instance v0, Landroid/app/AlertDialog$Builder; */
v1 = com.a.f.o.k;
/* invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
final String v1 = "\u7248\u672c\u5347\u7ea7"; // const-string v1, "\u7248\u672c\u5347\u7ea7"
(( android.app.AlertDialog$Builder ) v0 ).setTitle ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
final String v1 = "\u53d1\u73b0\u65b0\u7248\u672c\uff0c\u662f\u5426\u5347\u7ea7?"; // const-string v1, "\u53d1\u73b0\u65b0\u7248\u672c\uff0c\u662f\u5426\u5347\u7ea7?"
(( android.app.AlertDialog$Builder ) v0 ).setMessage ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
int v1 = 0; // const/4 v1, 0x0
(( android.app.AlertDialog$Builder ) v0 ).setCancelable ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;
final String v1 = "\u786e\u5b9a"; // const-string v1, "\u786e\u5b9a"
/* new-instance v2, Lcom/a/f/q; */
/* invoke-direct {v2}, Lcom/a/f/q;-><init>()V */
(( android.app.AlertDialog$Builder ) v0 ).setPositiveButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
final String v1 = "\u53d6\u6d88"; // const-string v1, "\u53d6\u6d88"
/* new-instance v2, Lcom/a/f/r; */
/* invoke-direct {v2}, Lcom/a/f/r;-><init>()V */
(( android.app.AlertDialog$Builder ) v0 ).setNegativeButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
(( android.app.AlertDialog$Builder ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
return;
} // .end method
public static void b ( com.calmei.jmsn.PlaneFightActivity p0 ) {
/* .locals 0 */
return;
} // .end method
public static Boolean b ( java.lang.String p0 ) {
/* .locals 8 */
int v0 = 0; // const/4 v0, 0x0
/* new-instance v1, Lorg/apache/http/impl/client/DefaultHttpClient; */
/* invoke-direct {v1}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V */
com.a.f.o .a ( p0 );
/* new-instance v3, Lorg/apache/http/client/methods/HttpGet; */
/* invoke-direct {v3, p0}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V */
(( java.io.File ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/io/File;->length()J
/* move-result-wide v4 */
/* const-wide/16 v6, 0x0 */
/* cmp-long v4, v4, v6 */
if ( v4 != null) { // if-eqz v4, :cond_0
final String v4 = "Range"; // const-string v4, "Range"
final String v5 = "bytes=0-"; // const-string v5, "bytes=0-"
(( org.apache.http.client.methods.HttpGet ) v3 ).addHeader ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Lorg/apache/http/client/methods/HttpGet;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
(( java.io.File ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/io/File;->length()J
/* move-result-wide v2 */
/* move-result-wide v4 */
/* long-to-int v1, v4 */
/* int-to-long v4, v1 */
/* cmp-long v1, v2, v4 */
/* if-nez v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
} // .end method
public static void c ( ) {
/* .locals 1 */
com.a.f.o .a ( );
com.a.f.o .c ( v0 );
return;
} // .end method
protected static void c ( java.lang.String p0 ) {
/* .locals 4 */
int v1 = 0; // const/4 v1, 0x0
int v3 = 1; // const/4 v3, 0x1
try { // :try_start_0
com.a.f.o .b ( p0 );
/* :try_end_0 */
v0 = /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* new-instance v0, Landroid/app/AlertDialog$Builder; */
v1 = com.a.f.o.k;
/* invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
final String v1 = "\u7248\u672c\u5347\u7ea7"; // const-string v1, "\u7248\u672c\u5347\u7ea7"
(( android.app.AlertDialog$Builder ) v0 ).setTitle ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
final String v1 = "\u6587\u4ef6\u5df2\u5b58\u5728\uff0c\u786e\u5b9a\u66f4\u65b0?"; // const-string v1, "\u6587\u4ef6\u5df2\u5b58\u5728\uff0c\u786e\u5b9a\u66f4\u65b0?"
(( android.app.AlertDialog$Builder ) v0 ).setMessage ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
(( android.app.AlertDialog$Builder ) v0 ).setCancelable ( v3 ); // invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;
final String v1 = "\u786e\u5b9a"; // const-string v1, "\u786e\u5b9a"
/* new-instance v2, Lcom/a/f/t; */
/* invoke-direct {v2, p0}, Lcom/a/f/t;-><init>(Ljava/lang/String;)V */
(( android.app.AlertDialog$Builder ) v0 ).setPositiveButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
final String v1 = "\u53d6\u6d88"; // const-string v1, "\u53d6\u6d88"
/* new-instance v2, Lcom/a/f/u; */
/* invoke-direct {v2}, Lcom/a/f/u;-><init>()V */
(( android.app.AlertDialog$Builder ) v0 ).setNegativeButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
(( android.app.AlertDialog$Builder ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
} // :cond_0
} // :goto_1
return;
/* :catch_0 */
/* move-exception v0 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
/* move v0, v1 */
} // :cond_1
/* new-instance v0, Landroid/app/ProgressDialog; */
v2 = com.a.f.o.k;
/* invoke-direct {v0, v2}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V */
(( android.app.ProgressDialog ) v0 ).setProgressStyle ( v3 ); // invoke-virtual {v0, v3}, Landroid/app/ProgressDialog;->setProgressStyle(I)V
(( android.app.ProgressDialog ) v0 ).setCancelable ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setCancelable(Z)V
final String v1 = "\u6b63\u5728\u66f4\u65b0"; // const-string v1, "\u6b63\u5728\u66f4\u65b0"
(( android.app.ProgressDialog ) v0 ).setMessage ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V
(( android.app.ProgressDialog ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V
v1 = com.a.f.o.c;
/* if-nez v1, :cond_0 */
com.a.f.o.d = (v3!= 0);
com.a.f.o.e = (v3!= 0);
/* new-instance v1, Lcom/a/f/v; */
/* invoke-direct {v1, p0, v0}, Lcom/a/f/v;-><init>(Ljava/lang/String;Landroid/app/ProgressDialog;)V */
/* new-instance v0, Ljava/lang/Thread; */
/* invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
(( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
} // .end method
public static void d ( ) {
/* .locals 3 */
/* new-instance v0, Landroid/app/AlertDialog$Builder; */
v1 = com.a.f.o.k;
/* invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
final String v1 = "\u7248\u672c\u5347\u7ea7"; // const-string v1, "\u7248\u672c\u5347\u7ea7"
(( android.app.AlertDialog$Builder ) v0 ).setTitle ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
final String v1 = "\u53d1\u73b0\u65b0\u7248\u672c\uff0c\u786e\u5b9a\u5347\u7ea7"; // const-string v1, "\u53d1\u73b0\u65b0\u7248\u672c\uff0c\u786e\u5b9a\u5347\u7ea7"
(( android.app.AlertDialog$Builder ) v0 ).setMessage ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
int v1 = 0; // const/4 v1, 0x0
(( android.app.AlertDialog$Builder ) v0 ).setCancelable ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;
final String v1 = "\u786e\u5b9a"; // const-string v1, "\u786e\u5b9a"
/* new-instance v2, Lcom/a/f/s; */
/* invoke-direct {v2}, Lcom/a/f/s;-><init>()V */
(( android.app.AlertDialog$Builder ) v0 ).setPositiveButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
(( android.app.AlertDialog$Builder ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
return;
} // .end method
static com.calmei.jmsn.PlaneFightActivity e ( ) { //synthethic
/* .locals 1 */
v0 = com.a.f.o.k;
} // .end method
