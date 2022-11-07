public class com.loopj.android.http.PersistentCookieStore implements org.apache.http.client.CookieStore {
	 /* # interfaces */
	 /* # static fields */
	 private static final java.lang.String COOKIE_NAME_PREFIX;
	 private static final java.lang.String COOKIE_NAME_STORE;
	 private static final java.lang.String COOKIE_PREFS;
	 /* # instance fields */
	 private android.content.SharedPreferences cookiePrefs;
	 private java.util.concurrent.ConcurrentHashMap cookies;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/concurrent/ConcurrentHashMap", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* "Lorg/apache/http/cookie/Cookie;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public com.loopj.android.http.PersistentCookieStore ( ) {
/* .locals 8 */
int v7 = 0; // const/4 v7, 0x0
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
final String v1 = "CookiePrefsFile"; // const-string v1, "CookiePrefsFile"
(( android.content.Context ) p1 ).getSharedPreferences ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
this.cookiePrefs = v1;
/* new-instance v1, Ljava/util/concurrent/ConcurrentHashMap; */
/* invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V */
this.cookies = v1;
v1 = this.cookiePrefs;
final String v2 = "names"; // const-string v2, "names"
if ( v1 != null) { // if-eqz v1, :cond_2
	 final String v2 = ","; // const-string v2, ","
	 android.text.TextUtils .split ( v1,v2 );
	 /* array-length v2, v1 */
} // :goto_0
/* if-ge v0, v2, :cond_1 */
/* aget-object v3, v1, v0 */
v4 = this.cookiePrefs;
/* new-instance v5, Ljava/lang/StringBuilder; */
/* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
final String v6 = "cookie_"; // const-string v6, "cookie_"
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).append ( v3 ); // invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
if ( v4 != null) { // if-eqz v4, :cond_0
	 com.loopj.android.http.PersistentCookieStore .decodeCookie ( v4 );
	 if ( v4 != null) { // if-eqz v4, :cond_0
		 v5 = this.cookies;
		 (( java.util.concurrent.ConcurrentHashMap ) v5 ).put ( v3, v4 ); // invoke-virtual {v5, v3, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 } // :cond_0
	 /* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
/* new-instance v0, Ljava/util/Date; */
/* invoke-direct {v0}, Ljava/util/Date;-><init>()V */
(( com.loopj.android.http.PersistentCookieStore ) p0 ).clearExpired ( v0 ); // invoke-virtual {p0, v0}, Lcom/loopj/android/http/PersistentCookieStore;->clearExpired(Ljava/util/Date;)Z
} // :cond_2
return;
} // .end method
private static java.lang.String byteArrayToHexString ( Object[] p0 ) {
/* .locals 4 */
/* new-instance v1, Ljava/lang/StringBuffer; */
/* array-length v0, p0 */
/* mul-int/lit8 v0, v0, 0x2 */
/* invoke-direct {v1, v0}, Ljava/lang/StringBuffer;-><init>(I)V */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* array-length v2, p0 */
/* if-ge v0, v2, :cond_1 */
/* aget-byte v2, p0, v0 */
/* and-int/lit16 v2, v2, 0xff */
/* const/16 v3, 0x10 */
/* if-ge v2, v3, :cond_0 */
/* const/16 v3, 0x30 */
(( java.lang.StringBuffer ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
} // :cond_0
java.lang.Integer .toHexString ( v2 );
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( java.lang.String ) v0 ).toUpperCase ( ); // invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;
} // .end method
private static org.apache.http.cookie.Cookie decodeCookie ( java.lang.String p0 ) {
/* .locals 3 */
com.loopj.android.http.PersistentCookieStore .hexStringToByteArray ( p0 );
/* new-instance v2, Ljava/io/ByteArrayInputStream; */
/* invoke-direct {v2, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V */
int v1 = 0; // const/4 v1, 0x0
try { // :try_start_0
/* new-instance v0, Ljava/io/ObjectInputStream; */
/* invoke-direct {v0, v2}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V */
(( java.io.ObjectInputStream ) v0 ).readObject ( ); // invoke-virtual {v0}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;
/* check-cast v0, Lcom/loopj/android/http/SerializableCookie; */
(( com.loopj.android.http.SerializableCookie ) v0 ).getCookie ( ); // invoke-virtual {v0}, Lcom/loopj/android/http/SerializableCookie;->getCookie()Lorg/apache/http/cookie/Cookie;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
/* :catch_0 */
/* move-exception v0 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
/* move-object v0, v1 */
} // .end method
private static java.lang.String encodeCookie ( com.loopj.android.http.SerializableCookie p0 ) {
/* .locals 2 */
/* new-instance v0, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V */
try { // :try_start_0
/* new-instance v1, Ljava/io/ObjectOutputStream; */
/* invoke-direct {v1, v0}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V */
(( java.io.ObjectOutputStream ) v1 ).writeObject ( p0 ); // invoke-virtual {v1, p0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
(( java.io.ByteArrayOutputStream ) v0 ).toByteArray ( ); // invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
com.loopj.android.http.PersistentCookieStore .byteArrayToHexString ( v0 );
} // :goto_0
/* :catch_0 */
/* move-exception v0 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
private static hexStringToByteArray ( java.lang.String p0 ) {
/* .locals 7 */
/* const/16 v6, 0x10 */
v1 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* div-int/lit8 v0, v1, 0x2 */
/* new-array v2, v0, [B */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* if-ge v0, v1, :cond_0 */
/* div-int/lit8 v3, v0, 0x2 */
v4 = (( java.lang.String ) p0 ).charAt ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C
v4 = java.lang.Character .digit ( v4,v6 );
/* shl-int/lit8 v4, v4, 0x4 */
/* add-int/lit8 v5, v0, 0x1 */
v5 = (( java.lang.String ) p0 ).charAt ( v5 ); // invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C
v5 = java.lang.Character .digit ( v5,v6 );
/* add-int/2addr v4, v5 */
/* int-to-byte v4, v4 */
/* aput-byte v4, v2, v3 */
/* add-int/lit8 v0, v0, 0x2 */
} // :cond_0
} // .end method
/* # virtual methods */
public void addCookie ( org.apache.http.cookie.Cookie p0 ) {
/* .locals 5 */
v1 = this.cookies;
(( java.util.concurrent.ConcurrentHashMap ) v1 ).put ( v0, p1 ); // invoke-virtual {v1, v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
v1 = this.cookiePrefs;
final String v2 = "names"; // const-string v2, "names"
final String v3 = ","; // const-string v3, ","
v4 = this.cookies;
(( java.util.concurrent.ConcurrentHashMap ) v4 ).keySet ( ); // invoke-virtual {v4}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;
android.text.TextUtils .join ( v3,v4 );
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "cookie_"; // const-string v3, "cookie_"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* new-instance v2, Lcom/loopj/android/http/SerializableCookie; */
/* invoke-direct {v2, p1}, Lcom/loopj/android/http/SerializableCookie;-><init>(Lorg/apache/http/cookie/Cookie;)V */
com.loopj.android.http.PersistentCookieStore .encodeCookie ( v2 );
return;
} // .end method
public void clear ( ) {
/* .locals 5 */
v0 = this.cookies;
(( java.util.concurrent.ConcurrentHashMap ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V
v0 = this.cookiePrefs;
v0 = this.cookies;
(( java.util.concurrent.ConcurrentHashMap ) v0 ).keySet ( ); // invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_0
/* check-cast v0, Ljava/lang/String; */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "cookie_"; // const-string v4, "cookie_"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :cond_0
final String v0 = "names"; // const-string v0, "names"
return;
} // .end method
public Boolean clearExpired ( java.util.Date p0 ) {
/* .locals 5 */
int v0 = 0; // const/4 v0, 0x0
v1 = this.cookiePrefs;
v1 = this.cookies;
(( java.util.concurrent.ConcurrentHashMap ) v1 ).entrySet ( ); // invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;
/* move v2, v0 */
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_0
/* check-cast v0, Ljava/util/Map$Entry; */
/* check-cast v1, Ljava/lang/String; */
v0 = /* check-cast v0, Lorg/apache/http/cookie/Cookie; */
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.cookies;
(( java.util.concurrent.ConcurrentHashMap ) v0 ).remove ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "cookie_"; // const-string v2, "cookie_"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
/* move v2, v0 */
} // :cond_0
if ( v2 != null) { // if-eqz v2, :cond_1
final String v0 = "names"; // const-string v0, "names"
final String v1 = ","; // const-string v1, ","
v4 = this.cookies;
(( java.util.concurrent.ConcurrentHashMap ) v4 ).keySet ( ); // invoke-virtual {v4}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;
android.text.TextUtils .join ( v1,v4 );
} // :cond_1
} // :cond_2
/* move v0, v2 */
} // .end method
public org.apache.http.cookie.Cookie getCookie ( java.lang.String p0 ) {
/* .locals 1 */
v0 = this.cookies;
(( java.util.concurrent.ConcurrentHashMap ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Lorg/apache/http/cookie/Cookie; */
} // .end method
public java.util.List getCookies ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List", */
/* "<", */
/* "Lorg/apache/http/cookie/Cookie;", */
/* ">;" */
/* } */
} // .end annotation
/* new-instance v0, Ljava/util/ArrayList; */
v1 = this.cookies;
(( java.util.concurrent.ConcurrentHashMap ) v1 ).values ( ); // invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;
/* invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V */
} // .end method
