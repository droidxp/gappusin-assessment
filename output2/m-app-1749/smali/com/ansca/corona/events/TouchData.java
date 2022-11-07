public class com.ansca.corona.events.TouchData {
	 /* .source "TouchData.java" */
	 /* # instance fields */
	 private Integer myId;
	 private Integer myPhase;
	 private Float myStartX;
	 private Float myStartY;
	 private Float myX;
	 private Float myY;
	 /* # direct methods */
	 public com.ansca.corona.events.TouchData ( ) {
		 /* .locals 1 */
		 /* .param p1, "id" # I */
		 /* .param p2, "x" # F */
		 /* .param p3, "y" # F */
		 /* .param p4, "phase" # I */
		 /* .prologue */
		 /* .line 11 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 9 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lcom/ansca/corona/events/TouchData;->myPhase:I */
		 /* .line 12 */
		 /* iput p1, p0, Lcom/ansca/corona/events/TouchData;->myId:I */
		 /* .line 13 */
		 /* iput p2, p0, Lcom/ansca/corona/events/TouchData;->myX:F */
		 /* .line 14 */
		 /* iput p3, p0, Lcom/ansca/corona/events/TouchData;->myY:F */
		 /* .line 15 */
		 /* iput p2, p0, Lcom/ansca/corona/events/TouchData;->myStartX:F */
		 /* .line 16 */
		 /* iput p3, p0, Lcom/ansca/corona/events/TouchData;->myStartY:F */
		 /* .line 17 */
		 /* iput p4, p0, Lcom/ansca/corona/events/TouchData;->myPhase:I */
		 /* .line 18 */
		 return;
	 } // .end method
	 public com.ansca.corona.events.TouchData ( ) {
		 /* .locals 4 */
		 /* .param p1, "rhs" # Lcom/ansca/corona/events/TouchData; */
		 /* .prologue */
		 /* .line 20 */
		 /* iget v0, p1, Lcom/ansca/corona/events/TouchData;->myId:I */
		 /* iget v1, p1, Lcom/ansca/corona/events/TouchData;->myX:F */
		 /* iget v2, p1, Lcom/ansca/corona/events/TouchData;->myY:F */
		 /* iget v3, p1, Lcom/ansca/corona/events/TouchData;->myPhase:I */
		 /* invoke-direct {p0, v0, v1, v2, v3}, Lcom/ansca/corona/events/TouchData;-><init>(IFFI)V */
		 /* .line 21 */
		 /* iget v0, p1, Lcom/ansca/corona/events/TouchData;->myStartX:F */
		 /* iput v0, p0, Lcom/ansca/corona/events/TouchData;->myStartX:F */
		 /* .line 22 */
		 /* iget v0, p1, Lcom/ansca/corona/events/TouchData;->myStartY:F */
		 /* iput v0, p0, Lcom/ansca/corona/events/TouchData;->myStartY:F */
		 /* .line 23 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer getId ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 25 */
		 /* iget v0, p0, Lcom/ansca/corona/events/TouchData;->myId:I */
	 } // .end method
	 public Integer getPhase ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 46 */
		 /* iget v0, p0, Lcom/ansca/corona/events/TouchData;->myPhase:I */
	 } // .end method
	 public Integer getStartX ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 40 */
		 /* iget v0, p0, Lcom/ansca/corona/events/TouchData;->myStartX:F */
		 /* float-to-int v0, v0 */
	 } // .end method
	 public Integer getStartY ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 43 */
		 /* iget v0, p0, Lcom/ansca/corona/events/TouchData;->myStartY:F */
		 /* float-to-int v0, v0 */
	 } // .end method
	 public Integer getX ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 28 */
		 /* iget v0, p0, Lcom/ansca/corona/events/TouchData;->myX:F */
		 /* float-to-int v0, v0 */
	 } // .end method
	 public Integer getY ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 31 */
		 /* iget v0, p0, Lcom/ansca/corona/events/TouchData;->myY:F */
		 /* float-to-int v0, v0 */
	 } // .end method
	 public void setPhase ( Integer p0 ) {
		 /* .locals 0 */
		 /* .param p1, "phase" # I */
		 /* .prologue */
		 /* .line 49 */
		 /* iput p1, p0, Lcom/ansca/corona/events/TouchData;->myPhase:I */
		 /* .line 50 */
		 return;
	 } // .end method
	 public void setX ( Float p0 ) {
		 /* .locals 0 */
		 /* .param p1, "x" # F */
		 /* .prologue */
		 /* .line 34 */
		 /* iput p1, p0, Lcom/ansca/corona/events/TouchData;->myX:F */
		 /* .line 35 */
		 return;
	 } // .end method
	 public void setY ( Float p0 ) {
		 /* .locals 0 */
		 /* .param p1, "y" # F */
		 /* .prologue */
		 /* .line 37 */
		 /* iput p1, p0, Lcom/ansca/corona/events/TouchData;->myY:F */
		 /* .line 38 */
		 return;
	 } // .end method
