class com.jumptap.adtag.events.EventManager$InteractEventTask$1 implements java.lang.Runnable {
	 /* .source "EventManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/jumptap/adtag/events/EventManager$InteractEventTask;->run()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.jumptap.adtag.events.EventManager$InteractEventTask this$1; //synthetic
/* # direct methods */
 com.jumptap.adtag.events.EventManager$InteractEventTask$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 317 */
this.this$1 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 6 */
/* .prologue */
/* .line 319 */
v3 = this.this$1;
v3 = this.this$0;
com.jumptap.adtag.events.EventManager .access$200 ( v3 );
(( com.jumptap.adtag.events.EventManager$EventInteractionInfo ) v3 ).getDuration ( ); // invoke-virtual {v3}, Lcom/jumptap/adtag/events/EventManager$EventInteractionInfo;->getDuration()J
/* move-result-wide v0 */
/* .line 322 */
/* .local v0, "duration":J */
/* const-wide/16 v3, 0x0 */
/* cmp-long v3, v0, v3 */
/* if-lez v3, :cond_0 */
/* .line 323 */
final String v3 = "JtAd-Tracking"; // const-string v3, "JtAd-Tracking"
final String v4 = "performing Interaction Event Task timer"; // const-string v4, "performing Interaction Event Task timer"
android.util.Log .i ( v3,v4 );
/* .line 324 */
/* new-instance v2, Ljava/util/HashMap; */
/* invoke-direct {v2}, Ljava/util/HashMap;-><init>()V */
/* .line 325 */
/* .local v2, "paramMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
final String v3 = "duration"; // const-string v3, "duration"
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = ""; // const-string v5, ""
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v0, v1 ); // invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 326 */
final String v3 = "units"; // const-string v3, "units"
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = ""; // const-string v5, ""
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v5 = this.this$1;
v5 = this.this$0;
com.jumptap.adtag.events.EventManager .access$200 ( v5 );
v5 = (( com.jumptap.adtag.events.EventManager$EventInteractionInfo ) v5 ).getNumOfInteractions ( ); // invoke-virtual {v5}, Lcom/jumptap/adtag/events/EventManager$EventInteractionInfo;->getNumOfInteractions()I
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 327 */
final String v3 = "JtAd-Tracking"; // const-string v3, "JtAd-Tracking"
final String v4 = "reset"; // const-string v4, "reset"
android.util.Log .i ( v3,v4 );
/* .line 328 */
v3 = this.this$1;
v3 = this.this$0;
com.jumptap.adtag.events.EventManager .access$200 ( v3 );
(( com.jumptap.adtag.events.EventManager$EventInteractionInfo ) v3 ).reset ( ); // invoke-virtual {v3}, Lcom/jumptap/adtag/events/EventManager$EventInteractionInfo;->reset()V
/* .line 329 */
v3 = this.this$1;
v3 = this.this$0;
v4 = com.jumptap.adtag.events.EventType.interact;
com.jumptap.adtag.events.EventManager .access$300 ( v3,v4,v2 );
/* .line 331 */
} // .end local v2 # "paramMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
} // :cond_0
return;
} // .end method
