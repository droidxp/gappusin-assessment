public class com.ansca.corona.events.TouchEvent extends com.ansca.corona.events.Event {
	 /* .source "TouchEvent.java" */
	 /* # instance fields */
	 private com.ansca.corona.events.TouchData myData;
	 /* # direct methods */
	 com.ansca.corona.events.TouchEvent ( ) {
		 /* .locals 1 */
		 /* .param p1, "t" # Lcom/ansca/corona/events/TouchData; */
		 /* .prologue */
		 /* .line 9 */
		 /* invoke-direct {p0}, Lcom/ansca/corona/events/Event;-><init>()V */
		 /* .line 11 */
		 /* new-instance v0, Lcom/ansca/corona/events/TouchData; */
		 /* invoke-direct {v0, p1}, Lcom/ansca/corona/events/TouchData;-><init>(Lcom/ansca/corona/events/TouchData;)V */
		 this.myData = v0;
		 /* .line 12 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void Send ( ) {
		 /* .locals 7 */
		 /* .prologue */
		 /* .line 16 */
		 v6 = this.myData;
		 /* .line 17 */
		 /* .local v6, "t":Lcom/ansca/corona/events/TouchData; */
		 v0 = 		 (( com.ansca.corona.events.TouchData ) v6 ).getX ( ); // invoke-virtual {v6}, Lcom/ansca/corona/events/TouchData;->getX()I
		 v1 = 		 (( com.ansca.corona.events.TouchData ) v6 ).getY ( ); // invoke-virtual {v6}, Lcom/ansca/corona/events/TouchData;->getY()I
		 v2 = 		 (( com.ansca.corona.events.TouchData ) v6 ).getStartX ( ); // invoke-virtual {v6}, Lcom/ansca/corona/events/TouchData;->getStartX()I
		 v3 = 		 (( com.ansca.corona.events.TouchData ) v6 ).getStartY ( ); // invoke-virtual {v6}, Lcom/ansca/corona/events/TouchData;->getStartY()I
		 v4 = 		 (( com.ansca.corona.events.TouchData ) v6 ).getPhase ( ); // invoke-virtual {v6}, Lcom/ansca/corona/events/TouchData;->getPhase()I
		 v5 = 		 (( com.ansca.corona.events.TouchData ) v6 ).getId ( ); // invoke-virtual {v6}, Lcom/ansca/corona/events/TouchData;->getId()I
		 /* invoke-static/range {v0 ..v5}, Lcom/ansca/corona/JavaToNativeShim;->touchEvent(IIIIII)V */
		 /* .line 18 */
		 return;
	 } // .end method
