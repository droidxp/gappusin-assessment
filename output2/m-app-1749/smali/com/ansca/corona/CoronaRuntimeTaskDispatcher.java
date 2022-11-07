public class com.ansca.corona.CoronaRuntimeTaskDispatcher {
	 /* .source "CoronaRuntimeTaskDispatcher.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/ansca/corona/CoronaRuntimeTaskDispatcher$TaskEvent; */
	 /* } */
} // .end annotation
/* # instance fields */
private com.ansca.corona.CoronaRuntime fRuntime;
/* # direct methods */
public com.ansca.corona.CoronaRuntimeTaskDispatcher ( ) {
	 /* .locals 0 */
	 /* .param p1, "runtime" # Lcom/ansca/corona/CoronaRuntime; */
	 /* .prologue */
	 /* .line 37 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 38 */
	 this.fRuntime = p1;
	 /* .line 39 */
	 return;
} // .end method
public com.ansca.corona.CoronaRuntimeTaskDispatcher ( ) {
	 /* .locals 2 */
	 /* .param p1, "luaState" # Lcom/naef/jnlua/LuaState; */
	 /* .prologue */
	 /* .line 53 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 55 */
	 int v1 = 0; // const/4 v1, 0x0
	 this.fRuntime = v1;
	 /* .line 56 */
	 if ( p1 != null) { // if-eqz p1, :cond_0
		 /* .line 57 */
		 com.ansca.corona.Controller .getRuntime ( );
		 /* .line 58 */
		 /* .local v0, "runtime":Lcom/ansca/corona/CoronaRuntime; */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 (( com.ansca.corona.CoronaRuntime ) v0 ).getLuaState ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaRuntime;->getLuaState()Lcom/naef/jnlua/LuaState;
			 /* if-ne v1, p1, :cond_0 */
			 /* .line 59 */
			 this.fRuntime = v0;
			 /* .line 62 */
		 } // .end local v0 # "runtime":Lcom/ansca/corona/CoronaRuntime;
	 } // :cond_0
	 return;
} // .end method
/* # virtual methods */
public Boolean isRuntimeAvailable ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 73 */
	 v0 = this.fRuntime;
	 /* if-nez v0, :cond_0 */
	 /* .line 74 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 78 */
} // :goto_0
} // :cond_0
v0 = this.fRuntime;
v0 = (( com.ansca.corona.CoronaRuntime ) v0 ).wasNotDisposed ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaRuntime;->wasNotDisposed()Z
} // .end method
public Boolean isRuntimeUnavailable ( ) {
/* .locals 1 */
/* .prologue */
/* .line 90 */
v0 = (( com.ansca.corona.CoronaRuntimeTaskDispatcher ) p0 ).isRuntimeAvailable ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CoronaRuntimeTaskDispatcher;->isRuntimeAvailable()Z
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void send ( com.ansca.corona.CoronaRuntimeTask p0 ) {
/* .locals 2 */
/* .param p1, "task" # Lcom/ansca/corona/CoronaRuntimeTask; */
/* .prologue */
/* .line 106 */
/* if-nez p1, :cond_0 */
/* .line 107 */
/* new-instance v1, Ljava/lang/NullPointerException; */
/* invoke-direct {v1}, Ljava/lang/NullPointerException;-><init>()V */
/* throw v1 */
/* .line 111 */
} // :cond_0
v1 = (( com.ansca.corona.CoronaRuntimeTaskDispatcher ) p0 ).isRuntimeUnavailable ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CoronaRuntimeTaskDispatcher;->isRuntimeUnavailable()Z
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 120 */
} // :cond_1
} // :goto_0
return;
/* .line 116 */
} // :cond_2
com.ansca.corona.Controller .getEventManager ( );
/* .line 117 */
/* .local v0, "eventManager":Lcom/ansca/corona/events/EventManager; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 118 */
/* new-instance v1, Lcom/ansca/corona/CoronaRuntimeTaskDispatcher$TaskEvent; */
/* invoke-direct {v1, p1}, Lcom/ansca/corona/CoronaRuntimeTaskDispatcher$TaskEvent;-><init>(Lcom/ansca/corona/CoronaRuntimeTask;)V */
(( com.ansca.corona.events.EventManager ) v0 ).addEvent ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/events/EventManager;->addEvent(Lcom/ansca/corona/events/Event;)V
} // .end method
