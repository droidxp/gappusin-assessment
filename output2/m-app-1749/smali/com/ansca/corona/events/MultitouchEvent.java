public class com.ansca.corona.events.MultitouchEvent extends com.ansca.corona.events.Event {
	 /* .source "MultitouchEvent.java" */
	 /* # static fields */
	 public static final Integer PHASE_BEGAN;
	 public static final Integer PHASE_CANCELLED;
	 public static final Integer PHASE_ENDED;
	 public static final Integer PHASE_MOVED;
	 public static final Integer PHASE_STATIONARY;
	 /* # instance fields */
	 private java.util.List myTouches;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List", */
	 /* "<", */
	 /* "Lcom/ansca/corona/events/TouchData;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
 com.ansca.corona.events.MultitouchEvent ( ) {
/* .locals 1 */
/* .prologue */
/* .line 20 */
/* invoke-direct {p0}, Lcom/ansca/corona/events/Event;-><init>()V */
/* .line 12 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.myTouches = v0;
/* .line 21 */
return;
} // .end method
/* # virtual methods */
public void Send ( ) {
/* .locals 1 */
/* .prologue */
/* .line 31 */
v0 = this.myTouches;
com.ansca.corona.JavaToNativeShim .multitouchEventCallback ( v0 );
/* .line 32 */
return;
} // .end method
public void add ( com.ansca.corona.events.TouchData p0 ) {
/* .locals 2 */
/* .param p1, "t" # Lcom/ansca/corona/events/TouchData; */
/* .prologue */
/* .line 25 */
/* new-instance v0, Lcom/ansca/corona/events/TouchData; */
/* invoke-direct {v0, p1}, Lcom/ansca/corona/events/TouchData;-><init>(Lcom/ansca/corona/events/TouchData;)V */
/* .line 26 */
/* .local v0, "tCopy":Lcom/ansca/corona/events/TouchData; */
v1 = this.myTouches;
/* .line 27 */
return;
} // .end method
