public class com.emman.vog.MenuScene extends com.wiyun.engine.nodes.Scene {
	 /* .source "MenuScene.java" */
	 /* # instance fields */
	 com.wiyun.engine.nodes.Sprite bubble;
	 com.wiyun.engine.types.WYSize s;
	 /* # direct methods */
	 public com.emman.vog.MenuScene ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 int v1 = 1; // const/4 v1, 0x1
		 /* .line 19 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Scene;-><init>()V */
		 /* .line 20 */
		 com.wiyun.engine.nodes.Director .getInstance ( );
		 (( com.wiyun.engine.nodes.Director ) v0 ).getWindowSize ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->getWindowSize()Lcom/wiyun/engine/types/WYSize;
		 this.s = v0;
		 /* .line 21 */
		 (( com.emman.vog.MenuScene ) p0 ).background ( ); // invoke-virtual {p0}, Lcom/emman/vog/MenuScene;->background()V
		 /* .line 23 */
		 (( com.emman.vog.MenuScene ) p0 ).autoRelease ( v1 ); // invoke-virtual {p0, v1}, Lcom/emman/vog/MenuScene;->autoRelease(Z)Lcom/wiyun/engine/nodes/Node;
		 /* .line 24 */
		 (( com.emman.vog.MenuScene ) p0 ).setNoDraw ( v1 ); // invoke-virtual {p0, v1}, Lcom/emman/vog/MenuScene;->setNoDraw(Z)V
		 /* .line 25 */
		 return;
	 } // .end method
	 private void addMenu ( ) {
		 /* .locals 10 */
		 /* .prologue */
		 /* const/high16 v9, 0x43270000 # 167.0f */
		 /* const/high16 v8, 0x42e80000 # 116.0f */
		 int v7 = 0; // const/4 v7, 0x0
		 /* .line 47 */
		 /* const v6, 0x7f020064 */
		 com.wiyun.engine.opengl.Texture2D .makePNG ( v6 );
		 /* .line 48 */
		 /* .local v4, "tex21":Lcom/wiyun/engine/opengl/Texture2D; */
		 /* const v6, 0x7f020065 */
		 com.wiyun.engine.opengl.Texture2D .makePNG ( v6 );
		 /* .line 50 */
		 /* .local v5, "tex22":Lcom/wiyun/engine/opengl/Texture2D; */
		 com.wiyun.engine.types.WYRect .make ( v7,v7,v9,v8 );
		 com.wiyun.engine.utils.ResolutionIndependent .resolve ( v6 );
		 /* .line 49 */
		 com.wiyun.engine.nodes.Sprite .make ( v4,v6 );
		 /* .line 52 */
		 /* .local v2, "playNormal":Lcom/wiyun/engine/nodes/Sprite; */
		 com.wiyun.engine.types.WYRect .make ( v7,v7,v9,v8 );
		 com.wiyun.engine.utils.ResolutionIndependent .resolve ( v6 );
		 /* .line 51 */
		 com.wiyun.engine.nodes.Sprite .make ( v5,v6 );
		 /* .line 54 */
		 /* .local v3, "playSelected":Lcom/wiyun/engine/nodes/Sprite; */
		 final String v6 = "playGame"; // const-string v6, "playGame"
		 /* .line 53 */
		 com.wiyun.engine.nodes.MenuItemSprite .make ( v2,v3,v3,p0,v6 );
		 /* .line 55 */
		 /* .local v1, "play":Lcom/wiyun/engine/nodes/MenuItemSprite; */
		 /* const/16 v6, 0xde */
		 (( com.wiyun.engine.nodes.MenuItemSprite ) v1 ).setAlpha ( v6 ); // invoke-virtual {v1, v6}, Lcom/wiyun/engine/nodes/MenuItemSprite;->setAlpha(I)V
		 /* .line 56 */
		 (( com.wiyun.engine.nodes.MenuItemSprite ) v1 ).autoRelease ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/nodes/MenuItemSprite;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
		 /* .line 58 */
		 int v6 = 1; // const/4 v6, 0x1
		 /* new-array v6, v6, [Lcom/wiyun/engine/nodes/MenuItem; */
		 int v7 = 0; // const/4 v7, 0x0
		 /* aput-object v1, v6, v7 */
		 com.wiyun.engine.nodes.Menu .make ( v6 );
		 /* .line 59 */
		 /* .local v0, "menuDif":Lcom/wiyun/engine/nodes/Menu; */
		 /* const/high16 v6, 0x439b0000 # 310.0f */
		 /* const/high16 v7, 0x431d0000 # 157.0f */
		 (( com.wiyun.engine.nodes.Menu ) v0 ).setPosition ( v6, v7 ); // invoke-virtual {v0, v6, v7}, Lcom/wiyun/engine/nodes/Menu;->setPosition(FF)V
		 /* .line 60 */
		 (( com.wiyun.engine.nodes.Menu ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Menu;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
		 /* .line 61 */
		 (( com.emman.vog.MenuScene ) p0 ).addChild ( v0 ); // invoke-virtual {p0, v0}, Lcom/emman/vog/MenuScene;->addChild(Lcom/wiyun/engine/nodes/Node;)V
		 /* .line 62 */
		 return;
	 } // .end method
	 private void addTitle ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* .line 40 */
		 /* const v1, 0x7f020068 */
		 com.wiyun.engine.nodes.Sprite .make ( v1 );
		 /* .line 41 */
		 /* .local v0, "title":Lcom/wiyun/engine/nodes/Sprite; */
		 (( com.wiyun.engine.nodes.Sprite ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Sprite;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
		 /* .line 42 */
		 /* const/high16 v1, 0x437a0000 # 250.0f */
		 /* const/high16 v2, 0x43820000 # 260.0f */
		 (( com.wiyun.engine.nodes.Sprite ) v0 ).setPosition ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/wiyun/engine/nodes/Sprite;->setPosition(FF)V
		 /* .line 43 */
		 (( com.emman.vog.MenuScene ) p0 ).addChild ( v0 ); // invoke-virtual {p0, v0}, Lcom/emman/vog/MenuScene;->addChild(Lcom/wiyun/engine/nodes/Node;)V
		 /* .line 44 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void background ( ) {
		 /* .locals 4 */
		 /* .prologue */
		 int v3 = 0; // const/4 v3, 0x0
		 /* .line 28 */
		 /* const v2, 0x7f020035 */
		 com.wiyun.engine.opengl.Texture2D .makeJPG ( v2 );
		 /* .line 29 */
		 /* .local v1, "bc":Lcom/wiyun/engine/opengl/Texture2D; */
		 com.wiyun.engine.nodes.Sprite .make ( v1 );
		 /* .line 30 */
		 /* .local v0, "background1":Lcom/wiyun/engine/nodes/Sprite; */
		 (( com.wiyun.engine.nodes.Sprite ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Sprite;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
		 /* .line 31 */
		 /* const/high16 v2, 0x3f000000 # 0.5f */
		 (( com.wiyun.engine.nodes.Sprite ) v0 ).setAnchor ( v3, v2 ); // invoke-virtual {v0, v3, v2}, Lcom/wiyun/engine/nodes/Sprite;->setAnchor(FF)V
		 /* .line 32 */
		 /* const/high16 v2, 0x43200000 # 160.0f */
		 (( com.wiyun.engine.nodes.Sprite ) v0 ).setPosition ( v3, v2 ); // invoke-virtual {v0, v3, v2}, Lcom/wiyun/engine/nodes/Sprite;->setPosition(FF)V
		 /* .line 33 */
		 (( com.emman.vog.MenuScene ) p0 ).addChild ( v0 ); // invoke-virtual {p0, v0}, Lcom/emman/vog/MenuScene;->addChild(Lcom/wiyun/engine/nodes/Node;)V
		 /* .line 35 */
		 /* invoke-direct {p0}, Lcom/emman/vog/MenuScene;->addTitle()V */
		 /* .line 36 */
		 /* invoke-direct {p0}, Lcom/emman/vog/MenuScene;->addMenu()V */
		 /* .line 37 */
		 return;
	 } // .end method
	 public void playGame ( ) {
		 /* .locals 4 */
		 /* .prologue */
		 /* .line 65 */
		 v0 = com.emman.vog.TitleActivity.instance;
		 /* new-instance v1, Landroid/content/Intent; */
		 v2 = com.emman.vog.TitleActivity.instance;
		 /* .line 66 */
		 /* const-class v3, Lcom/emman/vog/AnimalVoiceActivity; */
		 /* invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
		 /* .line 65 */
		 (( com.emman.vog.TitleActivity ) v0 ).startActivity ( v1 ); // invoke-virtual {v0, v1}, Lcom/emman/vog/TitleActivity;->startActivity(Landroid/content/Intent;)V
		 /* .line 67 */
		 return;
	 } // .end method
