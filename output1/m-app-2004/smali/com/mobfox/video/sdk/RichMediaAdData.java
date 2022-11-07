public class com.mobfox.video.sdk.RichMediaAdData implements java.io.Serializable {
	 /* .source "RichMediaAdData.java" */
	 /* # interfaces */
	 /* # static fields */
	 public static final Integer AD_FAILED;
	 public static final Integer ANIMATION_FADE_IN;
	 public static final Integer ANIMATION_FLIP_IN;
	 public static final Integer ANIMATION_NONE;
	 public static final Integer ANIMATION_SLIDE_IN_BOTTOM;
	 public static final Integer ANIMATION_SLIDE_IN_LEFT;
	 public static final Integer ANIMATION_SLIDE_IN_RIGHT;
	 public static final Integer ANIMATION_SLIDE_IN_TOP;
	 public static final Integer INTERSTITIAL;
	 public static final Integer INTERSTITIAL_TO_VIDEO;
	 public static final Integer NO_AD;
	 public static final Integer VIDEO;
	 public static final Integer VIDEO_TO_INTERSTITIAL;
	 private static final Long serialVersionUID;
	 /* # instance fields */
	 private Integer animation;
	 private com.mobfox.video.sdk.InterstitialData interstitial;
	 private Long timestamp;
	 private Integer type;
	 private com.mobfox.video.sdk.VideoData video;
	 /* # direct methods */
	 public com.mobfox.video.sdk.RichMediaAdData ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 5 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer getAnimation ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 38 */
		 /* iget v0, p0, Lcom/mobfox/video/sdk/RichMediaAdData;->animation:I */
	 } // .end method
	 public com.mobfox.video.sdk.InterstitialData getInterstitial ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 54 */
		 v0 = this.interstitial;
	 } // .end method
	 public Long getTimestamp ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 62 */
		 /* iget-wide v0, p0, Lcom/mobfox/video/sdk/RichMediaAdData;->timestamp:J */
		 /* return-wide v0 */
	 } // .end method
	 public Integer getType ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 30 */
		 /* iget v0, p0, Lcom/mobfox/video/sdk/RichMediaAdData;->type:I */
	 } // .end method
	 public com.mobfox.video.sdk.VideoData getVideo ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 46 */
		 v0 = this.video;
	 } // .end method
	 public void setAnimation ( Integer p0 ) {
		 /* .locals 0 */
		 /* .param p1, "animation" # I */
		 /* .prologue */
		 /* .line 42 */
		 /* iput p1, p0, Lcom/mobfox/video/sdk/RichMediaAdData;->animation:I */
		 /* .line 43 */
		 return;
	 } // .end method
	 public void setInterstitial ( com.mobfox.video.sdk.InterstitialData p0 ) {
		 /* .locals 0 */
		 /* .param p1, "interstitial" # Lcom/mobfox/video/sdk/InterstitialData; */
		 /* .prologue */
		 /* .line 58 */
		 this.interstitial = p1;
		 /* .line 59 */
		 return;
	 } // .end method
	 public void setTimestamp ( Long p0 ) {
		 /* .locals 0 */
		 /* .param p1, "timestamp" # J */
		 /* .prologue */
		 /* .line 66 */
		 /* iput-wide p1, p0, Lcom/mobfox/video/sdk/RichMediaAdData;->timestamp:J */
		 /* .line 67 */
		 return;
	 } // .end method
	 public void setType ( Integer p0 ) {
		 /* .locals 0 */
		 /* .param p1, "adType" # I */
		 /* .prologue */
		 /* .line 34 */
		 /* iput p1, p0, Lcom/mobfox/video/sdk/RichMediaAdData;->type:I */
		 /* .line 35 */
		 return;
	 } // .end method
	 public void setVideo ( com.mobfox.video.sdk.VideoData p0 ) {
		 /* .locals 0 */
		 /* .param p1, "video" # Lcom/mobfox/video/sdk/VideoData; */
		 /* .prologue */
		 /* .line 50 */
		 this.video = p1;
		 /* .line 51 */
		 return;
	 } // .end method
	 public java.lang.String toString ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* .line 71 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 final String v1 = "RichMediaAD [timestamp="; // const-string v1, "RichMediaAD [timestamp="
		 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 /* iget-wide v1, p0, Lcom/mobfox/video/sdk/RichMediaAdData;->timestamp:J */
		 (( java.lang.StringBuilder ) v0 ).append ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
		 final String v1 = ", type="; // const-string v1, ", type="
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget v1, p0, Lcom/mobfox/video/sdk/RichMediaAdData;->type:I */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 /* .line 72 */
		 final String v1 = ", animation="; // const-string v1, ", animation="
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget v1, p0, Lcom/mobfox/video/sdk/RichMediaAdData;->animation:I */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v1 = ", video="; // const-string v1, ", video="
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v1 = this.video;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 /* .line 73 */
		 final String v1 = ", interstitial="; // const-string v1, ", interstitial="
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v1 = this.interstitial;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 final String v1 = "]"; // const-string v1, "]"
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 71 */
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // .end method
