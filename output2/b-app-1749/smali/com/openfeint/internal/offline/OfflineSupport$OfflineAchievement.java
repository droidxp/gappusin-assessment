public class com.openfeint.internal.offline.OfflineSupport$OfflineAchievement {
	 /* .source "OfflineSupport.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/openfeint/internal/offline/OfflineSupport; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "OfflineAchievement" */
} // .end annotation
/* # instance fields */
public Float clientCompletionPercentage;
public java.lang.String resourceID;
public Float serverCompletionPercentage;
public java.lang.String timestamp;
/* # direct methods */
public com.openfeint.internal.offline.OfflineSupport$OfflineAchievement ( ) {
/* .locals 0 */
/* .prologue */
/* .line 41 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public com.openfeint.internal.offline.OfflineSupport$OfflineAchievement dup ( ) {
/* .locals 2 */
/* .prologue */
/* .line 43 */
/* new-instance v0, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement; */
/* invoke-direct {v0}, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;-><init>()V */
/* .line 44 */
/* .local v0, "rv":Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement; */
v1 = this.resourceID;
this.resourceID = v1;
/* .line 45 */
/* iget v1, p0, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;->clientCompletionPercentage:F */
/* iput v1, v0, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;->clientCompletionPercentage:F */
/* .line 46 */
/* iget v1, p0, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;->serverCompletionPercentage:F */
/* iput v1, v0, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;->serverCompletionPercentage:F */
/* .line 47 */
v1 = this.timestamp;
this.timestamp = v1;
/* .line 48 */
} // .end method
public Boolean eq ( com.openfeint.internal.offline.OfflineSupport$OfflineAchievement p0 ) {
/* .locals 2 */
/* .param p1, "rhs" # Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement; */
/* .prologue */
/* .line 51 */
v0 = this.resourceID;
v1 = this.resourceID;
v0 = com.openfeint.internal.offline.OfflineSupport .access$000 ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* iget v0, p0, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;->clientCompletionPercentage:F */
	 /* iget v1, p1, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;->clientCompletionPercentage:F */
	 /* cmpl-float v0, v0, v1 */
	 /* if-nez v0, :cond_0 */
	 /* iget v0, p0, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;->serverCompletionPercentage:F */
	 /* iget v1, p1, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;->serverCompletionPercentage:F */
	 /* cmpl-float v0, v0, v1 */
	 /* if-nez v0, :cond_0 */
	 v0 = this.timestamp;
	 v1 = this.timestamp;
	 v0 = 	 com.openfeint.internal.offline.OfflineSupport .access$000 ( v0,v1 );
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 int v0 = 1; // const/4 v0, 0x1
	 } // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
