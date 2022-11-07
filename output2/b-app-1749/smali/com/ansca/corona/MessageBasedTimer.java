public class com.ansca.corona.MessageBasedTimer {
	 /* .source "MessageBasedTimer.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/ansca/corona/MessageBasedTimer$Listener; */
	 /* } */
} // .end annotation
/* # static fields */
public static final com.ansca.corona.TimeSpan MIN_INTERVAL;
/* # instance fields */
private android.os.Handler fHandler;
private com.ansca.corona.TimeSpan fInterval;
private Boolean fIsRunning;
private com.ansca.corona.MessageBasedTimer$Listener fListener;
private com.ansca.corona.Ticks fNextElapseTimeInTicks;
private java.lang.Runnable fRunnable;
/* # direct methods */
static com.ansca.corona.MessageBasedTimer ( ) {
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 37 */
	 /* const-wide/16 v0, 0x5 */
	 com.ansca.corona.TimeSpan .fromMilliseconds ( v0,v1 );
	 return;
} // .end method
public com.ansca.corona.MessageBasedTimer ( ) {
	 /* .locals 2 */
	 /* .prologue */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 51 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 52 */
	 this.fHandler = v0;
	 /* .line 53 */
	 this.fRunnable = v0;
	 /* .line 54 */
	 this.fListener = v0;
	 /* .line 55 */
	 /* const-wide/16 v0, 0x1 */
	 com.ansca.corona.TimeSpan .fromMinutes ( v0,v1 );
	 this.fInterval = v0;
	 /* .line 56 */
	 com.ansca.corona.Ticks .fromCurrentTime ( );
	 this.fNextElapseTimeInTicks = v0;
	 /* .line 57 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* iput-boolean v0, p0, Lcom/ansca/corona/MessageBasedTimer;->fIsRunning:Z */
	 /* .line 58 */
	 return;
} // .end method
static void access$000 ( com.ansca.corona.MessageBasedTimer p0 ) { //synthethic
	 /* .locals 0 */
	 /* .param p0, "x0" # Lcom/ansca/corona/MessageBasedTimer; */
	 /* .prologue */
	 /* .line 13 */
	 /* invoke-direct {p0}, Lcom/ansca/corona/MessageBasedTimer;->onElapsed()V */
	 return;
} // .end method
private void onElapsed ( ) {
	 /* .locals 5 */
	 /* .prologue */
	 /* .line 218 */
	 /* iget-boolean v3, p0, Lcom/ansca/corona/MessageBasedTimer;->fIsRunning:Z */
	 /* if-nez v3, :cond_1 */
	 /* .line 239 */
} // :cond_0
} // :goto_0
return;
/* .line 223 */
} // :cond_1
v3 = this.fListener;
if ( v3 != null) { // if-eqz v3, :cond_2
/* .line 224 */
v3 = this.fListener;
/* .line 228 */
} // :cond_2
/* iget-boolean v3, p0, Lcom/ansca/corona/MessageBasedTimer;->fIsRunning:Z */
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 233 */
com.ansca.corona.Ticks .fromCurrentTime ( );
/* .line 235 */
/* .local v0, "currentTimeInTicks":Lcom/ansca/corona/Ticks; */
} // :cond_3
v3 = this.fNextElapseTimeInTicks;
v4 = this.fInterval;
(( com.ansca.corona.Ticks ) v3 ).add ( v4 ); // invoke-virtual {v3, v4}, Lcom/ansca/corona/Ticks;->add(Lcom/ansca/corona/TimeSpan;)Lcom/ansca/corona/Ticks;
this.fNextElapseTimeInTicks = v3;
/* .line 236 */
v3 = this.fNextElapseTimeInTicks;
v3 = (( com.ansca.corona.Ticks ) v3 ).compareTo ( v0 ); // invoke-virtual {v3, v0}, Lcom/ansca/corona/Ticks;->compareTo(Lcom/ansca/corona/Ticks;)I
/* if-lez v3, :cond_3 */
/* .line 237 */
v3 = this.fNextElapseTimeInTicks;
(( com.ansca.corona.Ticks ) v3 ).subtract ( v0 ); // invoke-virtual {v3, v0}, Lcom/ansca/corona/Ticks;->subtract(Lcom/ansca/corona/Ticks;)Lcom/ansca/corona/TimeSpan;
(( com.ansca.corona.TimeSpan ) v3 ).getTotalMilliseconds ( ); // invoke-virtual {v3}, Lcom/ansca/corona/TimeSpan;->getTotalMilliseconds()J
/* move-result-wide v1 */
/* .line 238 */
/* .local v1, "delayInMilliseconds":J */
v3 = this.fHandler;
v4 = this.fRunnable;
(( android.os.Handler ) v3 ).postDelayed ( v4, v1, v2 ); // invoke-virtual {v3, v4, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
} // .end method
/* # virtual methods */
public android.os.Handler getHandler ( ) {
/* .locals 1 */
/* .prologue */
/* .line 100 */
v0 = this.fHandler;
} // .end method
public com.ansca.corona.TimeSpan getInterval ( ) {
/* .locals 1 */
/* .prologue */
/* .line 152 */
v0 = this.fInterval;
} // .end method
public com.ansca.corona.MessageBasedTimer$Listener getListener ( ) {
/* .locals 1 */
/* .prologue */
/* .line 117 */
v0 = this.fListener;
} // .end method
public Boolean isNotRunning ( ) {
/* .locals 1 */
/* .prologue */
/* .line 168 */
/* iget-boolean v0, p0, Lcom/ansca/corona/MessageBasedTimer;->fIsRunning:Z */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isRunning ( ) {
/* .locals 1 */
/* .prologue */
/* .line 160 */
/* iget-boolean v0, p0, Lcom/ansca/corona/MessageBasedTimer;->fIsRunning:Z */
} // .end method
public void setHandler ( android.os.Handler p0 ) {
/* .locals 2 */
/* .param p1, "handler" # Landroid/os/Handler; */
/* .prologue */
/* .line 75 */
v1 = this.fHandler;
/* if-ne p1, v1, :cond_1 */
/* .line 92 */
} // :cond_0
} // :goto_0
return;
/* .line 80 */
} // :cond_1
/* iget-boolean v0, p0, Lcom/ansca/corona/MessageBasedTimer;->fIsRunning:Z */
/* .line 81 */
/* .local v0, "wasRunning":Z */
/* iget-boolean v1, p0, Lcom/ansca/corona/MessageBasedTimer;->fIsRunning:Z */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 82 */
(( com.ansca.corona.MessageBasedTimer ) p0 ).stop ( ); // invoke-virtual {p0}, Lcom/ansca/corona/MessageBasedTimer;->stop()V
/* .line 86 */
} // :cond_2
this.fHandler = p1;
/* .line 89 */
if ( v0 != null) { // if-eqz v0, :cond_0
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 90 */
(( com.ansca.corona.MessageBasedTimer ) p0 ).start ( ); // invoke-virtual {p0}, Lcom/ansca/corona/MessageBasedTimer;->start()V
} // .end method
public void setInterval ( com.ansca.corona.TimeSpan p0 ) {
/* .locals 1 */
/* .param p1, "interval" # Lcom/ansca/corona/TimeSpan; */
/* .prologue */
/* .line 128 */
/* if-nez p1, :cond_0 */
/* .line 129 */
/* new-instance v0, Ljava/lang/NullPointerException; */
/* invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V */
/* throw v0 */
/* .line 134 */
} // :cond_0
v0 = com.ansca.corona.MessageBasedTimer.MIN_INTERVAL;
v0 = (( com.ansca.corona.TimeSpan ) p1 ).compareTo ( v0 ); // invoke-virtual {p1, v0}, Lcom/ansca/corona/TimeSpan;->compareTo(Lcom/ansca/corona/TimeSpan;)I
/* if-gtz v0, :cond_1 */
/* .line 135 */
p1 = com.ansca.corona.MessageBasedTimer.MIN_INTERVAL;
/* .line 139 */
} // :cond_1
v0 = this.fInterval;
v0 = (( com.ansca.corona.TimeSpan ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Lcom/ansca/corona/TimeSpan;->equals(Lcom/ansca/corona/TimeSpan;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 145 */
} // :goto_0
return;
/* .line 144 */
} // :cond_2
this.fInterval = p1;
} // .end method
public void setListener ( com.ansca.corona.MessageBasedTimer$Listener p0 ) {
/* .locals 0 */
/* .param p1, "listener" # Lcom/ansca/corona/MessageBasedTimer$Listener; */
/* .prologue */
/* .line 108 */
this.fListener = p1;
/* .line 109 */
return;
} // .end method
public void start ( ) {
/* .locals 4 */
/* .prologue */
/* .line 174 */
/* iget-boolean v0, p0, Lcom/ansca/corona/MessageBasedTimer;->fIsRunning:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 195 */
} // :cond_0
} // :goto_0
return;
/* .line 179 */
} // :cond_1
v0 = this.fHandler;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 184 */
/* new-instance v0, Lcom/ansca/corona/MessageBasedTimer$1; */
/* invoke-direct {v0, p0}, Lcom/ansca/corona/MessageBasedTimer$1;-><init>(Lcom/ansca/corona/MessageBasedTimer;)V */
this.fRunnable = v0;
/* .line 192 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/ansca/corona/MessageBasedTimer;->fIsRunning:Z */
/* .line 193 */
com.ansca.corona.Ticks .fromCurrentTime ( );
v1 = this.fInterval;
(( com.ansca.corona.Ticks ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/Ticks;->add(Lcom/ansca/corona/TimeSpan;)Lcom/ansca/corona/Ticks;
this.fNextElapseTimeInTicks = v0;
/* .line 194 */
v0 = this.fHandler;
v1 = this.fRunnable;
v2 = this.fInterval;
(( com.ansca.corona.TimeSpan ) v2 ).getTotalMilliseconds ( ); // invoke-virtual {v2}, Lcom/ansca/corona/TimeSpan;->getTotalMilliseconds()J
/* move-result-wide v2 */
(( android.os.Handler ) v0 ).postDelayed ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
} // .end method
public void stop ( ) {
/* .locals 2 */
/* .prologue */
/* .line 200 */
/* iget-boolean v0, p0, Lcom/ansca/corona/MessageBasedTimer;->fIsRunning:Z */
/* if-nez v0, :cond_0 */
/* .line 210 */
} // :goto_0
return;
/* .line 205 */
} // :cond_0
v0 = this.fHandler;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.fRunnable;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 206 */
v0 = this.fHandler;
v1 = this.fRunnable;
(( android.os.Handler ) v0 ).removeCallbacks ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
/* .line 207 */
int v0 = 0; // const/4 v0, 0x0
this.fRunnable = v0;
/* .line 209 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/ansca/corona/MessageBasedTimer;->fIsRunning:Z */
} // .end method
