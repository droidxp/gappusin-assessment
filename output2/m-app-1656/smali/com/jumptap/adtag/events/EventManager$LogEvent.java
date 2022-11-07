class com.jumptap.adtag.events.EventManager$LogEvent implements java.lang.Runnable {
	 /* .source "EventManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/jumptap/adtag/events/EventManager; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "LogEvent" */
} // .end annotation
/* # instance fields */
private android.content.Context context;
private com.jumptap.adtag.events.JtEvent event;
/* # direct methods */
public com.jumptap.adtag.events.EventManager$LogEvent ( ) {
/* .locals 0 */
/* .param p1, "context" # Landroid/content/Context; */
/* .param p2, "event" # Lcom/jumptap/adtag/events/JtEvent; */
/* .prologue */
/* .line 296 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 297 */
this.context = p1;
/* .line 298 */
this.event = p2;
/* .line 299 */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 2 */
/* .prologue */
/* .line 302 */
v1 = this.context;
com.jumptap.adtag.db.DBManager .getInstance ( v1 );
/* .line 303 */
/* .local v0, "dbManager":Lcom/jumptap/adtag/db/DBManager; */
v1 = this.event;
(( com.jumptap.adtag.db.DBManager ) v0 ).insertEvent ( v1 ); // invoke-virtual {v0, v1}, Lcom/jumptap/adtag/db/DBManager;->insertEvent(Lcom/jumptap/adtag/events/JtEvent;)J
/* .line 304 */
v1 = this.context;
com.jumptap.adtag.events.EventManager .access$100 ( v1 );
/* .line 305 */
return;
} // .end method
