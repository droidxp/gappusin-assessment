public class com.wiyun.engine.afcanim.AFCClipMapping extends com.wiyun.engine.BaseWYObject {
	 /* .source "AFCClipMapping.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.afcanim.AFCClipMapping ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 21 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
		 /* .line 22 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.afcanim.AFCClipMapping ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 25 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseWYObject;-><init>(I)V */
		 /* .line 26 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.afcanim.AFCClipMapping ( ) {
		 /* .locals 0 */
		 /* .param p1, "dummy" # I */
		 /* .param p2, "tag" # I */
		 /* .prologue */
		 /* .line 105 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
		 /* .line 106 */
		 /* invoke-direct {p0, p2}, Lcom/wiyun/engine/afcanim/AFCClipMapping;->nativeInit(I)V */
		 /* .line 107 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.afcanim.AFCClipMapping ( ) {
		 /* .locals 0 */
		 /* .param p1, "dummy" # I */
		 /* .param p2, "tag" # I */
		 /* .param p3, "ammId" # I */
		 /* .prologue */
		 /* .line 109 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
		 /* .line 110 */
		 /* invoke-direct {p0, p2, p3}, Lcom/wiyun/engine/afcanim/AFCClipMapping;->nativeInit(II)V */
		 /* .line 111 */
		 return;
	 } // .end method
	 public com.wiyun.engine.afcanim.AFCClipMapping ( ) {
		 /* .locals 0 */
		 /* .param p1, "tag" # I */
		 /* .param p2, "mfsName" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 117 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
		 /* .line 118 */
		 /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/afcanim/AFCClipMapping;->nativeInit(ILjava/lang/String;)V */
		 /* .line 119 */
		 return;
	 } // .end method
	 public com.wiyun.engine.afcanim.AFCClipMapping ( ) {
		 /* .locals 0 */
		 /* .param p1, "tag" # I */
		 /* .param p2, "ammPath" # Ljava/lang/String; */
		 /* .param p3, "isFile" # Z */
		 /* .prologue */
		 /* .line 113 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
		 /* .line 114 */
		 /* invoke-direct {p0, p1, p2, p3}, Lcom/wiyun/engine/afcanim/AFCClipMapping;->nativeInit(ILjava/lang/String;Z)V */
		 /* .line 115 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.afcanim.AFCClipMapping from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 18 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/afcanim/AFCClipMapping; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/afcanim/AFCClipMapping;-><init>(I)V */
} // .end method
public static com.wiyun.engine.afcanim.AFCClipMapping make ( Integer p0 ) {
/* .locals 2 */
/* .param p0, "tag" # I */
/* .prologue */
/* .line 42 */
/* new-instance v0, Lcom/wiyun/engine/afcanim/AFCClipMapping; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, v1, p0}, Lcom/wiyun/engine/afcanim/AFCClipMapping;-><init>(II)V */
} // .end method
public static com.wiyun.engine.afcanim.AFCClipMapping makeAurora ( Integer p0, Integer p1 ) {
/* .locals 2 */
/* .param p0, "tag" # I */
/* .param p1, "ammId" # I */
/* .prologue */
/* .line 61 */
/* new-instance v0, Lcom/wiyun/engine/afcanim/AFCClipMapping; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, v1, p0, p1}, Lcom/wiyun/engine/afcanim/AFCClipMapping;-><init>(III)V */
} // .end method
public static com.wiyun.engine.afcanim.AFCClipMapping makeAurora ( Integer p0, java.lang.String p1, Boolean p2 ) {
/* .locals 1 */
/* .param p0, "tag" # I */
/* .param p1, "ammPath" # Ljava/lang/String; */
/* .param p2, "isFile" # Z */
/* .prologue */
/* .line 83 */
/* new-instance v0, Lcom/wiyun/engine/afcanim/AFCClipMapping; */
/* invoke-direct {v0, p0, p1, p2}, Lcom/wiyun/engine/afcanim/AFCClipMapping;-><init>(ILjava/lang/String;Z)V */
} // .end method
public static com.wiyun.engine.afcanim.AFCClipMapping makeMemoryAurora ( Integer p0, java.lang.String p1 ) {
/* .locals 1 */
/* .param p0, "tag" # I */
/* .param p1, "mfsName" # Ljava/lang/String; */
/* .prologue */
/* .line 102 */
/* new-instance v0, Lcom/wiyun/engine/afcanim/AFCClipMapping; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/afcanim/AFCClipMapping;-><init>(ILjava/lang/String;)V */
} // .end method
private native void nativeInit ( Integer p0 ) {
} // .end method
private native void nativeInit ( Integer p0, Integer p1 ) {
} // .end method
private native void nativeInit ( Integer p0, java.lang.String p1 ) {
} // .end method
private native void nativeInit ( Integer p0, java.lang.String p1, Boolean p2 ) {
} // .end method
/* # virtual methods */
public native Integer getTag ( ) {
} // .end method
public native void mapClip ( Integer p0, Integer p1 ) {
} // .end method
public native void mapClip ( Integer p0, Integer p1, Integer p2 ) {
} // .end method
public void mapClip ( Integer p0, com.wiyun.engine.opengl.Texture2D p1 ) {
/* .locals 1 */
/* .param p1, "fromClipIndex" # I */
/* .param p2, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
/* .prologue */
/* .line 235 */
com.wiyun.engine.types.WYPoint .makeZero ( );
(( com.wiyun.engine.afcanim.AFCClipMapping ) p0 ).mapClip ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Lcom/wiyun/engine/afcanim/AFCClipMapping;->mapClip(ILcom/wiyun/engine/opengl/Texture2D;Lcom/wiyun/engine/types/WYPoint;)V
/* .line 236 */
return;
} // .end method
public void mapClip ( Integer p0, com.wiyun.engine.opengl.Texture2D p1, com.wiyun.engine.types.WYPoint p2 ) {
/* .locals 3 */
/* .param p1, "fromClipIndex" # I */
/* .param p2, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
/* .param p3, "pos" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 218 */
v0 = (( com.wiyun.engine.opengl.Texture2D ) p2 ).getWidth ( ); // invoke-virtual {p2}, Lcom/wiyun/engine/opengl/Texture2D;->getWidth()F
v1 = (( com.wiyun.engine.opengl.Texture2D ) p2 ).getHeight ( ); // invoke-virtual {p2}, Lcom/wiyun/engine/opengl/Texture2D;->getHeight()F
com.wiyun.engine.types.WYRect .make ( v2,v2,v0,v1 );
(( com.wiyun.engine.afcanim.AFCClipMapping ) p0 ).mapClip ( p1, p2, p3, v0 ); // invoke-virtual {p0, p1, p2, p3, v0}, Lcom/wiyun/engine/afcanim/AFCClipMapping;->mapClip(ILcom/wiyun/engine/opengl/Texture2D;Lcom/wiyun/engine/types/WYPoint;Lcom/wiyun/engine/types/WYRect;)V
/* .line 219 */
return;
} // .end method
public void mapClip ( Integer p0, com.wiyun.engine.opengl.Texture2D p1, com.wiyun.engine.types.WYPoint p2, com.wiyun.engine.types.WYRect p3 ) {
/* .locals 7 */
/* .param p1, "fromClipIndex" # I */
/* .param p2, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
/* .param p3, "pos" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p4, "texRect" # Lcom/wiyun/engine/types/WYRect; */
/* .prologue */
/* .line 199 */
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
/* move-object v0, p0 */
/* move v1, p1 */
/* move-object v2, p2 */
/* move-object v3, p3 */
/* move-object v4, p4 */
/* invoke-virtual/range {v0 ..v6}, Lcom/wiyun/engine/afcanim/AFCClipMapping;->mapClip(ILcom/wiyun/engine/opengl/Texture2D;Lcom/wiyun/engine/types/WYPoint;Lcom/wiyun/engine/types/WYRect;ZF)V */
/* .line 200 */
return;
} // .end method
public native void mapClip ( Integer p0, com.wiyun.engine.opengl.Texture2D p1, com.wiyun.engine.types.WYPoint p2, com.wiyun.engine.types.WYRect p3, Boolean p4, Float p5 ) {
} // .end method
