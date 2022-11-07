class com.umeng.analytics.a implements java.lang.Thread$UncaughtExceptionHandler {
	 /* .source "CrashHandler.java" */
	 /* # interfaces */
	 /* # instance fields */
	 private java.lang.Thread$UncaughtExceptionHandler a;
	 private com.umeng.analytics.i b;
	 private android.content.Context c;
	 /* # direct methods */
	 public com.umeng.analytics.a ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 19 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 20 */
		 return;
	 } // .end method
	 private void a ( java.lang.Throwable p0 ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 48 */
		 /* if-nez p1, :cond_0 */
		 /* .line 49 */
		 final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
		 /* .line 50 */
		 final String v1 = "Exception is null in handleException"; // const-string v1, "Exception is null in handleException"
		 /* .line 49 */
		 com.umeng.common.Log .e ( v0,v1 );
		 /* .line 55 */
	 } // :goto_0
	 return;
	 /* .line 54 */
} // :cond_0
v0 = this.b;
v1 = this.c;
} // .end method
/* # virtual methods */
public void a ( android.content.Context p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 24 */
java.lang.Thread .getDefaultUncaughtExceptionHandler ( );
/* if-ne v0, p0, :cond_0 */
/* .line 31 */
} // :goto_0
return;
/* .line 28 */
} // :cond_0
(( android.content.Context ) p1 ).getApplicationContext ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
this.c = v0;
/* .line 29 */
java.lang.Thread .getDefaultUncaughtExceptionHandler ( );
this.a = v0;
/* .line 30 */
java.lang.Thread .setDefaultUncaughtExceptionHandler ( p0 );
} // .end method
public void a ( Object p0 ) {
/* .locals 0 */
/* .prologue */
/* .line 34 */
this.b = p1;
/* .line 35 */
return;
} // .end method
public void uncaughtException ( java.lang.Thread p0, java.lang.Throwable p1 ) {
/* .locals 1 */
/* .prologue */
/* .line 40 */
/* invoke-direct {p0, p2}, Lcom/umeng/analytics/a;->a(Ljava/lang/Throwable;)V */
/* .line 42 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 43 */
v0 = this.a;
/* .line 45 */
} // :cond_0
return;
} // .end method
