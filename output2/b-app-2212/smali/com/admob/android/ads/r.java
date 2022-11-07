public abstract class com.admob.android.ads.r implements java.lang.Runnable {
	 /* .source "AdMobConnector.java" */
	 /* # interfaces */
	 /* # static fields */
	 private static java.util.concurrent.Executor m;
	 private static java.lang.String n;
	 /* # instance fields */
	 protected java.lang.String a;
	 protected Integer b;
	 protected java.lang.Exception c;
	 protected java.util.Map d;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Map", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/String;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
protected Integer e;
protected Integer f;
protected java.lang.String g;
protected com.admob.android.ads.h h;
protected java.net.URL i;
protected j;
protected Boolean k;
protected java.lang.String l;
private java.lang.String o;
/* # direct methods */
static com.admob.android.ads.r ( ) {
/* .locals 1 */
/* .prologue */
/* .line 53 */
int v0 = 0; // const/4 v0, 0x0
return;
} // .end method
protected com.admob.android.ads.r ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* "Lcom/admob/android/ads/h;", */
/* "I", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;", */
/* "Ljava/lang/String;", */
/* ")V" */
/* } */
} // .end annotation
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 213 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 214 */
this.c = v1;
/* .line 215 */
this.o = p1;
/* .line 216 */
this.g = p2;
/* .line 217 */
this.h = p3;
/* .line 218 */
/* iput p4, p0, Lcom/admob/android/ads/r;->b:I */
/* .line 219 */
this.d = p5;
/* .line 220 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/admob/android/ads/r;->k:Z */
/* .line 221 */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/admob/android/ads/r;->e:I */
/* .line 222 */
int v0 = 3; // const/4 v0, 0x3
/* iput v0, p0, Lcom/admob/android/ads/r;->f:I */
/* .line 224 */
if ( p6 != null) { // if-eqz p6, :cond_0
/* .line 226 */
this.l = p6;
/* .line 227 */
final String v0 = "application/x-www-form-urlencoded"; // const-string v0, "application/x-www-form-urlencoded"
this.a = v0;
/* .line 234 */
} // :goto_0
return;
/* .line 231 */
} // :cond_0
this.l = v1;
/* .line 232 */
this.a = v1;
} // .end method
public static java.lang.String c ( ) {
/* .locals 5 */
/* .prologue */
final String v4 = "AdMobSDK"; // const-string v4, "AdMobSDK"
final String v3 = "; "; // const-string v3, "; "
/* .line 134 */
v0 = com.admob.android.ads.r.n;
/* if-nez v0, :cond_3 */
/* .line 140 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
/* .line 143 */
v1 = android.os.Build$VERSION.RELEASE;
/* .line 144 */
v2 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
/* if-lez v2, :cond_4 */
/* .line 146 */
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 153 */
} // :goto_0
final String v1 = "; "; // const-string v1, "; "
(( java.lang.StringBuffer ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 156 */
java.util.Locale .getDefault ( );
/* .line 157 */
(( java.util.Locale ) v1 ).getLanguage ( ); // invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;
/* .line 158 */
if ( v2 != null) { // if-eqz v2, :cond_5
/* .line 160 */
(( java.lang.String ) v2 ).toLowerCase ( ); // invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 161 */
(( java.util.Locale ) v1 ).getCountry ( ); // invoke-virtual {v1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;
/* .line 162 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 164 */
final String v2 = "-"; // const-string v2, "-"
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 165 */
(( java.lang.String ) v1 ).toLowerCase ( ); // invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 175 */
} // :cond_0
} // :goto_1
v1 = android.os.Build.MODEL;
/* .line 176 */
v2 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
/* if-lez v2, :cond_1 */
/* .line 178 */
final String v2 = "; "; // const-string v2, "; "
(( java.lang.StringBuffer ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 179 */
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 181 */
} // :cond_1
v1 = android.os.Build.ID;
/* .line 182 */
v2 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
/* if-lez v2, :cond_2 */
/* .line 184 */
final String v2 = " Build/"; // const-string v2, " Build/"
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 185 */
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 190 */
} // :cond_2
final String v1 = "Mozilla/5.0 (Linux; U; Android %s) AppleWebKit/525.10+ (KHTML, like Gecko) Version/3.0.4 Mobile Safari/523.12.2 (AdMob-ANDROID-%s)"; // const-string v1, "Mozilla/5.0 (Linux; U; Android %s) AppleWebKit/525.10+ (KHTML, like Gecko) Version/3.0.4 Mobile Safari/523.12.2 (AdMob-ANDROID-%s)"
int v2 = 2; // const/4 v2, 0x2
/* new-array v2, v2, [Ljava/lang/Object; */
int v3 = 0; // const/4 v3, 0x0
/* aput-object v0, v2, v3 */
int v0 = 1; // const/4 v0, 0x1
final String v3 = "20100331"; // const-string v3, "20100331"
/* aput-object v3, v2, v0 */
java.lang.String .format ( v1,v2 );
/* .line 193 */
final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
int v0 = 3; // const/4 v0, 0x3
v0 = android.util.Log .isLoggable ( v4,v0 );
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 195 */
final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Phone\'s user-agent is: "; // const-string v1, "Phone\'s user-agent is: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = com.admob.android.ads.r.n;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v4,v0 );
/* .line 199 */
} // :cond_3
v0 = com.admob.android.ads.r.n;
/* .line 151 */
} // :cond_4
final String v1 = "1.0"; // const-string v1, "1.0"
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* goto/16 :goto_0 */
/* .line 171 */
} // :cond_5
final String v1 = "en"; // const-string v1, "en"
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
} // .end method
/* # virtual methods */
public final void a ( Integer p0 ) {
/* .locals 0 */
/* .prologue */
/* .line 351 */
/* iput p1, p0, Lcom/admob/android/ads/r;->f:I */
/* .line 352 */
return;
} // .end method
protected final void a ( java.lang.String p0 ) {
/* .locals 0 */
/* .prologue */
/* .line 333 */
this.a = p1;
/* .line 334 */
return;
} // .end method
public abstract Boolean a ( ) {
} // .end method
public abstract void b ( ) {
} // .end method
public final d ( ) {
/* .locals 1 */
/* .prologue */
/* .line 261 */
v0 = this.j;
} // .end method
public final java.lang.String e ( ) {
/* .locals 1 */
/* .prologue */
/* .line 279 */
v0 = this.o;
} // .end method
public final java.net.URL f ( ) {
/* .locals 1 */
/* .prologue */
/* .line 295 */
v0 = this.i;
} // .end method
public final void g ( ) {
/* .locals 1 */
/* .prologue */
/* .line 323 */
v0 = com.admob.android.ads.r.m;
/* if-nez v0, :cond_0 */
java.util.concurrent.Executors .newCachedThreadPool ( );
} // :cond_0
v0 = com.admob.android.ads.r.m;
/* .line 324 */
return;
} // .end method
