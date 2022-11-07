public class com.ansca.corona.SystemMonitor {
	 /* .source "SystemMonitor.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/ansca/corona/SystemMonitor$SystemEventHandler; */
	 /* } */
} // .end annotation
/* # instance fields */
private com.ansca.corona.CoronaActivity fActivity;
private Boolean fIsLowOnMemory;
private Boolean fIsScreenOn;
private com.ansca.corona.SystemMonitor$SystemEventHandler fSystemEventHandler;
/* # direct methods */
public com.ansca.corona.SystemMonitor ( ) {
	 /* .locals 1 */
	 /* .param p1, "activity" # Lcom/ansca/corona/CoronaActivity; */
	 /* .prologue */
	 /* .line 25 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 27 */
	 /* if-nez p1, :cond_0 */
	 /* .line 28 */
	 /* new-instance v0, Ljava/lang/NullPointerException; */
	 /* invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V */
	 /* throw v0 */
	 /* .line 32 */
} // :cond_0
this.fActivity = p1;
/* .line 33 */
int v0 = 0; // const/4 v0, 0x0
this.fSystemEventHandler = v0;
/* .line 34 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/ansca/corona/SystemMonitor;->fIsScreenOn:Z */
/* .line 35 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/ansca/corona/SystemMonitor;->fIsLowOnMemory:Z */
/* .line 36 */
return;
} // .end method
static Boolean access$002 ( com.ansca.corona.SystemMonitor p0, Boolean p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/ansca/corona/SystemMonitor; */
/* .param p1, "x1" # Z */
/* .prologue */
/* .line 7 */
/* iput-boolean p1, p0, Lcom/ansca/corona/SystemMonitor;->fIsScreenOn:Z */
} // .end method
/* # virtual methods */
public com.ansca.corona.CoronaActivity getActivity ( ) {
/* .locals 1 */
/* .prologue */
/* .line 69 */
v0 = this.fActivity;
} // .end method
public Boolean isLowOnMemory ( ) {
/* .locals 5 */
/* .prologue */
/* .line 115 */
/* new-instance v1, Landroid/app/ActivityManager$MemoryInfo; */
/* invoke-direct {v1}, Landroid/app/ActivityManager$MemoryInfo;-><init>()V */
/* .line 116 */
/* .local v1, "memoryInfo":Landroid/app/ActivityManager$MemoryInfo; */
v2 = this.fActivity;
final String v3 = "activity"; // const-string v3, "activity"
(( com.ansca.corona.CoronaActivity ) v2 ).getSystemService ( v3 ); // invoke-virtual {v2, v3}, Lcom/ansca/corona/CoronaActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/app/ActivityManager; */
/* .line 117 */
/* .local v0, "activityManager":Landroid/app/ActivityManager; */
(( android.app.ActivityManager ) v0 ).getMemoryInfo ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/ActivityManager;->getMemoryInfo(Landroid/app/ActivityManager$MemoryInfo;)V
/* .line 120 */
/* iget-boolean v2, p0, Lcom/ansca/corona/SystemMonitor;->fIsLowOnMemory:Z */
/* iget-boolean v3, v1, Landroid/app/ActivityManager$MemoryInfo;->lowMemory:Z */
/* if-eq v2, v3, :cond_0 */
/* .line 121 */
/* iget-boolean v2, v1, Landroid/app/ActivityManager$MemoryInfo;->lowMemory:Z */
/* iput-boolean v2, p0, Lcom/ansca/corona/SystemMonitor;->fIsLowOnMemory:Z */
/* .line 122 */
/* iget-boolean v2, p0, Lcom/ansca/corona/SystemMonitor;->fIsLowOnMemory:Z */
if ( v2 != null) { // if-eqz v2, :cond_0
	 v2 = 	 com.ansca.corona.Controller .isValid ( );
	 if ( v2 != null) { // if-eqz v2, :cond_0
		 /* .line 123 */
		 com.ansca.corona.Controller .getEventManager ( );
		 /* new-instance v3, Lcom/ansca/corona/events/RunnableEvent; */
		 /* new-instance v4, Lcom/ansca/corona/SystemMonitor$1; */
		 /* invoke-direct {v4, p0}, Lcom/ansca/corona/SystemMonitor$1;-><init>(Lcom/ansca/corona/SystemMonitor;)V */
		 /* invoke-direct {v3, v4}, Lcom/ansca/corona/events/RunnableEvent;-><init>(Ljava/lang/Runnable;)V */
		 (( com.ansca.corona.events.EventManager ) v2 ).addEvent ( v3 ); // invoke-virtual {v2, v3}, Lcom/ansca/corona/events/EventManager;->addEvent(Lcom/ansca/corona/events/Event;)V
		 /* .line 135 */
	 } // :cond_0
	 /* iget-boolean v2, p0, Lcom/ansca/corona/SystemMonitor;->fIsLowOnMemory:Z */
} // .end method
public Boolean isRunning ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 61 */
	 v0 = this.fSystemEventHandler;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 int v0 = 1; // const/4 v0, 0x1
	 } // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isScreenLocked ( ) {
