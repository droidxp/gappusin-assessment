class com.ansca.corona.CoronaRuntimeTaskDispatcher$TaskEvent extends com.ansca.corona.events.Event {
	 /* .source "CoronaRuntimeTaskDispatcher.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/ansca/corona/CoronaRuntimeTaskDispatcher; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "TaskEvent" */
} // .end annotation
/* # instance fields */
private com.ansca.corona.CoronaRuntimeTask fTask;
/* # direct methods */
public com.ansca.corona.CoronaRuntimeTaskDispatcher$TaskEvent ( ) {
/* .locals 1 */
/* .param p1, "task" # Lcom/ansca/corona/CoronaRuntimeTask; */
/* .prologue */
/* .line 131 */
/* invoke-direct {p0}, Lcom/ansca/corona/events/Event;-><init>()V */
/* .line 132 */
/* if-nez p1, :cond_0 */
/* .line 133 */
/* new-instance v0, Ljava/lang/NullPointerException; */
/* invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V */
/* throw v0 */
/* .line 135 */
} // :cond_0
this.fTask = p1;
/* .line 136 */
return;
} // .end method
/* # virtual methods */
public void Send ( ) {
/* .locals 2 */
/* .prologue */
/* .line 142 */
v1 = this.fTask;
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = com.ansca.corona.Controller .isValid ( );
/* if-nez v1, :cond_1 */
/* .line 154 */
} // :cond_0
} // :goto_0
return;
/* .line 147 */
} // :cond_1
com.ansca.corona.Controller .getRuntime ( );
/* .line 148 */
/* .local v0, "runtime":Lcom/ansca/corona/CoronaRuntime; */
if ( v0 != null) { // if-eqz v0, :cond_0
v1 = (( com.ansca.corona.CoronaRuntime ) v0 ).wasDisposed ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaRuntime;->wasDisposed()Z
/* if-nez v1, :cond_0 */
/* .line 153 */
v1 = this.fTask;
} // .end method
