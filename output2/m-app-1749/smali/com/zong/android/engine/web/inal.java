class inal implements java.lang.Runnable {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/zong/android/engine/web/ZongWebView$ZgJavaScriptInterface;->loadPayView()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
private com.zong.android.engine.web.ZongWebView$ZgJavaScriptInterface a; //synthetic
/* # direct methods */
 inal ( ) {
/* .locals 0 */
this.a = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public final void run ( ) {
/* .locals 2 */
com.zong.android.engine.web.ZongWebView .i ( );
final String v1 = "Load Pay View JavaScript Executed"; // const-string v1, "Load Pay View JavaScript Executed"
zongfuscated.q .a ( v0,v1 );
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "javascript:initIntlPayView(\'"; // const-string v1, "javascript:initIntlPayView(\'"
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v1 = this.a;
v1 = this.a;
(( com.zong.android.engine.web.ZongWebView ) v1 ).g ( ); // invoke-virtual {v1}, Lcom/zong/android/engine/web/ZongWebView;->g()Lzongfuscated/F;
(( zongfuscated.F ) v1 ).a ( ); // invoke-virtual {v1}, Lzongfuscated/F;->a()Ljava/lang/Boolean;
v1 = (( java.lang.Boolean ) v1 ).booleanValue ( ); // invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z
java.lang.Boolean .toString ( v1 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "\', \'"; // const-string v1, "\', \'"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.a;
v1 = this.a;
(( com.zong.android.engine.web.ZongWebView ) v1 ).h ( ); // invoke-virtual {v1}, Lcom/zong/android/engine/web/ZongWebView;->h()Lcom/zong/android/engine/activities/ZongPaymentRequest;
(( com.zong.android.engine.activities.ZongPaymentRequest ) v1 ).getPhoneNumber ( ); // invoke-virtual {v1}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->getPhoneNumber()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "\', \'"; // const-string v1, "\', \'"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.a;
v1 = this.a;
(( com.zong.android.engine.web.ZongWebView ) v1 ).h ( ); // invoke-virtual {v1}, Lcom/zong/android/engine/web/ZongWebView;->h()Lcom/zong/android/engine/activities/ZongPaymentRequest;
(( com.zong.android.engine.activities.ZongPaymentRequest ) v1 ).getMno ( ); // invoke-virtual {v1}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->getMno()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "\', \'"; // const-string v1, "\', \'"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.a;
v1 = this.a;
(( com.zong.android.engine.web.ZongWebView ) v1 ).h ( ); // invoke-virtual {v1}, Lcom/zong/android/engine/web/ZongWebView;->h()Lcom/zong/android/engine/activities/ZongPaymentRequest;
(( com.zong.android.engine.activities.ZongPaymentRequest ) v1 ).getCountry ( ); // invoke-virtual {v1}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->getCountry()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "\', \'"; // const-string v1, "\', \'"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.a;
v1 = this.a;
(( com.zong.android.engine.web.ZongWebView ) v1 ).h ( ); // invoke-virtual {v1}, Lcom/zong/android/engine/web/ZongWebView;->h()Lcom/zong/android/engine/activities/ZongPaymentRequest;
(( com.zong.android.engine.activities.ZongPaymentRequest ) v1 ).getLang ( ); // invoke-virtual {v1}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->getLang()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "\', \'"; // const-string v1, "\', \'"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.a;
v1 = this.a;
(( com.zong.android.engine.web.ZongWebView ) v1 ).h ( ); // invoke-virtual {v1}, Lcom/zong/android/engine/web/ZongWebView;->h()Lcom/zong/android/engine/activities/ZongPaymentRequest;
(( com.zong.android.engine.activities.ZongPaymentRequest ) v1 ).getCurrency ( ); // invoke-virtual {v1}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->getCurrency()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "\', \'"; // const-string v1, "\', \'"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.a;
v1 = this.a;
(( com.zong.android.engine.web.ZongWebView ) v1 ).h ( ); // invoke-virtual {v1}, Lcom/zong/android/engine/web/ZongWebView;->h()Lcom/zong/android/engine/activities/ZongPaymentRequest;
(( com.zong.android.engine.activities.ZongPaymentRequest ) v1 ).getCustomerKey ( ); // invoke-virtual {v1}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->getCustomerKey()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "\')"; // const-string v1, "\')"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v1 = this.a;
v1 = this.a;
com.zong.android.engine.web.ZongWebView .a ( v1 );
(( android.webkit.WebView ) v1 ).loadUrl ( v0 ); // invoke-virtual {v1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
return;
} // .end method
