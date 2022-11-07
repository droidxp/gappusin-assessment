public class com.google.ads.ag implements com.google.ads.n {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/google/ads/ag$a;, */
	 /* Lcom/google/ads/ag$c;, */
	 /* Lcom/google/ads/ag$b; */
	 /* } */
} // .end annotation
/* # direct methods */
public com.google.ads.ag ( ) {
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 31 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 76 */
	 return;
} // .end method
/* # virtual methods */
public void a ( Object p0, java.util.HashMap p1, android.webkit.WebView p2 ) {
	 /* .locals 5 */
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
/* .line 97 */
(( com.google.ads.internal.d ) p1 ).g ( ); // invoke-virtual {p1}, Lcom/google/ads/internal/d;->g()Lcom/google/ads/m;
v0 = this.d;
(( com.google.ads.util.i$b ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$b;->a()Ljava/lang/Object;
/* check-cast v0, Landroid/content/Context; */
/* .line 98 */
final String v1 = "a"; // const-string v1, "a"
(( java.util.HashMap ) p2 ).get ( v1 ); // invoke-virtual {p2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Ljava/lang/String; */
/* .line 100 */
if ( v1 != null) { // if-eqz v1, :cond_2
	 /* .line 101 */
	 final String v2 = "resize"; // const-string v2, "resize"
	 v2 = 	 (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v2 != null) { // if-eqz v2, :cond_1
		 /* .line 102 */
		 final String v0 = "u"; // const-string v0, "u"
		 (( java.util.HashMap ) p2 ).get ( v0 ); // invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
		 /* check-cast v0, Ljava/lang/String; */
		 com.google.ads.ae .a ( p3,v0 );
		 /* .line 153 */
	 } // :cond_0
} // :goto_0
return;
/* .line 105 */
} // :cond_1
final String v2 = "state"; // const-string v2, "state"
v1 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 106 */
(( com.google.ads.internal.d ) p1 ).g ( ); // invoke-virtual {p1}, Lcom/google/ads/internal/d;->g()Lcom/google/ads/m;
v0 = this.c;
(( com.google.ads.util.i$d ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$d;->a()Ljava/lang/Object;
/* check-cast v0, Landroid/app/Activity; */
final String v1 = "u"; // const-string v1, "u"
(( java.util.HashMap ) p2 ).get ( v1 ); // invoke-virtual {p2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Ljava/lang/String; */
com.google.ads.ae .a ( v0,p3,v1 );
/* .line 113 */
} // :cond_2
/* new-instance v1, Landroid/content/Intent; */
/* invoke-direct {v1}, Landroid/content/Intent;-><init>()V */
/* .line 114 */
/* new-instance v2, Landroid/content/ComponentName; */
final String v3 = "com.google.android.apps.plus"; // const-string v3, "com.google.android.apps.plus"
final String v4 = "com.google.android.apps.circles.platform.PlusOneActivity"; // const-string v4, "com.google.android.apps.circles.platform.PlusOneActivity"
/* invoke-direct {v2, v3, v4}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
(( android.content.Intent ) v1 ).setComponent ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
/* .line 119 */
v1 = com.google.ads.af .a ( v1,v0 );
/* if-nez v1, :cond_4 */
/* .line 121 */
/* new-instance v1, Landroid/content/Intent; */
final String v2 = "android.intent.action.VIEW"; // const-string v2, "android.intent.action.VIEW"
final String v3 = "market://details?id=com.google.android.apps.plus"; // const-string v3, "market://details?id=com.google.android.apps.plus"
android.net.Uri .parse ( v3 );
/* invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
v1 = com.google.ads.af .a ( v1,v0 );
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 125 */
final String v1 = "d"; // const-string v1, "d"
(( java.util.HashMap ) p2 ).get ( v1 ); // invoke-virtual {p2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Ljava/lang/CharSequence; */
v1 = android.text.TextUtils .isEmpty ( v1 );
/* if-nez v1, :cond_3 */
final String v1 = "o"; // const-string v1, "o"
(( java.util.HashMap ) p2 ).get ( v1 ); // invoke-virtual {p2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Ljava/lang/CharSequence; */
v1 = android.text.TextUtils .isEmpty ( v1 );
/* if-nez v1, :cond_3 */
final String v1 = "c"; // const-string v1, "c"
(( java.util.HashMap ) p2 ).get ( v1 ); // invoke-virtual {p2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Ljava/lang/CharSequence; */
v1 = android.text.TextUtils .isEmpty ( v1 );
/* if-nez v1, :cond_3 */
/* .line 132 */
/* new-instance v1, Landroid/app/AlertDialog$Builder; */
/* invoke-direct {v1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
/* .line 133 */
final String v0 = "d"; // const-string v0, "d"
(( java.util.HashMap ) p2 ).get ( v0 ); // invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/CharSequence; */
(( android.app.AlertDialog$Builder ) v1 ).setMessage ( v0 ); // invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
final String v0 = "o"; // const-string v0, "o"
(( java.util.HashMap ) p2 ).get ( v0 ); // invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/CharSequence; */
/* new-instance v3, Lcom/google/ads/ag$c; */
/* invoke-direct {v3, p1}, Lcom/google/ads/ag$c;-><init>(Lcom/google/ads/internal/d;)V */
(( android.app.AlertDialog$Builder ) v2 ).setPositiveButton ( v0, v3 ); // invoke-virtual {v2, v0, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
final String v0 = "c"; // const-string v0, "c"
(( java.util.HashMap ) p2 ).get ( v0 ); // invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/CharSequence; */
/* new-instance v3, Lcom/google/ads/ag$a; */
/* invoke-direct {v3}, Lcom/google/ads/ag$a;-><init>()V */
(( android.app.AlertDialog$Builder ) v2 ).setNegativeButton ( v0, v3 ); // invoke-virtual {v2, v0, v3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* .line 139 */
(( android.app.AlertDialog$Builder ) v1 ).create ( ); // invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
(( android.app.AlertDialog ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V
/* goto/16 :goto_0 */
/* .line 142 */
} // :cond_3
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* .line 143 */
final String v1 = "u"; // const-string v1, "u"
final String v2 = "market://details?id=com.google.android.apps.plus"; // const-string v2, "market://details?id=com.google.android.apps.plus"
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 144 */
/* new-instance v1, Lcom/google/ads/internal/e; */
final String v2 = "intent"; // const-string v2, "intent"
/* invoke-direct {v1, v2, v0}, Lcom/google/ads/internal/e;-><init>(Ljava/lang/String;Ljava/util/HashMap;)V */
com.google.ads.AdActivity .launchAdActivity ( p1,v1 );
/* goto/16 :goto_0 */
/* .line 150 */
} // :cond_4
/* new-instance v0, Lcom/google/ads/internal/e; */
final String v1 = "plusone"; // const-string v1, "plusone"
/* invoke-direct {v0, v1, p2}, Lcom/google/ads/internal/e;-><init>(Ljava/lang/String;Ljava/util/HashMap;)V */
com.google.ads.AdActivity .launchAdActivity ( p1,v0 );
/* goto/16 :goto_0 */
} // .end method
