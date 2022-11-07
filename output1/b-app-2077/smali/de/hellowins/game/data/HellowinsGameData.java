public class de.hellowins.game.data.HellowinsGameData {
	 /* .source "HellowinsGameData.java" */
	 /* # static fields */
	 public static java.lang.String GAME_RESULT;
	 /* # instance fields */
	 protected Integer points;
	 protected Long time;
	 /* # direct methods */
	 static de.hellowins.game.data.HellowinsGameData ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 22 */
		 final String v0 = "GAME_RESULT"; // const-string v0, "GAME_RESULT"
		 return;
	 } // .end method
	 public de.hellowins.game.data.HellowinsGameData ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 20 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 24 */
		 /* const-wide/16 v0, 0x0 */
		 /* iput-wide v0, p0, Lde/hellowins/game/data/HellowinsGameData;->time:J */
		 /* .line 26 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lde/hellowins/game/data/HellowinsGameData;->points:I */
		 /* .line 20 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String getData ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 61 */
		 final String v0 = "{}"; // const-string v0, "{}"
	 } // .end method
	 public Integer getPoints ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 33 */
		 /* iget v0, p0, Lde/hellowins/game/data/HellowinsGameData;->points:I */
	 } // .end method
	 public Long getTime ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 47 */
		 /* iget-wide v0, p0, Lde/hellowins/game/data/HellowinsGameData;->time:J */
		 /* return-wide v0 */
	 } // .end method
	 public void setPoints ( Integer p0 ) {
		 /* .locals 0 */
		 /* .param p1, "points" # I */
		 /* .prologue */
		 /* .line 40 */
		 /* iput p1, p0, Lde/hellowins/game/data/HellowinsGameData;->points:I */
		 /* .line 41 */
		 return;
	 } // .end method
	 public void setTime ( Long p0 ) {
		 /* .locals 0 */
		 /* .param p1, "time" # J */
		 /* .prologue */
		 /* .line 54 */
		 /* iput-wide p1, p0, Lde/hellowins/game/data/HellowinsGameData;->time:J */
		 /* .line 55 */
		 return;
	 } // .end method
