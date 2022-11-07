public class com.wiyun.engine.nodes.Label extends com.wiyun.engine.nodes.TextureNode implements com.wiyun.engine.nodes.Node$IColorableLabel implements com.wiyun.engine.nodes.Node$ISizable {
	 /* .source "Label.java" */
	 /* # interfaces */
	 /* # direct methods */
	 protected com.wiyun.engine.nodes.Label ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 169 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/TextureNode;-><init>(I)V */
		 /* .line 170 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.Label ( ) {
		 /* .locals 7 */
		 /* .param p1, "string" # Ljava/lang/String; */
		 /* .param p2, "fontSize" # F */
		 /* .param p3, "style" # I */
		 /* .param p4, "fontName" # Ljava/lang/String; */
		 /* .param p5, "width" # F */
		 /* .param p6, "alignment" # I */
		 /* .prologue */
		 /* .line 151 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/TextureNode;-><init>()V */
		 /* .line 152 */
		 v2 = 		 com.wiyun.engine.utils.ResolutionIndependent .resolveSp ( p2 );
		 /* move-object v0, p0 */
		 /* move-object v1, p1 */
		 /* move v3, p3 */
		 /* move-object v4, p4 */
		 /* move v5, p5 */
		 /* move v6, p6 */
		 /* invoke-direct/range {v0 ..v6}, Lcom/wiyun/engine/nodes/Label;->nativeInit(Ljava/lang/String;FILjava/lang/String;FI)V */
		 /* .line 153 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.Label ( ) {
		 /* .locals 7 */
		 /* .param p1, "string" # Ljava/lang/String; */
		 /* .param p2, "fontSize" # F */
		 /* .param p3, "fontPath" # Ljava/lang/String; */
		 /* .param p4, "isFile" # Z */
		 /* .param p5, "width" # F */
		 /* .param p6, "alignment" # I */
		 /* .prologue */
		 /* .line 147 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/TextureNode;-><init>()V */
		 /* .line 148 */
		 v2 = 		 com.wiyun.engine.utils.ResolutionIndependent .resolveSp ( p2 );
		 /* move-object v0, p0 */
		 /* move-object v1, p1 */
		 /* move-object v3, p3 */
		 /* move v4, p4 */
		 /* move v5, p5 */
		 /* move v6, p6 */
		 /* invoke-direct/range {v0 ..v6}, Lcom/wiyun/engine/nodes/Label;->nativeInit(Ljava/lang/String;FLjava/lang/String;ZFI)V */
		 /* .line 149 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.Label from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 165 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/Label; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/Label;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.TextureNode from ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
com.wiyun.engine.nodes.Label .from ( p0 );
} // .end method
public static com.wiyun.engine.nodes.Label make ( java.lang.String p0 ) {
/* .locals 6 */
/* .param p0, "string" # Ljava/lang/String; */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 19 */
/* const/high16 v1, 0x42000000 # 32.0f */
final String v3 = "DroidSans"; // const-string v3, "DroidSans"
int v4 = 0; // const/4 v4, 0x0
/* move-object v0, p0 */
/* move v5, v2 */
/* invoke-static/range {v0 ..v5}, Lcom/wiyun/engine/nodes/Label;->make(Ljava/lang/String;FILjava/lang/String;FI)Lcom/wiyun/engine/nodes/Label; */
} // .end method
public static com.wiyun.engine.nodes.Label make ( java.lang.String p0, Float p1 ) {
/* .locals 6 */
/* .param p0, "string" # Ljava/lang/String; */
/* .param p1, "fontSize" # F */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 30 */
final String v3 = "DroidSans"; // const-string v3, "DroidSans"
int v4 = 0; // const/4 v4, 0x0
/* move-object v0, p0 */
/* move v1, p1 */
/* move v5, v2 */
/* invoke-static/range {v0 ..v5}, Lcom/wiyun/engine/nodes/Label;->make(Ljava/lang/String;FILjava/lang/String;FI)Lcom/wiyun/engine/nodes/Label; */
} // .end method
public static com.wiyun.engine.nodes.Label make ( java.lang.String p0, Float p1, Integer p2 ) {
/* .locals 7 */
/* .param p0, "string" # Ljava/lang/String; */
/* .param p1, "fontSize" # F */
/* .param p2, "style" # I */
/* .prologue */
/* .line 42 */
/* new-instance v0, Lcom/wiyun/engine/nodes/Label; */
final String v4 = "DroidSans"; // const-string v4, "DroidSans"
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
/* move-object v1, p0 */
/* move v2, p1 */
/* move v3, p2 */
/* invoke-direct/range {v0 ..v6}, Lcom/wiyun/engine/nodes/Label;-><init>(Ljava/lang/String;FILjava/lang/String;FI)V */
} // .end method
public static com.wiyun.engine.nodes.Label make ( java.lang.String p0, Float p1, Integer p2, java.lang.String p3 ) {
/* .locals 7 */
/* .param p0, "string" # Ljava/lang/String; */
/* .param p1, "fontSize" # F */
/* .param p2, "style" # I */
/* .param p3, "fontName" # Ljava/lang/String; */
/* .prologue */
/* .line 55 */
/* new-instance v0, Lcom/wiyun/engine/nodes/Label; */
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
/* move-object v1, p0 */
/* move v2, p1 */
/* move v3, p2 */
/* move-object v4, p3 */
/* invoke-direct/range {v0 ..v6}, Lcom/wiyun/engine/nodes/Label;-><init>(Ljava/lang/String;FILjava/lang/String;FI)V */
} // .end method
public static com.wiyun.engine.nodes.Label make ( java.lang.String p0, Float p1, Integer p2, java.lang.String p3, Float p4 ) {
/* .locals 7 */
/* .param p0, "string" # Ljava/lang/String; */
/* .param p1, "fontSize" # F */
/* .param p2, "style" # I */
/* .param p3, "fontName" # Ljava/lang/String; */
/* .param p4, "width" # F */
/* .prologue */
/* .line 69 */
/* new-instance v0, Lcom/wiyun/engine/nodes/Label; */
int v6 = 0; // const/4 v6, 0x0
/* move-object v1, p0 */
/* move v2, p1 */
/* move v3, p2 */
/* move-object v4, p3 */
/* move v5, p4 */
/* invoke-direct/range {v0 ..v6}, Lcom/wiyun/engine/nodes/Label;-><init>(Ljava/lang/String;FILjava/lang/String;FI)V */
} // .end method
public static com.wiyun.engine.nodes.Label make ( java.lang.String p0, Float p1, Integer p2, java.lang.String p3, Float p4, Integer p5 ) {
/* .locals 7 */
/* .param p0, "string" # Ljava/lang/String; */
/* .param p1, "fontSize" # F */
/* .param p2, "style" # I */
/* .param p3, "fontName" # Ljava/lang/String; */
/* .param p4, "width" # F */
/* .param p5, "alignment" # I */
/* .prologue */
/* .line 87 */
/* new-instance v0, Lcom/wiyun/engine/nodes/Label; */
/* move-object v1, p0 */
/* move v2, p1 */
/* move v3, p2 */
/* move-object v4, p3 */
/* move v5, p4 */
/* move v6, p5 */
/* invoke-direct/range {v0 ..v6}, Lcom/wiyun/engine/nodes/Label;-><init>(Ljava/lang/String;FILjava/lang/String;FI)V */
} // .end method
public static com.wiyun.engine.nodes.Label make ( java.lang.String p0, Float p1, java.lang.String p2 ) {
/* .locals 7 */
/* .param p0, "string" # Ljava/lang/String; */
/* .param p1, "fontSize" # F */
/* .param p2, "fontPath" # Ljava/lang/String; */
/* .prologue */
int v4 = 0; // const/4 v4, 0x0
/* .line 99 */
/* new-instance v0, Lcom/wiyun/engine/nodes/Label; */
int v5 = 0; // const/4 v5, 0x0
/* move-object v1, p0 */
/* move v2, p1 */
/* move-object v3, p2 */
/* move v6, v4 */
/* invoke-direct/range {v0 ..v6}, Lcom/wiyun/engine/nodes/Label;-><init>(Ljava/lang/String;FLjava/lang/String;ZFI)V */
} // .end method
public static com.wiyun.engine.nodes.Label make ( java.lang.String p0, Float p1, java.lang.String p2, Boolean p3 ) {
/* .locals 7 */
/* .param p0, "string" # Ljava/lang/String; */
/* .param p1, "fontSize" # F */
/* .param p2, "fontPath" # Ljava/lang/String; */
/* .param p3, "isFile" # Z */
/* .prologue */
/* .line 112 */
/* new-instance v0, Lcom/wiyun/engine/nodes/Label; */
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
/* move-object v1, p0 */
/* move v2, p1 */
/* move-object v3, p2 */
/* move v4, p3 */
/* invoke-direct/range {v0 ..v6}, Lcom/wiyun/engine/nodes/Label;-><init>(Ljava/lang/String;FLjava/lang/String;ZFI)V */
} // .end method
public static com.wiyun.engine.nodes.Label make ( java.lang.String p0, Float p1, java.lang.String p2, Boolean p3, Float p4 ) {
/* .locals 7 */
/* .param p0, "string" # Ljava/lang/String; */
/* .param p1, "fontSize" # F */
/* .param p2, "fontPath" # Ljava/lang/String; */
/* .param p3, "isFile" # Z */
/* .param p4, "width" # F */
/* .prologue */
/* .line 126 */
/* new-instance v0, Lcom/wiyun/engine/nodes/Label; */
int v6 = 0; // const/4 v6, 0x0
/* move-object v1, p0 */
/* move v2, p1 */
/* move-object v3, p2 */
/* move v4, p3 */
/* move v5, p4 */
/* invoke-direct/range {v0 ..v6}, Lcom/wiyun/engine/nodes/Label;-><init>(Ljava/lang/String;FLjava/lang/String;ZFI)V */
} // .end method
public static com.wiyun.engine.nodes.Label make ( java.lang.String p0, Float p1, java.lang.String p2, Boolean p3, Float p4, Integer p5 ) {
/* .locals 7 */
/* .param p0, "string" # Ljava/lang/String; */
/* .param p1, "fontSize" # F */
/* .param p2, "fontPath" # Ljava/lang/String; */
/* .param p3, "isFile" # Z */
/* .param p4, "width" # F */
/* .param p5, "alignment" # I */
/* .prologue */
/* .line 144 */
/* new-instance v0, Lcom/wiyun/engine/nodes/Label; */
/* move-object v1, p0 */
/* move v2, p1 */
/* move-object v3, p2 */
/* move v4, p3 */
/* move v5, p4 */
/* move v6, p5 */
/* invoke-direct/range {v0 ..v6}, Lcom/wiyun/engine/nodes/Label;-><init>(Ljava/lang/String;FLjava/lang/String;ZFI)V */
} // .end method
private native void nativeInit ( java.lang.String p0, Float p1, Integer p2, java.lang.String p3, Float p4, Integer p5 ) {
} // .end method
private native void nativeInit ( java.lang.String p0, Float p1, java.lang.String p2, Boolean p3, Float p4, Integer p5 ) {
} // .end method
/* # virtual methods */
protected void doNativeInit ( ) {
/* .locals 0 */
/* .prologue */
/* .line 174 */
return;
} // .end method
public native Integer getAlignment ( ) {
} // .end method
public native java.lang.String getFontName ( ) {
} // .end method
public native java.lang.String getFontPath ( ) {
} // .end method
public native Float getFontSize ( ) {
} // .end method
public native Integer getFontStyle ( ) {
} // .end method
public native Float getLineWidth ( ) {
} // .end method
public native java.lang.String getText ( ) {
} // .end method
public native Boolean isFileFontPath ( ) {
} // .end method
public native void setAlignment ( Integer p0 ) {
} // .end method
public native void setFontName ( java.lang.String p0 ) {
} // .end method
public native void setFontPath ( java.lang.String p0, Boolean p1 ) {
} // .end method
public native void setFontSize ( Float p0 ) {
} // .end method
public native void setFontStyle ( Integer p0 ) {
} // .end method
public native void setLineWidth ( Float p0 ) {
} // .end method
public native void setText ( java.lang.String p0 ) {
} // .end method
