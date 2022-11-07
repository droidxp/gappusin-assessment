public class de.hellowins.game.data.HellowinsResponseData {
	 /* .source "HellowinsResponseData.java" */
	 /* # static fields */
	 public static Integer HELLOWINS_STATUS_IDLE;
	 public static Integer HELLOWINS_STATUS_RUNNING;
	 /* # instance fields */
	 protected Boolean gameRunning;
	 protected Integer highscore;
	 protected Integer status;
	 protected de.hellowins.game.data.HellowinsUserData userData;
	 /* # direct methods */
	 static de.hellowins.game.data.HellowinsResponseData ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 5 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 6 */
		 int v0 = 1; // const/4 v0, 0x1
		 return;
	 } // .end method
	 public de.hellowins.game.data.HellowinsResponseData ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 3 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 8 */
		 /* iput v0, p0, Lde/hellowins/game/data/HellowinsResponseData;->status:I */
		 /* .line 10 */
		 /* iput-boolean v1, p0, Lde/hellowins/game/data/HellowinsResponseData;->gameRunning:Z */
		 /* .line 12 */
		 /* iput v1, p0, Lde/hellowins/game/data/HellowinsResponseData;->highscore:I */
		 /* .line 14 */
		 /* new-instance v0, Lde/hellowins/game/data/HellowinsUserData; */
		 /* invoke-direct {v0}, Lde/hellowins/game/data/HellowinsUserData;-><init>()V */
		 this.userData = v0;
		 /* .line 3 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer getHighscore ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 46 */
		 /* iget v0, p0, Lde/hellowins/game/data/HellowinsResponseData;->highscore:I */
	 } // .end method
	 public Integer getRemainingPercent ( ) {
		 /* .locals 4 */
		 /* .prologue */
		 /* .line 69 */
		 v0 = this.userData;
		 /* iget-wide v0, v0, Lde/hellowins/game/data/HellowinsUserData;->playTime:J */
		 /* long-to-double v0, v0 */
		 v2 = this.userData;
		 /* iget-wide v2, v2, Lde/hellowins/game/data/HellowinsUserData;->startTime:J */
		 /* long-to-double v2, v2 */
		 /* div-double/2addr v0, v2 */
		 /* const-wide/high16 v2, 0x4059000000000000L # 100.0 */
		 /* mul-double/2addr v0, v2 */
		 /* double-to-int v0, v0 */
	 } // .end method
	 public Integer getStatus ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 17 */
		 /* iget v0, p0, Lde/hellowins/game/data/HellowinsResponseData;->status:I */
	 } // .end method
	 public de.hellowins.game.data.HellowinsUserData getUser ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 62 */
		 v0 = this.userData;
	 } // .end method
	 public Boolean isGameRunning ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 30 */
		 /* iget-boolean v0, p0, Lde/hellowins/game/data/HellowinsResponseData;->gameRunning:Z */
	 } // .end method
	 public void setHighscore ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p1, "hs" # I */
		 /* .prologue */
		 /* .line 53 */
		 /* iget v0, p0, Lde/hellowins/game/data/HellowinsResponseData;->highscore:I */
		 /* if-ge v0, p1, :cond_0 */
		 /* .line 54 */
		 /* iput p1, p0, Lde/hellowins/game/data/HellowinsResponseData;->highscore:I */
		 /* .line 56 */
	 } // :cond_0
	 return;
} // .end method
public void setRunning ( Boolean p0 ) {
	 /* .locals 1 */
	 /* .param p1, "running" # Z */
	 /* .prologue */
	 /* .line 34 */
	 /* iput-boolean p1, p0, Lde/hellowins/game/data/HellowinsResponseData;->gameRunning:Z */
	 /* .line 35 */
	 /* iget-boolean v0, p0, Lde/hellowins/game/data/HellowinsResponseData;->gameRunning:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 36 */
		 /* iput v0, p0, Lde/hellowins/game/data/HellowinsResponseData;->status:I */
		 /* .line 40 */
	 } // :goto_0
	 return;
	 /* .line 38 */
} // :cond_0
/* iput v0, p0, Lde/hellowins/game/data/HellowinsResponseData;->status:I */
} // .end method
public void setStatus ( Integer p0 ) {
/* .locals 0 */
/* .param p1, "status" # I */
/* .prologue */
/* .line 21 */
/* iput p1, p0, Lde/hellowins/game/data/HellowinsResponseData;->status:I */
/* .line 22 */
return;
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .prologue */
/* .line 74 */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "HellowinsUpdateData: "; // const-string v1, "HellowinsUpdateData: "
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String; */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
