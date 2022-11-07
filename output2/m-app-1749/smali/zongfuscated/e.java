public class zongfuscated.e implements android.os.Parcelable {
	 /* # interfaces */
	 /* # static fields */
	 public static final android.os.Parcelable$Creator CREATOR;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Landroid/os/Parcelable$Creator", */
	 /* "<", */
	 /* "Lzongfuscated/e;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
private static final java.lang.String a;
/* # instance fields */
private java.lang.String b;
private java.lang.String c;
private Integer d;
private java.lang.String e;
/* # direct methods */
static zongfuscated.e ( ) {
/* .locals 3 */
/* const-class v0, Lzongfuscated/e; */
(( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
int v0 = 4; // const/4 v0, 0x4
/* new-array v0, v0, [Ljava/lang/String; */
int v1 = 0; // const/4 v1, 0x0
final String v2 = "192.168.1.20"; // const-string v2, "192.168.1.20"
/* aput-object v2, v0, v1 */
int v1 = 1; // const/4 v1, 0x1
final String v2 = "192.168.1.59"; // const-string v2, "192.168.1.59"
/* aput-object v2, v0, v1 */
int v1 = 2; // const/4 v1, 0x2
final String v2 = "192.168.1.84"; // const-string v2, "192.168.1.84"
/* aput-object v2, v0, v1 */
int v1 = 3; // const/4 v1, 0x3
final String v2 = "10.6.0.41"; // const-string v2, "10.6.0.41"
/* aput-object v2, v0, v1 */
/* new-instance v0, Lzongfuscated/f; */
/* invoke-direct {v0}, Lzongfuscated/f;-><init>()V */
return;
} // .end method
 zongfuscated.e ( ) { //synthethic
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, p1, v0}, Lzongfuscated/e;-><init>(Landroid/os/Parcel;B)V */
return;
} // .end method
private zongfuscated.e ( ) {
/* .locals 5 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
(( android.os.Parcel ) p1 ).readString ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;
this.b = v0;
(( android.os.Parcel ) p1 ).readString ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;
this.c = v0;
v0 = (( android.os.Parcel ) p1 ).readInt ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
/* iput v0, p0, Lzongfuscated/e;->d:I */
(( android.os.Parcel ) p1 ).readString ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;
this.e = v0;
v0 = zongfuscated.e.a;
final String v1 = "URI Dump"; // const-string v1, "URI Dump"
int v2 = 4; // const/4 v2, 0x4
/* new-array v2, v2, [Ljava/lang/String; */
int v3 = 0; // const/4 v3, 0x0
v4 = this.b;
/* aput-object v4, v2, v3 */
int v3 = 1; // const/4 v3, 0x1
v4 = this.c;
/* aput-object v4, v2, v3 */
int v3 = 2; // const/4 v3, 0x2
/* iget v4, p0, Lzongfuscated/e;->d:I */
java.lang.Integer .toString ( v4 );
/* aput-object v4, v2, v3 */
int v3 = 3; // const/4 v3, 0x3
v4 = this.e;
/* aput-object v4, v2, v3 */
zongfuscated.q .a ( v0,v1,v2 );
return;
} // .end method
public zongfuscated.e ( ) {
/* .locals 5 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
try { // :try_start_0
	 /* new-instance v0, Ljava/net/URI; */
	 /* invoke-direct {v0, p1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V */
	 (( java.net.URI ) v0 ).getScheme ( ); // invoke-virtual {v0}, Ljava/net/URI;->getScheme()Ljava/lang/String;
	 this.b = v1;
	 (( java.net.URI ) v0 ).getHost ( ); // invoke-virtual {v0}, Ljava/net/URI;->getHost()Ljava/lang/String;
	 this.c = v1;
	 v1 = 	 (( java.net.URI ) v0 ).getPort ( ); // invoke-virtual {v0}, Ljava/net/URI;->getPort()I
	 /* iput v1, p0, Lzongfuscated/e;->d:I */
	 (( java.net.URI ) v0 ).getPath ( ); // invoke-virtual {v0}, Ljava/net/URI;->getPath()Ljava/lang/String;
	 this.e = v0;
	 v0 = zongfuscated.e.a;
	 final String v1 = "URI Dump"; // const-string v1, "URI Dump"
	 int v2 = 4; // const/4 v2, 0x4
	 /* new-array v2, v2, [Ljava/lang/String; */
	 int v3 = 0; // const/4 v3, 0x0
	 v4 = this.b;
	 /* aput-object v4, v2, v3 */
	 int v3 = 1; // const/4 v3, 0x1
	 v4 = this.c;
	 /* aput-object v4, v2, v3 */
	 int v3 = 2; // const/4 v3, 0x2
	 /* iget v4, p0, Lzongfuscated/e;->d:I */
	 java.lang.Integer .toString ( v4 );
	 /* aput-object v4, v2, v3 */
	 int v3 = 3; // const/4 v3, 0x3
	 v4 = this.e;
	 /* aput-object v4, v2, v3 */
	 zongfuscated.q .a ( v0,v1,v2 );
	 /* :try_end_0 */
	 /* .catch Ljava/net/URISyntaxException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
v1 = zongfuscated.e.a;
final String v2 = "URI Syntax Exception"; // const-string v2, "URI Syntax Exception"
zongfuscated.q .a ( v1,v2,v0 );
} // .end method
private java.lang.String b ( ) {
/* .locals 3 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v1 = this.b;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "://"; // const-string v2, "://"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.c;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Lzongfuscated/e;->d:I */
int v2 = -1; // const/4 v2, -0x1
/* if-eq v1, v2, :cond_0 */
final String v1 = ":"; // const-string v1, ":"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v2, p0, Lzongfuscated/e;->d:I */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
} // :cond_0
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
/* # virtual methods */
public final java.lang.String a ( ) {
/* .locals 2 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {p0}, Lzongfuscated/e;->b()Ljava/lang/String; */
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v1 = this.e;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public final java.lang.String a ( java.lang.String p0 ) {
/* .locals 2 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {p0}, Lzongfuscated/e;->b()Ljava/lang/String; */
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public Integer describeContents ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void writeToParcel ( android.os.Parcel p0, Integer p1 ) {
/* .locals 1 */
v0 = this.b;
(( android.os.Parcel ) p1 ).writeString ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
v0 = this.c;
(( android.os.Parcel ) p1 ).writeString ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
/* iget v0, p0, Lzongfuscated/e;->d:I */
(( android.os.Parcel ) p1 ).writeInt ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
v0 = this.e;
(( android.os.Parcel ) p1 ).writeString ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
return;
} // .end method
