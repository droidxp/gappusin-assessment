class com.jumptap.adtag.events.EventManager$EventInteractionInfo {
	 /* .source "EventManager.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/jumptap/adtag/events/EventManager; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "EventInteractionInfo" */
} // .end annotation
/* # instance fields */
private Long endInteractionTime;
private Integer numOfInteractions;
private Long startInteractionTime;
final com.jumptap.adtag.events.EventManager this$0; //synthetic
/* # direct methods */
 com.jumptap.adtag.events.EventManager$EventInteractionInfo ( ) {
/* .locals 0 */
/* .prologue */
/* .line 346 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 347 */
(( com.jumptap.adtag.events.EventManager$EventInteractionInfo ) p0 ).reset ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/events/EventManager$EventInteractionInfo;->reset()V
/* .line 348 */
return;
} // .end method
/* # virtual methods */
public Long getDuration ( ) {
/* .locals 4 */
/* .prologue */
/* .line 372 */
/* iget-wide v0, p0, Lcom/jumptap/adtag/events/EventManager$EventInteractionInfo;->endInteractionTime:J */
/* iget-wide v2, p0, Lcom/jumptap/adtag/events/EventManager$EventInteractionInfo;->startInteractionTime:J */
/* sub-long/2addr v0, v2 */
/* return-wide v0 */
} // .end method
public Integer getNumOfInteractions ( ) {
/* .locals 1 */
/* .prologue */
/* .line 376 */
/* iget v0, p0, Lcom/jumptap/adtag/events/EventManager$EventInteractionInfo;->numOfInteractions:I */
} // .end method
public void interactionEnded ( ) {
/* .locals 4 */
/* .prologue */
/* .line 359 */
/* iget-wide v0, p0, Lcom/jumptap/adtag/events/EventManager$EventInteractionInfo;->startInteractionTime:J */
/* const-wide/16 v2, -0x1 */
/* cmp-long v0, v0, v2 */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 360 */
	 java.lang.System .currentTimeMillis ( );
	 /* move-result-wide v0 */
	 /* iput-wide v0, p0, Lcom/jumptap/adtag/events/EventManager$EventInteractionInfo;->endInteractionTime:J */
	 /* .line 362 */
} // :cond_0
final String v0 = "JtAd-Tracking"; // const-string v0, "JtAd-Tracking"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "interactionEnded: startInteractionTime="; // const-string v2, "interactionEnded: startInteractionTime="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-wide v2, p0, Lcom/jumptap/adtag/events/EventManager$EventInteractionInfo;->startInteractionTime:J */
(( java.lang.StringBuilder ) v1 ).append ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
final String v2 = " endInteractionTime="; // const-string v2, " endInteractionTime="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-wide v2, p0, Lcom/jumptap/adtag/events/EventManager$EventInteractionInfo;->endInteractionTime:J */
(( java.lang.StringBuilder ) v1 ).append ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v0,v1 );
/* .line 363 */
return;
} // .end method
public void interactionStarted ( ) {
/* .locals 4 */
/* .prologue */
/* .line 351 */
/* iget-wide v0, p0, Lcom/jumptap/adtag/events/EventManager$EventInteractionInfo;->startInteractionTime:J */
/* const-wide/16 v2, -0x1 */
/* cmp-long v0, v0, v2 */
/* if-nez v0, :cond_0 */
/* .line 352 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v0 */
/* iput-wide v0, p0, Lcom/jumptap/adtag/events/EventManager$EventInteractionInfo;->startInteractionTime:J */
/* .line 354 */
} // :cond_0
final String v0 = "JtAd-Tracking"; // const-string v0, "JtAd-Tracking"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "interactionStarted: startInteractionTime="; // const-string v2, "interactionStarted: startInteractionTime="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-wide v2, p0, Lcom/jumptap/adtag/events/EventManager$EventInteractionInfo;->startInteractionTime:J */
(( java.lang.StringBuilder ) v1 ).append ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
final String v2 = " endInteractionTime="; // const-string v2, " endInteractionTime="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-wide v2, p0, Lcom/jumptap/adtag/events/EventManager$EventInteractionInfo;->endInteractionTime:J */
(( java.lang.StringBuilder ) v1 ).append ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v0,v1 );
/* .line 355 */
/* iget v0, p0, Lcom/jumptap/adtag/events/EventManager$EventInteractionInfo;->numOfInteractions:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lcom/jumptap/adtag/events/EventManager$EventInteractionInfo;->numOfInteractions:I */
/* .line 356 */
return;
} // .end method
public void reset ( ) {
/* .locals 2 */
/* .prologue */
/* const-wide/16 v0, -0x1 */
/* .line 366 */
/* iput-wide v0, p0, Lcom/jumptap/adtag/events/EventManager$EventInteractionInfo;->startInteractionTime:J */
/* .line 367 */
/* iput-wide v0, p0, Lcom/jumptap/adtag/events/EventManager$EventInteractionInfo;->endInteractionTime:J */
/* .line 368 */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/jumptap/adtag/events/EventManager$EventInteractionInfo;->numOfInteractions:I */
/* .line 369 */
return;
} // .end method
