public class com.openfeint.internal.CookieStore extends org.apache.http.impl.client.BasicCookieStore {
	 /* .source "CookieStore.java" */
	 /* # static fields */
	 static final java.lang.String COOKIE_PREFIX;
	 static final Integer COOKIE_PREFIX_LEN;
	 static final java.lang.String COOKIE_VALUE_TAG;
	 static final Integer COOKIE_VALUE_TAG_LEN;
	 static final java.lang.String TAG;
	 /* # instance fields */
	 com.openfeint.internal.SyncedStore mSharedPreferences;
	 /* # direct methods */
	 static com.openfeint.internal.CookieStore ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 18 */
		 final String v0 = "_of_cookie_"; // const-string v0, "_of_cookie_"
		 v0 = 		 (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
		 /* .line 20 */
		 final String v0 = "value"; // const-string v0, "value"
		 v0 = 		 (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
		 return;
	 } // .end method
	 public com.openfeint.internal.CookieStore ( ) {
		 /* .locals 8 */
		 /* .param p1, "sp" # Lcom/openfeint/internal/SyncedStore; */
		 /* .prologue */
		 /* .line 41 */
		 /* invoke-direct {p0}, Lorg/apache/http/impl/client/BasicCookieStore;-><init>()V */
		 /* .line 43 */
		 this.mSharedPreferences = p1;
		 /* .line 45 */
		 v5 = this.mSharedPreferences;
		 (( com.openfeint.internal.SyncedStore ) v5 ).read ( ); // invoke-virtual {v5}, Lcom/openfeint/internal/SyncedStore;->read()Lcom/openfeint/internal/SyncedStore$Reader;
		 /* .line 47 */
		 /* .local v4, "r":Lcom/openfeint/internal/SyncedStore$Reader; */
		 try { // :try_start_0
			 (( com.openfeint.internal.SyncedStore$Reader ) v4 ).keySet ( ); // invoke-virtual {v4}, Lcom/openfeint/internal/SyncedStore$Reader;->keySet()Ljava/util/Set;
			 /* .local v2, "i$":Ljava/util/Iterator; */
		 } // :cond_0
	 v5 = 	 } // :goto_0
	 if ( v5 != null) { // if-eqz v5, :cond_1
		 /* check-cast v3, Ljava/lang/String; */
		 /* .line 48 */
		 /* .local v3, "k":Ljava/lang/String; */
		 final String v5 = "_of_cookie_"; // const-string v5, "_of_cookie_"
		 v5 = 		 (( java.lang.String ) v3 ).startsWith ( v5 ); // invoke-virtual {v3, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
		 if ( v5 != null) { // if-eqz v5, :cond_0
			 final String v5 = "value"; // const-string v5, "value"
			 v5 = 			 (( java.lang.String ) v3 ).endsWith ( v5 ); // invoke-virtual {v3, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
			 if ( v5 != null) { // if-eqz v5, :cond_0
				 /* .line 49 */
				 v6 = 				 (( java.lang.String ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/String;->length()I
				 /* sub-int/2addr v6, v7 */
				 (( java.lang.String ) v3 ).substring ( v5, v6 ); // invoke-virtual {v3, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;
				 /* .line 50 */
				 /* .local v1, "cookieName":Ljava/lang/String; */
				 /* invoke-direct {p0, v4, v1}, Lcom/openfeint/internal/CookieStore;->cookieFromPrefs(Lcom/openfeint/internal/SyncedStore$Reader;Ljava/lang/String;)Lorg/apache/http/impl/cookie/BasicClientCookie; */
				 /* .line 51 */
				 /* .local v0, "c":Lorg/apache/http/impl/cookie/BasicClientCookie; */
				 /* invoke-super {p0, v0}, Lorg/apache/http/impl/client/BasicCookieStore;->addCookie(Lorg/apache/http/cookie/Cookie;)V */
				 /* :try_end_0 */
				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
				 /* .line 55 */
			 } // .end local v0 # "c":Lorg/apache/http/impl/cookie/BasicClientCookie;
		 } // .end local v1 # "cookieName":Ljava/lang/String;
	 } // .end local v2 # "i$":Ljava/util/Iterator;
} // .end local v3 # "k":Ljava/lang/String;
/* :catchall_0 */
/* move-exception v5 */
(( com.openfeint.internal.SyncedStore$Reader ) v4 ).complete ( ); // invoke-virtual {v4}, Lcom/openfeint/internal/SyncedStore$Reader;->complete()V
/* throw v5 */
/* .restart local v2 # "i$":Ljava/util/Iterator; */
} // :cond_1
(( com.openfeint.internal.SyncedStore$Reader ) v4 ).complete ( ); // invoke-virtual {v4}, Lcom/openfeint/internal/SyncedStore$Reader;->complete()V
/* .line 58 */
return;
} // .end method
private org.apache.http.impl.cookie.BasicClientCookie cookieFromBundle ( android.os.Bundle p0, java.lang.String p1 ) {
/* .locals 8 */
/* .param p1, "b" # Landroid/os/Bundle; */
/* .param p2, "cookieName" # Ljava/lang/String; */
/* .prologue */
/* .line 61 */
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
final String v7 = "_of_cookie_"; // const-string v7, "_of_cookie_"
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).append ( p2 ); // invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 62 */
/* .local v5, "prefix":Ljava/lang/String; */
int v0 = 0; // const/4 v0, 0x0
/* .line 64 */
/* .local v0, "c":Lorg/apache/http/impl/cookie/BasicClientCookie; */
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v6 ).append ( v5 ); // invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v7 = "value"; // const-string v7, "value"
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( android.os.Bundle ) p1 ).getString ( v6 ); // invoke-virtual {p1, v6}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 65 */
/* .local v4, "cookieValue":Ljava/lang/String; */
/* if-nez v4, :cond_0 */
int v6 = 0; // const/4 v6, 0x0
/* .line 79 */
} // :goto_0
/* .line 67 */
} // :cond_0
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v6 ).append ( v5 ); // invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v7 = "path"; // const-string v7, "path"
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( android.os.Bundle ) p1 ).getString ( v6 ); // invoke-virtual {p1, v6}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 68 */
/* .local v3, "cookiePath":Ljava/lang/String; */
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v6 ).append ( v5 ); // invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v7 = "domain"; // const-string v7, "domain"
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( android.os.Bundle ) p1 ).getString ( v6 ); // invoke-virtual {p1, v6}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 69 */
/* .local v1, "cookieDomain":Ljava/lang/String; */
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v6 ).append ( v5 ); // invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v7 = "expiry"; // const-string v7, "expiry"
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( android.os.Bundle ) p1 ).getString ( v6 ); // invoke-virtual {p1, v6}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 72 */
/* .local v2, "cookieExpiry":Ljava/lang/String; */
/* new-instance v0, Lorg/apache/http/impl/cookie/BasicClientCookie; */
} // .end local v0 # "c":Lorg/apache/http/impl/cookie/BasicClientCookie;
/* invoke-direct {v0, p2, v4}, Lorg/apache/http/impl/cookie/BasicClientCookie;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 73 */
/* .restart local v0 # "c":Lorg/apache/http/impl/cookie/BasicClientCookie; */
(( org.apache.http.impl.cookie.BasicClientCookie ) v0 ).setPath ( v3 ); // invoke-virtual {v0, v3}, Lorg/apache/http/impl/cookie/BasicClientCookie;->setPath(Ljava/lang/String;)V
/* .line 74 */
(( org.apache.http.impl.cookie.BasicClientCookie ) v0 ).setDomain ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/http/impl/cookie/BasicClientCookie;->setDomain(Ljava/lang/String;)V
/* .line 75 */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 76 */
com.openfeint.internal.CookieStore .dateFromString ( v2 );
(( org.apache.http.impl.cookie.BasicClientCookie ) v0 ).setExpiryDate ( v6 ); // invoke-virtual {v0, v6}, Lorg/apache/http/impl/cookie/BasicClientCookie;->setExpiryDate(Ljava/util/Date;)V
} // :cond_1
/* move-object v6, v0 */
/* .line 79 */
} // .end method
private org.apache.http.impl.cookie.BasicClientCookie cookieFromPrefs ( com.openfeint.internal.SyncedStore$Reader p0, java.lang.String p1 ) {
/* .locals 9 */
/* .param p1, "r" # Lcom/openfeint/internal/SyncedStore$Reader; */
/* .param p2, "cookieName" # Ljava/lang/String; */
/* .prologue */
int v6 = 0; // const/4 v6, 0x0
/* .line 83 */
/* new-instance v7, Ljava/lang/StringBuilder; */
/* invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V */
final String v8 = "_of_cookie_"; // const-string v8, "_of_cookie_"
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).append ( p2 ); // invoke-virtual {v7, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 84 */
/* .local v5, "prefix":Ljava/lang/String; */
int v0 = 0; // const/4 v0, 0x0
/* .line 86 */
/* .local v0, "c":Lorg/apache/http/impl/cookie/BasicClientCookie; */
/* new-instance v7, Ljava/lang/StringBuilder; */
/* invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v7 ).append ( v5 ); // invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v8 = "value"; // const-string v8, "value"
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.openfeint.internal.SyncedStore$Reader ) p1 ).getString ( v7, v6 ); // invoke-virtual {p1, v7, v6}, Lcom/openfeint/internal/SyncedStore$Reader;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 87 */
/* .local v4, "cookieValue":Ljava/lang/String; */
/* if-nez v4, :cond_0 */
/* .line 99 */
} // :goto_0
/* .line 89 */
} // :cond_0
/* new-instance v7, Ljava/lang/StringBuilder; */
/* invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v7 ).append ( v5 ); // invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v8 = "path"; // const-string v8, "path"
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.openfeint.internal.SyncedStore$Reader ) p1 ).getString ( v7, v6 ); // invoke-virtual {p1, v7, v6}, Lcom/openfeint/internal/SyncedStore$Reader;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 90 */
/* .local v3, "cookiePath":Ljava/lang/String; */
/* new-instance v7, Ljava/lang/StringBuilder; */
/* invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v7 ).append ( v5 ); // invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v8 = "domain"; // const-string v8, "domain"
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.openfeint.internal.SyncedStore$Reader ) p1 ).getString ( v7, v6 ); // invoke-virtual {p1, v7, v6}, Lcom/openfeint/internal/SyncedStore$Reader;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 91 */
/* .local v1, "cookieDomain":Ljava/lang/String; */
/* new-instance v7, Ljava/lang/StringBuilder; */
/* invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v7 ).append ( v5 ); // invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v8 = "expiry"; // const-string v8, "expiry"
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.openfeint.internal.SyncedStore$Reader ) p1 ).getString ( v7, v6 ); // invoke-virtual {p1, v7, v6}, Lcom/openfeint/internal/SyncedStore$Reader;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 94 */
/* .local v2, "cookieExpiry":Ljava/lang/String; */
/* new-instance v0, Lorg/apache/http/impl/cookie/BasicClientCookie; */
} // .end local v0 # "c":Lorg/apache/http/impl/cookie/BasicClientCookie;
/* invoke-direct {v0, p2, v4}, Lorg/apache/http/impl/cookie/BasicClientCookie;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 95 */
/* .restart local v0 # "c":Lorg/apache/http/impl/cookie/BasicClientCookie; */
(( org.apache.http.impl.cookie.BasicClientCookie ) v0 ).setPath ( v3 ); // invoke-virtual {v0, v3}, Lorg/apache/http/impl/cookie/BasicClientCookie;->setPath(Ljava/lang/String;)V
/* .line 96 */
(( org.apache.http.impl.cookie.BasicClientCookie ) v0 ).setDomain ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/http/impl/cookie/BasicClientCookie;->setDomain(Ljava/lang/String;)V
/* .line 97 */
com.openfeint.internal.CookieStore .dateFromString ( v2 );
(( org.apache.http.impl.cookie.BasicClientCookie ) v0 ).setExpiryDate ( v6 ); // invoke-virtual {v0, v6}, Lorg/apache/http/impl/cookie/BasicClientCookie;->setExpiryDate(Ljava/util/Date;)V
/* move-object v6, v0 */
/* .line 99 */
} // .end method
private void cookieToBundle ( org.apache.http.cookie.Cookie p0, android.os.Bundle p1 ) {
/* .locals 4 */
/* .param p1, "cookie" # Lorg/apache/http/cookie/Cookie; */
/* .param p2, "b" # Landroid/os/Bundle; */
/* .prologue */
/* .line 103 */
/* .line 104 */
/* .local v1, "name":Ljava/lang/String; */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "_of_cookie_"; // const-string v3, "_of_cookie_"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = "value"; // const-string v3, "value"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( android.os.Bundle ) p2 ).putString ( v2, v3 ); // invoke-virtual {p2, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 105 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "_of_cookie_"; // const-string v3, "_of_cookie_"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = "path"; // const-string v3, "path"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( android.os.Bundle ) p2 ).putString ( v2, v3 ); // invoke-virtual {p2, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 106 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "_of_cookie_"; // const-string v3, "_of_cookie_"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = "domain"; // const-string v3, "domain"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( android.os.Bundle ) p2 ).putString ( v2, v3 ); // invoke-virtual {p2, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 107 */
/* .line 108 */
/* .local v0, "expiryDate":Ljava/util/Date; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 109 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "_of_cookie_"; // const-string v3, "_of_cookie_"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = "expiry"; // const-string v3, "expiry"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.openfeint.internal.CookieStore .stringFromDate ( v0 );
(( android.os.Bundle ) p2 ).putString ( v2, v3 ); // invoke-virtual {p2, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 111 */
} // :cond_0
return;
} // .end method
private void cookieToPrefs ( org.apache.http.cookie.Cookie p0, com.openfeint.internal.SyncedStore$Editor p1 ) {
/* .locals 3 */
/* .param p1, "cookie" # Lorg/apache/http/cookie/Cookie; */
/* .param p2, "e" # Lcom/openfeint/internal/SyncedStore$Editor; */
/* .prologue */
/* .line 114 */
/* .line 115 */
/* .local v0, "name":Ljava/lang/String; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "_of_cookie_"; // const-string v2, "_of_cookie_"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "value"; // const-string v2, "value"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.openfeint.internal.SyncedStore$Editor ) p2 ).putString ( v1, v2 ); // invoke-virtual {p2, v1, v2}, Lcom/openfeint/internal/SyncedStore$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 116 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "_of_cookie_"; // const-string v2, "_of_cookie_"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "path"; // const-string v2, "path"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.openfeint.internal.SyncedStore$Editor ) p2 ).putString ( v1, v2 ); // invoke-virtual {p2, v1, v2}, Lcom/openfeint/internal/SyncedStore$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 117 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "_of_cookie_"; // const-string v2, "_of_cookie_"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "domain"; // const-string v2, "domain"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.openfeint.internal.SyncedStore$Editor ) p2 ).putString ( v1, v2 ); // invoke-virtual {p2, v1, v2}, Lcom/openfeint/internal/SyncedStore$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 118 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "_of_cookie_"; // const-string v2, "_of_cookie_"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "expiry"; // const-string v2, "expiry"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.openfeint.internal.CookieStore .stringFromDate ( v2 );
(( com.openfeint.internal.SyncedStore$Editor ) p2 ).putString ( v1, v2 ); // invoke-virtual {p2, v1, v2}, Lcom/openfeint/internal/SyncedStore$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 119 */
return;
} // .end method
private static final java.util.Date dateFromString ( java.lang.String p0 ) {
/* .locals 4 */
/* .param p0, "s" # Ljava/lang/String; */
/* .prologue */
/* .line 176 */
try { // :try_start_0
org.apache.http.impl.cookie.DateUtils .parseDate ( p0 );
/* :try_end_0 */
/* .catch Lorg/apache/http/impl/cookie/DateParseException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 179 */
} // :goto_0
/* .line 177 */
/* :catch_0 */
/* move-exception v0 */
/* .line 178 */
/* .local v0, "e":Lorg/apache/http/impl/cookie/DateParseException; */
final String v1 = "CookieStore"; // const-string v1, "CookieStore"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Couldn\'t parse date: \'"; // const-string v3, "Couldn\'t parse date: \'"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = "\'"; // const-string v3, "\'"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.openfeint.internal.OpenFeintInternal .log ( v1,v2 );
/* .line 179 */
int v1 = 0; // const/4 v1, 0x0
} // .end method
private static final java.lang.String stringFromDate ( java.util.Date p0 ) {
/* .locals 1 */
/* .param p0, "d" # Ljava/util/Date; */
/* .prologue */
/* .line 171 */
org.apache.http.impl.cookie.DateUtils .formatDate ( p0 );
} // .end method
/* # virtual methods */
public synchronized void addCookie ( org.apache.http.cookie.Cookie p0 ) {
/* .locals 9 */
/* .param p1, "cookie" # Lorg/apache/http/cookie/Cookie; */
/* .prologue */
/* .line 124 */
/* monitor-enter p0 */
try { // :try_start_0
/* invoke-super {p0, p1}, Lorg/apache/http/impl/client/BasicCookieStore;->addCookie(Lorg/apache/http/cookie/Cookie;)V */
/* .line 125 */
/* .line 127 */
/* .local v4, "name":Ljava/lang/String; */
int v1 = 0; // const/4 v1, 0x0
/* .line 128 */
/* .local v1, "existing":Lorg/apache/http/cookie/Cookie; */
v7 = this.mSharedPreferences;
(( com.openfeint.internal.SyncedStore ) v7 ).read ( ); // invoke-virtual {v7}, Lcom/openfeint/internal/SyncedStore;->read()Lcom/openfeint/internal/SyncedStore$Reader;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
/* .line 130 */
/* .local v6, "r":Lcom/openfeint/internal/SyncedStore$Reader; */
try { // :try_start_1
/* invoke-direct {p0, v6, v4}, Lcom/openfeint/internal/CookieStore;->cookieFromPrefs(Lcom/openfeint/internal/SyncedStore$Reader;Ljava/lang/String;)Lorg/apache/http/impl/cookie/BasicClientCookie; */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_2 */
/* .line 132 */
try { // :try_start_2
(( com.openfeint.internal.SyncedStore$Reader ) v6 ).complete ( ); // invoke-virtual {v6}, Lcom/openfeint/internal/SyncedStore$Reader;->complete()V
/* .line 135 */
if ( v1 != null) { // if-eqz v1, :cond_0
v7 = (( java.lang.String ) v7 ).equals ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v7 != null) { // if-eqz v7, :cond_0
v7 = (( java.lang.String ) v7 ).equals ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v7 != null) { // if-eqz v7, :cond_0
v7 = (( java.lang.String ) v7 ).equals ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v7 != null) { // if-eqz v7, :cond_0
v7 = (( java.util.Date ) v7 ).equals ( v8 ); // invoke-virtual {v7, v8}, Ljava/util/Date;->equals(Ljava/lang/Object;)Z
/* if-nez v7, :cond_4 */
/* .line 141 */
} // :cond_0
v7 = this.mSharedPreferences;
(( com.openfeint.internal.SyncedStore ) v7 ).edit ( ); // invoke-virtual {v7}, Lcom/openfeint/internal/SyncedStore;->edit()Lcom/openfeint/internal/SyncedStore$Editor;
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
/* .line 144 */
/* .local v0, "e":Lcom/openfeint/internal/SyncedStore$Editor; */
try { // :try_start_3
/* new-instance v7, Ljava/lang/StringBuilder; */
/* invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V */
final String v8 = "_of_cookie_"; // const-string v8, "_of_cookie_"
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).append ( v4 ); // invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 145 */
/* .local v5, "prefix":Ljava/lang/String; */
(( com.openfeint.internal.SyncedStore$Editor ) v0 ).keySet ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/SyncedStore$Editor;->keySet()Ljava/util/Set;
/* .local v2, "i$":Ljava/util/Iterator; */
} // :cond_1
v7 = } // :goto_0
if ( v7 != null) { // if-eqz v7, :cond_2
/* check-cast v3, Ljava/lang/String; */
/* .line 146 */
/* .local v3, "k":Ljava/lang/String; */
v7 = (( java.lang.String ) v3 ).startsWith ( v5 ); // invoke-virtual {v3, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v7 != null) { // if-eqz v7, :cond_1
/* .line 147 */
(( com.openfeint.internal.SyncedStore$Editor ) v0 ).remove ( v3 ); // invoke-virtual {v0, v3}, Lcom/openfeint/internal/SyncedStore$Editor;->remove(Ljava/lang/String;)V
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
/* .line 156 */
} // .end local v2 # "i$":Ljava/util/Iterator;
} // .end local v3 # "k":Ljava/lang/String;
} // .end local v5 # "prefix":Ljava/lang/String;
/* :catchall_0 */
/* move-exception v7 */
try { // :try_start_4
(( com.openfeint.internal.SyncedStore$Editor ) v0 ).commit ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/SyncedStore$Editor;->commit()V
/* throw v7 */
/* :try_end_4 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_1 */
/* .line 124 */
} // .end local v0 # "e":Lcom/openfeint/internal/SyncedStore$Editor;
} // .end local v1 # "existing":Lorg/apache/http/cookie/Cookie;
} // .end local v4 # "name":Ljava/lang/String;
} // .end local v6 # "r":Lcom/openfeint/internal/SyncedStore$Reader;
/* :catchall_1 */
/* move-exception v7 */
/* monitor-exit p0 */
/* throw v7 */
/* .line 132 */
/* .restart local v1 # "existing":Lorg/apache/http/cookie/Cookie; */
/* .restart local v4 # "name":Ljava/lang/String; */
/* .restart local v6 # "r":Lcom/openfeint/internal/SyncedStore$Reader; */
/* :catchall_2 */
/* move-exception v7 */
try { // :try_start_5
(( com.openfeint.internal.SyncedStore$Reader ) v6 ).complete ( ); // invoke-virtual {v6}, Lcom/openfeint/internal/SyncedStore$Reader;->complete()V
/* throw v7 */
/* :try_end_5 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_1 */
/* .line 152 */
/* .restart local v0 # "e":Lcom/openfeint/internal/SyncedStore$Editor; */
/* .restart local v2 # "i$":Ljava/util/Iterator; */
/* .restart local v5 # "prefix":Ljava/lang/String; */
} // :cond_2
try { // :try_start_6
if ( v7 != null) { // if-eqz v7, :cond_3
/* .line 153 */
/* invoke-direct {p0, p1, v0}, Lcom/openfeint/internal/CookieStore;->cookieToPrefs(Lorg/apache/http/cookie/Cookie;Lcom/openfeint/internal/SyncedStore$Editor;)V */
/* :try_end_6 */
/* .catchall {:try_start_6 ..:try_end_6} :catchall_0 */
/* .line 156 */
} // :cond_3
try { // :try_start_7
(( com.openfeint.internal.SyncedStore$Editor ) v0 ).commit ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/SyncedStore$Editor;->commit()V
/* :try_end_7 */
/* .catchall {:try_start_7 ..:try_end_7} :catchall_1 */
/* .line 159 */
} // .end local v0 # "e":Lcom/openfeint/internal/SyncedStore$Editor;
} // .end local v2 # "i$":Ljava/util/Iterator;
} // .end local v5 # "prefix":Ljava/lang/String;
} // :cond_4
/* monitor-exit p0 */
return;
} // .end method
public synchronized void clearCookies ( com.openfeint.internal.SyncedStore$Editor p0 ) {
/* .locals 3 */
/* .param p1, "e" # Lcom/openfeint/internal/SyncedStore$Editor; */
/* .prologue */
/* .line 162 */
/* monitor-enter p0 */
try { // :try_start_0
(( com.openfeint.internal.SyncedStore$Editor ) p1 ).keySet ( ); // invoke-virtual {p1}, Lcom/openfeint/internal/SyncedStore$Editor;->keySet()Ljava/util/Set;
/* .local v0, "i$":Ljava/util/Iterator; */
} // :cond_0
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_1
/* check-cast v1, Ljava/lang/String; */
/* .line 163 */
/* .local v1, "k":Ljava/lang/String; */
final String v2 = "_of_cookie_"; // const-string v2, "_of_cookie_"
v2 = (( java.lang.String ) v1 ).startsWith ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 164 */
(( com.openfeint.internal.SyncedStore$Editor ) p1 ).remove ( v1 ); // invoke-virtual {p1, v1}, Lcom/openfeint/internal/SyncedStore$Editor;->remove(Ljava/lang/String;)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 162 */
} // .end local v0 # "i$":Ljava/util/Iterator;
} // .end local v1 # "k":Ljava/lang/String;
/* :catchall_0 */
/* move-exception v2 */
/* monitor-exit p0 */
/* throw v2 */
/* .line 167 */
/* .restart local v0 # "i$":Ljava/util/Iterator; */
} // :cond_1
try { // :try_start_1
/* invoke-super {p0}, Lorg/apache/http/impl/client/BasicCookieStore;->clear()V */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 168 */
/* monitor-exit p0 */
return;
} // .end method
public synchronized void restoreInstanceState ( android.os.Bundle p0 ) {
/* .locals 7 */
/* .param p1, "inState" # Landroid/os/Bundle; */
/* .prologue */
/* .line 31 */
/* monitor-enter p0 */
try { // :try_start_0
(( android.os.Bundle ) p1 ).keySet ( ); // invoke-virtual {p1}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
/* .local v2, "i$":Ljava/util/Iterator; */
} // :cond_0
v4 = } // :goto_0
if ( v4 != null) { // if-eqz v4, :cond_1
/* check-cast v3, Ljava/lang/String; */
/* .line 32 */
/* .local v3, "k":Ljava/lang/String; */
final String v4 = "_of_cookie_"; // const-string v4, "_of_cookie_"
v4 = (( java.lang.String ) v3 ).startsWith ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v4 != null) { // if-eqz v4, :cond_0
final String v4 = "value"; // const-string v4, "value"
v4 = (( java.lang.String ) v3 ).endsWith ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 33 */
v5 = (( java.lang.String ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/String;->length()I
/* sub-int/2addr v5, v6 */
(( java.lang.String ) v3 ).substring ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 34 */
/* .local v1, "cookieName":Ljava/lang/String; */
/* invoke-direct {p0, p1, v1}, Lcom/openfeint/internal/CookieStore;->cookieFromBundle(Landroid/os/Bundle;Ljava/lang/String;)Lorg/apache/http/impl/cookie/BasicClientCookie; */
/* .line 35 */
/* .local v0, "c":Lorg/apache/http/impl/cookie/BasicClientCookie; */
/* invoke-super {p0, v0}, Lorg/apache/http/impl/client/BasicCookieStore;->addCookie(Lorg/apache/http/cookie/Cookie;)V */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 31 */
} // .end local v0 # "c":Lorg/apache/http/impl/cookie/BasicClientCookie;
} // .end local v1 # "cookieName":Ljava/lang/String;
} // .end local v2 # "i$":Ljava/util/Iterator;
} // .end local v3 # "k":Ljava/lang/String;
/* :catchall_0 */
/* move-exception v4 */
/* monitor-exit p0 */
/* throw v4 */
/* .line 38 */
/* .restart local v2 # "i$":Ljava/util/Iterator; */
} // :cond_1
/* monitor-exit p0 */
return;
} // .end method
public synchronized void saveInstanceState ( android.os.Bundle p0 ) {
/* .locals 3 */
/* .param p1, "outState" # Landroid/os/Bundle; */
/* .prologue */
/* .line 25 */
/* monitor-enter p0 */
try { // :try_start_0
/* invoke-super {p0}, Lorg/apache/http/impl/client/BasicCookieStore;->getCookies()Ljava/util/List; */
/* .local v1, "i$":Ljava/util/Iterator; */
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_0
/* check-cast v0, Lorg/apache/http/cookie/Cookie; */
/* .line 26 */
/* .local v0, "c":Lorg/apache/http/cookie/Cookie; */
/* invoke-direct {p0, v0, p1}, Lcom/openfeint/internal/CookieStore;->cookieToBundle(Lorg/apache/http/cookie/Cookie;Landroid/os/Bundle;)V */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 25 */
} // .end local v0 # "c":Lorg/apache/http/cookie/Cookie;
} // .end local v1 # "i$":Ljava/util/Iterator;
/* :catchall_0 */
/* move-exception v2 */
/* monitor-exit p0 */
/* throw v2 */
/* .line 28 */
/* .restart local v1 # "i$":Ljava/util/Iterator; */
} // :cond_0
/* monitor-exit p0 */
return;
} // .end method
