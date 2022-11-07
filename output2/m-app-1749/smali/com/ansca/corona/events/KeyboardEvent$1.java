class com.ansca.corona.events.KeyboardEvent$1 implements java.lang.Runnable {
	 /* .source "KeyboardEvent.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/events/KeyboardEvent;->Send()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.events.KeyboardEvent this$0; //synthetic
/* # direct methods */
 com.ansca.corona.events.KeyboardEvent$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 42 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 4 */
/* .prologue */
/* .line 44 */
/* monitor-enter p0 */
/* .line 45 */
try { // :try_start_0
	 v0 = 	 com.ansca.corona.Controller .isValid ( );
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 46 */
		 com.ansca.corona.Controller .getActivity ( );
		 /* new-instance v1, Lcom/ansca/corona/events/KeyboardEvent$NonOverriddenKeyEvent; */
		 v2 = this.this$0;
		 v3 = this.this$0;
		 com.ansca.corona.events.KeyboardEvent .access$000 ( v3 );
		 /* invoke-direct {v1, v2, v3}, Lcom/ansca/corona/events/KeyboardEvent$NonOverriddenKeyEvent;-><init>(Lcom/ansca/corona/events/KeyboardEvent;Landroid/view/KeyEvent;)V */
		 (( com.ansca.corona.CoronaActivity ) v0 ).dispatchKeyEvent ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/CoronaActivity;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z
		 /* .line 48 */
	 } // :cond_0
	 /* monitor-exit p0 */
	 /* .line 49 */
	 return;
	 /* .line 48 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p0 */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* throw v0 */
} // .end method
