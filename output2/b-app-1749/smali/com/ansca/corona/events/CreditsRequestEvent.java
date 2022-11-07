public class com.ansca.corona.events.CreditsRequestEvent extends com.ansca.corona.events.Event {
	 /* .source "CreditsRequestEvent.java" */
	 /* # instance fields */
	 private Integer myNewPoints;
	 private Integer myTotalPoints;
	 /* # direct methods */
	 com.ansca.corona.events.CreditsRequestEvent ( ) {
		 /* .locals 0 */
		 /* .param p1, "newPoints" # I */
		 /* .param p2, "totalPoints" # I */
		 /* .prologue */
		 /* .line 9 */
		 /* invoke-direct {p0}, Lcom/ansca/corona/events/Event;-><init>()V */
		 /* .line 10 */
		 /* iput p1, p0, Lcom/ansca/corona/events/CreditsRequestEvent;->myNewPoints:I */
		 /* .line 11 */
		 /* iput p2, p0, Lcom/ansca/corona/events/CreditsRequestEvent;->myTotalPoints:I */
		 /* .line 12 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void Send ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 16 */
		 /* iget v0, p0, Lcom/ansca/corona/events/CreditsRequestEvent;->myNewPoints:I */
		 /* iget v1, p0, Lcom/ansca/corona/events/CreditsRequestEvent;->myTotalPoints:I */
		 com.ansca.corona.JavaToNativeShim .creditsRequestEvent ( v0,v1 );
		 /* .line 17 */
		 return;
	 } // .end method
