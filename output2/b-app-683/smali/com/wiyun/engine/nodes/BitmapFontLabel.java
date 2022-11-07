public class com.wiyun.engine.nodes.BitmapFontLabel extends com.wiyun.engine.nodes.Node {
	 /* .source "BitmapFontLabel.java" */
	 /* # static fields */
	 public static final Integer CENTER;
	 public static final Integer LEFT;
	 public static final Integer RIGHT;
	 /* # direct methods */
	 protected com.wiyun.engine.nodes.BitmapFontLabel ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 67 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;-><init>()V */
		 /* .line 68 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.BitmapFontLabel ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 57 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Node;-><init>(I)V */
		 /* .line 58 */
		 return;
	 } // .end method
	 public com.wiyun.engine.nodes.BitmapFontLabel ( ) {
		 /* .locals 0 */
		 /* .param p1, "font" # Lcom/wiyun/engine/utils/BitmapFont; */
		 /* .param p2, "text" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 78 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;-><init>()V */
		 /* .line 79 */
		 /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/nodes/BitmapFontLabel;->nativeInit(Lcom/wiyun/engine/utils/BitmapFont;Ljava/lang/String;)V */
		 /* .line 80 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.BitmapFontLabel from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 53 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/BitmapFontLabel; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/BitmapFontLabel;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.Node from ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
com.wiyun.engine.nodes.BitmapFontLabel .from ( p0 );
} // .end method
public static com.wiyun.engine.nodes.BitmapFontLabel make ( com.wiyun.engine.utils.BitmapFont p0, java.lang.String p1 ) {
/* .locals 1 */
/* .param p0, "font" # Lcom/wiyun/engine/utils/BitmapFont; */
/* .param p1, "text" # Ljava/lang/String; */
/* .prologue */
/* .line 49 */
/* new-instance v0, Lcom/wiyun/engine/nodes/BitmapFontLabel; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/nodes/BitmapFontLabel;-><init>(Lcom/wiyun/engine/utils/BitmapFont;Ljava/lang/String;)V */
} // .end method
private native void nativeGetColor ( com.wiyun.engine.types.WYColor3B p0 ) {
} // .end method
private native void nativeGetFont ( com.wiyun.engine.utils.BitmapFont p0 ) {
} // .end method
private native void nativeInit ( com.wiyun.engine.utils.BitmapFont p0, java.lang.String p1 ) {
} // .end method
/* # virtual methods */
protected void doNativeInit ( ) {
/* .locals 0 */
/* .prologue */
/* .line 62 */
return;
} // .end method
public native Integer getAlignment ( ) {
} // .end method
public native Integer getAlpha ( ) {
} // .end method
public com.wiyun.engine.types.WYColor3B getColor ( ) {
/* .locals 1 */
/* .prologue */
/* .line 127 */
/* new-instance v0, Lcom/wiyun/engine/types/WYColor3B; */
/* invoke-direct {v0}, Lcom/wiyun/engine/types/WYColor3B;-><init>()V */
/* .line 128 */
/* .local v0, "color":Lcom/wiyun/engine/types/WYColor3B; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/BitmapFontLabel;->nativeGetColor(Lcom/wiyun/engine/types/WYColor3B;)V */
/* .line 129 */
} // .end method
public com.wiyun.engine.utils.BitmapFont getFont ( ) {
/* .locals 1 */
/* .prologue */
/* .line 95 */
/* new-instance v0, Lcom/wiyun/engine/utils/BitmapFont; */
/* invoke-direct {v0}, Lcom/wiyun/engine/utils/BitmapFont;-><init>()V */
/* .line 96 */
/* .local v0, "font":Lcom/wiyun/engine/utils/BitmapFont; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/BitmapFontLabel;->nativeGetFont(Lcom/wiyun/engine/utils/BitmapFont;)V */
/* .line 97 */
} // .end method
public native Float getLineSpacing ( ) {
} // .end method
public native Float getLineWidth ( ) {
} // .end method
public native Float getSpaceWidth ( ) {
} // .end method
public native Integer getTabSize ( ) {
} // .end method
public native java.lang.String getText ( ) {
} // .end method
public native void setAlignment ( Integer p0 ) {
} // .end method
public native void setAlpha ( Integer p0 ) {
} // .end method
public native void setColor ( com.wiyun.engine.types.WYColor3B p0 ) {
} // .end method
public native void setFont ( com.wiyun.engine.utils.BitmapFont p0 ) {
} // .end method
public native void setLineSpacing ( Float p0 ) {
} // .end method
public native void setLineWidth ( Float p0 ) {
} // .end method
public native void setSpaceWidth ( Float p0 ) {
} // .end method
public native void setTabSize ( Integer p0 ) {
} // .end method
public native void setText ( java.lang.String p0 ) {
} // .end method
