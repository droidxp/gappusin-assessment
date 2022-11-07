public class com.wiyun.engine.utils.ZwoptexManager {
	 /* .source "ZwoptexManager.java" */
	 /* # direct methods */
	 public com.wiyun.engine.utils.ZwoptexManager ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 18 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static void addZwoptex ( java.lang.String p0, Integer p1 ) {
		 /* .locals 1 */
		 /* .param p0, "name" # Ljava/lang/String; */
		 /* .param p1, "resId" # I */
		 /* .prologue */
		 /* .line 33 */
		 int v0 = 0; // const/4 v0, 0x0
		 com.wiyun.engine.utils.ZwoptexManager .addZwoptex ( p0,p1,v0 );
		 /* .line 34 */
		 return;
	 } // .end method
	 public static native void addZwoptex ( java.lang.String p0, Integer p1, com.wiyun.engine.opengl.Texture2D p2 ) {
	 } // .end method
	 public static void addZwoptex ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 1 */
		 /* .param p0, "name" # Ljava/lang/String; */
		 /* .param p1, "path" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 99 */
		 int v0 = 0; // const/4 v0, 0x0
		 com.wiyun.engine.utils.ZwoptexManager .addZwoptex ( p0,p1,v0 );
		 /* .line 100 */
		 return;
	 } // .end method
	 public static void addZwoptex ( java.lang.String p0, java.lang.String p1, Boolean p2 ) {
		 /* .locals 1 */
		 /* .param p0, "name" # Ljava/lang/String; */
		 /* .param p1, "path" # Ljava/lang/String; */
		 /* .param p2, "isFile" # Z */
		 /* .prologue */
		 /* .line 119 */
		 int v0 = 0; // const/4 v0, 0x0
		 com.wiyun.engine.utils.ZwoptexManager .addZwoptex ( p0,p1,p2,v0 );
		 /* .line 120 */
		 return;
	 } // .end method
	 public static native void addZwoptex ( java.lang.String p0, java.lang.String p1, Boolean p2, com.wiyun.engine.opengl.Texture2D p3 ) {
	 } // .end method
	 public static native void addZwoptex ( java.lang.String p0, java.lang.String p1, Boolean p2, com.wiyun.engine.opengl.Texture2D p3, Float p4 ) {
	 } // .end method
	 public static native Integer getFrameCount ( java.lang.String p0 ) {
	 } // .end method
	 public static native java.lang.String getFrameNames ( java.lang.String p0 ) {
	 } // .end method
	 public static com.wiyun.engine.types.WYRect getFrameRect ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* .param p0, "frameName" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 208 */
		 com.wiyun.engine.types.WYRect .makeZero ( );
		 /* .line 209 */
		 /* .local v0, "rect":Lcom/wiyun/engine/types/WYRect; */
		 com.wiyun.engine.utils.ZwoptexManager .nativeGetFrameRect ( p0,v0 );
		 /* .line 210 */
	 } // .end method
	 public static com.wiyun.engine.types.WYRect getFrameRect ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 1 */
		 /* .param p0, "zwoptexName" # Ljava/lang/String; */
		 /* .param p1, "frameName" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 183 */
		 com.wiyun.engine.types.WYRect .makeZero ( );
		 /* .line 184 */
		 /* .local v0, "rect":Lcom/wiyun/engine/types/WYRect; */
		 com.wiyun.engine.utils.ZwoptexManager .nativeGetFrameRect ( p0,p1,v0 );
		 /* .line 185 */
	 } // .end method
	 public static com.wiyun.engine.types.WYRect getFrameRects ( java.lang.String p0 ) {
		 /* .locals 2 */
		 /* .param p0, "zwoptexName" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 244 */
		 v1 = 		 com.wiyun.engine.utils.ZwoptexManager .getFrameCount ( p0 );
		 /* new-array v0, v1, [Lcom/wiyun/engine/types/WYRect; */
		 /* .line 245 */
		 /* .local v0, "ret":[Lcom/wiyun/engine/types/WYRect; */
		 com.wiyun.engine.utils.ZwoptexManager .nativeGetFrameRects ( p0,v0 );
		 /* .line 246 */
	 } // .end method
	 public static com.wiyun.engine.nodes.SpriteFrame getSpriteFrame ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* .param p0, "frameName" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 285 */
		 v0 = 		 com.wiyun.engine.utils.ZwoptexManager .nativeGetSpriteFrame ( p0 );
		 com.wiyun.engine.nodes.SpriteFrame .from ( v0 );
	 } // .end method
	 public static com.wiyun.engine.nodes.SpriteFrame getSpriteFrame ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 1 */
		 /* .param p0, "zwoptexName" # Ljava/lang/String; */
		 /* .param p1, "frameName" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 268 */
		 v0 = 		 com.wiyun.engine.utils.ZwoptexManager .nativeGetSpriteFrame ( p0,p1 );
		 com.wiyun.engine.nodes.SpriteFrame .from ( v0 );
	 } // .end method
	 public static native Boolean hasZwoptex ( java.lang.String p0 ) {
	 } // .end method
	 public static com.wiyun.engine.nodes.Button makeButton ( java.lang.String p0, com.wiyun.engine.utils.TargetSelector p1 ) {
		 /* .locals 1 */
		 /* .param p0, "frameName" # Ljava/lang/String; */
		 /* .param p1, "ts" # Lcom/wiyun/engine/utils/TargetSelector; */
		 /* .prologue */
		 /* .line 450 */
		 v0 = 		 com.wiyun.engine.utils.ZwoptexManager .nativeMakeButton ( p0,p1 );
		 com.wiyun.engine.nodes.Button .from ( v0 );
	 } // .end method
	 public static com.wiyun.engine.nodes.Button makeButton ( java.lang.String p0, java.lang.String p1, com.wiyun.engine.utils.TargetSelector p2, com.wiyun.engine.opengl.Texture2D p3 ) {
		 /* .locals 1 */
		 /* .param p0, "zwoptexName" # Ljava/lang/String; */
		 /* .param p1, "frameName" # Ljava/lang/String; */
		 /* .param p2, "ts" # Lcom/wiyun/engine/utils/TargetSelector; */
		 /* .param p3, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
		 /* .prologue */
		 /* .line 338 */
		 v0 = 		 com.wiyun.engine.utils.ZwoptexManager .nativeMakeButton ( p0,p1,p2,p3 );
		 com.wiyun.engine.nodes.Button .from ( v0 );
	 } // .end method
	 public static com.wiyun.engine.nodes.Sprite makeSprite ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* .param p0, "frameName" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 425 */
		 v0 = 		 com.wiyun.engine.utils.ZwoptexManager .nativeMakeSprite ( p0 );
		 com.wiyun.engine.nodes.Sprite .from ( v0 );
	 } // .end method
	 public static com.wiyun.engine.nodes.Sprite makeSprite ( java.lang.String p0, java.lang.String p1, com.wiyun.engine.opengl.Texture2D p2 ) {
		 /* .locals 1 */
		 /* .param p0, "zwoptexName" # Ljava/lang/String; */
		 /* .param p1, "frameName" # Ljava/lang/String; */
		 /* .param p2, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
		 /* .prologue */
		 /* .line 311 */
		 v0 = 		 com.wiyun.engine.utils.ZwoptexManager .nativeMakeSprite ( p0,p1,p2 );
		 com.wiyun.engine.nodes.Sprite .from ( v0 );
	 } // .end method
	 public static com.wiyun.engine.nodes.SpriteEx makeSpriteEx ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* .param p0, "frameName" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 473 */
		 v0 = 		 com.wiyun.engine.utils.ZwoptexManager .nativeMakeSpriteEx ( p0 );
		 com.wiyun.engine.nodes.SpriteEx .from ( v0 );
	 } // .end method
	 public static com.wiyun.engine.nodes.SpriteEx makeSpriteEx ( java.lang.String p0, java.lang.String p1, com.wiyun.engine.opengl.Texture2D p2 ) {
		 /* .locals 1 */
		 /* .param p0, "zwoptexName" # Ljava/lang/String; */
		 /* .param p1, "frameName" # Ljava/lang/String; */
		 /* .param p2, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
		 /* .prologue */
		 /* .line 363 */
		 v0 = 		 com.wiyun.engine.utils.ZwoptexManager .nativeMakeSpriteEx ( p0,p1,p2 );
		 com.wiyun.engine.nodes.SpriteEx .from ( v0 );
	 } // .end method
	 private static native void nativeGetFrameRect ( java.lang.String p0, com.wiyun.engine.types.WYRect p1 ) {
	 } // .end method
	 private static native void nativeGetFrameRect ( java.lang.String p0, java.lang.String p1, com.wiyun.engine.types.WYRect p2 ) {
	 } // .end method
	 private static native void nativeGetFrameRects ( java.lang.String p0, com.wiyun.engine.types.WYRect[] p1 ) {
	 } // .end method
	 private static native Integer nativeGetSpriteFrame ( java.lang.String p0 ) {
	 } // .end method
	 private static native Integer nativeGetSpriteFrame ( java.lang.String p0, java.lang.String p1 ) {
	 } // .end method
	 private static native Integer nativeMakeButton ( java.lang.String p0, com.wiyun.engine.utils.TargetSelector p1 ) {
	 } // .end method
	 private static native Integer nativeMakeButton ( java.lang.String p0, java.lang.String p1, com.wiyun.engine.utils.TargetSelector p2, com.wiyun.engine.opengl.Texture2D p3 ) {
	 } // .end method
	 private static native Integer nativeMakeSprite ( java.lang.String p0 ) {
	 } // .end method
	 private static native Integer nativeMakeSprite ( java.lang.String p0, java.lang.String p1, com.wiyun.engine.opengl.Texture2D p2 ) {
	 } // .end method
	 private static native Integer nativeMakeSpriteEx ( java.lang.String p0 ) {
	 } // .end method
	 private static native Integer nativeMakeSpriteEx ( java.lang.String p0, java.lang.String p1, com.wiyun.engine.opengl.Texture2D p2 ) {
	 } // .end method
	 public static native void removeAllZwoptex ( ) {
	 } // .end method
	 public static native void removeZwoptex ( java.lang.String p0 ) {
	 } // .end method
	 public static native void setZwoptexTexture ( java.lang.String p0, com.wiyun.engine.opengl.Texture2D p1 ) {
	 } // .end method
