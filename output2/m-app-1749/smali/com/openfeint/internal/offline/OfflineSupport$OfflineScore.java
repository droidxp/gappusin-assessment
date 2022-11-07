public class com.openfeint.internal.offline.OfflineSupport$OfflineScore {
	 /* .source "OfflineSupport.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/openfeint/internal/offline/OfflineSupport; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "OfflineScore" */
} // .end annotation
/* # instance fields */
public java.lang.String blobFileName;
public java.lang.String customData;
public java.lang.String displayText;
public java.lang.String leaderboardID;
public Long score;
public java.lang.String timestamp;
/* # direct methods */
public com.openfeint.internal.offline.OfflineSupport$OfflineScore ( ) {
/* .locals 0 */
/* .prologue */
/* .line 64 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public com.openfeint.internal.offline.OfflineSupport$OfflineScore dup ( ) {
/* .locals 3 */
/* .prologue */
/* .line 66 */
/* new-instance v0, Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore; */
/* invoke-direct {v0}, Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore;-><init>()V */
/* .line 67 */
/* .local v0, "rv":Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore; */
v1 = this.leaderboardID;
this.leaderboardID = v1;
/* .line 68 */
/* iget-wide v1, p0, Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore;->score:J */
/* iput-wide v1, v0, Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore;->score:J */
/* .line 69 */
v1 = this.displayText;
this.displayText = v1;
/* .line 70 */
v1 = this.customData;
this.customData = v1;
/* .line 71 */
v1 = this.blobFileName;
this.blobFileName = v1;
/* .line 72 */
v1 = this.timestamp;
this.timestamp = v1;
/* .line 73 */
} // .end method
public Boolean eq ( com.openfeint.internal.offline.OfflineSupport$OfflineScore p0 ) {
/* .locals 4 */
/* .param p1, "rhs" # Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore; */
/* .prologue */
/* .line 76 */
v0 = this.leaderboardID;
v1 = this.leaderboardID;
v0 = com.openfeint.internal.offline.OfflineSupport .access$000 ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* iget-wide v0, p0, Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore;->score:J */
	 /* iget-wide v2, p1, Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore;->score:J */
	 /* cmp-long v0, v0, v2 */
	 /* if-nez v0, :cond_0 */
	 v0 = this.displayText;
	 v1 = this.displayText;
	 v0 = 	 com.openfeint.internal.offline.OfflineSupport .access$000 ( v0,v1 );
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 v0 = this.customData;
		 v1 = this.customData;
		 v0 = 		 com.openfeint.internal.offline.OfflineSupport .access$000 ( v0,v1 );
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.blobFileName;
			 v1 = this.blobFileName;
			 v0 = 			 com.openfeint.internal.offline.OfflineSupport .access$000 ( v0,v1 );
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 v0 = this.timestamp;
				 v1 = this.timestamp;
				 v0 = 				 com.openfeint.internal.offline.OfflineSupport .access$000 ( v0,v1 );
				 if ( v0 != null) { // if-eqz v0, :cond_0
					 int v0 = 1; // const/4 v0, 0x1
				 } // :goto_0
			 } // :cond_0
			 int v0 = 0; // const/4 v0, 0x0
		 } // .end method
