public class zongfuscated.n implements java.lang.Runnable {
	 /* # interfaces */
	 /* # static fields */
	 private static final java.lang.String a;
	 /* # instance fields */
	 private Boolean b;
	 private org.apache.http.client.methods.HttpGet c;
	 private android.os.Handler d;
	 /* # direct methods */
	 static zongfuscated.n ( ) {
		 /* .locals 1 */
		 /* const-class v0, Lzongfuscated/n; */
		 (( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
		 return;
	 } // .end method
	 public zongfuscated.n ( ) {
		 /* .locals 5 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Landroid/os/Handler;", */
		 /* "Ljava/lang/String;", */
		 /* "Ljava/util/HashMap", */
		 /* "<", */
		 /* "Ljava/lang/String;", */
		 /* "Ljava/lang/String;", */
		 /* ">;Z)V" */
		 /* } */
	 } // .end annotation
	 int v0 = 0; // const/4 v0, 0x0
	 int v4 = 0; // const/4 v4, 0x0
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* iput-boolean v4, p0, Lzongfuscated/n;->b:Z */
	 this.c = v0;
	 this.d = v0;
	 /* iput-boolean p4, p0, Lzongfuscated/n;->b:Z */
	 this.d = p1;
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 java.lang.String .valueOf ( p2 );
	 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 zongfuscated.n .a ( p2,p3 );
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 v1 = zongfuscated.n.a;
	 final String v2 = "Request URI"; // const-string v2, "Request URI"
	 int v3 = 1; // const/4 v3, 0x1
	 /* new-array v3, v3, [Ljava/lang/String; */
	 /* aput-object v0, v3, v4 */
	 zongfuscated.q .a ( v1,v2,v3 );
	 /* new-instance v1, Lorg/apache/http/client/methods/HttpGet; */
	 /* invoke-direct {v1, v0}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V */
	 this.c = v1;
	 v0 = this.c;
	 final String v1 = "User-Agent"; // const-string v1, "User-Agent"
	 final String v2 = "Android"; // const-string v2, "Android"
	 (( org.apache.http.client.methods.HttpGet ) v0 ).addHeader ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/apache/http/client/methods/HttpGet;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
	 return;
} // .end method
public zongfuscated.n ( ) {
	 /* .locals 2 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/util/HashMap", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/String;", */
	 /* ">;)V" */
	 /* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {p0, v0, p1, p2, v1}, Lzongfuscated/n;-><init>(Landroid/os/Handler;Ljava/lang/String;Ljava/util/HashMap;Z)V */
return;
} // .end method
private static java.lang.String a ( java.lang.String p0, java.util.HashMap p1 ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)", */
/* "Ljava/lang/String;" */
/* } */
} // .end annotation
int v4 = 0; // const/4 v4, 0x0
final String v0 = ""; // const-string v0, ""
if ( p1 != null) { // if-eqz p1, :cond_0
v1 = (( java.util.HashMap ) p1 ).size ( ); // invoke-virtual {p1}, Ljava/util/HashMap;->size()I
/* if-lez v1, :cond_0 */
final String v0 = "?"; // const-string v0, "?"
v0 = (( java.lang.String ) p0 ).contains ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 final String v1 = "&"; // const-string v1, "&"
	 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 /* move-object v2, v0 */
} // :goto_0
(( java.util.HashMap ) p1 ).keySet ( ); // invoke-virtual {p1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
/* move v3, v4 */
v0 = } // :goto_1
/* if-nez v0, :cond_2 */
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v1 = zongfuscated.n.a;
final String v2 = "Params List partURL"; // const-string v2, "Params List partURL"
int v3 = 1; // const/4 v3, 0x1
/* new-array v3, v3, [Ljava/lang/String; */
/* aput-object v0, v3, v4 */
zongfuscated.q .a ( v1,v2,v3 );
} // :cond_0
} // :cond_1
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "?"; // const-string v1, "?"
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* move-object v2, v0 */
} // :cond_2
/* check-cast v0, Ljava/lang/String; */
/* if-lez v3, :cond_3 */
final String v1 = "&"; // const-string v1, "&"
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // :cond_3
try { // :try_start_0
(( java.util.HashMap ) p1 ).get ( v0 ); // invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Ljava/lang/String; */
final String v6 = "UTF-8"; // const-string v6, "UTF-8"
java.net.URLEncoder .encode ( v1,v6 );
/* :try_end_0 */
/* .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_2
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v6 = "="; // const-string v6, "="
(( java.lang.StringBuilder ) v0 ).append ( v6 ); // invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* add-int/lit8 v0, v3, 0x1 */
/* move v3, v0 */
/* :catch_0 */
/* move-exception v1 */
v6 = zongfuscated.n.a;
final String v7 = "Default Encoding Scheme used"; // const-string v7, "Default Encoding Scheme used"
zongfuscated.q .a ( v6,v7,v1 );
(( java.util.HashMap ) p1 ).get ( v0 ); // invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Ljava/lang/String; */
java.net.URLEncoder .encode ( v1 );
} // .end method
/* # virtual methods */
public final zongfuscated.o a ( ) {
/* .locals 10 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
int v1 = 0; // const/4 v1, 0x0
int v0 = 0; // const/4 v0, 0x0
zongfuscated.d .a ( );
/* move-object v9, v0 */
/* move v0, v1 */
/* move-object v1, v9 */
} // :goto_0
/* if-nez v1, :cond_0 */
int v2 = 3; // const/4 v2, 0x3
/* if-lt v0, v2, :cond_1 */
} // :cond_0
/* if-nez v1, :cond_4 */
/* new-instance v0, Ljava/lang/Exception; */
final String v1 = "Failed to ZongService.call() ...HTTP Connection Failure "; // const-string v1, "Failed to ZongService.call() ...HTTP Connection Failure "
/* invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_1
/* add-int/lit8 v2, v0, 0x1 */
try { // :try_start_0
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_3
v4 = zongfuscated.q .a ( );
if ( v4 != null) { // if-eqz v4, :cond_2
/* new-instance v4, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V */
/* new-instance v0, Ljava/io/ByteArrayInputStream; */
(( java.io.ByteArrayOutputStream ) v4 ).toByteArray ( ); // invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
/* invoke-direct {v0, v5}, Ljava/io/ByteArrayInputStream;-><init>([B)V */
v5 = zongfuscated.n.a;
final String v6 = "Call() Output Stream"; // const-string v6, "Call() Output Stream"
int v7 = 1; // const/4 v7, 0x1
/* new-array v7, v7, [Ljava/lang/String; */
int v8 = 0; // const/4 v8, 0x0
(( java.io.ByteArrayOutputStream ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toString()Ljava/lang/String;
/* aput-object v4, v7, v8 */
zongfuscated.q .a ( v5,v6,v7 );
} // :goto_1
zongfuscated.k .a ( v0 );
/* new-instance v0, Lzongfuscated/o; */
/* invoke-direct {v0, v4}, Lzongfuscated/o;-><init>(Lzongfuscated/B;)V */
/* move-object v1, v0 */
/* move v0, v2 */
} // :cond_2
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
v4 = zongfuscated.n.a;
final String v5 = "call()"; // const-string v5, "call()"
zongfuscated.q .a ( v4,v5,v0 );
/* const-wide/16 v4, 0xbb8 */
java.lang.Thread .sleep ( v4,v5 );
} // :cond_3
/* move v0, v2 */
} // :cond_4
} // .end method
public void run ( ) {
/* .locals 3 */
try { // :try_start_0
(( zongfuscated.n ) p0 ).a ( ); // invoke-virtual {p0}, Lzongfuscated/n;->a()Lzongfuscated/o;
/* iget-boolean v1, p0, Lzongfuscated/n;->b:Z */
/* if-nez v1, :cond_2 */
if ( v0 != null) { // if-eqz v0, :cond_1
v1 = zongfuscated.n.a;
final String v2 = "Message Call was Sucessful"; // const-string v2, "Message Call was Sucessful"
zongfuscated.q .a ( v1,v2 );
v1 = this.d;
int v2 = 4; // const/4 v2, 0x4
(( android.os.Handler ) v1 ).obtainMessage ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
if ( v0 != null) { // if-eqz v0, :cond_0
v1 = this.d;
(( android.os.Handler ) v1 ).sendMessage ( v0 ); // invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
v0 = zongfuscated.n.a;
final String v1 = "Message Send was Sucessful"; // const-string v1, "Message Send was Sucessful"
zongfuscated.q .a ( v0,v1 );
} // :goto_0
return;
} // :cond_0
v0 = zongfuscated.n.a;
final String v1 = "Message Send Failure"; // const-string v1, "Message Send Failure"
zongfuscated.q .a ( v0,v1 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
v1 = zongfuscated.n.a;
final String v2 = "RUN()"; // const-string v2, "RUN()"
zongfuscated.q .a ( v1,v2,v0 );
} // :cond_1
try { // :try_start_1
v0 = zongfuscated.n.a;
final String v1 = "Message Call Failure"; // const-string v1, "Message Call Failure"
zongfuscated.q .a ( v0,v1 );
} // :cond_2
v0 = zongfuscated.n.a;
final String v1 = "Message Call was FLUSH"; // const-string v1, "Message Call was FLUSH"
zongfuscated.q .a ( v0,v1 );
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
} // .end method
