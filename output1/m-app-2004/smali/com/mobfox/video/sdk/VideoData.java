public class com.mobfox.video.sdk.VideoData implements java.io.Serializable {
	 /* .source "VideoData.java" */
	 /* # interfaces */
	 /* # static fields */
	 public static final Integer DELIVERY_PROGRESSIVE;
	 public static final Integer DELIVERY_STREAMING;
	 public static final Integer DISPLAY_FULLSCREEN;
	 public static final Integer DISPLAY_NORMAL;
	 public static final Integer OVERLAY_MARKUP;
	 public static final Integer OVERLAY_URL;
	 private static final Long serialVersionUID;
	 /* # instance fields */
	 Boolean allowTapNavigationBars;
	 Integer bitrate;
	 java.lang.String bottomNavigationBarBackground;
	 java.util.Vector completeEvents;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Vector", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
Integer delivery;
Integer display;
Integer duration;
Integer height;
java.lang.String htmlOverlayMarkup;
Integer htmlOverlayType;
java.lang.String htmlOverlayUrl;
java.util.Vector icons;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Vector", */
/* "<", */
/* "Lcom/mobfox/video/sdk/NavIconData;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
java.util.Vector muteEvents;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Vector", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
Integer orientation;
java.lang.String pauseButtonImage;
java.util.Vector pauseEvents;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Vector", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
java.lang.String playButtonImage;
java.lang.String replayButtonImage;
java.util.Vector replayEvents;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Vector", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
Boolean showBottomNavigationBar;
Boolean showHtmlOverlay;
Integer showHtmlOverlayAfter;
Boolean showNavigationBars;
Boolean showPauseButton;
Boolean showReplayButton;
Boolean showSkipButton;
Integer showSkipButtonAfter;
Boolean showTimer;
Boolean showTopNavigationBar;
java.lang.String skipButtonImage;
java.util.Vector skipEvents;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Vector", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
java.util.Vector startEvents;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Vector", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
java.util.HashMap timeTrackingEvents;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/Integer;", */
/* "Ljava/util/Vector", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;>;" */
/* } */
} // .end annotation
} // .end field
java.lang.String topNavigationBarBackground;
java.lang.String type;
java.util.Vector unmuteEvents;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Vector", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
java.util.Vector unpauseEvents;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Vector", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
java.lang.String videoUrl;
Integer width;
/* # direct methods */
public com.mobfox.video.sdk.VideoData ( ) {
/* .locals 1 */
/* .prologue */
/* .line 7 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 102 */
/* new-instance v0, Ljava/util/Vector; */
/* invoke-direct {v0}, Ljava/util/Vector;-><init>()V */
this.icons = v0;
/* .line 112 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.timeTrackingEvents = v0;
/* .line 113 */
/* new-instance v0, Ljava/util/Vector; */
/* invoke-direct {v0}, Ljava/util/Vector;-><init>()V */
this.startEvents = v0;
/* .line 114 */
/* new-instance v0, Ljava/util/Vector; */
/* invoke-direct {v0}, Ljava/util/Vector;-><init>()V */
this.completeEvents = v0;
/* .line 115 */
/* new-instance v0, Ljava/util/Vector; */
/* invoke-direct {v0}, Ljava/util/Vector;-><init>()V */
this.muteEvents = v0;
/* .line 116 */
/* new-instance v0, Ljava/util/Vector; */
/* invoke-direct {v0}, Ljava/util/Vector;-><init>()V */
this.unmuteEvents = v0;
/* .line 117 */
/* new-instance v0, Ljava/util/Vector; */
/* invoke-direct {v0}, Ljava/util/Vector;-><init>()V */
this.pauseEvents = v0;
/* .line 118 */
/* new-instance v0, Ljava/util/Vector; */
/* invoke-direct {v0}, Ljava/util/Vector;-><init>()V */
this.unpauseEvents = v0;
/* .line 119 */
/* new-instance v0, Ljava/util/Vector; */
/* invoke-direct {v0}, Ljava/util/Vector;-><init>()V */
this.skipEvents = v0;
/* .line 120 */
/* new-instance v0, Ljava/util/Vector; */
/* invoke-direct {v0}, Ljava/util/Vector;-><init>()V */
this.replayEvents = v0;
/* .line 127 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/mobfox/video/sdk/VideoData;->showHtmlOverlay:Z */
/* .line 7 */
return;
} // .end method
/* # virtual methods */
public java.lang.String toString ( ) {
/* .locals 2 */
/* .prologue */
/* .line 149 */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "VideoData \n[\norientation="; // const-string v1, "VideoData \n[\norientation="
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* iget v1, p0, Lcom/mobfox/video/sdk/VideoData;->orientation:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ",\ndisplay="; // const-string v1, ",\ndisplay="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 150 */
/* iget v1, p0, Lcom/mobfox/video/sdk/VideoData;->display:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ",\ndelivery="; // const-string v1, ",\ndelivery="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Lcom/mobfox/video/sdk/VideoData;->delivery:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ",\ntype="; // const-string v1, ",\ntype="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.type;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 151 */
final String v1 = ",\nbitrate="; // const-string v1, ",\nbitrate="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Lcom/mobfox/video/sdk/VideoData;->bitrate:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ",\nwidth="; // const-string v1, ",\nwidth="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Lcom/mobfox/video/sdk/VideoData;->width:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ",\nheight="; // const-string v1, ",\nheight="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 152 */
/* iget v1, p0, Lcom/mobfox/video/sdk/VideoData;->height:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ",\nvideoUrl="; // const-string v1, ",\nvideoUrl="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.videoUrl;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ",\nduration="; // const-string v1, ",\nduration="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 153 */
/* iget v1, p0, Lcom/mobfox/video/sdk/VideoData;->duration:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ",\nshowSkipButton="; // const-string v1, ",\nshowSkipButton="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-boolean v1, p0, Lcom/mobfox/video/sdk/VideoData;->showSkipButton:Z */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
/* .line 154 */
final String v1 = ",\nshowSkipButtonAfter="; // const-string v1, ",\nshowSkipButtonAfter="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Lcom/mobfox/video/sdk/VideoData;->showSkipButtonAfter:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
/* .line 155 */
final String v1 = ",\nskipButtonImage="; // const-string v1, ",\nskipButtonImage="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.skipButtonImage;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 156 */
final String v1 = ",\nshowNavigationBars="; // const-string v1, ",\nshowNavigationBars="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-boolean v1, p0, Lcom/mobfox/video/sdk/VideoData;->showNavigationBars:Z */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
/* .line 157 */
final String v1 = ",\nallowTapNavigationBars="; // const-string v1, ",\nallowTapNavigationBars="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-boolean v1, p0, Lcom/mobfox/video/sdk/VideoData;->allowTapNavigationBars:Z */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
/* .line 158 */
final String v1 = ",\nshowTopNavigationBar="; // const-string v1, ",\nshowTopNavigationBar="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-boolean v1, p0, Lcom/mobfox/video/sdk/VideoData;->showTopNavigationBar:Z */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
/* .line 159 */
final String v1 = ",\ntopNavigationBarBackground="; // const-string v1, ",\ntopNavigationBarBackground="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.topNavigationBarBackground;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 160 */
final String v1 = ",\nshowBottomNavigationBar="; // const-string v1, ",\nshowBottomNavigationBar="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-boolean v1, p0, Lcom/mobfox/video/sdk/VideoData;->showBottomNavigationBar:Z */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
/* .line 161 */
final String v1 = ",\nbottomNavigationBarBackground="; // const-string v1, ",\nbottomNavigationBarBackground="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 162 */
v1 = this.bottomNavigationBarBackground;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ",\nshowPauseButton="; // const-string v1, ",\nshowPauseButton="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 163 */
/* iget-boolean v1, p0, Lcom/mobfox/video/sdk/VideoData;->showPauseButton:Z */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
final String v1 = ",\npauseButtonImage="; // const-string v1, ",\npauseButtonImage="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.pauseButtonImage;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 164 */
final String v1 = ",\nplayButtonImage="; // const-string v1, ",\nplayButtonImage="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.playButtonImage;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 165 */
final String v1 = ",\nshowReplayButton="; // const-string v1, ",\nshowReplayButton="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-boolean v1, p0, Lcom/mobfox/video/sdk/VideoData;->showReplayButton:Z */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
/* .line 166 */
final String v1 = ",\nreplayButtonImage="; // const-string v1, ",\nreplayButtonImage="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.replayButtonImage;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ",\nshowTimer="; // const-string v1, ",\nshowTimer="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 167 */
/* iget-boolean v1, p0, Lcom/mobfox/video/sdk/VideoData;->showTimer:Z */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
final String v1 = ",\nicons="; // const-string v1, ",\nicons="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.icons;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = ",\ntimeTrackingEvents="; // const-string v1, ",\ntimeTrackingEvents="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 168 */
v1 = this.timeTrackingEvents;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = ",\nstartEvents="; // const-string v1, ",\nstartEvents="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.startEvents;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
/* .line 169 */
final String v1 = ",\ncompleteEvents="; // const-string v1, ",\ncompleteEvents="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.completeEvents;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = ",\nmuteEvents="; // const-string v1, ",\nmuteEvents="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 170 */
v1 = this.muteEvents;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = ",\nunmuteEvents="; // const-string v1, ",\nunmuteEvents="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.unmuteEvents;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
/* .line 171 */
final String v1 = ",\npauseEvents="; // const-string v1, ",\npauseEvents="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.pauseEvents;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = ",\nunpauseEvents="; // const-string v1, ",\nunpauseEvents="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 172 */
v1 = this.unpauseEvents;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = ",\nskipEvents="; // const-string v1, ",\nskipEvents="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.skipEvents;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
/* .line 173 */
final String v1 = ",\nreplayEvents="; // const-string v1, ",\nreplayEvents="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.replayEvents;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = ",\nshowHtmlOverlay="; // const-string v1, ",\nshowHtmlOverlay="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 174 */
/* iget-boolean v1, p0, Lcom/mobfox/video/sdk/VideoData;->showHtmlOverlay:Z */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
final String v1 = ",\nshowHtmlOverlayAfter="; // const-string v1, ",\nshowHtmlOverlayAfter="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 175 */
/* iget v1, p0, Lcom/mobfox/video/sdk/VideoData;->showHtmlOverlayAfter:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ",\nhtmlOverlayType="; // const-string v1, ",\nhtmlOverlayType="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 176 */
/* iget v1, p0, Lcom/mobfox/video/sdk/VideoData;->htmlOverlayType:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ",\nhtmlOverlayUrl="; // const-string v1, ",\nhtmlOverlayUrl="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.htmlOverlayUrl;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 177 */
final String v1 = ",\nhtmlOverlayMarkup="; // const-string v1, ",\nhtmlOverlayMarkup="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.htmlOverlayMarkup;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "\n]"; // const-string v1, "\n]"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 149 */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