/* .locals 3 */
/* .prologue */
/* .line 94 */
v1 = this.fActivity;
final String v2 = "keyguard"; // const-string v2, "keyguard"
(( com.ansca.corona.CoronaActivity ) v1 ).getSystemService ( v2 ); // invoke-virtual {v1, v2}, Lcom/ansca/corona/CoronaActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/app/KeyguardManager; */
/* .line 95 */
/* .local v0, "keyguardManager":Landroid/app/KeyguardManager; */
v1 = (( android.app.KeyguardManager ) v0 ).inKeyguardRestrictedInputMode ( ); // invoke-virtual {v0}, Landroid/app/KeyguardManager;->inKeyguardRestrictedInputMode()Z
} // .end method
public Boolean isScreenOff ( ) {
/* .locals 1 */
/* .prologue */
/* .line 85 */
/* iget-boolean v0, p0, Lcom/ansca/corona/SystemMonitor;->fIsScreenOn:Z */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isScreenOn ( ) {
/* .locals 1 */
/* .prologue */
/* .line 77 */
/* iget-boolean v0, p0, Lcom/ansca/corona/SystemMonitor;->fIsScreenOn:Z */
} // .end method
public Boolean isScreenUnlocked ( ) {
/* .locals 1 */
/* .prologue */
/* .line 103 */
v0 = (( com.ansca.corona.SystemMonitor ) p0 ).isScreenLocked ( ); // invoke-virtual {p0}, Lcom/ansca/corona/SystemMonitor;->isScreenLocked()Z
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void start ( ) {
/* .locals 1 */
/* .prologue */
/* .line 40 */
/* new-instance v0, Lcom/ansca/corona/SystemMonitor$SystemEventHandler; */
/* invoke-direct {v0, p0, p0}, Lcom/ansca/corona/SystemMonitor$SystemEventHandler;-><init>(Lcom/ansca/corona/SystemMonitor;Lcom/ansca/corona/SystemMonitor;)V */
this.fSystemEventHandler = v0;
/* .line 41 */
return;
} // .end method
public void stop ( ) {
/* .locals 1 */
/* .prologue */
/* .line 45 */
v0 = this.fSystemEventHandler;
(( com.ansca.corona.SystemMonitor$SystemEventHandler ) v0 ).dispose ( ); // invoke-virtual {v0}, Lcom/ansca/corona/SystemMonitor$SystemEventHandler;->dispose()V
/* .line 46 */
int v0 = 0; // const/4 v0, 0x0
this.fSystemEventHandler = v0;
/* .line 47 */
return;
} // .end method
public void update ( ) {
/* .locals 0 */
/* .prologue */
/* .line 53 */
(( com.ansca.corona.SystemMonitor ) p0 ).isLowOnMemory ( ); // invoke-virtual {p0}, Lcom/ansca/corona/SystemMonitor;->isLowOnMemory()Z
/* .line 54 */
return;
} // .end method
