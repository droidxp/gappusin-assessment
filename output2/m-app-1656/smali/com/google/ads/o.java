public class com.google.ads.o implements com.google.ads.n {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 private static final com.google.ads.internal.a a;
	 /* # direct methods */
	 static com.google.ads.o ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 26 */
		 v0 = com.google.ads.internal.a.a;
		 /* check-cast v0, Lcom/google/ads/internal/a; */
		 return;
	 } // .end method
	 public com.google.ads.o ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 22 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( Object p0, java.util.HashMap p1, android.webkit.WebView p2 ) {
		 /* .locals 12 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Lcom/google/ads/internal/d;", */
		 /* "Ljava/util/HashMap", */
		 /* "<", */
		 /* "Ljava/lang/String;", */
		 /* "Ljava/lang/String;", */
		 /* ">;", */
		 /* "Landroid/webkit/WebView;", */
		 /* ")V" */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 int v11 = 2; // const/4 v11, 0x2
	 int v1 = 1; // const/4 v1, 0x1
	 int v2 = 0; // const/4 v2, 0x0
	 /* .line 37 */
	 final String v0 = "urls"; // const-string v0, "urls"
	 (( java.util.HashMap ) p2 ).get ( v0 ); // invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
	 /* check-cast v0, Ljava/lang/String; */
	 /* .line 38 */
	 /* if-nez v0, :cond_0 */
	 /* .line 39 */
	 final String v0 = "Could not get the urls param from canOpenURLs gmsg."; // const-string v0, "Could not get the urls param from canOpenURLs gmsg."
	 com.google.ads.util.b .e ( v0 );
	 /* .line 65 */
} // :goto_0
return;
/* .line 42 */
} // :cond_0
final String v3 = ","; // const-string v3, ","
(( java.lang.String ) v0 ).split ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
/* .line 45 */
/* new-instance v5, Ljava/util/HashMap; */
/* invoke-direct {v5}, Ljava/util/HashMap;-><init>()V */
/* .line 46 */
(( android.webkit.WebView ) p3 ).getContext ( ); // invoke-virtual {p3}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;
(( android.content.Context ) v0 ).getPackageManager ( ); // invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
/* .line 47 */
/* array-length v7, v4 */
/* move v3, v2 */
} // :goto_1
/* if-ge v3, v7, :cond_3 */
/* aget-object v8, v4, v3 */
/* .line 49 */
final String v0 = ";"; // const-string v0, ";"
(( java.lang.String ) v8 ).split ( v0, v11 ); // invoke-virtual {v8, v0, v11}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;
/* .line 50 */
/* aget-object v9, v0, v2 */
/* .line 51 */
/* array-length v10, v0 */
/* if-lt v10, v11, :cond_1 */
/* aget-object v0, v0, v1 */
/* .line 55 */
} // :goto_2
android.net.Uri .parse ( v9 );
/* .line 56 */
/* new-instance v10, Landroid/content/Intent; */
/* invoke-direct {v10, v0, v9}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
/* .line 57 */
/* const/high16 v0, 0x10000 */
(( android.content.pm.PackageManager ) v6 ).resolveActivity ( v10, v0 ); // invoke-virtual {v6, v10, v0}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;
/* .line 59 */
if ( v0 != null) { // if-eqz v0, :cond_2
/* move v0, v1 */
/* .line 60 */
} // :goto_3
java.lang.Boolean .valueOf ( v0 );
(( java.util.HashMap ) v5 ).put ( v8, v0 ); // invoke-virtual {v5, v8, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 47 */
/* add-int/lit8 v0, v3, 0x1 */
/* move v3, v0 */
/* .line 51 */
} // :cond_1
final String v0 = "android.intent.action.VIEW"; // const-string v0, "android.intent.action.VIEW"
} // :cond_2
/* move v0, v2 */
/* .line 59 */
/* .line 64 */
} // :cond_3
v0 = com.google.ads.o.a;
(( com.google.ads.internal.a ) v0 ).a ( p3, v5 ); // invoke-virtual {v0, p3, v5}, Lcom/google/ads/internal/a;->a(Landroid/webkit/WebView;Ljava/util/Map;)V
} // .end method
