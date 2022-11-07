class com.mobfox.video.sdk.CacheManager$Item implements java.io.Serializable {
	 /* .source "CacheManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/mobfox/video/sdk/CacheManager; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x8 */
/* name = "Item" */
} // .end annotation
/* # static fields */
private static final Long serialVersionUID;
/* # instance fields */
public Long expires;
public java.lang.String key;
public com.mobfox.video.sdk.CacheManager$Item next;
public com.mobfox.video.sdk.CacheManager$Item previous;
public java.lang.String value;
/* # direct methods */
public com.mobfox.video.sdk.CacheManager$Item ( ) {
/* .locals 0 */
/* .prologue */
/* .line 62 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 63 */
return;
} // .end method
public com.mobfox.video.sdk.CacheManager$Item ( ) {
/* .locals 0 */
/* .param p1, "k" # Ljava/lang/String; */
/* .param p2, "v" # Ljava/lang/String; */
/* .param p3, "e" # J */
/* .prologue */
/* .line 56 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 57 */
this.key = p1;
/* .line 58 */
this.value = p2;
/* .line 59 */
/* iput-wide p3, p0, Lcom/mobfox/video/sdk/CacheManager$Item;->expires:J */
/* .line 60 */
return;
} // .end method
