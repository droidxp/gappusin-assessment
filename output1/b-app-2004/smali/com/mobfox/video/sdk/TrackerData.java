public class com.mobfox.video.sdk.TrackerData implements java.io.Serializable {
	 /* .source "TrackerData.java" */
	 /* # interfaces */
	 /* # static fields */
	 public static final Integer TYPE_COMPLETE;
	 public static final Integer TYPE_FIRSTQUARTILE;
	 public static final Integer TYPE_MIDPOINT;
	 public static final Integer TYPE_MUTE;
	 public static final Integer TYPE_PAUSE;
	 public static final Integer TYPE_REPLAY;
	 public static final Integer TYPE_SKIP;
	 public static final Integer TYPE_START;
	 public static final Integer TYPE_THIRDQUARTILE;
	 public static final Integer TYPE_TIME;
	 public static final Integer TYPE_UNMUTE;
	 public static final Integer TYPE_UNPAUSE;
	 private static final Long serialVersionUID;
	 /* # instance fields */
	 Integer time;
	 Integer type;
	 java.lang.String url;
	 /* # direct methods */
	 public com.mobfox.video.sdk.TrackerData ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 5 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void reset ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 int v1 = -1; // const/4 v1, -0x1
		 /* .line 26 */
		 int v0 = 0; // const/4 v0, 0x0
		 this.url = v0;
		 /* .line 27 */
		 /* iput v1, p0, Lcom/mobfox/video/sdk/TrackerData;->type:I */
		 /* .line 28 */
		 /* iput v1, p0, Lcom/mobfox/video/sdk/TrackerData;->time:I */
		 /* .line 29 */
		 return;
	 } // .end method
