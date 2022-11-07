public class de.hellowins.game.data.HellowinsUserData {
	 /* .source "HellowinsUserData.java" */
	 /* # instance fields */
	 protected java.text.SimpleDateFormat dateFormat;
	 public Long playTime;
	 public java.lang.String rank;
	 public Long startTime;
	 public java.lang.String time;
	 /* # direct methods */
	 public de.hellowins.game.data.HellowinsUserData ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* const-wide/32 v1, 0x1d4c0 */
		 /* .line 7 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 9 */
		 final String v0 = "1/1"; // const-string v0, "1/1"
		 this.rank = v0;
		 /* .line 11 */
		 final String v0 = "02:00"; // const-string v0, "02:00"
		 this.time = v0;
		 /* .line 13 */
		 /* iput-wide v1, p0, Lde/hellowins/game/data/HellowinsUserData;->startTime:J */
		 /* .line 15 */
		 /* iput-wide v1, p0, Lde/hellowins/game/data/HellowinsUserData;->playTime:J */
		 /* .line 17 */
		 /* new-instance v0, Ljava/text/SimpleDateFormat; */
		 final String v1 = "mm:ss"; // const-string v1, "mm:ss"
		 /* invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V */
		 this.dateFormat = v0;
		 /* .line 7 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void calcPlayTime ( Long p0 ) {
		 /* .locals 4 */
		 /* .param p1, "dif" # J */
		 /* .prologue */
		 /* const-wide/16 v2, 0x0 */
		 /* .line 26 */
		 /* iget-wide v0, p0, Lde/hellowins/game/data/HellowinsUserData;->playTime:J */
		 /* sub-long/2addr v0, p1 */
		 /* iput-wide v0, p0, Lde/hellowins/game/data/HellowinsUserData;->playTime:J */
		 /* .line 27 */
		 /* iget-wide v0, p0, Lde/hellowins/game/data/HellowinsUserData;->playTime:J */
		 /* cmp-long v0, v0, v2 */
		 /* if-gez v0, :cond_0 */
		 /* .line 28 */
		 /* iput-wide v2, p0, Lde/hellowins/game/data/HellowinsUserData;->playTime:J */
		 /* .line 30 */
	 } // :cond_0
	 v0 = this.dateFormat;
	 /* new-instance v1, Ljava/util/Date; */
	 /* iget-wide v2, p0, Lde/hellowins/game/data/HellowinsUserData;->playTime:J */
	 /* invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V */
	 (( java.text.SimpleDateFormat ) v0 ).format ( v1 ); // invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
	 this.time = v0;
	 /* .line 31 */
	 return;
} // .end method
public void setPlayTime ( Long p0 ) {
	 /* .locals 2 */
	 /* .param p1, "t" # J */
	 /* .prologue */
	 /* .line 20 */
	 /* iput-wide p1, p0, Lde/hellowins/game/data/HellowinsUserData;->playTime:J */
	 /* .line 22 */
	 v0 = this.dateFormat;
	 /* new-instance v1, Ljava/util/Date; */
	 /* invoke-direct {v1, p1, p2}, Ljava/util/Date;-><init>(J)V */
	 (( java.text.SimpleDateFormat ) v0 ).format ( v1 ); // invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
	 this.time = v0;
	 /* .line 23 */
	 return;
} // .end method
