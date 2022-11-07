public class lqh.china.lianliankancgrbw.LayerGame extends lqh.china.lianliankancgrbw.PubLayer implements com.wiyun.engine.nodes.INodeVirtualMethods {
	 /* # interfaces */
	 /* # instance fields */
	 com.wiyun.engine.nodes.Button bHome;
	 com.wiyun.engine.nodes.Button bMusic;
	 com.wiyun.engine.nodes.Button bSound;
	 Float boxlength;
	 at g;
	 public Boolean ib_can_exit_and_savegame;
	 java.lang.Boolean ib_stop_timer;
	 Integer ii_same_path_clearing;
	 Integer ii_timer_cpu_last;
	 com.wiyun.engine.nodes.AtlasLabel numberCurrentScore;
	 com.wiyun.engine.nodes.AtlasLabel numberLevel;
	 com.wiyun.engine.nodes.AtlasLabel numberMaxScore;
	 com.wiyun.engine.nodes.AtlasLabel numberScoreFinishing;
	 Float numberScoreFinishingScaleInit;
	 com.wiyun.engine.types.WYRect rButtonHome;
	 com.wiyun.engine.types.WYRect rButtonMusic;
	 com.wiyun.engine.types.WYRect rButtonSound;
	 com.wiyun.engine.types.WYRect rComboNumber;
	 com.wiyun.engine.types.WYRect rComboText;
	 com.wiyun.engine.types.WYRect rEffectCenterLabel;
	 com.wiyun.engine.types.WYRect rFinishScoreText;
	 com.wiyun.engine.types.WYRect rHighScoreLabel;
	 com.wiyun.engine.types.WYRect rHighScoreText;
	 com.wiyun.engine.types.WYRect rLabelFinding;
	 com.wiyun.engine.types.WYRect rLevelText;
	 com.wiyun.engine.types.WYRect rMain;
	 com.wiyun.engine.types.WYRect rMessageBox;
	 com.wiyun.engine.types.WYRect rPanelGame;
	 com.wiyun.engine.types.WYRect rScoreLabel;
	 com.wiyun.engine.types.WYRect rScoreText;
	 com.wiyun.engine.types.WYRect rShowNewRecord;
	 com.wiyun.engine.types.WYRect rTimeLeft;
	 com.wiyun.engine.nodes.Sprite sButtonHome;
	 com.wiyun.engine.nodes.Sprite sButtonMusic;
	 com.wiyun.engine.nodes.Sprite sButtonSound;
	 com.wiyun.engine.nodes.Sprite sFinishScoreText;
	 com.wiyun.engine.nodes.Sprite sLableFinding;
	 com.wiyun.engine.nodes.Sprite sLogo;
	 com.wiyun.engine.nodes.Sprite sShowNewRecord;
	 com.wiyun.engine.nodes.Sprite sTimeLeft;
	 com.wiyun.engine.nodes.Sprite sprite_combo_1;
	 com.wiyun.engine.nodes.Sprite sprite_combo_2;
	 com.wiyun.engine.nodes.Sprite sprite_combo_3;
	 com.wiyun.engine.nodes.Sprite sprite_combo_4;
	 com.wiyun.engine.nodes.Sprite sprite_effect_lose;
	 com.wiyun.engine.nodes.Sprite sprite_effect_nextlevel;
	 com.wiyun.engine.opengl.Texture2D temp_pic;
	 com.wiyun.engine.types.WYPoint temp_point1;
	 com.wiyun.engine.types.WYPoint temp_point2;
	 com.wiyun.engine.opengl.WYGLSurfaceView wysView;
	 /* # direct methods */
	 public lqh.china.lianliankancgrbw.LayerGame ( ) {
		 /* .locals 4 */
		 int v3 = 0; // const/4 v3, 0x0
		 int v2 = 1; // const/4 v2, 0x1
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {p0}, Llqh/china/lianliankancgrbw/PubLayer;-><init>()V */
		 java.lang.Boolean .valueOf ( v1 );
		 this.ib_stop_timer = v0;
		 /* const/high16 v0, 0x41200000 # 10.0f */
		 /* iput v0, p0, Llqh/china/lianliankancgrbw/LayerGame;->boxlength:F */
		 /* iput v1, p0, Llqh/china/lianliankancgrbw/LayerGame;->ii_same_path_clearing:I */
		 /* const/high16 v0, 0x3f800000 # 1.0f */
		 /* iput v0, p0, Llqh/china/lianliankancgrbw/LayerGame;->numberScoreFinishingScaleInit:F */
		 /* iput-boolean v2, p0, Llqh/china/lianliankancgrbw/LayerGame;->ib_can_exit_and_savegame:Z */
		 com.wiyun.engine.nodes.Director .getInstance ( );
		 (( com.wiyun.engine.nodes.Director ) v0 ).getOpenGLView ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->getOpenGLView()Lcom/wiyun/engine/opengl/WYGLSurfaceView;
		 this.wysView = v0;
		 this.g = p1;
		 v0 = this.g;
		 this.t = v3;
		 v0 = this.g;
		 this.u = v3;
		 (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).setKeyEnabled ( v2 ); // invoke-virtual {p0, v2}, Llqh/china/lianliankancgrbw/LayerGame;->setKeyEnabled(Z)V
		 /* invoke-direct {p0}, Llqh/china/lianliankancgrbw/LayerGame;->of_init_rect()V */
		 /* invoke-direct {p0}, Llqh/china/lianliankancgrbw/LayerGame;->of_set_background()V */
		 /* invoke-direct {p0}, Llqh/china/lianliankancgrbw/LayerGame;->of_init_label_button()V */
		 /* sget-boolean v0, Lay;->m:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.g;
			 v0 = this.a;
			 ay .a ( v0 );
		 } // :cond_0
		 v0 = this.g;
		 /* iget-boolean v0, v0, Lat;->M:Z */
		 /* if-nez v0, :cond_1 */
		 v0 = 		 ay .b ( );
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 ay .a ( v0 );
		 } // :cond_1
		 v0 = this.g;
		 /* iget-boolean v0, v0, Lat;->M:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_2
			 int v0 = 0; // const/4 v0, 0x0
			 (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_begin_next ( v0 ); // invoke-virtual {p0, v0}, Llqh/china/lianliankancgrbw/LayerGame;->of_begin_next(F)V
		 } // :goto_0
		 return;
	 } // :cond_2
	 v0 = this.g;
	 v0 = 	 (( at ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lat;->b(I)Z
	 if ( v0 != null) { // if-eqz v0, :cond_3
		 (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_begin_load_do ( ); // invoke-virtual {p0}, Llqh/china/lianliankancgrbw/LayerGame;->of_begin_load_do()V
	 } // :cond_3
	 (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_begin ( ); // invoke-virtual {p0}, Llqh/china/lianliankancgrbw/LayerGame;->of_begin()V
} // .end method
private void of_init_label_button ( ) {
	 /* .locals 5 */
	 int v4 = 4; // const/4 v4, 0x4
	 int v3 = 6; // const/4 v3, 0x6
	 int v2 = 0; // const/4 v2, 0x0
	 v0 = this.rButtonMusic;
	 /* const v1, 0x7f02000b */
	 (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_create_label_sprite ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Llqh/china/lianliankancgrbw/LayerGame;->of_create_label_sprite(Lcom/wiyun/engine/types/WYRect;I)Lcom/wiyun/engine/nodes/Sprite;
	 this.sButtonMusic = v0;
	 v0 = this.rButtonSound;
	 /* const v1, 0x7f02000e */
	 (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_create_label_sprite ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Llqh/china/lianliankancgrbw/LayerGame;->of_create_label_sprite(Lcom/wiyun/engine/types/WYRect;I)Lcom/wiyun/engine/nodes/Sprite;
	 this.sButtonSound = v0;
	 v0 = this.rButtonHome;
	 /* const v1, 0x7f020007 */
	 (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_create_label_sprite ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Llqh/china/lianliankancgrbw/LayerGame;->of_create_label_sprite(Lcom/wiyun/engine/types/WYRect;I)Lcom/wiyun/engine/nodes/Sprite;
	 this.sButtonHome = v0;
	 v0 = this.rTimeLeft;
	 /* const v1, 0x7f02005c */
	 (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_create_label_sprite ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Llqh/china/lianliankancgrbw/LayerGame;->of_create_label_sprite(Lcom/wiyun/engine/types/WYRect;I)Lcom/wiyun/engine/nodes/Sprite;
	 this.sTimeLeft = v0;
	 v0 = this.rShowNewRecord;
	 /* const v1, 0x7f020070 */
	 (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_create_label_sprite ( v0, v1, v4 ); // invoke-virtual {p0, v0, v1, v4}, Llqh/china/lianliankancgrbw/LayerGame;->of_create_label_sprite(Lcom/wiyun/engine/types/WYRect;II)Lcom/wiyun/engine/nodes/Sprite;
	 this.sShowNewRecord = v0;
	 v0 = this.sShowNewRecord;
	 (( com.wiyun.engine.nodes.Sprite ) v0 ).setVisible ( v2 ); // invoke-virtual {v0, v2}, Lcom/wiyun/engine/nodes/Sprite;->setVisible(Z)V
	 v0 = this.rLabelFinding;
	 /* const v1, 0x7f02006e */
	 (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_create_label_sprite ( v0, v1, v4 ); // invoke-virtual {p0, v0, v1, v4}, Llqh/china/lianliankancgrbw/LayerGame;->of_create_label_sprite(Lcom/wiyun/engine/types/WYRect;II)Lcom/wiyun/engine/nodes/Sprite;
	 this.sLableFinding = v0;
	 v0 = this.sLableFinding;
	 (( com.wiyun.engine.nodes.Sprite ) v0 ).setVisible ( v2 ); // invoke-virtual {v0, v2}, Lcom/wiyun/engine/nodes/Sprite;->setVisible(Z)V
	 v0 = this.sLableFinding;
	 /* const/16 v1, 0x64 */
	 (( com.wiyun.engine.nodes.Sprite ) v0 ).setAlpha ( v1 ); // invoke-virtual {v0, v1}, Lcom/wiyun/engine/nodes/Sprite;->setAlpha(I)V
	 (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_set_button_pic_by_status ( ); // invoke-virtual {p0}, Llqh/china/lianliankancgrbw/LayerGame;->of_set_button_pic_by_status()V
	 (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_create_number_show ( ); // invoke-virtual {p0}, Llqh/china/lianliankancgrbw/LayerGame;->of_create_number_show()V
	 v0 = this.rEffectCenterLabel;
	 /* const v1, 0x7f020051 */
	 (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_create_label_sprite ( v0, v1, v3 ); // invoke-virtual {p0, v0, v1, v3}, Llqh/china/lianliankancgrbw/LayerGame;->of_create_label_sprite(Lcom/wiyun/engine/types/WYRect;II)Lcom/wiyun/engine/nodes/Sprite;
	 this.sprite_combo_1 = v0;
	 v0 = this.rEffectCenterLabel;
	 /* const v1, 0x7f020052 */
	 (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_create_label_sprite ( v0, v1, v3 ); // invoke-virtual {p0, v0, v1, v3}, Llqh/china/lianliankancgrbw/LayerGame;->of_create_label_sprite(Lcom/wiyun/engine/types/WYRect;II)Lcom/wiyun/engine/nodes/Sprite;
	 this.sprite_combo_2 = v0;
	 v0 = this.rEffectCenterLabel;
	 /* const v1, 0x7f020053 */
	 (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_create_label_sprite ( v0, v1, v3 ); // invoke-virtual {p0, v0, v1, v3}, Llqh/china/lianliankancgrbw/LayerGame;->of_create_label_sprite(Lcom/wiyun/engine/types/WYRect;II)Lcom/wiyun/engine/nodes/Sprite;
	 this.sprite_combo_3 = v0;
	 v0 = this.rEffectCenterLabel;
	 /* const v1, 0x7f020054 */
	 (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_create_label_sprite ( v0, v1, v3 ); // invoke-virtual {p0, v0, v1, v3}, Llqh/china/lianliankancgrbw/LayerGame;->of_create_label_sprite(Lcom/wiyun/engine/types/WYRect;II)Lcom/wiyun/engine/nodes/Sprite;
	 this.sprite_combo_4 = v0;
	 v0 = this.rEffectCenterLabel;
	 /* const v1, 0x7f020056 */
	 (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_create_label_sprite ( v0, v1, v3 ); // invoke-virtual {p0, v0, v1, v3}, Llqh/china/lianliankancgrbw/LayerGame;->of_create_label_sprite(Lcom/wiyun/engine/types/WYRect;II)Lcom/wiyun/engine/nodes/Sprite;
	 this.sprite_effect_nextlevel = v0;
	 v0 = this.rEffectCenterLabel;
	 /* const v1, 0x7f020055 */
	 (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_create_label_sprite ( v0, v1, v3 ); // invoke-virtual {p0, v0, v1, v3}, Llqh/china/lianliankancgrbw/LayerGame;->of_create_label_sprite(Lcom/wiyun/engine/types/WYRect;II)Lcom/wiyun/engine/nodes/Sprite;
	 this.sprite_effect_lose = v0;
	 v0 = this.sprite_combo_1;
	 (( com.wiyun.engine.nodes.Sprite ) v0 ).setVisible ( v2 ); // invoke-virtual {v0, v2}, Lcom/wiyun/engine/nodes/Sprite;->setVisible(Z)V
	 v0 = this.sprite_combo_2;
	 (( com.wiyun.engine.nodes.Sprite ) v0 ).setVisible ( v2 ); // invoke-virtual {v0, v2}, Lcom/wiyun/engine/nodes/Sprite;->setVisible(Z)V
	 v0 = this.sprite_combo_3;
	 (( com.wiyun.engine.nodes.Sprite ) v0 ).setVisible ( v2 ); // invoke-virtual {v0, v2}, Lcom/wiyun/engine/nodes/Sprite;->setVisible(Z)V
	 v0 = this.sprite_combo_4;
	 (( com.wiyun.engine.nodes.Sprite ) v0 ).setVisible ( v2 ); // invoke-virtual {v0, v2}, Lcom/wiyun/engine/nodes/Sprite;->setVisible(Z)V
	 v0 = this.sprite_effect_nextlevel;
	 (( com.wiyun.engine.nodes.Sprite ) v0 ).setVisible ( v2 ); // invoke-virtual {v0, v2}, Lcom/wiyun/engine/nodes/Sprite;->setVisible(Z)V
	 v0 = this.sprite_effect_lose;
	 (( com.wiyun.engine.nodes.Sprite ) v0 ).setVisible ( v2 ); // invoke-virtual {v0, v2}, Lcom/wiyun/engine/nodes/Sprite;->setVisible(Z)V
	 return;
} // .end method
private void of_init_rect ( ) {
	 /* .locals 13 */
	 /* const v12, 0x3dcccccd # 0.1f */
	 /* const/high16 v11, 0x42340000 # 45.0f */
	 /* const/high16 v10, 0x3f000000 # 0.5f */
	 /* const v9, 0x3e4ccccd # 0.2f */
	 /* const/high16 v8, 0x42200000 # 40.0f */
	 com.wiyun.engine.nodes.Director .getInstance ( );
	 (( com.wiyun.engine.nodes.Director ) v0 ).getWindowSize ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->getWindowSize()Lcom/wiyun/engine/types/WYSize;
	 /* iget v1, v0, Lcom/wiyun/engine/types/WYSize;->width:F */
	 /* const/high16 v2, 0x43f00000 # 480.0f */
	 /* div-float/2addr v1, v2 */
	 /* const/high16 v2, 0x43e00000 # 448.0f */
	 v3 = this.g;
	 /* iget v3, v3, Lat;->q:I */
	 /* int-to-float v3, v3 */
	 /* div-float/2addr v2, v3 */
	 v3 = this.g;
	 /* iget v3, v3, Lat;->p:I */
	 /* int-to-float v3, v3 */
	 /* mul-float/2addr v2, v3 */
	 /* const v3, 0x44298000 # 678.0f */
	 /* sub-float/2addr v3, v2 */
	 /* const/high16 v4, 0x42b40000 # 90.0f */
	 /* sub-float/2addr v3, v4 */
	 /* const/high16 v4, -0x40800000 # -1.0f */
	 /* mul-float/2addr v3, v4 */
	 int v4 = 0; // const/4 v4, 0x0
	 /* mul-float v5, v1, v3 */
	 /* const/high16 v6, 0x43f00000 # 480.0f */
	 /* mul-float/2addr v6, v1 */
	 /* const/high16 v7, 0x44480000 # 800.0f */
	 /* mul-float/2addr v7, v1 */
	 com.wiyun.engine.types.WYRect .make ( v4,v5,v6,v7 );
	 this.rPanelGame = v4;
	 /* const/high16 v4, 0x41900000 # 18.0f */
	 /* mul-float/2addr v4, v1 */
	 /* const/high16 v5, 0x42b40000 # 90.0f */
	 /* mul-float/2addr v5, v1 */
	 /* const/high16 v6, 0x43e00000 # 448.0f */
	 /* mul-float/2addr v6, v1 */
	 /* mul-float/2addr v2, v1 */
	 com.wiyun.engine.types.WYRect .make ( v4,v5,v6,v2 );
	 this.rMain = v2;
	 v2 = this.rMain;
	 v2 = this.size;
	 /* iget v2, v2, Lcom/wiyun/engine/types/WYSize;->width:F */
	 v4 = this.g;
	 /* iget v4, v4, Lat;->q:I */
	 /* int-to-float v4, v4 */
	 /* div-float/2addr v2, v4 */
	 /* iput v2, p0, Llqh/china/lianliankancgrbw/LayerGame;->boxlength:F */
	 /* const/high16 v2, 0x432a0000 # 170.0f */
	 /* mul-float/2addr v2, v1 */
	 /* const v4, 0x44304000 # 705.0f */
	 /* add-float/2addr v4, v3 */
	 /* mul-float/2addr v4, v1 */
	 /* const/high16 v5, 0x42dc0000 # 110.0f */
	 /* mul-float/2addr v5, v1 */
	 /* mul-float v6, v1, v8 */
	 com.wiyun.engine.types.WYRect .make ( v2,v4,v5,v6 );
	 this.rHighScoreText = v2;
	 /* const/high16 v2, 0x42000000 # 32.0f */
	 /* mul-float/2addr v2, v1 */
	 /* const v4, 0x44304000 # 705.0f */
	 /* add-float/2addr v4, v3 */
	 /* mul-float/2addr v4, v1 */
	 /* const/high16 v5, 0x42dc0000 # 110.0f */
	 /* mul-float/2addr v5, v1 */
	 /* mul-float v6, v1, v8 */
	 com.wiyun.engine.types.WYRect .make ( v2,v4,v5,v6 );
	 this.rScoreText = v2;
	 /* const/high16 v2, 0x43b40000 # 360.0f */
	 /* mul-float/2addr v2, v1 */
	 /* const v4, 0x44304000 # 705.0f */
	 /* add-float/2addr v4, v3 */
	 /* mul-float/2addr v4, v1 */
	 /* const/high16 v5, 0x42700000 # 60.0f */
	 /* mul-float/2addr v5, v1 */
	 /* mul-float v6, v1, v8 */
	 com.wiyun.engine.types.WYRect .make ( v2,v4,v5,v6 );
	 this.rLevelText = v2;
	 /* const/high16 v2, 0x40a00000 # 5.0f */
	 /* mul-float/2addr v2, v1 */
	 /* iget v4, v0, Lcom/wiyun/engine/types/WYSize;->height:F */
	 /* mul-float v5, v11, v1 */
	 /* sub-float/2addr v4, v5 */
	 /* mul-float v5, v1, v8 */
	 /* mul-float v6, v1, v8 */
	 com.wiyun.engine.types.WYRect .make ( v2,v4,v5,v6 );
	 this.rButtonMusic = v2;
	 /* const/high16 v2, 0x42480000 # 50.0f */
	 /* mul-float/2addr v2, v1 */
	 /* iget v4, v0, Lcom/wiyun/engine/types/WYSize;->height:F */
	 /* mul-float v5, v11, v1 */
	 /* sub-float/2addr v4, v5 */
	 /* mul-float v5, v1, v8 */
	 /* mul-float v6, v1, v8 */
	 com.wiyun.engine.types.WYRect .make ( v2,v4,v5,v6 );
	 this.rButtonSound = v2;
	 /* iget v2, v0, Lcom/wiyun/engine/types/WYSize;->width:F */
	 /* mul-float v4, v11, v1 */
	 /* sub-float/2addr v2, v4 */
	 /* iget v4, v0, Lcom/wiyun/engine/types/WYSize;->height:F */
	 /* mul-float v5, v11, v1 */
	 /* sub-float/2addr v4, v5 */
	 /* mul-float v5, v1, v8 */
	 /* mul-float v6, v1, v8 */
	 com.wiyun.engine.types.WYRect .make ( v2,v4,v5,v6 );
	 this.rButtonHome = v2;
	 /* const/high16 v2, 0x43c80000 # 400.0f */
	 /* mul-float/2addr v2, v1 */
	 /* const v4, 0x44368000 # 730.0f */
	 /* add-float/2addr v4, v3 */
	 /* mul-float/2addr v4, v1 */
	 /* const/high16 v5, 0x42a00000 # 80.0f */
	 /* mul-float/2addr v5, v1 */
	 /* const/high16 v6, 0x42480000 # 50.0f */
	 /* mul-float/2addr v6, v1 */
	 com.wiyun.engine.types.WYRect .make ( v2,v4,v5,v6 );
	 this.rShowNewRecord = v2;
	 /* const/high16 v2, 0x41100000 # 9.0f */
	 /* mul-float/2addr v2, v1 */
	 /* const v4, 0x442cc000 # 691.0f */
	 /* add-float/2addr v3, v4 */
	 /* mul-float/2addr v3, v1 */
	 /* const v4, 0x43e68000 # 461.0f */
	 /* mul-float/2addr v4, v1 */
	 /* const/high16 v5, 0x41300000 # 11.0f */
	 /* mul-float/2addr v1, v5 */
	 com.wiyun.engine.types.WYRect .make ( v2,v3,v4,v1 );
	 this.rTimeLeft = v1;
	 /* iget v1, v0, Lcom/wiyun/engine/types/WYSize;->width:F */
	 /* mul-float/2addr v1, v9 */
	 /* iget v2, v0, Lcom/wiyun/engine/types/WYSize;->height:F */
	 /* const v3, 0x3e99999a # 0.3f */
	 /* mul-float/2addr v2, v3 */
	 /* iget v3, v0, Lcom/wiyun/engine/types/WYSize;->width:F */
	 /* const v4, 0x3f19999a # 0.6f */
	 /* mul-float/2addr v3, v4 */
	 /* iget v4, v0, Lcom/wiyun/engine/types/WYSize;->width:F */
	 /* mul-float/2addr v4, v9 */
	 com.wiyun.engine.types.WYRect .make ( v1,v2,v3,v4 );
	 this.rMessageBox = v1;
	 /* iget v1, v0, Lcom/wiyun/engine/types/WYSize;->width:F */
	 /* mul-float/2addr v1, v10 */
	 /* iget v2, v0, Lcom/wiyun/engine/types/WYSize;->height:F */
	 /* const v3, 0x3e99999a # 0.3f */
	 /* mul-float/2addr v2, v3 */
	 /* iget v3, v0, Lcom/wiyun/engine/types/WYSize;->width:F */
	 /* mul-float/2addr v3, v10 */
	 /* iget v4, v0, Lcom/wiyun/engine/types/WYSize;->width:F */
	 /* const v5, 0x3e19999a # 0.15f */
	 /* mul-float/2addr v4, v5 */
	 com.wiyun.engine.types.WYRect .make ( v1,v2,v3,v4 );
	 this.rLabelFinding = v1;
	 /* iget v1, v0, Lcom/wiyun/engine/types/WYSize;->width:F */
	 /* mul-float/2addr v1, v9 */
	 /* iget v2, v0, Lcom/wiyun/engine/types/WYSize;->height:F */
	 /* mul-float/2addr v2, v10 */
	 /* iget v3, v0, Lcom/wiyun/engine/types/WYSize;->width:F */
	 /* const v4, 0x3f19999a # 0.6f */
	 /* mul-float/2addr v3, v4 */
	 /* iget v4, v0, Lcom/wiyun/engine/types/WYSize;->width:F */
	 /* mul-float/2addr v4, v9 */
	 com.wiyun.engine.types.WYRect .make ( v1,v2,v3,v4 );
	 this.rFinishScoreText = v1;
	 /* iget v1, v0, Lcom/wiyun/engine/types/WYSize;->width:F */
	 int v2 = 0; // const/4 v2, 0x0
	 /* mul-float/2addr v1, v2 */
	 /* iget v2, v0, Lcom/wiyun/engine/types/WYSize;->height:F */
	 /* mul-float/2addr v2, v10 */
	 /* iget v3, v0, Lcom/wiyun/engine/types/WYSize;->width:F */
	 /* const v4, 0x3e99999a # 0.3f */
	 /* mul-float/2addr v3, v4 */
	 /* sub-float/2addr v2, v3 */
	 /* iget v3, v0, Lcom/wiyun/engine/types/WYSize;->width:F */
	 /* const/high16 v4, 0x3f800000 # 1.0f */
	 /* mul-float/2addr v3, v4 */
	 /* iget v4, v0, Lcom/wiyun/engine/types/WYSize;->width:F */
	 /* const v5, 0x3f19999a # 0.6f */
	 /* mul-float/2addr v4, v5 */
	 com.wiyun.engine.types.WYRect .make ( v1,v2,v3,v4 );
	 this.rEffectCenterLabel = v1;
	 /* iget v1, v0, Lcom/wiyun/engine/types/WYSize;->width:F */
	 /* const v2, 0x3eb33333 # 0.35f */
	 /* mul-float/2addr v1, v2 */
	 /* iget v2, v0, Lcom/wiyun/engine/types/WYSize;->height:F */
	 /* const v3, 0x3f1e353f # 0.618f */
	 /* mul-float/2addr v2, v3 */
	 /* iget v3, v0, Lcom/wiyun/engine/types/WYSize;->width:F */
	 /* mul-float/2addr v3, v9 */
	 /* iget v4, v0, Lcom/wiyun/engine/types/WYSize;->width:F */
	 /* mul-float/2addr v4, v12 */
	 com.wiyun.engine.types.WYRect .make ( v1,v2,v3,v4 );
	 this.rComboText = v1;
	 /* iget v1, v0, Lcom/wiyun/engine/types/WYSize;->width:F */
	 /* const v2, 0x3f0ccccd # 0.55f */
	 /* mul-float/2addr v1, v2 */
	 /* iget v2, v0, Lcom/wiyun/engine/types/WYSize;->height:F */
	 /* const v3, 0x3f1e353f # 0.618f */
	 /* mul-float/2addr v2, v3 */
	 /* iget v3, v0, Lcom/wiyun/engine/types/WYSize;->width:F */
	 /* mul-float/2addr v3, v12 */
	 /* iget v0, v0, Lcom/wiyun/engine/types/WYSize;->width:F */
	 /* mul-float/2addr v0, v12 */
	 com.wiyun.engine.types.WYRect .make ( v1,v2,v3,v0 );
	 this.rComboNumber = v0;
	 return;
} // .end method
private void of_play_clearing_1_draw_path_effect1 ( Float p0 ) {
	 /* .locals 12 */
	 int v3 = 2; // const/4 v3, 0x2
	 int v2 = 1; // const/4 v2, 0x1
	 int v11 = 0; // const/4 v11, 0x0
	 aw .a ( p1 );
	 v0 = this.g;
	 v0 = this.H;
	 /* array-length v0, v0 */
	 /* if-lt v0, v3, :cond_0 */
	 v0 = this.g;
	 v0 = this.H;
	 /* array-length v0, v0 */
	 /* add-int/lit8 v0, v0, -0x1 */
	 /* new-array v4, v0, [Lcom/wiyun/engine/actions/MoveTo; */
	 /* move v0, v2 */
} // :goto_0
v1 = this.g;
v1 = this.H;
/* array-length v1, v1 */
/* if-lt v0, v1, :cond_1 */
/* array-length v0, v4 */
/* if-ne v0, v2, :cond_2 */
/* aget-object v1, v4, v11 */
/* move-object v4, v1 */
} // :goto_1
if ( v4 != null) { // if-eqz v4, :cond_0
com.wiyun.engine.actions.Hide .make ( );
(( com.wiyun.engine.actions.Hide ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/actions/Hide;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/actions/FiniteTimeAction; */
/* const/high16 v1, 0x3f000000 # 0.5f */
com.wiyun.engine.actions.DelayTime .make ( v1 );
(( com.wiyun.engine.actions.DelayTime ) v1 ).autoRelease ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/actions/DelayTime;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v1, Lcom/wiyun/engine/actions/FiniteTimeAction; */
/* new-array v3, v3, [Lcom/wiyun/engine/actions/FiniteTimeAction; */
/* aput-object v1, v3, v11 */
/* aput-object v0, v3, v2 */
com.wiyun.engine.actions.Sequence .make ( v4,v3 );
(( com.wiyun.engine.particle.ParticleSystem ) v5 ).runAction ( v0 ); // invoke-virtual {v5, v0}, Lcom/wiyun/engine/particle/ParticleSystem;->runAction(Lcom/wiyun/engine/actions/Action;)V
v0 = this.g;
v0 = this.H;
/* aget-object v0, v0, v11 */
/* aget v0, v0, v11 */
v1 = this.g;
v1 = this.H;
/* aget-object v1, v1, v11 */
/* aget v1, v1, v2 */
v2 = this.g;
v2 = this.t;
/* aget-object v0, v2, v0 */
/* aget-object v0, v0, v1 */
(( com.wiyun.engine.nodes.Sprite ) v0 ).getAbsolutePosition ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Sprite;->getAbsolutePosition()Lcom/wiyun/engine/types/WYPoint;
(( com.wiyun.engine.particle.ParticleSystem ) v5 ).setPosition ( v0 ); // invoke-virtual {v5, v0}, Lcom/wiyun/engine/particle/ParticleSystem;->setPosition(Lcom/wiyun/engine/types/WYPoint;)V
int v0 = 4; // const/4 v0, 0x4
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).addChild ( v5, v0 ); // invoke-virtual {p0, v5, v0}, Llqh/china/lianliankancgrbw/LayerGame;->addChild(Lcom/wiyun/engine/nodes/Node;I)V
} // :cond_0
(( com.wiyun.engine.particle.ParticleSystem ) v5 ).autoRelease ( ); // invoke-virtual {v5}, Lcom/wiyun/engine/particle/ParticleSystem;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
return;
} // :cond_1
v1 = this.g;
v1 = this.H;
/* add-int/lit8 v6, v0, -0x1 */
/* aget-object v1, v1, v6 */
/* aget v1, v1, v11 */
v6 = this.g;
v6 = this.H;
/* add-int/lit8 v7, v0, -0x1 */
/* aget-object v6, v6, v7 */
/* aget v6, v6, v2 */
v7 = this.g;
v7 = this.H;
/* aget-object v7, v7, v0 */
/* aget v7, v7, v11 */
v8 = this.g;
v8 = this.H;
/* aget-object v8, v8, v0 */
/* aget v8, v8, v2 */
v9 = this.g;
v9 = this.t;
/* aget-object v9, v9, v1 */
/* aget-object v9, v9, v6 */
(( com.wiyun.engine.nodes.Sprite ) v9 ).getAbsolutePosition ( ); // invoke-virtual {v9}, Lcom/wiyun/engine/nodes/Sprite;->getAbsolutePosition()Lcom/wiyun/engine/types/WYPoint;
/* iget v9, v9, Lcom/wiyun/engine/types/WYPoint;->x:F */
v10 = this.g;
v10 = this.t;
/* aget-object v1, v10, v1 */
/* aget-object v1, v1, v6 */
(( com.wiyun.engine.nodes.Sprite ) v1 ).getAbsolutePosition ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/nodes/Sprite;->getAbsolutePosition()Lcom/wiyun/engine/types/WYPoint;
/* iget v1, v1, Lcom/wiyun/engine/types/WYPoint;->y:F */
v6 = this.g;
v6 = this.t;
/* aget-object v6, v6, v7 */
/* aget-object v6, v6, v8 */
(( com.wiyun.engine.nodes.Sprite ) v6 ).getAbsolutePosition ( ); // invoke-virtual {v6}, Lcom/wiyun/engine/nodes/Sprite;->getAbsolutePosition()Lcom/wiyun/engine/types/WYPoint;
/* iget v6, v6, Lcom/wiyun/engine/types/WYPoint;->x:F */
v10 = this.g;
v10 = this.t;
/* aget-object v7, v10, v7 */
/* aget-object v7, v7, v8 */
(( com.wiyun.engine.nodes.Sprite ) v7 ).getAbsolutePosition ( ); // invoke-virtual {v7}, Lcom/wiyun/engine/nodes/Sprite;->getAbsolutePosition()Lcom/wiyun/engine/types/WYPoint;
/* iget v7, v7, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* add-int/lit8 v8, v0, -0x1 */
/* const v10, 0x3d4ccccd # 0.05f */
com.wiyun.engine.actions.MoveTo .make ( v10,v9,v1,v6,v7 );
/* aput-object v1, v4, v8 */
/* add-int/lit8 v0, v0, 0x1 */
/* goto/16 :goto_0 */
} // :cond_2
/* aget-object v0, v4, v11 */
/* new-array v1, v2, [Lcom/wiyun/engine/actions/FiniteTimeAction; */
/* aget-object v6, v4, v2 */
/* aput-object v6, v1, v11 */
com.wiyun.engine.actions.Sequence .make ( v0,v1 );
/* move-object v1, v0 */
/* move v0, v3 */
} // :goto_2
/* array-length v6, v4 */
/* if-lt v0, v6, :cond_3 */
/* move-object v4, v1 */
/* goto/16 :goto_1 */
} // :cond_3
/* new-array v6, v2, [Lcom/wiyun/engine/actions/FiniteTimeAction; */
/* aget-object v7, v4, v0 */
/* aput-object v7, v6, v11 */
com.wiyun.engine.actions.Sequence .make ( v1,v6 );
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
private void of_play_clearing_1_draw_path_effect2 ( Float p0 ) {
/* .locals 9 */
/* const/high16 v8, 0x3f000000 # 0.5f */
/* const v7, 0x3e99999a # 0.3f */
int v6 = 1; // const/4 v6, 0x1
int v3 = 0; // const/4 v3, 0x0
v0 = this.g;
v0 = this.H;
/* array-length v0, v0 */
int v1 = 2; // const/4 v1, 0x2
/* if-lt v0, v1, :cond_0 */
v0 = this.g;
v0 = this.H;
/* move v2, v3 */
} // :goto_0
v0 = this.g;
v0 = this.H;
/* array-length v0, v0 */
/* if-lt v2, v0, :cond_1 */
} // :cond_0
return;
} // :cond_1
v0 = this.g;
v0 = this.H;
/* aget-object v0, v0, v2 */
/* aget v0, v0, v3 */
v1 = this.g;
v1 = this.H;
/* aget-object v1, v1, v2 */
/* aget v1, v1, v6 */
v4 = this.g;
v4 = this.t;
/* aget-object v4, v4, v0 */
/* aget-object v4, v4, v1 */
(( com.wiyun.engine.nodes.Sprite ) v4 ).getAbsolutePosition ( ); // invoke-virtual {v4}, Lcom/wiyun/engine/nodes/Sprite;->getAbsolutePosition()Lcom/wiyun/engine/types/WYPoint;
/* iget v4, v4, Lcom/wiyun/engine/types/WYPoint;->x:F */
v5 = this.g;
v5 = this.t;
/* aget-object v0, v5, v0 */
/* aget-object v0, v0, v1 */
(( com.wiyun.engine.nodes.Sprite ) v0 ).getAbsolutePosition ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Sprite;->getAbsolutePosition()Lcom/wiyun/engine/types/WYPoint;
/* iget v0, v0, Lcom/wiyun/engine/types/WYPoint;->y:F */
v1 = this.temp_pic;
com.wiyun.engine.nodes.Sprite .make ( v1 );
(( com.wiyun.engine.nodes.Sprite ) v5 ).setPosition ( v4, v0 ); // invoke-virtual {v5, v4, v0}, Lcom/wiyun/engine/nodes/Sprite;->setPosition(FF)V
/* iget v0, p0, Llqh/china/lianliankancgrbw/LayerGame;->boxlength:F */
/* mul-float/2addr v0, v7 */
/* iget v1, p0, Llqh/china/lianliankancgrbw/LayerGame;->boxlength:F */
/* mul-float/2addr v1, v7 */
(( com.wiyun.engine.nodes.Sprite ) v5 ).setContentSize ( v0, v1 ); // invoke-virtual {v5, v0, v1}, Lcom/wiyun/engine/nodes/Sprite;->setContentSize(FF)V
(( com.wiyun.engine.nodes.Sprite ) v5 ).setAutoFit ( v6 ); // invoke-virtual {v5, v6}, Lcom/wiyun/engine/nodes/Sprite;->setAutoFit(Z)V
com.wiyun.engine.actions.DelayTime .make ( v8 );
(( com.wiyun.engine.actions.DelayTime ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/actions/DelayTime;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/actions/FiniteTimeAction; */
/* const v1, 0x3f99999a # 1.2f */
com.wiyun.engine.actions.FadeOut .make ( v1 );
(( com.wiyun.engine.actions.FadeOut ) v1 ).autoRelease ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/actions/FadeOut;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v1, Lcom/wiyun/engine/actions/IntervalAction; */
/* new-array v4, v6, [Lcom/wiyun/engine/actions/FiniteTimeAction; */
/* aput-object v1, v4, v3 */
com.wiyun.engine.actions.Sequence .make ( v0,v4 );
(( com.wiyun.engine.actions.Sequence ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/actions/Sequence;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/actions/IntervalAction; */
(( com.wiyun.engine.nodes.Sprite ) v5 ).runAction ( v0 ); // invoke-virtual {v5, v0}, Lcom/wiyun/engine/nodes/Sprite;->runAction(Lcom/wiyun/engine/actions/Action;)V
/* const/high16 v0, 0x43b40000 # 360.0f */
com.wiyun.engine.actions.RotateBy .make ( v8,v0 );
(( com.wiyun.engine.actions.RotateBy ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/actions/RotateBy;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/actions/RotateBy; */
(( com.wiyun.engine.nodes.Sprite ) v5 ).runAction ( v0 ); // invoke-virtual {v5, v0}, Lcom/wiyun/engine/nodes/Sprite;->runAction(Lcom/wiyun/engine/actions/Action;)V
int v0 = 4; // const/4 v0, 0x4
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).addChild ( v5, v0 ); // invoke-virtual {p0, v5, v0}, Llqh/china/lianliankancgrbw/LayerGame;->addChild(Lcom/wiyun/engine/nodes/Node;I)V
(( com.wiyun.engine.nodes.Sprite ) v5 ).autoRelease ( ); // invoke-virtual {v5}, Lcom/wiyun/engine/nodes/Sprite;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* add-int/lit8 v0, v2, 0x1 */
/* move v2, v0 */
/* goto/16 :goto_0 */
} // .end method
private void of_play_clearing_2_add_finish_score ( ) {
/* .locals 12 */
/* const/high16 v11, 0x3f800000 # 1.0f */
int v10 = 2; // const/4 v10, 0x2
int v9 = 3; // const/4 v9, 0x3
int v8 = 0; // const/4 v8, 0x0
int v7 = 1; // const/4 v7, 0x1
v0 = this.g;
/* iget v0, v0, Lat;->J:F */
int v1 = 0; // const/4 v1, 0x0
/* cmpg-float v0, v0, v1 */
/* if-gtz v0, :cond_0 */
} // :goto_0
return;
} // :cond_0
v0 = this.g;
/* const/high16 v1, 0x44fa0000 # 2000.0f */
v2 = this.g;
/* iget v2, v2, Lat;->K:F */
v3 = this.g;
/* iget v3, v3, Lat;->J:F */
/* div-float/2addr v2, v3 */
/* mul-float/2addr v1, v2 */
/* float-to-int v1, v1 */
/* iput v1, v0, Lat;->o:I */
v0 = this.g;
/* iget v0, v0, Lat;->o:I */
/* const/16 v1, 0xc8 */
/* if-ge v0, v1, :cond_1 */
v0 = this.g;
/* iput v8, v0, Lat;->o:I */
} // :cond_1
v0 = this.g;
/* iget v0, v0, Lat;->o:I */
/* invoke-direct {p0, v0}, Llqh/china/lianliankancgrbw/LayerGame;->of_score_add(I)V */
/* const/high16 v0, 0x3f000000 # 0.5f */
v1 = this.sTimeLeft;
(( com.wiyun.engine.nodes.Sprite ) v1 ).getAbsolutePosition ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/nodes/Sprite;->getAbsolutePosition()Lcom/wiyun/engine/types/WYPoint;
/* iget v1, v1, Lcom/wiyun/engine/types/WYPoint;->x:F */
v2 = this.sTimeLeft;
(( com.wiyun.engine.nodes.Sprite ) v2 ).getAbsolutePosition ( ); // invoke-virtual {v2}, Lcom/wiyun/engine/nodes/Sprite;->getAbsolutePosition()Lcom/wiyun/engine/types/WYPoint;
/* iget v2, v2, Lcom/wiyun/engine/types/WYPoint;->y:F */
v3 = this.rFinishScoreText;
v3 = (( com.wiyun.engine.types.WYRect ) v3 ).midX ( ); // invoke-virtual {v3}, Lcom/wiyun/engine/types/WYRect;->midX()F
v4 = this.rFinishScoreText;
v4 = (( com.wiyun.engine.types.WYRect ) v4 ).midY ( ); // invoke-virtual {v4}, Lcom/wiyun/engine/types/WYRect;->midY()F
com.wiyun.engine.actions.MoveTo .make ( v0,v1,v2,v3,v4 );
(( com.wiyun.engine.actions.MoveTo ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/actions/MoveTo;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/actions/MoveTo; */
(( com.wiyun.engine.actions.MoveTo ) v0 ).reverse ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/actions/MoveTo;->reverse()Lcom/wiyun/engine/actions/IntervalAction;
(( com.wiyun.engine.actions.IntervalAction ) v1 ).autoRelease ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/actions/IntervalAction;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v1, Lcom/wiyun/engine/actions/MoveTo; */
/* const/high16 v2, 0x43340000 # 180.0f */
com.wiyun.engine.actions.RotateBy .make ( v11,v2 );
(( com.wiyun.engine.actions.RotateBy ) v2 ).autoRelease ( ); // invoke-virtual {v2}, Lcom/wiyun/engine/actions/RotateBy;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v2, Lcom/wiyun/engine/actions/RotateBy; */
v3 = this.sTimeLeft;
v3 = (( com.wiyun.engine.nodes.Sprite ) v3 ).getScaleX ( ); // invoke-virtual {v3}, Lcom/wiyun/engine/nodes/Sprite;->getScaleX()F
v4 = this.sTimeLeft;
v4 = (( com.wiyun.engine.nodes.Sprite ) v4 ).getScaleY ( ); // invoke-virtual {v4}, Lcom/wiyun/engine/nodes/Sprite;->getScaleY()F
/* const/high16 v5, 0x40c00000 # 6.0f */
/* mul-float/2addr v5, v3 */
/* const/high16 v6, 0x40c00000 # 6.0f */
/* mul-float/2addr v6, v4 */
com.wiyun.engine.actions.ScaleTo .make ( v11,v3,v4,v5,v6 );
(( com.wiyun.engine.actions.ScaleTo ) v3 ).autoRelease ( ); // invoke-virtual {v3}, Lcom/wiyun/engine/actions/ScaleTo;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v3, Lcom/wiyun/engine/actions/ScaleTo; */
(( com.wiyun.engine.actions.ScaleTo ) v3 ).reverse ( ); // invoke-virtual {v3}, Lcom/wiyun/engine/actions/ScaleTo;->reverse()Lcom/wiyun/engine/actions/IntervalAction;
(( com.wiyun.engine.actions.IntervalAction ) v4 ).autoRelease ( ); // invoke-virtual {v4}, Lcom/wiyun/engine/actions/IntervalAction;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v4, Lcom/wiyun/engine/actions/ScaleTo; */
/* new-array v5, v10, [Lcom/wiyun/engine/actions/FiniteTimeAction; */
/* aput-object v2, v5, v8 */
/* aput-object v1, v5, v7 */
com.wiyun.engine.actions.Sequence .make ( v0,v5 );
(( com.wiyun.engine.actions.Sequence ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/actions/Sequence;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/actions/IntervalAction; */
/* new-array v1, v7, [Lcom/wiyun/engine/actions/FiniteTimeAction; */
/* aput-object v4, v1, v8 */
com.wiyun.engine.actions.Sequence .make ( v3,v1 );
(( com.wiyun.engine.actions.Sequence ) v1 ).autoRelease ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/actions/Sequence;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v1, Lcom/wiyun/engine/actions/IntervalAction; */
v2 = this.sTimeLeft;
(( com.wiyun.engine.nodes.Sprite ) v2 ).runAction ( v0 ); // invoke-virtual {v2, v0}, Lcom/wiyun/engine/nodes/Sprite;->runAction(Lcom/wiyun/engine/actions/Action;)V
v0 = this.sTimeLeft;
(( com.wiyun.engine.nodes.Sprite ) v0 ).runAction ( v1 ); // invoke-virtual {v0, v1}, Lcom/wiyun/engine/nodes/Sprite;->runAction(Lcom/wiyun/engine/actions/Action;)V
v0 = this.numberScoreFinishing;
final String v1 = "%d"; // const-string v1, "%d"
/* new-array v2, v7, [Ljava/lang/Object; */
v3 = this.g;
/* iget v3, v3, Lat;->o:I */
java.lang.Integer .valueOf ( v3 );
/* aput-object v3, v2, v8 */
java.lang.String .format ( v1,v2 );
(( com.wiyun.engine.nodes.AtlasLabel ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Lcom/wiyun/engine/nodes/AtlasLabel;->setText(Ljava/lang/String;)V
v0 = this.numberScoreFinishing;
v1 = this.rFinishScoreText;
v1 = (( com.wiyun.engine.types.WYRect ) v1 ).midX ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/types/WYRect;->midX()F
v2 = this.rFinishScoreText;
v2 = (( com.wiyun.engine.types.WYRect ) v2 ).midY ( ); // invoke-virtual {v2}, Lcom/wiyun/engine/types/WYRect;->midY()F
(( com.wiyun.engine.nodes.AtlasLabel ) v0 ).setPosition ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/wiyun/engine/nodes/AtlasLabel;->setPosition(FF)V
v0 = this.numberScoreFinishing;
(( com.wiyun.engine.nodes.AtlasLabel ) v0 ).setVisible ( v7 ); // invoke-virtual {v0, v7}, Lcom/wiyun/engine/nodes/AtlasLabel;->setVisible(Z)V
com.wiyun.engine.actions.Hide .make ( );
(( com.wiyun.engine.actions.Hide ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/actions/Hide;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/actions/FiniteTimeAction; */
com.wiyun.engine.actions.DelayTime .make ( v11 );
(( com.wiyun.engine.actions.DelayTime ) v1 ).autoRelease ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/actions/DelayTime;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v1, Lcom/wiyun/engine/actions/FiniteTimeAction; */
/* const/high16 v2, 0x40000000 # 2.0f */
v3 = this.rFinishScoreText;
v3 = (( com.wiyun.engine.types.WYRect ) v3 ).midX ( ); // invoke-virtual {v3}, Lcom/wiyun/engine/types/WYRect;->midX()F
v4 = this.rFinishScoreText;
v4 = (( com.wiyun.engine.types.WYRect ) v4 ).midY ( ); // invoke-virtual {v4}, Lcom/wiyun/engine/types/WYRect;->midY()F
v5 = this.rScoreText;
v5 = (( com.wiyun.engine.types.WYRect ) v5 ).midX ( ); // invoke-virtual {v5}, Lcom/wiyun/engine/types/WYRect;->midX()F
v6 = this.rScoreText;
v6 = (( com.wiyun.engine.types.WYRect ) v6 ).midY ( ); // invoke-virtual {v6}, Lcom/wiyun/engine/types/WYRect;->midY()F
com.wiyun.engine.actions.MoveTo .make ( v2,v3,v4,v5,v6 );
(( com.wiyun.engine.actions.MoveTo ) v2 ).autoRelease ( ); // invoke-virtual {v2}, Lcom/wiyun/engine/actions/MoveTo;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v2, Lcom/wiyun/engine/actions/MoveTo; */
/* new-array v3, v10, [Lcom/wiyun/engine/actions/FiniteTimeAction; */
/* aput-object v2, v3, v8 */
/* aput-object v0, v3, v7 */
com.wiyun.engine.actions.Sequence .make ( v1,v3 );
v1 = this.numberScoreFinishing;
(( com.wiyun.engine.nodes.AtlasLabel ) v1 ).runAction ( v0 ); // invoke-virtual {v1, v0}, Lcom/wiyun/engine/nodes/AtlasLabel;->runAction(Lcom/wiyun/engine/actions/Action;)V
/* const/high16 v0, 0x40400000 # 3.0f */
/* iget v1, p0, Llqh/china/lianliankancgrbw/LayerGame;->numberScoreFinishingScaleInit:F */
/* const/high16 v2, 0x40000000 # 2.0f */
/* mul-float/2addr v1, v2 */
/* const/high16 v2, 0x3f000000 # 0.5f */
com.wiyun.engine.actions.ScaleTo .make ( v0,v1,v2 );
v1 = this.numberScoreFinishing;
(( com.wiyun.engine.nodes.AtlasLabel ) v1 ).runAction ( v0 ); // invoke-virtual {v1, v0}, Lcom/wiyun/engine/nodes/AtlasLabel;->runAction(Lcom/wiyun/engine/actions/Action;)V
ay .a ( v0 );
v0 = this.particle_manager;
/* const v1, 0x3f99999a # 1.2f */
(( lqh.china.lianliankancgrbw.PubParticleManager ) v0 ).of_play_particle_fireup ( v1 ); // invoke-virtual {v0, v1}, Llqh/china/lianliankancgrbw/PubParticleManager;->of_play_particle_fireup(F)V
v0 = this.g;
/* iget v0, v0, Lat;->o:I */
/* const/16 v1, 0x5dc */
/* if-le v0, v1, :cond_3 */
int v0 = 4; // const/4 v0, 0x4
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_play_effect ( v0, v9 ); // invoke-virtual {p0, v0, v9}, Llqh/china/lianliankancgrbw/LayerGame;->of_play_effect(II)V
} // :cond_2
} // :goto_1
/* new-instance v0, Lcom/wiyun/engine/utils/TargetSelector; */
final String v1 = "of_score_adding_one( float , int )"; // const-string v1, "of_score_adding_one( float , int )"
/* new-array v2, v10, [Ljava/lang/Object; */
/* const/high16 v3, 0x3fc00000 # 1.5f */
java.lang.Float .valueOf ( v3 );
/* aput-object v3, v2, v8 */
v3 = this.g;
/* iget v3, v3, Lat;->o:I */
java.lang.Integer .valueOf ( v3 );
/* aput-object v3, v2, v7 */
/* invoke-direct {v0, p0, v1, v2}, Lcom/wiyun/engine/utils/TargetSelector;-><init>(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V */
/* const/high16 v1, 0x40000000 # 2.0f */
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).scheduleOnce ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Llqh/china/lianliankancgrbw/LayerGame;->scheduleOnce(Lcom/wiyun/engine/utils/TargetSelector;F)V
/* goto/16 :goto_0 */
} // :cond_3
v0 = this.g;
/* iget v0, v0, Lat;->o:I */
/* const/16 v1, 0x44c */
/* if-le v0, v1, :cond_4 */
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_play_effect ( v9, v9 ); // invoke-virtual {p0, v9, v9}, Llqh/china/lianliankancgrbw/LayerGame;->of_play_effect(II)V
} // :cond_4
v0 = this.g;
/* iget v0, v0, Lat;->o:I */
/* const/16 v1, 0x258 */
/* if-le v0, v1, :cond_5 */
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_play_effect ( v10, v9 ); // invoke-virtual {p0, v10, v9}, Llqh/china/lianliankancgrbw/LayerGame;->of_play_effect(II)V
} // :cond_5
v0 = this.g;
/* iget v0, v0, Lat;->o:I */
/* const/16 v1, 0xc8 */
/* if-lt v0, v1, :cond_2 */
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_play_effect ( v7, v9 ); // invoke-virtual {p0, v7, v9}, Llqh/china/lianliankancgrbw/LayerGame;->of_play_effect(II)V
} // .end method
private void of_play_combo_number ( ) {
/* .locals 10 */
int v9 = 4; // const/4 v9, 0x4
/* const/high16 v8, 0x3fc00000 # 1.5f */
/* const/high16 v6, 0x41a80000 # 21.0f */
/* const/high16 v5, 0x41c80000 # 25.0f */
int v4 = 0; // const/4 v4, 0x0
v0 = this.g;
/* iget v0, v0, Lat;->d:I */
int v1 = 1; // const/4 v1, 0x1
/* if-eq v0, v1, :cond_1 */
} // :cond_0
} // :goto_0
return;
} // :cond_1
v0 = this.g;
/* iget v0, v0, Lat;->I:I */
int v1 = 2; // const/4 v1, 0x2
/* if-lt v0, v1, :cond_0 */
com.wiyun.engine.nodes.CharMap .make ( );
(( com.wiyun.engine.nodes.CharMap ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/CharMap;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* const/high16 v1, 0x41a00000 # 20.0f */
v1 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v1 ); // invoke-virtual {p0, v1}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v2 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v5 ); // invoke-virtual {p0, v5}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
com.wiyun.engine.types.WYRect .make ( v4,v4,v1,v2 );
/* const/16 v2, 0x30 */
(( com.wiyun.engine.nodes.CharMap ) v0 ).mapChar ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/wiyun/engine/nodes/CharMap;->mapChar(Lcom/wiyun/engine/types/WYRect;I)V
/* const/high16 v1, 0x41a00000 # 20.0f */
v1 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v1 ); // invoke-virtual {p0, v1}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
/* const/high16 v2, 0x41200000 # 10.0f */
v2 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v2 ); // invoke-virtual {p0, v2}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v3 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v5 ); // invoke-virtual {p0, v5}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
com.wiyun.engine.types.WYRect .make ( v1,v4,v2,v3 );
/* const/16 v2, 0x31 */
(( com.wiyun.engine.nodes.CharMap ) v0 ).mapChar ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/wiyun/engine/nodes/CharMap;->mapChar(Lcom/wiyun/engine/types/WYRect;I)V
/* const/high16 v1, 0x41f00000 # 30.0f */
v1 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v1 ); // invoke-virtual {p0, v1}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v2 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v6 ); // invoke-virtual {p0, v6}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v3 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v5 ); // invoke-virtual {p0, v5}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
com.wiyun.engine.types.WYRect .make ( v1,v4,v2,v3 );
/* const/16 v2, 0x32 */
(( com.wiyun.engine.nodes.CharMap ) v0 ).mapChar ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/wiyun/engine/nodes/CharMap;->mapChar(Lcom/wiyun/engine/types/WYRect;I)V
/* const/high16 v1, 0x424c0000 # 51.0f */
v1 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v1 ); // invoke-virtual {p0, v1}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v2 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v6 ); // invoke-virtual {p0, v6}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v3 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v5 ); // invoke-virtual {p0, v5}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
com.wiyun.engine.types.WYRect .make ( v1,v4,v2,v3 );
/* const/16 v2, 0x33 */
(( com.wiyun.engine.nodes.CharMap ) v0 ).mapChar ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/wiyun/engine/nodes/CharMap;->mapChar(Lcom/wiyun/engine/types/WYRect;I)V
/* const/high16 v1, 0x42900000 # 72.0f */
v1 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v1 ); // invoke-virtual {p0, v1}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v2 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v6 ); // invoke-virtual {p0, v6}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v3 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v5 ); // invoke-virtual {p0, v5}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
com.wiyun.engine.types.WYRect .make ( v1,v4,v2,v3 );
/* const/16 v2, 0x34 */
(( com.wiyun.engine.nodes.CharMap ) v0 ).mapChar ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/wiyun/engine/nodes/CharMap;->mapChar(Lcom/wiyun/engine/types/WYRect;I)V
/* const/high16 v1, 0x42ba0000 # 93.0f */
v1 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v1 ); // invoke-virtual {p0, v1}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v2 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v6 ); // invoke-virtual {p0, v6}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v3 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v5 ); // invoke-virtual {p0, v5}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
com.wiyun.engine.types.WYRect .make ( v1,v4,v2,v3 );
/* const/16 v2, 0x35 */
(( com.wiyun.engine.nodes.CharMap ) v0 ).mapChar ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/wiyun/engine/nodes/CharMap;->mapChar(Lcom/wiyun/engine/types/WYRect;I)V
/* const/high16 v1, 0x42e40000 # 114.0f */
v1 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v1 ); // invoke-virtual {p0, v1}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v2 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v6 ); // invoke-virtual {p0, v6}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v3 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v5 ); // invoke-virtual {p0, v5}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
com.wiyun.engine.types.WYRect .make ( v1,v4,v2,v3 );
/* const/16 v2, 0x36 */
(( com.wiyun.engine.nodes.CharMap ) v0 ).mapChar ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/wiyun/engine/nodes/CharMap;->mapChar(Lcom/wiyun/engine/types/WYRect;I)V
/* const/high16 v1, 0x43070000 # 135.0f */
v1 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v1 ); // invoke-virtual {p0, v1}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v2 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v6 ); // invoke-virtual {p0, v6}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v3 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v5 ); // invoke-virtual {p0, v5}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
com.wiyun.engine.types.WYRect .make ( v1,v4,v2,v3 );
/* const/16 v2, 0x37 */
(( com.wiyun.engine.nodes.CharMap ) v0 ).mapChar ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/wiyun/engine/nodes/CharMap;->mapChar(Lcom/wiyun/engine/types/WYRect;I)V
/* const/high16 v1, 0x431c0000 # 156.0f */
v1 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v1 ); // invoke-virtual {p0, v1}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v2 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v6 ); // invoke-virtual {p0, v6}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v3 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v5 ); // invoke-virtual {p0, v5}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
com.wiyun.engine.types.WYRect .make ( v1,v4,v2,v3 );
/* const/16 v2, 0x38 */
(( com.wiyun.engine.nodes.CharMap ) v0 ).mapChar ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/wiyun/engine/nodes/CharMap;->mapChar(Lcom/wiyun/engine/types/WYRect;I)V
/* const/high16 v1, 0x43310000 # 177.0f */
v1 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v1 ); // invoke-virtual {p0, v1}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v2 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v6 ); // invoke-virtual {p0, v6}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v3 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v5 ); // invoke-virtual {p0, v5}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
com.wiyun.engine.types.WYRect .make ( v1,v4,v2,v3 );
/* const/16 v2, 0x39 */
(( com.wiyun.engine.nodes.CharMap ) v0 ).mapChar ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/wiyun/engine/nodes/CharMap;->mapChar(Lcom/wiyun/engine/types/WYRect;I)V
/* const v1, 0x7f020058 */
com.wiyun.engine.opengl.Texture2D .make ( v1 );
final String v2 = "%d"; // const-string v2, "%d"
int v3 = 1; // const/4 v3, 0x1
/* new-array v3, v3, [Ljava/lang/Object; */
int v4 = 0; // const/4 v4, 0x0
v5 = this.g;
/* iget v5, v5, Lat;->I:I */
java.lang.Integer .valueOf ( v5 );
/* aput-object v5, v3, v4 */
java.lang.String .format ( v2,v3 );
com.wiyun.engine.nodes.AtlasLabel .make ( v2,v1,v0 );
(( com.wiyun.engine.nodes.AtlasLabel ) v2 ).autoRelease ( ); // invoke-virtual {v2}, Lcom/wiyun/engine/nodes/AtlasLabel;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
v0 = (( com.wiyun.engine.opengl.Texture2D ) v1 ).getPixelHeight ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/opengl/Texture2D;->getPixelHeight()I
v1 = this.rComboNumber;
v1 = this.size;
/* iget v1, v1, Lcom/wiyun/engine/types/WYSize;->height:F */
/* int-to-float v0, v0 */
/* div-float v0, v1, v0 */
/* const v1, 0x3f4ccccd # 0.8f */
/* mul-float/2addr v1, v0 */
(( com.wiyun.engine.nodes.AtlasLabel ) v2 ).setScale ( v1, v0 ); // invoke-virtual {v2, v1, v0}, Lcom/wiyun/engine/nodes/AtlasLabel;->setScale(FF)V
v0 = this.rComboText;
v0 = this.size;
/* iget v0, v0, Lcom/wiyun/engine/types/WYSize;->height:F */
/* const/high16 v1, 0x40000000 # 2.0f */
/* mul-float/2addr v1, v0 */
v0 = this.rComboText;
v0 = (( com.wiyun.engine.types.WYRect ) v0 ).midX ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/types/WYRect;->midX()F
v3 = this.rComboText;
v3 = (( com.wiyun.engine.types.WYRect ) v3 ).midY ( ); // invoke-virtual {v3}, Lcom/wiyun/engine/types/WYRect;->midY()F
com.wiyun.engine.types.WYPoint .make ( v0,v3 );
v0 = this.rComboNumber;
v0 = (( com.wiyun.engine.types.WYRect ) v0 ).midX ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/types/WYRect;->midX()F
v4 = this.rComboNumber;
v4 = (( com.wiyun.engine.types.WYRect ) v4 ).midY ( ); // invoke-virtual {v4}, Lcom/wiyun/engine/types/WYRect;->midY()F
com.wiyun.engine.types.WYPoint .make ( v0,v4 );
(( com.wiyun.engine.nodes.AtlasLabel ) v2 ).setPosition ( v0 ); // invoke-virtual {v2, v0}, Lcom/wiyun/engine/nodes/AtlasLabel;->setPosition(Lcom/wiyun/engine/types/WYPoint;)V
v4 = this.rComboText;
/* const v5, 0x7f02006d */
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_create_label_sprite ( v4, v5, v9 ); // invoke-virtual {p0, v4, v5, v9}, Llqh/china/lianliankancgrbw/LayerGame;->of_create_label_sprite(Lcom/wiyun/engine/types/WYRect;II)Lcom/wiyun/engine/nodes/Sprite;
(( com.wiyun.engine.nodes.Sprite ) v4 ).autoRelease ( ); // invoke-virtual {v4}, Lcom/wiyun/engine/nodes/Sprite;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* iget v5, v0, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v6, v0, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* iget v7, v0, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v0, v0, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* add-float/2addr v0, v1 */
com.wiyun.engine.actions.MoveTo .make ( v8,v5,v6,v7,v0 );
(( com.wiyun.engine.actions.MoveTo ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/actions/MoveTo;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/actions/MoveTo; */
(( com.wiyun.engine.nodes.AtlasLabel ) v2 ).runAction ( v0 ); // invoke-virtual {v2, v0}, Lcom/wiyun/engine/nodes/AtlasLabel;->runAction(Lcom/wiyun/engine/actions/Action;)V
com.wiyun.engine.actions.FadeOut .make ( v8 );
(( com.wiyun.engine.actions.FadeOut ) v5 ).autoRelease ( ); // invoke-virtual {v5}, Lcom/wiyun/engine/actions/FadeOut;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
(( com.wiyun.engine.nodes.AtlasLabel ) v2 ).runAction ( v5 ); // invoke-virtual {v2, v5}, Lcom/wiyun/engine/nodes/AtlasLabel;->runAction(Lcom/wiyun/engine/actions/Action;)V
/* iget v0, v3, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v6, v3, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* iget v7, v3, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v3, v3, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* add-float/2addr v1, v3 */
com.wiyun.engine.actions.MoveTo .make ( v8,v0,v6,v7,v1 );
(( com.wiyun.engine.actions.MoveTo ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/actions/MoveTo;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/actions/MoveTo; */
(( com.wiyun.engine.nodes.Sprite ) v4 ).runAction ( v0 ); // invoke-virtual {v4, v0}, Lcom/wiyun/engine/nodes/Sprite;->runAction(Lcom/wiyun/engine/actions/Action;)V
com.wiyun.engine.actions.FadeOut .make ( v8 );
(( com.wiyun.engine.actions.FadeOut ) v5 ).autoRelease ( ); // invoke-virtual {v5}, Lcom/wiyun/engine/actions/FadeOut;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
(( com.wiyun.engine.nodes.Sprite ) v4 ).runAction ( v0 ); // invoke-virtual {v4, v0}, Lcom/wiyun/engine/nodes/Sprite;->runAction(Lcom/wiyun/engine/actions/Action;)V
v0 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_get_tag ( ); // invoke-virtual {p0}, Llqh/china/lianliankancgrbw/LayerGame;->of_get_tag()I
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).addChild ( v2, v9, v0 ); // invoke-virtual {p0, v2, v9, v0}, Llqh/china/lianliankancgrbw/LayerGame;->addChild(Lcom/wiyun/engine/nodes/Node;II)V
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_remove_by_time ( v8, v0 ); // invoke-virtual {p0, v8, v0}, Llqh/china/lianliankancgrbw/LayerGame;->of_remove_by_time(FI)V
v0 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_get_tag ( ); // invoke-virtual {p0}, Llqh/china/lianliankancgrbw/LayerGame;->of_get_tag()I
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).addChild ( v4, v9, v0 ); // invoke-virtual {p0, v4, v9, v0}, Llqh/china/lianliankancgrbw/LayerGame;->addChild(Lcom/wiyun/engine/nodes/Node;II)V
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_remove_by_time ( v8, v0 ); // invoke-virtual {p0, v8, v0}, Llqh/china/lianliankancgrbw/LayerGame;->of_remove_by_time(FI)V
/* goto/16 :goto_0 */
} // .end method
private void of_play_score_adding ( Integer p0, com.wiyun.engine.types.WYPoint p1 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, p1, p2, v0}, Llqh/china/lianliankancgrbw/LayerGame;->of_play_score_adding(ILcom/wiyun/engine/types/WYPoint;F)V */
return;
} // .end method
private void of_play_score_adding ( Integer p0, com.wiyun.engine.types.WYPoint p1, Float p2 ) {
/* .locals 8 */
/* const/high16 v3, 0x41a00000 # 20.0f */
/* const/high16 v7, 0x3fc00000 # 1.5f */
/* const/high16 v5, 0x41a80000 # 21.0f */
/* const/high16 v4, 0x41c80000 # 25.0f */
int v6 = 0; // const/4 v6, 0x0
com.wiyun.engine.nodes.CharMap .make ( );
(( com.wiyun.engine.nodes.CharMap ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/CharMap;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
v1 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v3 ); // invoke-virtual {p0, v3}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v2 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v4 ); // invoke-virtual {p0, v4}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
com.wiyun.engine.types.WYRect .make ( v6,v6,v1,v2 );
/* const/16 v2, 0x30 */
(( com.wiyun.engine.nodes.CharMap ) v0 ).mapChar ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/wiyun/engine/nodes/CharMap;->mapChar(Lcom/wiyun/engine/types/WYRect;I)V
v1 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v3 ); // invoke-virtual {p0, v3}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
/* const/high16 v2, 0x41200000 # 10.0f */
v2 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v2 ); // invoke-virtual {p0, v2}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v3 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v4 ); // invoke-virtual {p0, v4}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
com.wiyun.engine.types.WYRect .make ( v1,v6,v2,v3 );
/* const/16 v2, 0x31 */
(( com.wiyun.engine.nodes.CharMap ) v0 ).mapChar ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/wiyun/engine/nodes/CharMap;->mapChar(Lcom/wiyun/engine/types/WYRect;I)V
/* const/high16 v1, 0x41f00000 # 30.0f */
v1 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v1 ); // invoke-virtual {p0, v1}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v2 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v5 ); // invoke-virtual {p0, v5}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v3 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v4 ); // invoke-virtual {p0, v4}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
com.wiyun.engine.types.WYRect .make ( v1,v6,v2,v3 );
/* const/16 v2, 0x32 */
(( com.wiyun.engine.nodes.CharMap ) v0 ).mapChar ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/wiyun/engine/nodes/CharMap;->mapChar(Lcom/wiyun/engine/types/WYRect;I)V
/* const/high16 v1, 0x424c0000 # 51.0f */
v1 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v1 ); // invoke-virtual {p0, v1}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v2 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v5 ); // invoke-virtual {p0, v5}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v3 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v4 ); // invoke-virtual {p0, v4}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
com.wiyun.engine.types.WYRect .make ( v1,v6,v2,v3 );
/* const/16 v2, 0x33 */
(( com.wiyun.engine.nodes.CharMap ) v0 ).mapChar ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/wiyun/engine/nodes/CharMap;->mapChar(Lcom/wiyun/engine/types/WYRect;I)V
/* const/high16 v1, 0x42900000 # 72.0f */
v1 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v1 ); // invoke-virtual {p0, v1}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v2 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v5 ); // invoke-virtual {p0, v5}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v3 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v4 ); // invoke-virtual {p0, v4}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
com.wiyun.engine.types.WYRect .make ( v1,v6,v2,v3 );
/* const/16 v2, 0x34 */
(( com.wiyun.engine.nodes.CharMap ) v0 ).mapChar ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/wiyun/engine/nodes/CharMap;->mapChar(Lcom/wiyun/engine/types/WYRect;I)V
/* const/high16 v1, 0x42ba0000 # 93.0f */
v1 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v1 ); // invoke-virtual {p0, v1}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v2 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v5 ); // invoke-virtual {p0, v5}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v3 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v4 ); // invoke-virtual {p0, v4}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
com.wiyun.engine.types.WYRect .make ( v1,v6,v2,v3 );
/* const/16 v2, 0x35 */
(( com.wiyun.engine.nodes.CharMap ) v0 ).mapChar ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/wiyun/engine/nodes/CharMap;->mapChar(Lcom/wiyun/engine/types/WYRect;I)V
/* const/high16 v1, 0x42e40000 # 114.0f */
v1 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v1 ); // invoke-virtual {p0, v1}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v2 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v5 ); // invoke-virtual {p0, v5}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v3 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v4 ); // invoke-virtual {p0, v4}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
com.wiyun.engine.types.WYRect .make ( v1,v6,v2,v3 );
/* const/16 v2, 0x36 */
(( com.wiyun.engine.nodes.CharMap ) v0 ).mapChar ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/wiyun/engine/nodes/CharMap;->mapChar(Lcom/wiyun/engine/types/WYRect;I)V
/* const/high16 v1, 0x43070000 # 135.0f */
v1 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v1 ); // invoke-virtual {p0, v1}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v2 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v5 ); // invoke-virtual {p0, v5}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v3 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v4 ); // invoke-virtual {p0, v4}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
com.wiyun.engine.types.WYRect .make ( v1,v6,v2,v3 );
/* const/16 v2, 0x37 */
(( com.wiyun.engine.nodes.CharMap ) v0 ).mapChar ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/wiyun/engine/nodes/CharMap;->mapChar(Lcom/wiyun/engine/types/WYRect;I)V
/* const/high16 v1, 0x431c0000 # 156.0f */
v1 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v1 ); // invoke-virtual {p0, v1}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v2 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v5 ); // invoke-virtual {p0, v5}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v3 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v4 ); // invoke-virtual {p0, v4}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
com.wiyun.engine.types.WYRect .make ( v1,v6,v2,v3 );
/* const/16 v2, 0x38 */
(( com.wiyun.engine.nodes.CharMap ) v0 ).mapChar ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/wiyun/engine/nodes/CharMap;->mapChar(Lcom/wiyun/engine/types/WYRect;I)V
/* const/high16 v1, 0x43310000 # 177.0f */
v1 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v1 ); // invoke-virtual {p0, v1}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v2 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v5 ); // invoke-virtual {p0, v5}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v3 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v4 ); // invoke-virtual {p0, v4}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
com.wiyun.engine.types.WYRect .make ( v1,v6,v2,v3 );
/* const/16 v2, 0x39 */
(( com.wiyun.engine.nodes.CharMap ) v0 ).mapChar ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/wiyun/engine/nodes/CharMap;->mapChar(Lcom/wiyun/engine/types/WYRect;I)V
/* const v1, 0x7f020058 */
com.wiyun.engine.opengl.Texture2D .make ( v1 );
final String v2 = "%d"; // const-string v2, "%d"
int v3 = 1; // const/4 v3, 0x1
/* new-array v3, v3, [Ljava/lang/Object; */
int v4 = 0; // const/4 v4, 0x0
java.lang.Integer .valueOf ( p1 );
/* aput-object v5, v3, v4 */
java.lang.String .format ( v2,v3 );
com.wiyun.engine.nodes.AtlasLabel .make ( v2,v1,v0 );
(( com.wiyun.engine.nodes.AtlasLabel ) v2 ).autoRelease ( ); // invoke-virtual {v2}, Lcom/wiyun/engine/nodes/AtlasLabel;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
v0 = (( com.wiyun.engine.opengl.Texture2D ) v1 ).getPixelHeight ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/opengl/Texture2D;->getPixelHeight()I
/* iget v1, p0, Llqh/china/lianliankancgrbw/LayerGame;->boxlength:F */
/* int-to-float v0, v0 */
/* div-float v0, v1, v0 */
/* const v1, 0x3f4ccccd # 0.8f */
/* mul-float/2addr v0, v1 */
/* cmpl-float v1, p3, v6 */
/* if-lez v1, :cond_0 */
} // :goto_0
(( com.wiyun.engine.nodes.AtlasLabel ) v2 ).setPosition ( p2 ); // invoke-virtual {v2, p2}, Lcom/wiyun/engine/nodes/AtlasLabel;->setPosition(Lcom/wiyun/engine/types/WYPoint;)V
/* iget v0, p2, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v1, p2, Lcom/wiyun/engine/types/WYPoint;->y:F */
v3 = this.rScoreText;
v3 = (( com.wiyun.engine.types.WYRect ) v3 ).minX ( ); // invoke-virtual {v3}, Lcom/wiyun/engine/types/WYRect;->minX()F
v4 = this.rScoreText;
v4 = this.size;
/* iget v4, v4, Lcom/wiyun/engine/types/WYSize;->height:F */
/* const/high16 v5, 0x40000000 # 2.0f */
/* div-float/2addr v4, v5 */
/* add-float/2addr v3, v4 */
v4 = this.rScoreText;
v4 = (( com.wiyun.engine.types.WYRect ) v4 ).midY ( ); // invoke-virtual {v4}, Lcom/wiyun/engine/types/WYRect;->midY()F
com.wiyun.engine.actions.MoveTo .make ( v7,v0,v1,v3,v4 );
(( com.wiyun.engine.actions.MoveTo ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/actions/MoveTo;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/actions/MoveTo; */
(( com.wiyun.engine.nodes.AtlasLabel ) v2 ).runAction ( v0 ); // invoke-virtual {v2, v0}, Lcom/wiyun/engine/nodes/AtlasLabel;->runAction(Lcom/wiyun/engine/actions/Action;)V
/* const/high16 v0, 0x3f000000 # 0.5f */
com.wiyun.engine.actions.ScaleTo .make ( v7,p3,v0 );
/* const/16 v1, 0x64 */
(( com.wiyun.engine.nodes.AtlasLabel ) v2 ).setAlpha ( v1 ); // invoke-virtual {v2, v1}, Lcom/wiyun/engine/nodes/AtlasLabel;->setAlpha(I)V
(( com.wiyun.engine.actions.ScaleTo ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/actions/ScaleTo;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
(( com.wiyun.engine.nodes.AtlasLabel ) v2 ).runAction ( v0 ); // invoke-virtual {v2, v0}, Lcom/wiyun/engine/nodes/AtlasLabel;->runAction(Lcom/wiyun/engine/actions/Action;)V
v0 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_get_tag ( ); // invoke-virtual {p0}, Llqh/china/lianliankancgrbw/LayerGame;->of_get_tag()I
int v1 = 3; // const/4 v1, 0x3
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).addChild ( v2, v1, v0 ); // invoke-virtual {p0, v2, v1, v0}, Llqh/china/lianliankancgrbw/LayerGame;->addChild(Lcom/wiyun/engine/nodes/Node;II)V
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_remove_by_time ( v7, v0 ); // invoke-virtual {p0, v7, v0}, Llqh/china/lianliankancgrbw/LayerGame;->of_remove_by_time(FI)V
/* new-instance v0, Lcom/wiyun/engine/utils/TargetSelector; */
final String v1 = "of_score_adding_one( float , int )"; // const-string v1, "of_score_adding_one( float , int )"
int v2 = 2; // const/4 v2, 0x2
/* new-array v2, v2, [Ljava/lang/Object; */
int v3 = 0; // const/4 v3, 0x0
java.lang.Float .valueOf ( v7 );
/* aput-object v4, v2, v3 */
int v3 = 1; // const/4 v3, 0x1
java.lang.Integer .valueOf ( p1 );
/* aput-object v4, v2, v3 */
/* invoke-direct {v0, p0, v1, v2}, Lcom/wiyun/engine/utils/TargetSelector;-><init>(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V */
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).scheduleOnce ( v0, v7 ); // invoke-virtual {p0, v0, v7}, Llqh/china/lianliankancgrbw/LayerGame;->scheduleOnce(Lcom/wiyun/engine/utils/TargetSelector;F)V
return;
} // :cond_0
/* move p3, v0 */
} // .end method
private void of_score_add ( Integer p0 ) {
/* .locals 3 */
int v2 = 1; // const/4 v2, 0x1
v0 = this.g;
/* iget v1, v0, Lat;->i:I */
/* add-int/2addr v1, p1 */
/* iput v1, v0, Lat;->i:I */
v0 = this.g;
/* iget v0, v0, Lat;->i:I */
v1 = this.g;
/* iget v1, v1, Lat;->h:I */
/* if-le v0, v1, :cond_0 */
v0 = this.g;
v1 = this.g;
/* iget v1, v1, Lat;->i:I */
/* iput v1, v0, Lat;->h:I */
v0 = this.g;
/* iget-boolean v0, v0, Lat;->n:Z */
/* if-nez v0, :cond_0 */
v0 = this.g;
/* iput-boolean v2, v0, Lat;->n:Z */
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_play_new_record ( ); // invoke-virtual {p0}, Llqh/china/lianliankancgrbw/LayerGame;->of_play_new_record()V
} // :cond_0
v0 = this.g;
/* iget v0, v0, Lat;->i:I */
v1 = this.g;
/* iget v1, v1, Lat;->k:I */
/* if-le v0, v1, :cond_1 */
v0 = this.g;
v1 = this.g;
/* iget v1, v1, Lat;->i:I */
/* iput v1, v0, Lat;->k:I */
v0 = this.g;
/* iput-boolean v2, v0, Lat;->l:Z */
} // :cond_1
return;
} // .end method
private void of_set_background ( ) {
/* .locals 8 */
/* const/high16 v7, 0x42800000 # 64.0f */
int v6 = 0; // const/4 v6, 0x0
int v5 = 0; // const/4 v5, 0x0
com.wiyun.engine.nodes.Director .getInstance ( );
(( com.wiyun.engine.nodes.Director ) v0 ).getWindowSize ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->getWindowSize()Lcom/wiyun/engine/types/WYSize;
/* iget v1, v0, Lcom/wiyun/engine/types/WYSize;->width:F */
/* const/high16 v2, 0x43f00000 # 480.0f */
/* div-float/2addr v1, v2 */
/* const/high16 v2, 0x7f020000 */
com.wiyun.engine.nodes.Sprite .make ( v2 );
(( com.wiyun.engine.nodes.Sprite ) v2 ).setAnchor ( v5, v5 ); // invoke-virtual {v2, v5, v5}, Lcom/wiyun/engine/nodes/Sprite;->setAnchor(FF)V
(( com.wiyun.engine.nodes.Sprite ) v2 ).setPosition ( v5, v5 ); // invoke-virtual {v2, v5, v5}, Lcom/wiyun/engine/nodes/Sprite;->setPosition(FF)V
/* iget v3, v0, Lcom/wiyun/engine/types/WYSize;->width:F */
/* iget v4, v0, Lcom/wiyun/engine/types/WYSize;->height:F */
(( com.wiyun.engine.nodes.Sprite ) v2 ).setContentSize ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Lcom/wiyun/engine/nodes/Sprite;->setContentSize(FF)V
int v3 = 1; // const/4 v3, 0x1
(( com.wiyun.engine.nodes.Sprite ) v2 ).setAutoFit ( v3 ); // invoke-virtual {v2, v3}, Lcom/wiyun/engine/nodes/Sprite;->setAutoFit(Z)V
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).addChild ( v2, v6 ); // invoke-virtual {p0, v2, v6}, Llqh/china/lianliankancgrbw/LayerGame;->addChild(Lcom/wiyun/engine/nodes/Node;I)V
/* iget v2, v0, Lcom/wiyun/engine/types/WYSize;->height:F */
/* mul-float v3, v1, v7 */
/* sub-float/2addr v2, v3 */
/* iget v3, v0, Lcom/wiyun/engine/types/WYSize;->width:F */
/* mul-float v4, v1, v7 */
com.wiyun.engine.types.WYRect .make ( v5,v2,v3,v4 );
/* const v3, 0x7f02005d */
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_create_label_sprite ( v2, v3, v6 ); // invoke-virtual {p0, v2, v3, v6}, Llqh/china/lianliankancgrbw/LayerGame;->of_create_label_sprite(Lcom/wiyun/engine/types/WYRect;II)Lcom/wiyun/engine/nodes/Sprite;
v2 = this.rPanelGame;
/* const v3, 0x7f02005a */
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_create_label_sprite ( v2, v3, v6 ); // invoke-virtual {p0, v2, v3, v6}, Llqh/china/lianliankancgrbw/LayerGame;->of_create_label_sprite(Lcom/wiyun/engine/types/WYRect;II)Lcom/wiyun/engine/nodes/Sprite;
/* iget v0, v0, Lcom/wiyun/engine/types/WYSize;->width:F */
/* const/high16 v2, 0x42c60000 # 99.0f */
/* mul-float/2addr v1, v2 */
com.wiyun.engine.types.WYRect .make ( v5,v5,v0,v1 );
/* const v1, 0x7f020059 */
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_create_label_sprite ( v0, v1, v6 ); // invoke-virtual {p0, v0, v1, v6}, Llqh/china/lianliankancgrbw/LayerGame;->of_create_label_sprite(Lcom/wiyun/engine/types/WYRect;II)Lcom/wiyun/engine/nodes/Sprite;
return;
} // .end method
/* # virtual methods */
public void jDraw ( ) {
/* .locals 0 */
return;
} // .end method
public void jOnEnter ( ) {
/* .locals 0 */
return;
} // .end method
public void jOnEnterTransitionDidFinish ( ) {
/* .locals 1 */
v0 = this.g;
v0 = this.b;
aj .c ( );
return;
} // .end method
public void jOnExit ( ) {
/* .locals 0 */
return;
} // .end method
public void of_begin ( ) {
/* .locals 5 */
int v4 = 1; // const/4 v4, 0x1
int v3 = 0; // const/4 v3, 0x0
v0 = this.g;
v1 = this.g;
v1 = this.a;
v2 = this.g;
/* iget v2, v2, Lat;->e:I */
v1 = ax .a ( v1,v2 );
/* iput v1, v0, Lat;->h:I */
v0 = this.g;
v1 = this.g;
v1 = this.a;
v2 = this.g;
/* iget v2, v2, Lat;->e:I */
v1 = ax .b ( v1,v2 );
/* iput v1, v0, Lat;->k:I */
v0 = this.g;
/* iput-boolean v3, v0, Lat;->l:Z */
v0 = this.g;
/* iput v3, v0, Lat;->i:I */
v0 = this.g;
/* iput v3, v0, Lat;->j:I */
v0 = this.g;
v0 = this.g;
/* iput v4, v0, Lat;->f:I */
v0 = this.g;
v1 = this.g;
v1 = (( at ) v1 ).d ( ); // invoke-virtual {v1}, Lat;->d()I
/* iput v1, v0, Lat;->g:I */
v0 = this.g;
/* iput-boolean v3, v0, Lat;->n:Z */
v0 = this.g;
(( at ) v0 ).a ( ); // invoke-virtual {v0}, Lat;->a()V
v0 = this.g;
(( at ) v0 ).b ( ); // invoke-virtual {v0}, Lat;->b()V
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_begin_load_do ( ); // invoke-virtual {p0}, Llqh/china/lianliankancgrbw/LayerGame;->of_begin_load_do()V
v0 = this.g;
(( at ) v0 ).a ( v4 ); // invoke-virtual {v0, v4}, Lat;->a(I)V
return;
} // .end method
public void of_begin_load_do ( ) {
/* .locals 7 */
/* const v6, 0x3dcccccd # 0.1f */
int v5 = 0; // const/4 v5, 0x0
int v1 = -1; // const/4 v1, -0x1
int v4 = 1; // const/4 v4, 0x1
v0 = this.g;
/* iput v4, v0, Lat;->d:I */
v0 = this.g;
/* iput v1, v0, Lat;->E:I */
v0 = this.g;
/* iput v1, v0, Lat;->D:I */
v0 = this.g;
/* iput v1, v0, Lat;->G:I */
v0 = this.g;
/* iput v1, v0, Lat;->F:I */
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_init_sprites ( ); // invoke-virtual {p0}, Llqh/china/lianliankancgrbw/LayerGame;->of_init_sprites()V
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).setTouchEnabled ( v4 ); // invoke-virtual {p0, v4}, Llqh/china/lianliankancgrbw/LayerGame;->setTouchEnabled(Z)V
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_reset_number_show ( ); // invoke-virtual {p0}, Llqh/china/lianliankancgrbw/LayerGame;->of_reset_number_show()V
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_play_screen_init ( ); // invoke-virtual {p0}, Llqh/china/lianliankancgrbw/LayerGame;->of_play_screen_init()V
java.lang.Boolean .valueOf ( v5 );
this.ib_stop_timer = v0;
/* new-instance v0, Lcom/wiyun/engine/utils/TargetSelector; */
final String v1 = "of_timer_gaming(float)"; // const-string v1, "of_timer_gaming(float)"
/* new-array v2, v4, [Ljava/lang/Object; */
java.lang.Float .valueOf ( v6 );
/* aput-object v3, v2, v5 */
/* invoke-direct {v0, p0, v1, v2}, Lcom/wiyun/engine/utils/TargetSelector;-><init>(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V */
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).scheduleOnce ( v0, v6 ); // invoke-virtual {p0, v0, v6}, Llqh/china/lianliankancgrbw/LayerGame;->scheduleOnce(Lcom/wiyun/engine/utils/TargetSelector;F)V
v0 = this.g;
/* iget-boolean v0, v0, Lat;->n:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.sShowNewRecord;
(( com.wiyun.engine.nodes.Sprite ) v0 ).setVisible ( v4 ); // invoke-virtual {v0, v4}, Lcom/wiyun/engine/nodes/Sprite;->setVisible(Z)V
} // :goto_0
/* iput-boolean v4, p0, Llqh/china/lianliankancgrbw/LayerGame;->ib_can_exit_and_savegame:Z */
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).setTouchEnabled ( v4 ); // invoke-virtual {p0, v4}, Llqh/china/lianliankancgrbw/LayerGame;->setTouchEnabled(Z)V
return;
} // :cond_0
v0 = this.sShowNewRecord;
(( com.wiyun.engine.nodes.Sprite ) v0 ).setVisible ( v5 ); // invoke-virtual {v0, v5}, Lcom/wiyun/engine/nodes/Sprite;->setVisible(Z)V
} // .end method
public void of_begin_next ( Float p0 ) {
/* .locals 3 */
int v1 = 0; // const/4 v1, 0x0
int v2 = 1; // const/4 v2, 0x1
v0 = this.g;
/* iget-boolean v0, v0, Lat;->M:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.g;
/* iput-boolean v1, v0, Lat;->M:Z */
v0 = this.g;
/* iget-boolean v0, v0, Lat;->N:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.g;
/* iput-boolean v1, v0, Lat;->N:Z */
v0 = this.g;
v0 = (( at ) v0 ).b ( v2 ); // invoke-virtual {v0, v2}, Lat;->b(I)Z
/* if-nez v0, :cond_0 */
v0 = this.g;
(( at ) v0 ).a ( ); // invoke-virtual {v0}, Lat;->a()V
} // :cond_0
} // :goto_0
v0 = this.g;
v1 = this.g;
v1 = (( at ) v1 ).d ( ); // invoke-virtual {v1}, Lat;->d()I
/* iput v1, v0, Lat;->g:I */
v0 = this.g;
(( at ) v0 ).b ( ); // invoke-virtual {v0}, Lat;->b()V
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_begin_load_do ( ); // invoke-virtual {p0}, Llqh/china/lianliankancgrbw/LayerGame;->of_begin_load_do()V
v0 = this.g;
(( at ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lat;->a(I)V
} // :goto_1
return;
} // :cond_1
v0 = this.g;
/* iput-boolean v2, v0, Lat;->M:Z */
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_begin_next_restart_layer ( ); // invoke-virtual {p0}, Llqh/china/lianliankancgrbw/LayerGame;->of_begin_next_restart_layer()V
} // :cond_2
v0 = this.g;
(( at ) v0 ).a ( ); // invoke-virtual {v0}, Lat;->a()V
v0 = this.g;
/* iget v1, v0, Lat;->f:I */
/* add-int/lit8 v1, v1, 0x1 */
/* iput v1, v0, Lat;->f:I */
} // .end method
public void of_begin_next_restart_layer ( ) {
/* .locals 3 */
com.wiyun.engine.nodes.Scene .make ( );
/* new-instance v1, Llqh/china/lianliankancgrbw/LayerGame; */
v2 = this.g;
/* invoke-direct {v1, v2}, Llqh/china/lianliankancgrbw/LayerGame;-><init>(Lat;)V */
int v2 = 0; // const/4 v2, 0x0
(( com.wiyun.engine.nodes.Scene ) v0 ).addChild ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/wiyun/engine/nodes/Scene;->addChild(Lcom/wiyun/engine/nodes/Node;I)V
int v1 = 1; // const/4 v1, 0x1
(( com.wiyun.engine.nodes.Scene ) v0 ).autoRelease ( v1 ); // invoke-virtual {v0, v1}, Lcom/wiyun/engine/nodes/Scene;->autoRelease(Z)Lcom/wiyun/engine/nodes/Node;
com.wiyun.engine.nodes.Director .getInstance ( );
(( com.wiyun.engine.nodes.Director ) v1 ).replaceScene ( v0 ); // invoke-virtual {v1, v0}, Lcom/wiyun/engine/nodes/Director;->replaceScene(Lcom/wiyun/engine/nodes/Scene;)V
return;
} // .end method
public void of_button_down_imitate ( com.wiyun.engine.nodes.Sprite p0 ) {
/* .locals 4 */
/* const v0, 0x3dcccccd # 0.1f */
/* const v1, 0x3f99999a # 1.2f */
com.wiyun.engine.actions.ScaleBy .make ( v0,v1 );
(( com.wiyun.engine.actions.ScaleBy ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/actions/ScaleBy;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/actions/IntervalAction; */
(( com.wiyun.engine.actions.IntervalAction ) v0 ).reverse ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/actions/IntervalAction;->reverse()Lcom/wiyun/engine/actions/IntervalAction;
(( com.wiyun.engine.actions.IntervalAction ) v1 ).autoRelease ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/actions/IntervalAction;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v1, Lcom/wiyun/engine/actions/IntervalAction; */
int v2 = 1; // const/4 v2, 0x1
/* new-array v2, v2, [Lcom/wiyun/engine/actions/FiniteTimeAction; */
int v3 = 0; // const/4 v3, 0x0
/* aput-object v1, v2, v3 */
com.wiyun.engine.actions.Sequence .make ( v0,v2 );
(( com.wiyun.engine.actions.Sequence ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/actions/Sequence;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/actions/IntervalAction; */
(( com.wiyun.engine.nodes.Sprite ) p1 ).runAction ( v0 ); // invoke-virtual {p1, v0}, Lcom/wiyun/engine/nodes/Sprite;->runAction(Lcom/wiyun/engine/actions/Action;)V
return;
} // .end method
public void of_create_number_show ( ) {
/* .locals 9 */
int v8 = 1; // const/4 v8, 0x1
/* const/high16 v7, 0x3f000000 # 0.5f */
/* const/high16 v6, 0x41a80000 # 21.0f */
/* const/high16 v5, 0x41c80000 # 25.0f */
int v4 = 0; // const/4 v4, 0x0
com.wiyun.engine.nodes.CharMap .make ( );
(( com.wiyun.engine.nodes.CharMap ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/CharMap;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* const/high16 v1, 0x41a00000 # 20.0f */
v1 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v1 ); // invoke-virtual {p0, v1}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v2 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v5 ); // invoke-virtual {p0, v5}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
com.wiyun.engine.types.WYRect .make ( v4,v4,v1,v2 );
/* const/16 v2, 0x30 */
(( com.wiyun.engine.nodes.CharMap ) v0 ).mapChar ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/wiyun/engine/nodes/CharMap;->mapChar(Lcom/wiyun/engine/types/WYRect;I)V
/* const/high16 v1, 0x41a00000 # 20.0f */
v1 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v1 ); // invoke-virtual {p0, v1}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
/* const/high16 v2, 0x41200000 # 10.0f */
v2 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v2 ); // invoke-virtual {p0, v2}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v3 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v5 ); // invoke-virtual {p0, v5}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
com.wiyun.engine.types.WYRect .make ( v1,v4,v2,v3 );
/* const/16 v2, 0x31 */
(( com.wiyun.engine.nodes.CharMap ) v0 ).mapChar ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/wiyun/engine/nodes/CharMap;->mapChar(Lcom/wiyun/engine/types/WYRect;I)V
/* const/high16 v1, 0x41f00000 # 30.0f */
v1 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v1 ); // invoke-virtual {p0, v1}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v2 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v6 ); // invoke-virtual {p0, v6}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v3 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v5 ); // invoke-virtual {p0, v5}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
com.wiyun.engine.types.WYRect .make ( v1,v4,v2,v3 );
/* const/16 v2, 0x32 */
(( com.wiyun.engine.nodes.CharMap ) v0 ).mapChar ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/wiyun/engine/nodes/CharMap;->mapChar(Lcom/wiyun/engine/types/WYRect;I)V
/* const/high16 v1, 0x424c0000 # 51.0f */
v1 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v1 ); // invoke-virtual {p0, v1}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v2 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v6 ); // invoke-virtual {p0, v6}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v3 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v5 ); // invoke-virtual {p0, v5}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
com.wiyun.engine.types.WYRect .make ( v1,v4,v2,v3 );
/* const/16 v2, 0x33 */
(( com.wiyun.engine.nodes.CharMap ) v0 ).mapChar ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/wiyun/engine/nodes/CharMap;->mapChar(Lcom/wiyun/engine/types/WYRect;I)V
/* const/high16 v1, 0x42900000 # 72.0f */
v1 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v1 ); // invoke-virtual {p0, v1}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v2 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v6 ); // invoke-virtual {p0, v6}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v3 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v5 ); // invoke-virtual {p0, v5}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
com.wiyun.engine.types.WYRect .make ( v1,v4,v2,v3 );
/* const/16 v2, 0x34 */
(( com.wiyun.engine.nodes.CharMap ) v0 ).mapChar ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/wiyun/engine/nodes/CharMap;->mapChar(Lcom/wiyun/engine/types/WYRect;I)V
/* const/high16 v1, 0x42ba0000 # 93.0f */
v1 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v1 ); // invoke-virtual {p0, v1}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v2 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v6 ); // invoke-virtual {p0, v6}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v3 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v5 ); // invoke-virtual {p0, v5}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
com.wiyun.engine.types.WYRect .make ( v1,v4,v2,v3 );
/* const/16 v2, 0x35 */
(( com.wiyun.engine.nodes.CharMap ) v0 ).mapChar ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/wiyun/engine/nodes/CharMap;->mapChar(Lcom/wiyun/engine/types/WYRect;I)V
/* const/high16 v1, 0x42e40000 # 114.0f */
v1 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v1 ); // invoke-virtual {p0, v1}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v2 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v6 ); // invoke-virtual {p0, v6}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v3 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v5 ); // invoke-virtual {p0, v5}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
com.wiyun.engine.types.WYRect .make ( v1,v4,v2,v3 );
/* const/16 v2, 0x36 */
(( com.wiyun.engine.nodes.CharMap ) v0 ).mapChar ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/wiyun/engine/nodes/CharMap;->mapChar(Lcom/wiyun/engine/types/WYRect;I)V
/* const/high16 v1, 0x43070000 # 135.0f */
v1 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v1 ); // invoke-virtual {p0, v1}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v2 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v6 ); // invoke-virtual {p0, v6}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v3 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v5 ); // invoke-virtual {p0, v5}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
com.wiyun.engine.types.WYRect .make ( v1,v4,v2,v3 );
/* const/16 v2, 0x37 */
(( com.wiyun.engine.nodes.CharMap ) v0 ).mapChar ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/wiyun/engine/nodes/CharMap;->mapChar(Lcom/wiyun/engine/types/WYRect;I)V
/* const/high16 v1, 0x431c0000 # 156.0f */
v1 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v1 ); // invoke-virtual {p0, v1}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v2 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v6 ); // invoke-virtual {p0, v6}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v3 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v5 ); // invoke-virtual {p0, v5}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
com.wiyun.engine.types.WYRect .make ( v1,v4,v2,v3 );
/* const/16 v2, 0x38 */
(( com.wiyun.engine.nodes.CharMap ) v0 ).mapChar ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/wiyun/engine/nodes/CharMap;->mapChar(Lcom/wiyun/engine/types/WYRect;I)V
/* const/high16 v1, 0x43310000 # 177.0f */
v1 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v1 ); // invoke-virtual {p0, v1}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v2 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v6 ); // invoke-virtual {p0, v6}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
v3 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v5 ); // invoke-virtual {p0, v5}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
com.wiyun.engine.types.WYRect .make ( v1,v4,v2,v3 );
/* const/16 v2, 0x39 */
(( com.wiyun.engine.nodes.CharMap ) v0 ).mapChar ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/wiyun/engine/nodes/CharMap;->mapChar(Lcom/wiyun/engine/types/WYRect;I)V
/* const v1, 0x7f020058 */
com.wiyun.engine.opengl.Texture2D .make ( v1 );
final String v2 = "0"; // const-string v2, "0"
com.wiyun.engine.nodes.AtlasLabel .make ( v2,v1,v0 );
this.numberMaxScore = v2;
final String v2 = "0"; // const-string v2, "0"
com.wiyun.engine.nodes.AtlasLabel .make ( v2,v1,v0 );
this.numberCurrentScore = v2;
final String v2 = "0"; // const-string v2, "0"
com.wiyun.engine.nodes.AtlasLabel .make ( v2,v1,v0 );
this.numberLevel = v2;
final String v2 = "0"; // const-string v2, "0"
com.wiyun.engine.nodes.AtlasLabel .make ( v2,v1,v0 );
this.numberScoreFinishing = v0;
v0 = this.numberMaxScore;
(( com.wiyun.engine.nodes.AtlasLabel ) v0 ).setAnchor ( v4, v7 ); // invoke-virtual {v0, v4, v7}, Lcom/wiyun/engine/nodes/AtlasLabel;->setAnchor(FF)V
v0 = this.numberCurrentScore;
(( com.wiyun.engine.nodes.AtlasLabel ) v0 ).setAnchor ( v4, v7 ); // invoke-virtual {v0, v4, v7}, Lcom/wiyun/engine/nodes/AtlasLabel;->setAnchor(FF)V
v0 = this.numberLevel;
(( com.wiyun.engine.nodes.AtlasLabel ) v0 ).setAnchor ( v7, v7 ); // invoke-virtual {v0, v7, v7}, Lcom/wiyun/engine/nodes/AtlasLabel;->setAnchor(FF)V
v0 = this.numberScoreFinishing;
(( com.wiyun.engine.nodes.AtlasLabel ) v0 ).setAnchor ( v7, v7 ); // invoke-virtual {v0, v7, v7}, Lcom/wiyun/engine/nodes/AtlasLabel;->setAnchor(FF)V
v0 = this.numberMaxScore;
v2 = this.rHighScoreText;
v2 = (( com.wiyun.engine.types.WYRect ) v2 ).minX ( ); // invoke-virtual {v2}, Lcom/wiyun/engine/types/WYRect;->minX()F
v3 = this.rHighScoreText;
v3 = (( com.wiyun.engine.types.WYRect ) v3 ).midY ( ); // invoke-virtual {v3}, Lcom/wiyun/engine/types/WYRect;->midY()F
(( com.wiyun.engine.nodes.AtlasLabel ) v0 ).setPosition ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Lcom/wiyun/engine/nodes/AtlasLabel;->setPosition(FF)V
v0 = this.numberMaxScore;
v2 = this.rHighScoreText;
v2 = this.size;
/* iget v2, v2, Lcom/wiyun/engine/types/WYSize;->width:F */
v3 = this.rHighScoreText;
v3 = this.size;
/* iget v3, v3, Lcom/wiyun/engine/types/WYSize;->height:F */
(( com.wiyun.engine.nodes.AtlasLabel ) v0 ).setContentSize ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Lcom/wiyun/engine/nodes/AtlasLabel;->setContentSize(FF)V
v0 = this.numberCurrentScore;
v2 = this.rScoreText;
v2 = (( com.wiyun.engine.types.WYRect ) v2 ).minX ( ); // invoke-virtual {v2}, Lcom/wiyun/engine/types/WYRect;->minX()F
v3 = this.rScoreText;
v3 = (( com.wiyun.engine.types.WYRect ) v3 ).midY ( ); // invoke-virtual {v3}, Lcom/wiyun/engine/types/WYRect;->midY()F
(( com.wiyun.engine.nodes.AtlasLabel ) v0 ).setPosition ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Lcom/wiyun/engine/nodes/AtlasLabel;->setPosition(FF)V
v0 = this.numberCurrentScore;
v2 = this.rScoreText;
v2 = this.size;
/* iget v2, v2, Lcom/wiyun/engine/types/WYSize;->width:F */
v3 = this.rScoreText;
v3 = this.size;
/* iget v3, v3, Lcom/wiyun/engine/types/WYSize;->height:F */
(( com.wiyun.engine.nodes.AtlasLabel ) v0 ).setContentSize ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Lcom/wiyun/engine/nodes/AtlasLabel;->setContentSize(FF)V
v0 = this.numberLevel;
v2 = this.rLevelText;
v2 = (( com.wiyun.engine.types.WYRect ) v2 ).midX ( ); // invoke-virtual {v2}, Lcom/wiyun/engine/types/WYRect;->midX()F
v3 = this.rLevelText;
v3 = (( com.wiyun.engine.types.WYRect ) v3 ).midY ( ); // invoke-virtual {v3}, Lcom/wiyun/engine/types/WYRect;->midY()F
(( com.wiyun.engine.nodes.AtlasLabel ) v0 ).setPosition ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Lcom/wiyun/engine/nodes/AtlasLabel;->setPosition(FF)V
v0 = this.numberLevel;
v2 = this.rLevelText;
v2 = this.size;
/* iget v2, v2, Lcom/wiyun/engine/types/WYSize;->width:F */
v3 = this.rLevelText;
v3 = this.size;
/* iget v3, v3, Lcom/wiyun/engine/types/WYSize;->height:F */
(( com.wiyun.engine.nodes.AtlasLabel ) v0 ).setContentSize ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Lcom/wiyun/engine/nodes/AtlasLabel;->setContentSize(FF)V
v0 = this.numberScoreFinishing;
v2 = this.rFinishScoreText;
v2 = (( com.wiyun.engine.types.WYRect ) v2 ).midX ( ); // invoke-virtual {v2}, Lcom/wiyun/engine/types/WYRect;->midX()F
v3 = this.rFinishScoreText;
v3 = (( com.wiyun.engine.types.WYRect ) v3 ).midY ( ); // invoke-virtual {v3}, Lcom/wiyun/engine/types/WYRect;->midY()F
(( com.wiyun.engine.nodes.AtlasLabel ) v0 ).setPosition ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Lcom/wiyun/engine/nodes/AtlasLabel;->setPosition(FF)V
v0 = this.numberScoreFinishing;
v2 = this.rFinishScoreText;
v2 = this.size;
/* iget v2, v2, Lcom/wiyun/engine/types/WYSize;->width:F */
v3 = this.rFinishScoreText;
v3 = this.size;
/* iget v3, v3, Lcom/wiyun/engine/types/WYSize;->height:F */
(( com.wiyun.engine.nodes.AtlasLabel ) v0 ).setContentSize ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Lcom/wiyun/engine/nodes/AtlasLabel;->setContentSize(FF)V
v0 = this.numberMaxScore;
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).addChild ( v0, v8 ); // invoke-virtual {p0, v0, v8}, Llqh/china/lianliankancgrbw/LayerGame;->addChild(Lcom/wiyun/engine/nodes/Node;I)V
v0 = this.numberCurrentScore;
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).addChild ( v0, v8 ); // invoke-virtual {p0, v0, v8}, Llqh/china/lianliankancgrbw/LayerGame;->addChild(Lcom/wiyun/engine/nodes/Node;I)V
v0 = this.numberLevel;
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).addChild ( v0, v8 ); // invoke-virtual {p0, v0, v8}, Llqh/china/lianliankancgrbw/LayerGame;->addChild(Lcom/wiyun/engine/nodes/Node;I)V
v0 = this.numberScoreFinishing;
int v2 = 3; // const/4 v2, 0x3
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).addChild ( v0, v2 ); // invoke-virtual {p0, v0, v2}, Llqh/china/lianliankancgrbw/LayerGame;->addChild(Lcom/wiyun/engine/nodes/Node;I)V
v0 = (( com.wiyun.engine.opengl.Texture2D ) v1 ).getPixelHeight ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/opengl/Texture2D;->getPixelHeight()I
v1 = this.rScoreText;
v1 = this.size;
/* iget v1, v1, Lcom/wiyun/engine/types/WYSize;->height:F */
/* int-to-float v2, v0 */
/* div-float/2addr v1, v2 */
/* const v2, 0x3f333333 # 0.7f */
/* mul-float/2addr v2, v1 */
v3 = this.numberMaxScore;
(( com.wiyun.engine.nodes.AtlasLabel ) v3 ).setScale ( v2, v1 ); // invoke-virtual {v3, v2, v1}, Lcom/wiyun/engine/nodes/AtlasLabel;->setScale(FF)V
v3 = this.numberCurrentScore;
(( com.wiyun.engine.nodes.AtlasLabel ) v3 ).setScale ( v2, v1 ); // invoke-virtual {v3, v2, v1}, Lcom/wiyun/engine/nodes/AtlasLabel;->setScale(FF)V
v3 = this.numberLevel;
(( com.wiyun.engine.nodes.AtlasLabel ) v3 ).setScale ( v2, v1 ); // invoke-virtual {v3, v2, v1}, Lcom/wiyun/engine/nodes/AtlasLabel;->setScale(FF)V
v1 = this.numberMaxScore;
(( com.wiyun.engine.nodes.AtlasLabel ) v1 ).setAlignment ( v8 ); // invoke-virtual {v1, v8}, Lcom/wiyun/engine/nodes/AtlasLabel;->setAlignment(I)V
v1 = this.numberCurrentScore;
(( com.wiyun.engine.nodes.AtlasLabel ) v1 ).setAlignment ( v8 ); // invoke-virtual {v1, v8}, Lcom/wiyun/engine/nodes/AtlasLabel;->setAlignment(I)V
v1 = this.numberLevel;
(( com.wiyun.engine.nodes.AtlasLabel ) v1 ).setAlignment ( v8 ); // invoke-virtual {v1, v8}, Lcom/wiyun/engine/nodes/AtlasLabel;->setAlignment(I)V
v1 = this.rFinishScoreText;
v1 = this.size;
/* iget v1, v1, Lcom/wiyun/engine/types/WYSize;->height:F */
/* int-to-float v0, v0 */
/* div-float v0, v1, v0 */
/* iput v0, p0, Llqh/china/lianliankancgrbw/LayerGame;->numberScoreFinishingScaleInit:F */
v0 = this.numberScoreFinishing;
/* iget v1, p0, Llqh/china/lianliankancgrbw/LayerGame;->numberScoreFinishingScaleInit:F */
(( com.wiyun.engine.nodes.AtlasLabel ) v0 ).setScale ( v1 ); // invoke-virtual {v0, v1}, Lcom/wiyun/engine/nodes/AtlasLabel;->setScale(F)V
v0 = this.numberScoreFinishing;
int v1 = 0; // const/4 v1, 0x0
(( com.wiyun.engine.nodes.AtlasLabel ) v0 ).setVisible ( v1 ); // invoke-virtual {v0, v1}, Lcom/wiyun/engine/nodes/AtlasLabel;->setVisible(Z)V
/* const v0, 0x3f99999a # 1.2f */
/* const v1, 0x3f666666 # 0.9f */
com.wiyun.engine.actions.ScaleTo .make ( v7,v0,v1 );
(( com.wiyun.engine.actions.ScaleTo ) v0 ).reverse ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/actions/ScaleTo;->reverse()Lcom/wiyun/engine/actions/IntervalAction;
/* new-array v2, v8, [Lcom/wiyun/engine/actions/FiniteTimeAction; */
int v3 = 0; // const/4 v3, 0x0
/* aput-object v1, v2, v3 */
com.wiyun.engine.actions.Sequence .make ( v0,v2 );
(( com.wiyun.engine.actions.Sequence ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/actions/Sequence;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/actions/IntervalAction; */
com.wiyun.engine.actions.RepeatForever .make ( v0 );
(( com.wiyun.engine.actions.RepeatForever ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/actions/RepeatForever;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_reset_number_show ( ); // invoke-virtual {p0}, Llqh/china/lianliankancgrbw/LayerGame;->of_reset_number_show()V
return;
} // .end method
public void of_dialog_exit ( Float p0 ) {
/* .locals 12 */
/* const v0, 0x7f04000a */
int v1 = 2; // const/4 v1, 0x2
com.wiyun.engine.utils.BitmapFont .loadFont ( v0,v1 );
final String v1 = "Alert"; // const-string v1, "Alert"
com.wiyun.engine.nodes.BitmapFontLabel .make ( v0,v1 );
(( com.wiyun.engine.nodes.BitmapFontLabel ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/BitmapFontLabel;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
com.wiyun.engine.nodes.Director .getInstance ( );
(( com.wiyun.engine.nodes.Director ) v1 ).getContext ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
/* const v2, 0x7f050002 */
(( android.content.Context ) v1 ).getString ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;
/* const/high16 v2, 0x41800000 # 16.0f */
int v3 = 1; // const/4 v3, 0x1
com.wiyun.engine.nodes.Label .make ( v1,v2,v3 );
/* new-instance v1, Lcom/wiyun/engine/types/WYColor3B; */
int v2 = 0; // const/4 v2, 0x0
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
/* invoke-direct {v1, v2, v4, v5}, Lcom/wiyun/engine/types/WYColor3B;-><init>(III)V */
(( com.wiyun.engine.nodes.Label ) v3 ).setColor ( v1 ); // invoke-virtual {v3, v1}, Lcom/wiyun/engine/nodes/Label;->setColor(Lcom/wiyun/engine/types/WYColor3B;)V
(( com.wiyun.engine.nodes.Label ) v3 ).autoRelease ( ); // invoke-virtual {v3}, Lcom/wiyun/engine/nodes/Label;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* const v1, 0x7f020010 */
com.wiyun.engine.opengl.Texture2D .make ( v1 );
/* const/high16 v2, 0x43020000 # 130.0f */
v2 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v2 ); // invoke-virtual {p0, v2}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
/* const/high16 v4, 0x41a00000 # 20.0f */
v4 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v4 ); // invoke-virtual {p0, v4}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
/* const/high16 v5, 0x3f800000 # 1.0f */
v5 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v5 ); // invoke-virtual {p0, v5}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
/* const/high16 v6, 0x3f800000 # 1.0f */
v6 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v6 ); // invoke-virtual {p0, v6}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
com.wiyun.engine.types.WYRect .make ( v2,v4,v5,v6 );
com.wiyun.engine.nodes.NinePatchSprite .make ( v1,v2 );
(( com.wiyun.engine.nodes.NinePatchSprite ) v6 ).autoRelease ( ); // invoke-virtual {v6}, Lcom/wiyun/engine/nodes/NinePatchSprite;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* const v1, 0x7f020011 */
com.wiyun.engine.opengl.Texture2D .make ( v1 );
com.wiyun.engine.nodes.Sprite .make ( v1 );
final String v2 = "OK"; // const-string v2, "OK"
/* const/high16 v4, 0x41a00000 # 20.0f */
com.wiyun.engine.nodes.Label .make ( v2,v4 );
/* new-instance v4, Lcom/wiyun/engine/types/WYColor3B; */
/* const/16 v5, 0x60 */
/* const/16 v7, 0x38 */
/* const/16 v8, 0x13 */
/* invoke-direct {v4, v5, v7, v8}, Lcom/wiyun/engine/types/WYColor3B;-><init>(III)V */
(( com.wiyun.engine.nodes.Label ) v2 ).setColor ( v4 ); // invoke-virtual {v2, v4}, Lcom/wiyun/engine/nodes/Label;->setColor(Lcom/wiyun/engine/types/WYColor3B;)V
(( com.wiyun.engine.nodes.Sprite ) v1 ).autoRelease ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/nodes/Sprite;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
(( com.wiyun.engine.nodes.Label ) v2 ).autoRelease ( ); // invoke-virtual {v2}, Lcom/wiyun/engine/nodes/Label;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* const v4, 0x7f020011 */
com.wiyun.engine.opengl.Texture2D .make ( v4 );
com.wiyun.engine.nodes.Sprite .make ( v4 );
final String v5 = "Cancel"; // const-string v5, "Cancel"
/* const/high16 v7, 0x41a00000 # 20.0f */
com.wiyun.engine.nodes.Label .make ( v5,v7 );
/* new-instance v7, Lcom/wiyun/engine/types/WYColor3B; */
/* const/16 v8, 0x60 */
/* const/16 v9, 0x38 */
/* const/16 v10, 0x13 */
/* invoke-direct {v7, v8, v9, v10}, Lcom/wiyun/engine/types/WYColor3B;-><init>(III)V */
(( com.wiyun.engine.nodes.Label ) v5 ).setColor ( v7 ); // invoke-virtual {v5, v7}, Lcom/wiyun/engine/nodes/Label;->setColor(Lcom/wiyun/engine/types/WYColor3B;)V
(( com.wiyun.engine.nodes.Sprite ) v4 ).autoRelease ( ); // invoke-virtual {v4}, Lcom/wiyun/engine/nodes/Sprite;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
(( com.wiyun.engine.nodes.Label ) v5 ).autoRelease ( ); // invoke-virtual {v5}, Lcom/wiyun/engine/nodes/Label;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
com.wiyun.engine.dialog.Dialog .make ( );
(( com.wiyun.engine.dialog.Dialog ) v7 ).a ( v6 ); // invoke-virtual {v7, v6}, Lcom/wiyun/engine/dialog/Dialog;->a(Lcom/wiyun/engine/nodes/Node;)Lcom/wiyun/engine/dialog/Dialog;
/* const/high16 v8, 0x41a00000 # 20.0f */
v8 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v8 ); // invoke-virtual {p0, v8}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
/* const/high16 v9, 0x41a00000 # 20.0f */
v9 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v9 ); // invoke-virtual {p0, v9}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
/* const/high16 v10, 0x41a00000 # 20.0f */
v10 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v10 ); // invoke-virtual {p0, v10}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
/* const/high16 v11, 0x41700000 # 15.0f */
v11 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v11 ); // invoke-virtual {p0, v11}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
(( com.wiyun.engine.dialog.Dialog ) v6 ).a ( v8, v9, v10, v11 ); // invoke-virtual {v6, v8, v9, v10, v11}, Lcom/wiyun/engine/dialog/Dialog;->a(FFFF)Lcom/wiyun/engine/dialog/Dialog;
(( com.wiyun.engine.dialog.Dialog ) v6 ).b ( v0 ); // invoke-virtual {v6, v0}, Lcom/wiyun/engine/dialog/Dialog;->b(Lcom/wiyun/engine/nodes/Node;)Lcom/wiyun/engine/dialog/Dialog;
(( com.wiyun.engine.dialog.Dialog ) v0 ).c ( v3 ); // invoke-virtual {v0, v3}, Lcom/wiyun/engine/dialog/Dialog;->c(Lcom/wiyun/engine/nodes/Node;)Lcom/wiyun/engine/dialog/Dialog;
/* new-instance v3, Lcom/wiyun/engine/utils/TargetSelector; */
final String v6 = "onOKButton(float,Object)"; // const-string v6, "onOKButton(float,Object)"
int v8 = 2; // const/4 v8, 0x2
/* new-array v8, v8, [Ljava/lang/Object; */
int v9 = 0; // const/4 v9, 0x0
int v10 = 0; // const/4 v10, 0x0
java.lang.Float .valueOf ( v10 );
/* aput-object v10, v8, v9 */
int v9 = 1; // const/4 v9, 0x1
/* aput-object v7, v8, v9 */
/* invoke-direct {v3, p0, v6, v8}, Lcom/wiyun/engine/utils/TargetSelector;-><init>(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V */
int v6 = 0; // const/4 v6, 0x0
/* invoke-virtual/range {v0 ..v6}, Lcom/wiyun/engine/dialog/Dialog;->a(Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/utils/TargetSelector;)Lcom/wiyun/engine/dialog/Dialog; */
com.wiyun.engine.dialog.DialogPopupTransition .make ( );
(( com.wiyun.engine.dialog.Dialog ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/wiyun/engine/dialog/Dialog;->a(Lcom/wiyun/engine/dialog/DialogTransition;)Lcom/wiyun/engine/dialog/Dialog;
int v1 = 1; // const/4 v1, 0x1
(( com.wiyun.engine.dialog.Dialog ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/wiyun/engine/dialog/Dialog;->a(I)Lcom/wiyun/engine/dialog/Dialog;
int v1 = 1; // const/4 v1, 0x1
(( com.wiyun.engine.dialog.Dialog ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/wiyun/engine/dialog/Dialog;->a(Z)Lcom/wiyun/engine/dialog/Dialog;
(( com.wiyun.engine.dialog.Dialog ) v7 ).autoRelease ( ); // invoke-virtual {v7}, Lcom/wiyun/engine/dialog/Dialog;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
return;
} // .end method
public void of_dialog_fail ( Float p0 ) {
/* .locals 12 */
/* const v0, 0x7f04000a */
int v1 = 2; // const/4 v1, 0x2
com.wiyun.engine.utils.BitmapFont .loadFont ( v0,v1 );
final String v1 = "Alert"; // const-string v1, "Alert"
com.wiyun.engine.nodes.BitmapFontLabel .make ( v0,v1 );
(( com.wiyun.engine.nodes.BitmapFontLabel ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/BitmapFontLabel;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* const v1, 0x3f4ccccd # 0.8f */
/* const v2, 0x3f4ccccd # 0.8f */
(( com.wiyun.engine.nodes.BitmapFontLabel ) v0 ).setScale ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/wiyun/engine/nodes/BitmapFontLabel;->setScale(FF)V
/* const/high16 v1, 0x40000000 # 2.0f */
(( com.wiyun.engine.nodes.BitmapFontLabel ) v0 ).setLineSpacing ( v1 ); // invoke-virtual {v0, v1}, Lcom/wiyun/engine/nodes/BitmapFontLabel;->setLineSpacing(F)V
com.wiyun.engine.nodes.Director .getInstance ( );
(( com.wiyun.engine.nodes.Director ) v1 ).getContext ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
final String v1 = " Do you want to retry ?\n "; // const-string v1, " Do you want to retry ?\n "
/* const/high16 v2, 0x41a00000 # 20.0f */
int v3 = 1; // const/4 v3, 0x1
com.wiyun.engine.nodes.Label .make ( v1,v2,v3 );
/* new-instance v1, Lcom/wiyun/engine/types/WYColor3B; */
int v2 = 0; // const/4 v2, 0x0
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
/* invoke-direct {v1, v2, v4, v5}, Lcom/wiyun/engine/types/WYColor3B;-><init>(III)V */
(( com.wiyun.engine.nodes.Label ) v3 ).setColor ( v1 ); // invoke-virtual {v3, v1}, Lcom/wiyun/engine/nodes/Label;->setColor(Lcom/wiyun/engine/types/WYColor3B;)V
(( com.wiyun.engine.nodes.Label ) v3 ).autoRelease ( ); // invoke-virtual {v3}, Lcom/wiyun/engine/nodes/Label;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* const v1, 0x7f020010 */
com.wiyun.engine.opengl.Texture2D .make ( v1 );
/* const/high16 v2, 0x43020000 # 130.0f */
v2 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v2 ); // invoke-virtual {p0, v2}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
/* const/high16 v4, 0x41a00000 # 20.0f */
v4 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v4 ); // invoke-virtual {p0, v4}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
/* const/high16 v5, 0x3f800000 # 1.0f */
v5 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v5 ); // invoke-virtual {p0, v5}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
/* const/high16 v6, 0x3f800000 # 1.0f */
v6 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v6 ); // invoke-virtual {p0, v6}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
com.wiyun.engine.types.WYRect .make ( v2,v4,v5,v6 );
com.wiyun.engine.nodes.NinePatchSprite .make ( v1,v2 );
(( com.wiyun.engine.nodes.NinePatchSprite ) v6 ).autoRelease ( ); // invoke-virtual {v6}, Lcom/wiyun/engine/nodes/NinePatchSprite;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* const v1, 0x7f020011 */
com.wiyun.engine.opengl.Texture2D .make ( v1 );
com.wiyun.engine.nodes.Sprite .make ( v1 );
final String v2 = "Yes"; // const-string v2, "Yes"
/* const/high16 v4, 0x41a00000 # 20.0f */
com.wiyun.engine.nodes.Label .make ( v2,v4 );
/* new-instance v4, Lcom/wiyun/engine/types/WYColor3B; */
/* const/16 v5, 0x60 */
/* const/16 v7, 0x38 */
/* const/16 v8, 0x13 */
/* invoke-direct {v4, v5, v7, v8}, Lcom/wiyun/engine/types/WYColor3B;-><init>(III)V */
(( com.wiyun.engine.nodes.Label ) v2 ).setColor ( v4 ); // invoke-virtual {v2, v4}, Lcom/wiyun/engine/nodes/Label;->setColor(Lcom/wiyun/engine/types/WYColor3B;)V
(( com.wiyun.engine.nodes.Sprite ) v1 ).autoRelease ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/nodes/Sprite;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
(( com.wiyun.engine.nodes.Label ) v2 ).autoRelease ( ); // invoke-virtual {v2}, Lcom/wiyun/engine/nodes/Label;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* const v4, 0x7f020011 */
com.wiyun.engine.opengl.Texture2D .make ( v4 );
com.wiyun.engine.nodes.Sprite .make ( v4 );
final String v5 = "No"; // const-string v5, "No"
/* const/high16 v7, 0x41a00000 # 20.0f */
com.wiyun.engine.nodes.Label .make ( v5,v7 );
/* new-instance v7, Lcom/wiyun/engine/types/WYColor3B; */
/* const/16 v8, 0x60 */
/* const/16 v9, 0x38 */
/* const/16 v10, 0x13 */
/* invoke-direct {v7, v8, v9, v10}, Lcom/wiyun/engine/types/WYColor3B;-><init>(III)V */
(( com.wiyun.engine.nodes.Label ) v5 ).setColor ( v7 ); // invoke-virtual {v5, v7}, Lcom/wiyun/engine/nodes/Label;->setColor(Lcom/wiyun/engine/types/WYColor3B;)V
(( com.wiyun.engine.nodes.Sprite ) v4 ).autoRelease ( ); // invoke-virtual {v4}, Lcom/wiyun/engine/nodes/Sprite;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
(( com.wiyun.engine.nodes.Label ) v5 ).autoRelease ( ); // invoke-virtual {v5}, Lcom/wiyun/engine/nodes/Label;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
com.wiyun.engine.dialog.Dialog .make ( );
(( com.wiyun.engine.dialog.Dialog ) v7 ).a ( v6 ); // invoke-virtual {v7, v6}, Lcom/wiyun/engine/dialog/Dialog;->a(Lcom/wiyun/engine/nodes/Node;)Lcom/wiyun/engine/dialog/Dialog;
/* const/high16 v8, 0x41a00000 # 20.0f */
v8 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v8 ); // invoke-virtual {p0, v8}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
/* const/high16 v9, 0x41a00000 # 20.0f */
v9 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v9 ); // invoke-virtual {p0, v9}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
/* const/high16 v10, 0x41a00000 # 20.0f */
v10 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v10 ); // invoke-virtual {p0, v10}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
/* const/high16 v11, 0x41900000 # 18.0f */
v11 = (( lqh.china.lianliankancgrbw.LayerGame ) p0 ).DP ( v11 ); // invoke-virtual {p0, v11}, Llqh/china/lianliankancgrbw/LayerGame;->DP(F)F
(( com.wiyun.engine.dialog.Dialog ) v6 ).a ( v8, v9, v10, v11 ); // invoke-virtual {v6, v8, v9, v10, v11}, Lcom/wiyun/engine/dialog/Dialog;->a(FFFF)Lcom/wiyun/engine/dialog/Dialog;
(( com.wiyun.engine.dialog.Dialog ) v6 ).b ( v0 ); // invoke-virtual {v6, v0}, Lcom/wiyun/engine/dialog/Dialog;->b(Lcom/wiyun/engine/nodes/Node;)Lcom/wiyun/engine/dialog/Dialog;
(( com.wiyun.engine.dialog.Dialog ) v0 ).c ( v3 ); // invoke-virtual {v0, v3}, Lcom/wiyun/engine/dialog/Dialog;->c(Lcom/wiyun/engine/nodes/Node;)Lcom/wiyun/engine/dialog/Dialog;
/* new-instance v3, Lcom/wiyun/engine/utils/TargetSelector; */
final String v6 = "onFailRetry(float,Object)"; // const-string v6, "onFailRetry(float,Object)"
int v8 = 2; // const/4 v8, 0x2
/* new-array v8, v8, [Ljava/lang/Object; */
int v9 = 0; // const/4 v9, 0x0
int v10 = 0; // const/4 v10, 0x0
java.lang.Float .valueOf ( v10 );
/* aput-object v10, v8, v9 */
int v9 = 1; // const/4 v9, 0x1
/* aput-object v7, v8, v9 */
/* invoke-direct {v3, p0, v6, v8}, Lcom/wiyun/engine/utils/TargetSelector;-><init>(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V */
/* new-instance v6, Lcom/wiyun/engine/utils/TargetSelector; */
final String v8 = "onFailMenu(float,Object)"; // const-string v8, "onFailMenu(float,Object)"
int v9 = 2; // const/4 v9, 0x2
/* new-array v9, v9, [Ljava/lang/Object; */
int v10 = 0; // const/4 v10, 0x0
int v11 = 0; // const/4 v11, 0x0
java.lang.Float .valueOf ( v11 );
/* aput-object v11, v9, v10 */
int v10 = 1; // const/4 v10, 0x1
/* aput-object v7, v9, v10 */
/* invoke-direct {v6, p0, v8, v9}, Lcom/wiyun/engine/utils/TargetSelector;-><init>(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V */
/* invoke-virtual/range {v0 ..v6}, Lcom/wiyun/engine/dialog/Dialog;->a(Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/utils/TargetSelector;)Lcom/wiyun/engine/dialog/Dialog; */
com.wiyun.engine.dialog.DialogPopupTransition .make ( );
(( com.wiyun.engine.dialog.Dialog ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/wiyun/engine/dialog/Dialog;->a(Lcom/wiyun/engine/dialog/DialogTransition;)Lcom/wiyun/engine/dialog/Dialog;
int v1 = 1; // const/4 v1, 0x1
(( com.wiyun.engine.dialog.Dialog ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/wiyun/engine/dialog/Dialog;->a(I)Lcom/wiyun/engine/dialog/Dialog;
int v1 = 1; // const/4 v1, 0x1
(( com.wiyun.engine.dialog.Dialog ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/wiyun/engine/dialog/Dialog;->a(Z)Lcom/wiyun/engine/dialog/Dialog;
(( com.wiyun.engine.dialog.Dialog ) v7 ).autoRelease ( ); // invoke-virtual {v7}, Lcom/wiyun/engine/dialog/Dialog;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
return;
} // .end method
public void of_exit ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_exit ( v0 ); // invoke-virtual {p0, v0}, Llqh/china/lianliankancgrbw/LayerGame;->of_exit(F)V
return;
} // .end method
public void of_exit ( Float p0 ) {
/* .locals 5 */
int v4 = 0; // const/4 v4, 0x0
/* iget-boolean v0, p0, Llqh/china/lianliankancgrbw/LayerGame;->ib_can_exit_and_savegame:Z */
/* if-nez v0, :cond_0 */
/* new-instance v0, Lcom/wiyun/engine/utils/TargetSelector; */
final String v1 = "of_exit(float)"; // const-string v1, "of_exit(float)"
int v2 = 1; // const/4 v2, 0x1
/* new-array v2, v2, [Ljava/lang/Object; */
int v3 = 0; // const/4 v3, 0x0
java.lang.Float .valueOf ( v3 );
/* aput-object v3, v2, v4 */
/* invoke-direct {v0, p0, v1, v2}, Lcom/wiyun/engine/utils/TargetSelector;-><init>(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V */
/* const v1, 0x3e4ccccd # 0.2f */
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).scheduleOnce ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Llqh/china/lianliankancgrbw/LayerGame;->scheduleOnce(Lcom/wiyun/engine/utils/TargetSelector;F)V
} // :goto_0
return;
} // :cond_0
v0 = this.g;
(( at ) v0 ).a ( v4 ); // invoke-virtual {v0, v4}, Lat;->a(I)V
com.wiyun.engine.nodes.Director .getInstance ( );
(( com.wiyun.engine.nodes.Director ) v0 ).popScene ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->popScene()V
} // .end method
public void of_fail ( Float p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).setTouchEnabled ( v0 ); // invoke-virtual {p0, v0}, Llqh/china/lianliankancgrbw/LayerGame;->setTouchEnabled(Z)V
/* iput-boolean v0, p0, Llqh/china/lianliankancgrbw/LayerGame;->ib_can_exit_and_savegame:Z */
int v0 = 0; // const/4 v0, 0x0
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_dialog_fail ( v0 ); // invoke-virtual {p0, v0}, Llqh/china/lianliankancgrbw/LayerGame;->of_dialog_fail(F)V
return;
} // .end method
public void of_finding_msg_hide ( Float p0 ) {
/* .locals 2 */
v0 = this.sLableFinding;
int v1 = 0; // const/4 v1, 0x0
(( com.wiyun.engine.nodes.Sprite ) v0 ).setVisible ( v1 ); // invoke-virtual {v0, v1}, Lcom/wiyun/engine/nodes/Sprite;->setVisible(Z)V
return;
} // .end method
public void of_finding_msg_show ( Float p0 ) {
/* .locals 2 */
v0 = this.sLableFinding;
int v1 = 1; // const/4 v1, 0x1
(( com.wiyun.engine.nodes.Sprite ) v0 ).setVisible ( v1 ); // invoke-virtual {v0, v1}, Lcom/wiyun/engine/nodes/Sprite;->setVisible(Z)V
return;
} // .end method
public synchronized void of_finish_one_level ( Float p0 ) {
/* .locals 5 */
/* monitor-enter p0 */
int v0 = 1; // const/4 v0, 0x1
try { // :try_start_0
java.lang.Boolean .valueOf ( v0 );
this.ib_stop_timer = v0;
v0 = this.g;
/* iget-boolean v0, v0, Lat;->m:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* const/16 v0, 0xb */
int v1 = 2; // const/4 v1, 0x2
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_play_effect ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Llqh/china/lianliankancgrbw/LayerGame;->of_play_effect(II)V
v0 = this.g;
v0 = this.b;
(( aj ) v0 ).i ( ); // invoke-virtual {v0}, Laj;->i()V
/* new-instance v0, Lcom/wiyun/engine/utils/TargetSelector; */
final String v1 = "of_begin_next(float)"; // const-string v1, "of_begin_next(float)"
int v2 = 1; // const/4 v2, 0x1
/* new-array v2, v2, [Ljava/lang/Object; */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
java.lang.Float .valueOf ( v4 );
/* aput-object v4, v2, v3 */
/* invoke-direct {v0, p0, v1, v2}, Lcom/wiyun/engine/utils/TargetSelector;-><init>(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V */
/* const/high16 v1, 0x40800000 # 4.0f */
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).scheduleOnce ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Llqh/china/lianliankancgrbw/LayerGame;->scheduleOnce(Lcom/wiyun/engine/utils/TargetSelector;F)V
v0 = this.g;
/* iget v0, v0, Lat;->h:I */
v1 = this.g;
/* iget v1, v1, Lat;->i:I */
/* if-ne v0, v1, :cond_0 */
v0 = this.g;
/* iget v0, v0, Lat;->e:I */
v1 = this.g;
/* iget v1, v1, Lat;->h:I */
ax .a ( v0,v1 );
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
} // :cond_0
} // :goto_0
/* monitor-exit p0 */
return;
} // :cond_1
try { // :try_start_1
v0 = this.g;
int v1 = 4; // const/4 v1, 0x4
/* iput v1, v0, Lat;->d:I */
/* const/16 v0, 0xc */
int v1 = 1; // const/4 v1, 0x1
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_play_effect ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Llqh/china/lianliankancgrbw/LayerGame;->of_play_effect(II)V
/* new-instance v0, Lcom/wiyun/engine/utils/TargetSelector; */
final String v1 = "of_fail(float)"; // const-string v1, "of_fail(float)"
int v2 = 1; // const/4 v2, 0x1
/* new-array v2, v2, [Ljava/lang/Object; */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
java.lang.Float .valueOf ( v4 );
/* aput-object v4, v2, v3 */
/* invoke-direct {v0, p0, v1, v2}, Lcom/wiyun/engine/utils/TargetSelector;-><init>(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V */
/* const/high16 v1, 0x40a00000 # 5.0f */
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).scheduleOnce ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Llqh/china/lianliankancgrbw/LayerGame;->scheduleOnce(Lcom/wiyun/engine/utils/TargetSelector;F)V
v0 = this.g;
v0 = this.b;
(( aj ) v0 ).i ( ); // invoke-virtual {v0}, Laj;->i()V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public void of_init_sprites ( ) {
/* .locals 13 */
/* const/16 v4, 0x3c */
/* const/high16 v12, 0x3f000000 # 0.5f */
int v11 = 1; // const/4 v11, 0x1
/* const/high16 v10, 0x40000000 # 2.0f */
int v1 = 0; // const/4 v1, 0x0
v0 = this.g;
v0 = this.t;
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_0
return;
} // :cond_1
v0 = this.g;
v0 = this.s;
if ( v0 != null) { // if-eqz v0, :cond_0
v2 = this.g;
v0 = this.g;
/* iget v0, v0, Lat;->p:I */
v3 = this.g;
/* iget v3, v3, Lat;->q:I */
/* filled-new-array {v0, v3}, [I */
/* const-class v3, Lcom/wiyun/engine/nodes/Sprite; */
java.lang.reflect.Array .newInstance ( v3,v0 );
/* check-cast v0, [[Lcom/wiyun/engine/nodes/Sprite; */
this.t = v0;
v2 = this.g;
v0 = this.g;
/* iget v0, v0, Lat;->p:I */
v3 = this.g;
/* iget v3, v3, Lat;->q:I */
/* filled-new-array {v0, v3}, [I */
/* const-class v3, Lcom/wiyun/engine/nodes/Sprite; */
java.lang.reflect.Array .newInstance ( v3,v0 );
/* check-cast v0, [[Lcom/wiyun/engine/nodes/Sprite; */
this.u = v0;
/* move v0, v1 */
} // :goto_0
v2 = this.g;
/* iget v2, v2, Lat;->p:I */
/* if-ge v0, v2, :cond_0 */
/* move v2, v1 */
} // :goto_1
v3 = this.g;
/* iget v3, v3, Lat;->q:I */
/* if-lt v2, v3, :cond_2 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_2
v3 = this.g;
v3 = this.s;
/* aget-object v3, v3, v0 */
/* aget v3, v3, v2 */
/* if-gez v3, :cond_3 */
/* move v3, v1 */
} // :cond_3
/* if-lt v3, v4, :cond_4 */
/* move v3, v4 */
} // :cond_4
v5 = this.g;
v5 = this.t;
/* aget-object v5, v5, v0 */
v6 = this.g;
v6 = this.v;
/* aget-object v6, v6, v3 */
com.wiyun.engine.nodes.Sprite .make ( v6 );
/* aput-object v6, v5, v2 */
v5 = this.rMain;
v5 = (( com.wiyun.engine.types.WYRect ) v5 ).minX ( ); // invoke-virtual {v5}, Lcom/wiyun/engine/types/WYRect;->minX()F
/* int-to-float v6, v2 */
/* add-float/2addr v6, v12 */
/* iget v7, p0, Llqh/china/lianliankancgrbw/LayerGame;->boxlength:F */
/* mul-float/2addr v6, v7 */
/* add-float/2addr v5, v6 */
v6 = this.rMain;
v6 = (( com.wiyun.engine.types.WYRect ) v6 ).maxY ( ); // invoke-virtual {v6}, Lcom/wiyun/engine/types/WYRect;->maxY()F
/* int-to-float v7, v0 */
/* add-float/2addr v7, v12 */
/* iget v8, p0, Llqh/china/lianliankancgrbw/LayerGame;->boxlength:F */
/* mul-float/2addr v7, v8 */
/* sub-float/2addr v6, v7 */
v7 = this.g;
v7 = this.t;
/* aget-object v7, v7, v0 */
/* aget-object v7, v7, v2 */
(( com.wiyun.engine.nodes.Sprite ) v7 ).setPosition ( v5, v6 ); // invoke-virtual {v7, v5, v6}, Lcom/wiyun/engine/nodes/Sprite;->setPosition(FF)V
v7 = this.g;
v7 = this.t;
/* aget-object v7, v7, v0 */
/* aget-object v7, v7, v2 */
/* iget v8, p0, Llqh/china/lianliankancgrbw/LayerGame;->boxlength:F */
/* sub-float/2addr v8, v10 */
/* iget v9, p0, Llqh/china/lianliankancgrbw/LayerGame;->boxlength:F */
/* sub-float/2addr v9, v10 */
(( com.wiyun.engine.nodes.Sprite ) v7 ).setContentSize ( v8, v9 ); // invoke-virtual {v7, v8, v9}, Lcom/wiyun/engine/nodes/Sprite;->setContentSize(FF)V
v7 = this.g;
v7 = this.t;
/* aget-object v7, v7, v0 */
/* aget-object v7, v7, v2 */
(( com.wiyun.engine.nodes.Sprite ) v7 ).setAutoFit ( v11 ); // invoke-virtual {v7, v11}, Lcom/wiyun/engine/nodes/Sprite;->setAutoFit(Z)V
/* if-nez v3, :cond_5 */
v7 = this.g;
v7 = this.t;
/* aget-object v7, v7, v0 */
/* aget-object v7, v7, v2 */
(( com.wiyun.engine.nodes.Sprite ) v7 ).setVisible ( v1 ); // invoke-virtual {v7, v1}, Lcom/wiyun/engine/nodes/Sprite;->setVisible(Z)V
} // :cond_5
v7 = this.g;
v7 = this.t;
/* aget-object v7, v7, v0 */
/* aget-object v7, v7, v2 */
int v8 = 2; // const/4 v8, 0x2
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).addChild ( v7, v8 ); // invoke-virtual {p0, v7, v8}, Llqh/china/lianliankancgrbw/LayerGame;->addChild(Lcom/wiyun/engine/nodes/Node;I)V
v7 = this.g;
v7 = this.u;
/* aget-object v7, v7, v0 */
v8 = this.g;
v8 = this.w;
com.wiyun.engine.nodes.Sprite .make ( v8 );
/* aput-object v8, v7, v2 */
v7 = this.g;
v7 = this.u;
/* aget-object v7, v7, v0 */
/* aget-object v7, v7, v2 */
(( com.wiyun.engine.nodes.Sprite ) v7 ).setPosition ( v5, v6 ); // invoke-virtual {v7, v5, v6}, Lcom/wiyun/engine/nodes/Sprite;->setPosition(FF)V
v5 = this.g;
v5 = this.u;
/* aget-object v5, v5, v0 */
/* aget-object v5, v5, v2 */
/* iget v6, p0, Llqh/china/lianliankancgrbw/LayerGame;->boxlength:F */
/* sub-float/2addr v6, v10 */
/* iget v7, p0, Llqh/china/lianliankancgrbw/LayerGame;->boxlength:F */
/* sub-float/2addr v7, v10 */
(( com.wiyun.engine.nodes.Sprite ) v5 ).setContentSize ( v6, v7 ); // invoke-virtual {v5, v6, v7}, Lcom/wiyun/engine/nodes/Sprite;->setContentSize(FF)V
v5 = this.g;
v5 = this.u;
/* aget-object v5, v5, v0 */
/* aget-object v5, v5, v2 */
(( com.wiyun.engine.nodes.Sprite ) v5 ).setAutoFit ( v11 ); // invoke-virtual {v5, v11}, Lcom/wiyun/engine/nodes/Sprite;->setAutoFit(Z)V
/* if-nez v3, :cond_6 */
v3 = this.g;
v3 = this.u;
/* aget-object v3, v3, v0 */
/* aget-object v3, v3, v2 */
(( com.wiyun.engine.nodes.Sprite ) v3 ).setVisible ( v1 ); // invoke-virtual {v3, v1}, Lcom/wiyun/engine/nodes/Sprite;->setVisible(Z)V
} // :cond_6
v3 = this.g;
v3 = this.u;
/* aget-object v3, v3, v0 */
/* aget-object v3, v3, v2 */
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).addChild ( v3, v11 ); // invoke-virtual {p0, v3, v11}, Llqh/china/lianliankancgrbw/LayerGame;->addChild(Lcom/wiyun/engine/nodes/Node;I)V
/* add-int/lit8 v2, v2, 0x1 */
/* goto/16 :goto_1 */
} // .end method
public void of_play_clearing_1 ( Float p0 ) {
/* .locals 13 */
int v12 = 3; // const/4 v12, 0x3
/* const v11, 0x3dcccccd # 0.1f */
int v10 = 0; // const/4 v10, 0x0
int v9 = 0; // const/4 v9, 0x0
int v8 = 1; // const/4 v8, 0x1
v0 = this.g;
/* iget v0, v0, Lat;->E:I */
/* if-ltz v0, :cond_0 */
v0 = this.g;
/* iget v0, v0, Lat;->D:I */
/* if-ltz v0, :cond_0 */
v0 = this.g;
/* iget v0, v0, Lat;->G:I */
/* if-ltz v0, :cond_0 */
v0 = this.g;
/* iget v0, v0, Lat;->F:I */
/* if-gez v0, :cond_1 */
} // :cond_0
} // :goto_0
return;
} // :cond_1
v0 = this.g;
v0 = this.s;
v1 = this.g;
/* iget v1, v1, Lat;->D:I */
/* aget-object v0, v0, v1 */
v1 = this.g;
/* iget v1, v1, Lat;->E:I */
/* aget v0, v0, v1 */
v1 = this.g;
v1 = this.v;
/* aget-object v0, v1, v0 */
this.temp_pic = v0;
v0 = this.g;
v0 = this.s;
v1 = this.g;
/* iget v1, v1, Lat;->D:I */
/* aget-object v0, v0, v1 */
v1 = this.g;
/* iget v1, v1, Lat;->E:I */
/* aput v10, v0, v1 */
v0 = this.g;
v0 = this.s;
v1 = this.g;
/* iget v1, v1, Lat;->F:I */
/* aget-object v0, v0, v1 */
v1 = this.g;
/* iget v1, v1, Lat;->G:I */
/* aput v10, v0, v1 */
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).setTouchEnabled ( v10 ); // invoke-virtual {p0, v10}, Llqh/china/lianliankancgrbw/LayerGame;->setTouchEnabled(Z)V
/* iput-boolean v10, p0, Llqh/china/lianliankancgrbw/LayerGame;->ib_can_exit_and_savegame:Z */
v0 = this.g;
v0 = this.t;
v1 = this.g;
/* iget v1, v1, Lat;->D:I */
/* aget-object v0, v0, v1 */
v1 = this.g;
/* iget v1, v1, Lat;->E:I */
/* aget-object v0, v0, v1 */
(( com.wiyun.engine.nodes.Sprite ) v0 ).getAbsolutePosition ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Sprite;->getAbsolutePosition()Lcom/wiyun/engine/types/WYPoint;
this.temp_point1 = v0;
v0 = this.g;
v0 = this.t;
v1 = this.g;
/* iget v1, v1, Lat;->F:I */
/* aget-object v0, v0, v1 */
v1 = this.g;
/* iget v1, v1, Lat;->G:I */
/* aget-object v0, v0, v1 */
(( com.wiyun.engine.nodes.Sprite ) v0 ).getAbsolutePosition ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Sprite;->getAbsolutePosition()Lcom/wiyun/engine/types/WYPoint;
this.temp_point2 = v0;
v0 = this.temp_pic;
com.wiyun.engine.nodes.Sprite .make ( v0 );
v0 = this.temp_point1;
(( com.wiyun.engine.nodes.Sprite ) v3 ).setPosition ( v0 ); // invoke-virtual {v3, v0}, Lcom/wiyun/engine/nodes/Sprite;->setPosition(Lcom/wiyun/engine/types/WYPoint;)V
/* iget v0, p0, Llqh/china/lianliankancgrbw/LayerGame;->boxlength:F */
/* iget v1, p0, Llqh/china/lianliankancgrbw/LayerGame;->boxlength:F */
(( com.wiyun.engine.nodes.Sprite ) v3 ).setContentSize ( v0, v1 ); // invoke-virtual {v3, v0, v1}, Lcom/wiyun/engine/nodes/Sprite;->setContentSize(FF)V
(( com.wiyun.engine.nodes.Sprite ) v3 ).setAutoFit ( v8 ); // invoke-virtual {v3, v8}, Lcom/wiyun/engine/nodes/Sprite;->setAutoFit(Z)V
v0 = this.g;
v0 = this.x;
com.wiyun.engine.nodes.Sprite .make ( v0 );
v0 = this.temp_point1;
(( com.wiyun.engine.nodes.Sprite ) v4 ).setPosition ( v0 ); // invoke-virtual {v4, v0}, Lcom/wiyun/engine/nodes/Sprite;->setPosition(Lcom/wiyun/engine/types/WYPoint;)V
/* iget v0, p0, Llqh/china/lianliankancgrbw/LayerGame;->boxlength:F */
/* iget v1, p0, Llqh/china/lianliankancgrbw/LayerGame;->boxlength:F */
(( com.wiyun.engine.nodes.Sprite ) v4 ).setContentSize ( v0, v1 ); // invoke-virtual {v4, v0, v1}, Lcom/wiyun/engine/nodes/Sprite;->setContentSize(FF)V
(( com.wiyun.engine.nodes.Sprite ) v4 ).setAutoFit ( v8 ); // invoke-virtual {v4, v8}, Lcom/wiyun/engine/nodes/Sprite;->setAutoFit(Z)V
v0 = this.temp_pic;
com.wiyun.engine.nodes.Sprite .make ( v0 );
v0 = this.temp_point2;
(( com.wiyun.engine.nodes.Sprite ) v5 ).setPosition ( v0 ); // invoke-virtual {v5, v0}, Lcom/wiyun/engine/nodes/Sprite;->setPosition(Lcom/wiyun/engine/types/WYPoint;)V
/* iget v0, p0, Llqh/china/lianliankancgrbw/LayerGame;->boxlength:F */
/* iget v1, p0, Llqh/china/lianliankancgrbw/LayerGame;->boxlength:F */
(( com.wiyun.engine.nodes.Sprite ) v5 ).setContentSize ( v0, v1 ); // invoke-virtual {v5, v0, v1}, Lcom/wiyun/engine/nodes/Sprite;->setContentSize(FF)V
(( com.wiyun.engine.nodes.Sprite ) v5 ).setAutoFit ( v8 ); // invoke-virtual {v5, v8}, Lcom/wiyun/engine/nodes/Sprite;->setAutoFit(Z)V
v0 = this.g;
v0 = this.x;
com.wiyun.engine.nodes.Sprite .make ( v0 );
v0 = this.temp_point2;
(( com.wiyun.engine.nodes.Sprite ) v6 ).setPosition ( v0 ); // invoke-virtual {v6, v0}, Lcom/wiyun/engine/nodes/Sprite;->setPosition(Lcom/wiyun/engine/types/WYPoint;)V
/* iget v0, p0, Llqh/china/lianliankancgrbw/LayerGame;->boxlength:F */
/* iget v1, p0, Llqh/china/lianliankancgrbw/LayerGame;->boxlength:F */
(( com.wiyun.engine.nodes.Sprite ) v6 ).setContentSize ( v0, v1 ); // invoke-virtual {v6, v0, v1}, Lcom/wiyun/engine/nodes/Sprite;->setContentSize(FF)V
(( com.wiyun.engine.nodes.Sprite ) v6 ).setAutoFit ( v8 ); // invoke-virtual {v6, v8}, Lcom/wiyun/engine/nodes/Sprite;->setAutoFit(Z)V
com.wiyun.engine.actions.Show .make ( );
(( com.wiyun.engine.actions.Show ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/actions/Show;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/actions/FiniteTimeAction; */
com.wiyun.engine.actions.Hide .make ( );
(( com.wiyun.engine.actions.Hide ) v1 ).autoRelease ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/actions/Hide;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v1, Lcom/wiyun/engine/actions/FiniteTimeAction; */
com.wiyun.engine.actions.DelayTime .make ( v11 );
(( com.wiyun.engine.actions.DelayTime ) v2 ).autoRelease ( ); // invoke-virtual {v2}, Lcom/wiyun/engine/actions/DelayTime;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v2, Lcom/wiyun/engine/actions/FiniteTimeAction; */
int v7 = 2; // const/4 v7, 0x2
/* new-array v7, v7, [Lcom/wiyun/engine/actions/FiniteTimeAction; */
/* aput-object v2, v7, v10 */
/* aput-object v1, v7, v8 */
com.wiyun.engine.actions.Sequence .make ( v0,v7 );
(( com.wiyun.engine.actions.IntervalAction ) v0 ).copy ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/actions/IntervalAction;->copy()Lcom/wiyun/engine/actions/IntervalAction;
(( com.wiyun.engine.actions.IntervalAction ) v0 ).copy ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/actions/IntervalAction;->copy()Lcom/wiyun/engine/actions/IntervalAction;
(( com.wiyun.engine.actions.IntervalAction ) v0 ).copy ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/actions/IntervalAction;->copy()Lcom/wiyun/engine/actions/IntervalAction;
(( com.wiyun.engine.nodes.Sprite ) v3 ).runAction ( v0 ); // invoke-virtual {v3, v0}, Lcom/wiyun/engine/nodes/Sprite;->runAction(Lcom/wiyun/engine/actions/Action;)V
(( com.wiyun.engine.nodes.Sprite ) v5 ).runAction ( v1 ); // invoke-virtual {v5, v1}, Lcom/wiyun/engine/nodes/Sprite;->runAction(Lcom/wiyun/engine/actions/Action;)V
(( com.wiyun.engine.nodes.Sprite ) v4 ).runAction ( v2 ); // invoke-virtual {v4, v2}, Lcom/wiyun/engine/nodes/Sprite;->runAction(Lcom/wiyun/engine/actions/Action;)V
(( com.wiyun.engine.nodes.Sprite ) v6 ).runAction ( v7 ); // invoke-virtual {v6, v7}, Lcom/wiyun/engine/nodes/Sprite;->runAction(Lcom/wiyun/engine/actions/Action;)V
/* iget v0, p0, Llqh/china/lianliankancgrbw/LayerGame;->boxlength:F */
/* const/high16 v1, 0x3f000000 # 0.5f */
/* mul-float/2addr v0, v1 */
com.wiyun.engine.actions.JumpBy .make ( v11,v9,v9,v0,v8 );
(( com.wiyun.engine.actions.JumpBy ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/actions/JumpBy;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/actions/JumpBy; */
(( com.wiyun.engine.nodes.Sprite ) v3 ).runAction ( v0 ); // invoke-virtual {v3, v0}, Lcom/wiyun/engine/nodes/Sprite;->runAction(Lcom/wiyun/engine/actions/Action;)V
/* iget v0, p0, Llqh/china/lianliankancgrbw/LayerGame;->boxlength:F */
/* const/high16 v1, 0x3f000000 # 0.5f */
/* mul-float/2addr v0, v1 */
com.wiyun.engine.actions.JumpBy .make ( v11,v9,v9,v0,v8 );
(( com.wiyun.engine.actions.JumpBy ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/actions/JumpBy;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/actions/JumpBy; */
(( com.wiyun.engine.nodes.Sprite ) v5 ).runAction ( v0 ); // invoke-virtual {v5, v0}, Lcom/wiyun/engine/nodes/Sprite;->runAction(Lcom/wiyun/engine/actions/Action;)V
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).addChild ( v4, v12 ); // invoke-virtual {p0, v4, v12}, Llqh/china/lianliankancgrbw/LayerGame;->addChild(Lcom/wiyun/engine/nodes/Node;I)V
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).addChild ( v3, v12 ); // invoke-virtual {p0, v3, v12}, Llqh/china/lianliankancgrbw/LayerGame;->addChild(Lcom/wiyun/engine/nodes/Node;I)V
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).addChild ( v6, v12 ); // invoke-virtual {p0, v6, v12}, Llqh/china/lianliankancgrbw/LayerGame;->addChild(Lcom/wiyun/engine/nodes/Node;I)V
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).addChild ( v5, v12 ); // invoke-virtual {p0, v5, v12}, Llqh/china/lianliankancgrbw/LayerGame;->addChild(Lcom/wiyun/engine/nodes/Node;I)V
(( com.wiyun.engine.nodes.Sprite ) v3 ).autoRelease ( ); // invoke-virtual {v3}, Lcom/wiyun/engine/nodes/Sprite;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
(( com.wiyun.engine.nodes.Sprite ) v5 ).autoRelease ( ); // invoke-virtual {v5}, Lcom/wiyun/engine/nodes/Sprite;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
(( com.wiyun.engine.nodes.Sprite ) v4 ).autoRelease ( ); // invoke-virtual {v4}, Lcom/wiyun/engine/nodes/Sprite;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
(( com.wiyun.engine.nodes.Sprite ) v6 ).autoRelease ( ); // invoke-virtual {v6}, Lcom/wiyun/engine/nodes/Sprite;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* invoke-direct {p0, v11}, Llqh/china/lianliankancgrbw/LayerGame;->of_play_clearing_1_draw_path_effect2(F)V */
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_play_clearing_2 ( v9 ); // invoke-virtual {p0, v9}, Llqh/china/lianliankancgrbw/LayerGame;->of_play_clearing_2(F)V
/* goto/16 :goto_0 */
} // .end method
public void of_play_clearing_2 ( Float p0 ) {
/* .locals 13 */
/* const/high16 v12, 0x3f000000 # 0.5f */
int v7 = 0; // const/4 v7, 0x0
int v6 = 3; // const/4 v6, 0x3
int v1 = 0; // const/4 v1, 0x0
int v5 = 1; // const/4 v5, 0x1
java.lang.Math .random ( );
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_play_clearing_2_pop_sound ( v7 ); // invoke-virtual {p0, v7}, Llqh/china/lianliankancgrbw/LayerGame;->of_play_clearing_2_pop_sound(F)V
/* new-instance v0, Lcom/wiyun/engine/utils/TargetSelector; */
final String v2 = "of_play_clearing_2_pop_sound(float)"; // const-string v2, "of_play_clearing_2_pop_sound(float)"
/* new-array v3, v5, [Ljava/lang/Object; */
java.lang.Float .valueOf ( v12 );
/* aput-object v4, v3, v1 */
/* invoke-direct {v0, p0, v2, v3}, Lcom/wiyun/engine/utils/TargetSelector;-><init>(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V */
/* const v2, 0x3e19999a # 0.15f */
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).scheduleOnce ( v0, v2 ); // invoke-virtual {p0, v0, v2}, Llqh/china/lianliankancgrbw/LayerGame;->scheduleOnce(Lcom/wiyun/engine/utils/TargetSelector;F)V
v0 = this.g;
/* iget v0, v0, Lat;->I:I */
/* add-int/lit8 v0, v0, 0x1 */
/* mul-int/lit8 v0, v0, 0x5 */
v2 = this.temp_point1;
/* invoke-direct {p0, v0, v2, v7}, Llqh/china/lianliankancgrbw/LayerGame;->of_play_score_adding(ILcom/wiyun/engine/types/WYPoint;F)V */
v2 = this.temp_point2;
/* invoke-direct {p0, v0, v2, v7}, Llqh/china/lianliankancgrbw/LayerGame;->of_play_score_adding(ILcom/wiyun/engine/types/WYPoint;F)V */
/* mul-int/lit8 v0, v0, 0x2 */
/* invoke-direct {p0, v0}, Llqh/china/lianliankancgrbw/LayerGame;->of_score_add(I)V */
v0 = this.g;
/* iget v0, v0, Lat;->I:I */
/* const/16 v2, 0x8 */
/* if-ne v0, v2, :cond_0 */
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_play_effect ( v5, v6 ); // invoke-virtual {p0, v5, v6}, Llqh/china/lianliankancgrbw/LayerGame;->of_play_effect(II)V
} // :cond_0
v0 = this.g;
/* iget v0, v0, Lat;->I:I */
/* const/16 v2, 0x10 */
/* if-ne v0, v2, :cond_1 */
int v0 = 2; // const/4 v0, 0x2
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_play_effect ( v0, v6 ); // invoke-virtual {p0, v0, v6}, Llqh/china/lianliankancgrbw/LayerGame;->of_play_effect(II)V
} // :cond_1
v0 = this.g;
/* iget v0, v0, Lat;->I:I */
/* const/16 v2, 0x18 */
/* if-ne v0, v2, :cond_2 */
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_play_effect ( v6, v6 ); // invoke-virtual {p0, v6, v6}, Llqh/china/lianliankancgrbw/LayerGame;->of_play_effect(II)V
} // :cond_2
v0 = this.g;
/* iget v0, v0, Lat;->I:I */
/* rem-int/lit8 v0, v0, 0x8 */
/* if-nez v0, :cond_3 */
v0 = this.g;
/* iget v0, v0, Lat;->I:I */
/* div-int/lit8 v0, v0, 0x8 */
int v2 = 4; // const/4 v2, 0x4
/* if-lt v0, v2, :cond_3 */
int v0 = 4; // const/4 v0, 0x4
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_play_effect ( v0, v6 ); // invoke-virtual {p0, v0, v6}, Llqh/china/lianliankancgrbw/LayerGame;->of_play_effect(II)V
} // :cond_3
v0 = this.g;
v0 = (( at ) v0 ).e ( ); // invoke-virtual {v0}, Lat;->e()Z
if ( v0 != null) { // if-eqz v0, :cond_4
v0 = this.g;
/* iput-boolean v5, v0, Lat;->m:Z */
java.lang.Boolean .valueOf ( v5 );
this.ib_stop_timer = v0;
/* invoke-direct {p0}, Llqh/china/lianliankancgrbw/LayerGame;->of_play_clearing_2_add_finish_score()V */
/* new-instance v0, Lcom/wiyun/engine/utils/TargetSelector; */
final String v2 = "of_finish_one_level(float)"; // const-string v2, "of_finish_one_level(float)"
/* new-array v3, v5, [Ljava/lang/Object; */
java.lang.Float .valueOf ( v12 );
/* aput-object v4, v3, v1 */
/* invoke-direct {v0, p0, v2, v3}, Lcom/wiyun/engine/utils/TargetSelector;-><init>(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V */
/* const/high16 v1, 0x40000000 # 2.0f */
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).scheduleOnce ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Llqh/china/lianliankancgrbw/LayerGame;->scheduleOnce(Lcom/wiyun/engine/utils/TargetSelector;F)V
} // :goto_0
return;
} // :cond_4
v6 = this.g;
/* iget v0, v6, Lat;->p:I */
/* iget v2, v6, Lat;->q:I */
/* filled-new-array {v0, v2}, [I */
v2 = java.lang.Integer.TYPE;
java.lang.reflect.Array .newInstance ( v2,v0 );
/* check-cast v0, [[I */
this.c = v0;
/* move v0, v1 */
} // :goto_1
/* iget v2, v6, Lat;->p:I */
/* if-lt v0, v2, :cond_5 */
/* move v4, v1 */
} // :goto_2
/* iget v0, v6, Lat;->p:I */
/* if-lt v4, v0, :cond_8 */
/* move v0, v1 */
} // :goto_3
/* if-nez v0, :cond_1a */
java.lang.Boolean .valueOf ( v5 );
this.ib_stop_timer = v0;
v0 = this.g;
/* iput-boolean v1, v0, Lat;->m:Z */
v0 = this.g;
(( at ) v0 ).c ( ); // invoke-virtual {v0}, Lat;->c()V
/* const v0, 0x7f02006f */
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_show_message ( v0 ); // invoke-virtual {p0, v0}, Llqh/china/lianliankancgrbw/LayerGame;->of_show_message(I)V
/* new-instance v0, Lcom/wiyun/engine/utils/TargetSelector; */
final String v2 = "of_finish_one_level(float)"; // const-string v2, "of_finish_one_level(float)"
/* new-array v3, v5, [Ljava/lang/Object; */
java.lang.Float .valueOf ( v12 );
/* aput-object v4, v3, v1 */
/* invoke-direct {v0, p0, v2, v3}, Lcom/wiyun/engine/utils/TargetSelector;-><init>(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V */
/* const/high16 v1, 0x41700000 # 15.0f */
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).scheduleOnce ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Llqh/china/lianliankancgrbw/LayerGame;->scheduleOnce(Lcom/wiyun/engine/utils/TargetSelector;F)V
} // :cond_5
/* move v2, v1 */
} // :goto_4
/* iget v3, v6, Lat;->q:I */
/* if-lt v2, v3, :cond_6 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_6
v3 = this.s;
/* aget-object v3, v3, v0 */
/* aget v3, v3, v2 */
/* if-lez v3, :cond_7 */
v3 = this.c;
/* aget-object v3, v3, v0 */
int v4 = 2; // const/4 v4, 0x2
/* aput v4, v3, v2 */
} // :goto_5
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_7
v3 = this.c;
/* aget-object v3, v3, v0 */
/* aput v1, v3, v2 */
} // :cond_8
/* move v3, v1 */
} // :goto_6
/* iget v0, v6, Lat;->q:I */
/* if-lt v3, v0, :cond_9 */
/* add-int/lit8 v0, v4, 0x1 */
/* move v4, v0 */
} // :cond_9
v0 = this.s;
/* aget-object v0, v0, v4 */
/* aget v0, v0, v3 */
/* if-lez v0, :cond_e */
v0 = this.s;
/* aget-object v0, v0, v4 */
/* aget v0, v0, v3 */
/* iget v2, v6, Lat;->p:I */
/* add-int/lit8 v2, v2, -0x1 */
/* if-ge v4, v2, :cond_a */
v2 = this.s;
/* add-int/lit8 v7, v4, 0x1 */
/* aget-object v2, v2, v7 */
/* aget v2, v2, v3 */
/* if-ne v0, v2, :cond_a */
/* move v0, v5 */
} // :goto_7
if ( v0 != null) { // if-eqz v0, :cond_19
/* move v0, v5 */
} // :cond_a
/* if-lez v4, :cond_b */
v2 = this.s;
/* add-int/lit8 v7, v4, -0x1 */
/* aget-object v2, v2, v7 */
/* aget v2, v2, v3 */
/* if-ne v0, v2, :cond_b */
/* move v0, v5 */
} // :cond_b
/* iget v2, v6, Lat;->q:I */
/* add-int/lit8 v2, v2, -0x1 */
/* if-ge v3, v2, :cond_c */
v2 = this.s;
/* aget-object v2, v2, v4 */
/* add-int/lit8 v7, v3, 0x1 */
/* aget v2, v2, v7 */
/* if-ne v0, v2, :cond_c */
/* move v0, v5 */
} // :cond_c
/* if-lez v3, :cond_d */
v2 = this.s;
/* aget-object v2, v2, v4 */
/* add-int/lit8 v7, v3, -0x1 */
/* aget v2, v2, v7 */
/* if-ne v0, v2, :cond_d */
/* move v0, v5 */
} // :cond_d
/* move v0, v1 */
} // :cond_e
v0 = this.c;
/* aget-object v0, v0, v4 */
/* aget v0, v0, v3 */
/* if-nez v0, :cond_19 */
(( at ) v6 ).a ( v4, v3 ); // invoke-virtual {v6, v4, v3}, Lat;->a(II)V
/* new-instance v7, Ljava/util/ArrayList; */
/* invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V */
/* new-instance v8, Ljava/util/ArrayList; */
/* invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V */
/* move v0, v1 */
} // :goto_8
/* iget v2, v6, Lat;->p:I */
/* if-lt v0, v2, :cond_f */
/* move v0, v1 */
} // :goto_9
if ( v0 != null) { // if-eqz v0, :cond_19
/* move v0, v5 */
/* goto/16 :goto_3 */
} // :cond_f
/* move v2, v1 */
} // :goto_a
/* iget v9, v6, Lat;->q:I */
/* if-lt v2, v9, :cond_10 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_10
v9 = this.y;
/* aget-object v9, v9, v0 */
/* aget v9, v9, v2 */
int v10 = 2; // const/4 v10, 0x2
/* if-ne v9, v10, :cond_18 */
v9 = this.c;
/* aget-object v9, v9, v0 */
/* aput v5, v9, v2 */
/* if-lez v0, :cond_12 */
v9 = this.s;
/* add-int/lit8 v10, v0, -0x1 */
/* aget-object v9, v9, v10 */
/* aget v9, v9, v2 */
/* add-int/lit8 v10, v0, -0x1 */
/* iget v11, v6, Lat;->q:I */
/* mul-int/2addr v10, v11 */
/* add-int/2addr v10, v2 */
/* if-lez v9, :cond_12 */
java.lang.Integer .valueOf ( v10 );
v11 = (( java.util.ArrayList ) v8 ).contains ( v11 ); // invoke-virtual {v8, v11}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
/* if-nez v11, :cond_11 */
java.lang.Integer .valueOf ( v9 );
v11 = (( java.util.ArrayList ) v7 ).contains ( v11 ); // invoke-virtual {v7, v11}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_11
/* move v0, v5 */
} // :cond_11
java.lang.Integer .valueOf ( v10 );
(( java.util.ArrayList ) v8 ).add ( v10 ); // invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
java.lang.Integer .valueOf ( v9 );
(( java.util.ArrayList ) v7 ).add ( v9 ); // invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
} // :cond_12
/* iget v9, v6, Lat;->p:I */
/* add-int/lit8 v9, v9, -0x1 */
/* if-ge v0, v9, :cond_14 */
v9 = this.s;
/* add-int/lit8 v10, v0, 0x1 */
/* aget-object v9, v9, v10 */
/* aget v9, v9, v2 */
/* add-int/lit8 v10, v0, 0x1 */
/* iget v11, v6, Lat;->q:I */
/* mul-int/2addr v10, v11 */
/* add-int/2addr v10, v2 */
/* if-lez v9, :cond_14 */
java.lang.Integer .valueOf ( v10 );
v11 = (( java.util.ArrayList ) v8 ).contains ( v11 ); // invoke-virtual {v8, v11}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
/* if-nez v11, :cond_13 */
java.lang.Integer .valueOf ( v9 );
v11 = (( java.util.ArrayList ) v7 ).contains ( v11 ); // invoke-virtual {v7, v11}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_13
/* move v0, v5 */
} // :cond_13
java.lang.Integer .valueOf ( v10 );
(( java.util.ArrayList ) v8 ).add ( v10 ); // invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
java.lang.Integer .valueOf ( v9 );
(( java.util.ArrayList ) v7 ).add ( v9 ); // invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
} // :cond_14
/* if-lez v2, :cond_16 */
v9 = this.s;
/* aget-object v9, v9, v0 */
/* add-int/lit8 v10, v2, -0x1 */
/* aget v9, v9, v10 */
/* iget v10, v6, Lat;->q:I */
/* mul-int/2addr v10, v0 */
/* add-int/2addr v10, v2 */
/* add-int/lit8 v10, v10, -0x1 */
/* if-lez v9, :cond_16 */
java.lang.Integer .valueOf ( v10 );
v11 = (( java.util.ArrayList ) v8 ).contains ( v11 ); // invoke-virtual {v8, v11}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
/* if-nez v11, :cond_15 */
java.lang.Integer .valueOf ( v9 );
v11 = (( java.util.ArrayList ) v7 ).contains ( v11 ); // invoke-virtual {v7, v11}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_15
/* move v0, v5 */
/* goto/16 :goto_9 */
} // :cond_15
java.lang.Integer .valueOf ( v10 );
(( java.util.ArrayList ) v8 ).add ( v10 ); // invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
java.lang.Integer .valueOf ( v9 );
(( java.util.ArrayList ) v7 ).add ( v9 ); // invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
} // :cond_16
/* iget v9, v6, Lat;->q:I */
/* add-int/lit8 v9, v9, -0x1 */
/* if-ge v2, v9, :cond_18 */
v9 = this.s;
/* aget-object v9, v9, v0 */
/* add-int/lit8 v10, v2, 0x1 */
/* aget v9, v9, v10 */
/* iget v10, v6, Lat;->q:I */
/* mul-int/2addr v10, v0 */
/* add-int/2addr v10, v2 */
/* add-int/lit8 v10, v10, 0x1 */
/* if-lez v9, :cond_18 */
java.lang.Integer .valueOf ( v10 );
v11 = (( java.util.ArrayList ) v8 ).contains ( v11 ); // invoke-virtual {v8, v11}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
/* if-nez v11, :cond_17 */
java.lang.Integer .valueOf ( v9 );
v11 = (( java.util.ArrayList ) v7 ).contains ( v11 ); // invoke-virtual {v7, v11}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_17
/* move v0, v5 */
/* goto/16 :goto_9 */
} // :cond_17
java.lang.Integer .valueOf ( v10 );
(( java.util.ArrayList ) v8 ).add ( v10 ); // invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
java.lang.Integer .valueOf ( v9 );
(( java.util.ArrayList ) v7 ).add ( v9 ); // invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
} // :cond_18
/* add-int/lit8 v2, v2, 0x1 */
/* goto/16 :goto_a */
} // :cond_19
/* add-int/lit8 v0, v3, 0x1 */
/* move v3, v0 */
/* goto/16 :goto_6 */
} // :cond_1a
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).setTouchEnabled ( v5 ); // invoke-virtual {p0, v5}, Llqh/china/lianliankancgrbw/LayerGame;->setTouchEnabled(Z)V
/* iput-boolean v5, p0, Llqh/china/lianliankancgrbw/LayerGame;->ib_can_exit_and_savegame:Z */
/* goto/16 :goto_0 */
} // .end method
public void of_play_clearing_2_pop_sound ( Float p0 ) {
/* .locals 1 */
ay .a ( v0 );
return;
} // .end method
public void of_play_effect ( Integer p0, Integer p1 ) {
/* .locals 13 */
int v12 = 3; // const/4 v12, 0x3
int v11 = 2; // const/4 v11, 0x2
int v10 = 0; // const/4 v10, 0x0
/* const/high16 v3, 0x40000000 # 2.0f */
int v9 = 1; // const/4 v9, 0x1
com.wiyun.engine.nodes.Director .getInstance ( );
(( com.wiyun.engine.nodes.Director ) v0 ).getWindowSize ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->getWindowSize()Lcom/wiyun/engine/types/WYSize;
/* packed-switch p1, :pswitch_data_0 */
} // :goto_0
/* :pswitch_0 */
return;
/* :pswitch_1 */
v0 = this.sprite_combo_1;
/* move v2, v3 */
/* move-object v4, v0 */
} // :goto_1
(( com.wiyun.engine.nodes.Sprite ) v4 ).setAutoFit ( v9 ); // invoke-virtual {v4, v9}, Lcom/wiyun/engine/nodes/Sprite;->setAutoFit(Z)V
com.wiyun.engine.actions.Show .make ( );
(( com.wiyun.engine.actions.Show ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/actions/Show;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/actions/FiniteTimeAction; */
com.wiyun.engine.actions.Hide .make ( );
(( com.wiyun.engine.actions.Hide ) v1 ).autoRelease ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/actions/Hide;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v1, Lcom/wiyun/engine/actions/FiniteTimeAction; */
com.wiyun.engine.actions.DelayTime .make ( v2 );
(( com.wiyun.engine.actions.DelayTime ) v2 ).autoRelease ( ); // invoke-virtual {v2}, Lcom/wiyun/engine/actions/DelayTime;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v2, Lcom/wiyun/engine/actions/FiniteTimeAction; */
v6 = this.rEffectCenterLabel;
v6 = (( com.wiyun.engine.types.WYRect ) v6 ).midX ( ); // invoke-virtual {v6}, Lcom/wiyun/engine/types/WYRect;->midX()F
v7 = this.rEffectCenterLabel;
v7 = (( com.wiyun.engine.types.WYRect ) v7 ).midY ( ); // invoke-virtual {v7}, Lcom/wiyun/engine/types/WYRect;->midY()F
v8 = this.rEffectCenterLabel;
v8 = this.size;
/* iget v8, v8, Lcom/wiyun/engine/types/WYSize;->height:F */
/* div-float v3, v8, v3 */
/* packed-switch p2, :pswitch_data_1 */
/* :pswitch_2 */
/* const v8, 0x3dcccccd # 0.1f */
/* iget v5, v5, Lcom/wiyun/engine/types/WYSize;->height:F */
/* add-float/2addr v3, v5 */
com.wiyun.engine.actions.MoveTo .make ( v8,v6,v3,v6,v7 );
/* new-array v5, v12, [Lcom/wiyun/engine/actions/FiniteTimeAction; */
/* aput-object v3, v5, v10 */
/* aput-object v2, v5, v9 */
/* aput-object v1, v5, v11 */
com.wiyun.engine.actions.Sequence .make ( v0,v5 );
} // :goto_2
/* const/16 v1, 0xa */
/* if-ge p1, v1, :cond_0 */
/* const/16 v1, 0x64 */
(( com.wiyun.engine.nodes.Sprite ) v4 ).setAlpha ( v1 ); // invoke-virtual {v4, v1}, Lcom/wiyun/engine/nodes/Sprite;->setAlpha(I)V
} // :goto_3
(( com.wiyun.engine.nodes.Sprite ) v4 ).runAction ( v0 ); // invoke-virtual {v4, v0}, Lcom/wiyun/engine/nodes/Sprite;->runAction(Lcom/wiyun/engine/actions/Action;)V
(( com.wiyun.engine.actions.IntervalAction ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/actions/IntervalAction;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* :pswitch_3 */
v0 = this.sprite_combo_2;
/* move v2, v3 */
/* move-object v4, v0 */
/* :pswitch_4 */
v0 = this.sprite_combo_3;
/* move v2, v3 */
/* move-object v4, v0 */
/* :pswitch_5 */
v0 = this.sprite_combo_4;
/* move v2, v3 */
/* move-object v4, v0 */
/* :pswitch_6 */
v0 = this.sprite_effect_nextlevel;
ay .a ( v1 );
/* move v2, v3 */
/* move-object v4, v0 */
/* :pswitch_7 */
v1 = this.sprite_effect_lose;
/* const/high16 v0, 0x40400000 # 3.0f */
ay .a ( v2 );
/* move v2, v0 */
/* move-object v4, v1 */
/* goto/16 :goto_1 */
/* :pswitch_8 */
/* const v5, 0x3dcccccd # 0.1f */
/* const/high16 v8, -0x40800000 # -1.0f */
/* mul-float/2addr v3, v8 */
com.wiyun.engine.actions.MoveTo .make ( v5,v6,v3,v6,v7 );
/* new-array v5, v12, [Lcom/wiyun/engine/actions/FiniteTimeAction; */
/* aput-object v3, v5, v10 */
/* aput-object v2, v5, v9 */
/* aput-object v1, v5, v11 */
com.wiyun.engine.actions.Sequence .make ( v0,v5 );
/* :pswitch_9 */
/* const v2, 0x3e4ccccd # 0.2f */
/* const/high16 v3, 0x3fc00000 # 1.5f */
/* const v5, 0x3f4ccccd # 0.8f */
com.wiyun.engine.actions.ScaleTo .make ( v2,v3,v5 );
/* const/high16 v3, 0x3f800000 # 1.0f */
com.wiyun.engine.actions.FadeOut .make ( v3 );
/* new-array v5, v12, [Lcom/wiyun/engine/actions/FiniteTimeAction; */
/* aput-object v2, v5, v10 */
/* aput-object v3, v5, v9 */
/* aput-object v1, v5, v11 */
com.wiyun.engine.actions.Sequence .make ( v0,v5 );
} // :cond_0
/* const/16 v1, 0xff */
(( com.wiyun.engine.nodes.Sprite ) v4 ).setAlpha ( v1 ); // invoke-virtual {v4, v1}, Lcom/wiyun/engine/nodes/Sprite;->setAlpha(I)V
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_1 */
/* :pswitch_3 */
/* :pswitch_4 */
/* :pswitch_5 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_6 */
/* :pswitch_7 */
} // .end packed-switch
/* :pswitch_data_1 */
/* .packed-switch 0x1 */
/* :pswitch_2 */
/* :pswitch_8 */
/* :pswitch_9 */
} // .end packed-switch
} // .end method
public void of_play_finish_shake ( ) {
/* .locals 5 */
int v2 = 0; // const/4 v2, 0x0
/* move v1, v2 */
} // :goto_0
v0 = this.g;
/* iget v0, v0, Lat;->p:I */
/* if-lt v1, v0, :cond_0 */
return;
} // :cond_0
/* move v3, v2 */
} // :goto_1
v0 = this.g;
/* iget v0, v0, Lat;->q:I */
/* if-lt v3, v0, :cond_1 */
ay .a ( v0 );
/* add-int/lit8 v0, v1, 0x1 */
/* move v1, v0 */
} // :cond_1
v0 = this.g;
v0 = this.t;
/* aget-object v0, v0, v1 */
/* aget-object v0, v0, v3 */
v0 = (( com.wiyun.engine.nodes.Sprite ) v0 ).isVisible ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Sprite;->isVisible()Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* const/high16 v0, 0x3fc00000 # 1.5f */
/* const/high16 v4, 0x40000000 # 2.0f */
com.wiyun.engine.actions.Shake .make ( v0,v4 );
(( com.wiyun.engine.actions.Shake ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/actions/Shake;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/actions/IntervalAction; */
v4 = this.g;
v4 = this.t;
/* aget-object v4, v4, v1 */
/* aget-object v4, v4, v3 */
(( com.wiyun.engine.nodes.Sprite ) v4 ).runAction ( v0 ); // invoke-virtual {v4, v0}, Lcom/wiyun/engine/nodes/Sprite;->runAction(Lcom/wiyun/engine/actions/Action;)V
} // :cond_2
/* add-int/lit8 v0, v3, 0x1 */
/* move v3, v0 */
} // .end method
public void of_play_new_record ( ) {
/* .locals 6 */
/* const/high16 v2, 0x40000000 # 2.0f */
/* const/high16 v5, 0x3f800000 # 1.0f */
com.wiyun.engine.nodes.Director .getInstance ( );
(( com.wiyun.engine.nodes.Director ) v0 ).getWindowSize ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->getWindowSize()Lcom/wiyun/engine/types/WYSize;
/* iget v1, v0, Lcom/wiyun/engine/types/WYSize;->width:F */
/* div-float/2addr v1, v2 */
/* iget v0, v0, Lcom/wiyun/engine/types/WYSize;->height:F */
/* div-float v2, v0, v2 */
v0 = this.sShowNewRecord;
(( com.wiyun.engine.nodes.Sprite ) v0 ).setPosition ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/wiyun/engine/nodes/Sprite;->setPosition(FF)V
v0 = this.sShowNewRecord;
int v3 = 1; // const/4 v3, 0x1
(( com.wiyun.engine.nodes.Sprite ) v0 ).setVisible ( v3 ); // invoke-virtual {v0, v3}, Lcom/wiyun/engine/nodes/Sprite;->setVisible(Z)V
/* const/high16 v0, 0x40400000 # 3.0f */
com.wiyun.engine.actions.ScaleTo .make ( v5,v0,v5 );
(( com.wiyun.engine.actions.ScaleTo ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/actions/ScaleTo;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/actions/IntervalAction; */
v3 = this.rShowNewRecord;
v3 = (( com.wiyun.engine.types.WYRect ) v3 ).midX ( ); // invoke-virtual {v3}, Lcom/wiyun/engine/types/WYRect;->midX()F
v4 = this.rShowNewRecord;
v4 = (( com.wiyun.engine.types.WYRect ) v4 ).midY ( ); // invoke-virtual {v4}, Lcom/wiyun/engine/types/WYRect;->midY()F
com.wiyun.engine.actions.MoveTo .make ( v5,v1,v2,v3,v4 );
(( com.wiyun.engine.actions.IntervalAction ) v1 ).autoRelease ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/actions/IntervalAction;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
v2 = this.sShowNewRecord;
(( com.wiyun.engine.nodes.Sprite ) v2 ).runAction ( v1 ); // invoke-virtual {v2, v1}, Lcom/wiyun/engine/nodes/Sprite;->runAction(Lcom/wiyun/engine/actions/Action;)V
v1 = this.sShowNewRecord;
(( com.wiyun.engine.nodes.Sprite ) v1 ).runAction ( v0 ); // invoke-virtual {v1, v0}, Lcom/wiyun/engine/nodes/Sprite;->runAction(Lcom/wiyun/engine/actions/Action;)V
v0 = this.particle_manager;
(( lqh.china.lianliankancgrbw.PubParticleManager ) v0 ).of_play_particle_fireup ( v5 ); // invoke-virtual {v0, v5}, Llqh/china/lianliankancgrbw/PubParticleManager;->of_play_particle_fireup(F)V
ay .a ( v0 );
return;
} // .end method
public void of_play_screen_init ( ) {
/* .locals 12 */
/* const v11, 0x3d4ccccd # 0.05f */
int v10 = 0; // const/4 v10, 0x0
int v9 = 1; // const/4 v9, 0x1
int v2 = 0; // const/4 v2, 0x0
/* move v1, v2 */
} // :goto_0
v0 = this.g;
/* iget v0, v0, Lat;->p:I */
/* if-lt v1, v0, :cond_0 */
return;
} // :cond_0
/* const v0, 0x3e6147ae # 0.22f */
v3 = this.g;
/* iget v3, v3, Lat;->p:I */
/* sub-int/2addr v3, v1 */
/* int-to-float v3, v3 */
/* mul-float v4, v0, v3 */
/* move v3, v2 */
} // :goto_1
v0 = this.g;
/* iget v0, v0, Lat;->q:I */
/* if-lt v3, v0, :cond_1 */
/* new-instance v0, Lcom/wiyun/engine/utils/TargetSelector; */
final String v3 = "of_play_screen_init_sound(float)"; // const-string v3, "of_play_screen_init_sound(float)"
/* new-array v5, v9, [Ljava/lang/Object; */
java.lang.Float .valueOf ( v10 );
/* aput-object v6, v5, v2 */
/* invoke-direct {v0, p0, v3, v5}, Lcom/wiyun/engine/utils/TargetSelector;-><init>(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V */
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).scheduleOnce ( v0, v4 ); // invoke-virtual {p0, v0, v4}, Llqh/china/lianliankancgrbw/LayerGame;->scheduleOnce(Lcom/wiyun/engine/utils/TargetSelector;F)V
/* new-instance v0, Lcom/wiyun/engine/utils/TargetSelector; */
final String v3 = "of_play_screen_init_sound(float)"; // const-string v3, "of_play_screen_init_sound(float)"
/* new-array v5, v9, [Ljava/lang/Object; */
java.lang.Float .valueOf ( v10 );
/* aput-object v6, v5, v2 */
/* invoke-direct {v0, p0, v3, v5}, Lcom/wiyun/engine/utils/TargetSelector;-><init>(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V */
/* add-float v3, v4, v11 */
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).scheduleOnce ( v0, v3 ); // invoke-virtual {p0, v0, v3}, Llqh/china/lianliankancgrbw/LayerGame;->scheduleOnce(Lcom/wiyun/engine/utils/TargetSelector;F)V
/* add-int/lit8 v0, v1, 0x1 */
/* move v1, v0 */
} // :cond_1
v0 = this.g;
v0 = this.t;
/* aget-object v0, v0, v1 */
/* aget-object v0, v0, v3 */
v6 = (( com.wiyun.engine.nodes.Sprite ) v0 ).getPositionX ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Sprite;->getPositionX()F
v0 = this.g;
v0 = this.t;
/* aget-object v0, v0, v1 */
/* aget-object v0, v0, v3 */
v7 = (( com.wiyun.engine.nodes.Sprite ) v0 ).getPositionY ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Sprite;->getPositionY()F
v0 = this.rMain;
v0 = (( com.wiyun.engine.types.WYRect ) v0 ).maxY ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/types/WYRect;->maxY()F
v5 = this.g;
/* iget v5, v5, Lat;->p:I */
/* sub-int/2addr v5, v1 */
/* int-to-float v5, v5 */
/* iget v8, p0, Llqh/china/lianliankancgrbw/LayerGame;->boxlength:F */
/* mul-float/2addr v5, v8 */
/* const/high16 v8, 0x40000000 # 2.0f */
/* mul-float/2addr v5, v8 */
/* add-float/2addr v0, v5 */
/* rem-int/lit8 v5, v3, 0x2 */
/* if-ne v5, v9, :cond_2 */
/* iget v5, p0, Llqh/china/lianliankancgrbw/LayerGame;->boxlength:F */
/* const v8, 0x3e99999a # 0.3f */
/* mul-float/2addr v5, v8 */
/* add-float/2addr v5, v0 */
/* add-float v0, v4, v11 */
} // :goto_2
com.wiyun.engine.actions.MoveTo .make ( v0,v6,v5,v6,v7 );
(( com.wiyun.engine.actions.MoveTo ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/actions/MoveTo;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/actions/MoveTo; */
v5 = this.g;
v5 = this.t;
/* aget-object v5, v5, v1 */
/* aget-object v5, v5, v3 */
(( com.wiyun.engine.nodes.Sprite ) v5 ).runAction ( v0 ); // invoke-virtual {v5, v0}, Lcom/wiyun/engine/nodes/Sprite;->runAction(Lcom/wiyun/engine/actions/Action;)V
/* add-int/lit8 v0, v3, 0x1 */
/* move v3, v0 */
} // :cond_2
/* move v5, v0 */
/* move v0, v4 */
} // .end method
public void of_play_screen_init_sound ( Float p0 ) {
/* .locals 0 */
return;
} // .end method
public void of_reset_number_show ( ) {
/* .locals 6 */
int v5 = 1; // const/4 v5, 0x1
int v4 = 0; // const/4 v4, 0x0
v0 = this.numberMaxScore;
final String v1 = "%d"; // const-string v1, "%d"
/* new-array v2, v5, [Ljava/lang/Object; */
v3 = this.g;
/* iget v3, v3, Lat;->h:I */
java.lang.Integer .valueOf ( v3 );
/* aput-object v3, v2, v4 */
java.lang.String .format ( v1,v2 );
(( com.wiyun.engine.nodes.AtlasLabel ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Lcom/wiyun/engine/nodes/AtlasLabel;->setText(Ljava/lang/String;)V
v0 = this.numberCurrentScore;
final String v1 = "%d"; // const-string v1, "%d"
/* new-array v2, v5, [Ljava/lang/Object; */
v3 = this.g;
/* iget v3, v3, Lat;->j:I */
java.lang.Integer .valueOf ( v3 );
/* aput-object v3, v2, v4 */
java.lang.String .format ( v1,v2 );
(( com.wiyun.engine.nodes.AtlasLabel ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Lcom/wiyun/engine/nodes/AtlasLabel;->setText(Ljava/lang/String;)V
v0 = this.numberLevel;
final String v1 = "%d"; // const-string v1, "%d"
/* new-array v2, v5, [Ljava/lang/Object; */
v3 = this.g;
/* iget v3, v3, Lat;->f:I */
java.lang.Integer .valueOf ( v3 );
/* aput-object v3, v2, v4 */
java.lang.String .format ( v1,v2 );
(( com.wiyun.engine.nodes.AtlasLabel ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Lcom/wiyun/engine/nodes/AtlasLabel;->setText(Ljava/lang/String;)V
return;
} // .end method
public void of_reset_sprites ( ) {
/* .locals 9 */
int v8 = 1; // const/4 v8, 0x1
/* const/high16 v7, 0x3f000000 # 0.5f */
int v1 = 0; // const/4 v1, 0x0
v0 = this.g;
v0 = this.t;
/* if-nez v0, :cond_0 */
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_init_sprites ( ); // invoke-virtual {p0}, Llqh/china/lianliankancgrbw/LayerGame;->of_init_sprites()V
} // :cond_0
/* move v0, v1 */
} // :goto_0
v2 = this.g;
/* iget v2, v2, Lat;->p:I */
/* if-lt v0, v2, :cond_1 */
return;
} // :cond_1
/* move v2, v1 */
} // :goto_1
v3 = this.g;
/* iget v3, v3, Lat;->q:I */
/* if-lt v2, v3, :cond_2 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_2
v3 = this.g;
v3 = this.s;
/* aget-object v3, v3, v0 */
/* aget v3, v3, v2 */
/* if-gtz v3, :cond_3 */
v3 = this.g;
v3 = this.t;
/* aget-object v3, v3, v0 */
/* aget-object v3, v3, v2 */
(( com.wiyun.engine.nodes.Sprite ) v3 ).setVisible ( v1 ); // invoke-virtual {v3, v1}, Lcom/wiyun/engine/nodes/Sprite;->setVisible(Z)V
v3 = this.g;
v3 = this.u;
/* aget-object v3, v3, v0 */
/* aget-object v3, v3, v2 */
(( com.wiyun.engine.nodes.Sprite ) v3 ).setVisible ( v1 ); // invoke-virtual {v3, v1}, Lcom/wiyun/engine/nodes/Sprite;->setVisible(Z)V
} // :goto_2
v3 = this.rMain;
v3 = (( com.wiyun.engine.types.WYRect ) v3 ).minX ( ); // invoke-virtual {v3}, Lcom/wiyun/engine/types/WYRect;->minX()F
/* int-to-float v4, v2 */
/* add-float/2addr v4, v7 */
/* iget v5, p0, Llqh/china/lianliankancgrbw/LayerGame;->boxlength:F */
/* mul-float/2addr v4, v5 */
/* add-float/2addr v3, v4 */
v4 = this.rMain;
v4 = (( com.wiyun.engine.types.WYRect ) v4 ).maxY ( ); // invoke-virtual {v4}, Lcom/wiyun/engine/types/WYRect;->maxY()F
/* int-to-float v5, v0 */
/* add-float/2addr v5, v7 */
/* iget v6, p0, Llqh/china/lianliankancgrbw/LayerGame;->boxlength:F */
/* mul-float/2addr v5, v6 */
/* sub-float/2addr v4, v5 */
v5 = this.g;
v5 = this.t;
/* aget-object v5, v5, v0 */
/* aget-object v5, v5, v2 */
(( com.wiyun.engine.nodes.Sprite ) v5 ).setPosition ( v3, v4 ); // invoke-virtual {v5, v3, v4}, Lcom/wiyun/engine/nodes/Sprite;->setPosition(FF)V
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_3
v3 = this.g;
v3 = this.t;
/* aget-object v3, v3, v0 */
/* aget-object v3, v3, v2 */
v4 = this.g;
v4 = this.v;
v5 = this.g;
v5 = this.s;
/* aget-object v5, v5, v0 */
/* aget v5, v5, v2 */
/* aget-object v4, v4, v5 */
(( com.wiyun.engine.nodes.Sprite ) v3 ).setTexture ( v4 ); // invoke-virtual {v3, v4}, Lcom/wiyun/engine/nodes/Sprite;->setTexture(Lcom/wiyun/engine/opengl/Texture2D;)V
v3 = this.g;
v3 = this.t;
/* aget-object v3, v3, v0 */
/* aget-object v3, v3, v2 */
(( com.wiyun.engine.nodes.Sprite ) v3 ).setVisible ( v8 ); // invoke-virtual {v3, v8}, Lcom/wiyun/engine/nodes/Sprite;->setVisible(Z)V
v3 = this.g;
/* iget v3, v3, Lat;->D:I */
/* if-ne v0, v3, :cond_4 */
v3 = this.g;
/* iget v3, v3, Lat;->E:I */
/* if-eq v2, v3, :cond_5 */
} // :cond_4
v3 = this.g;
/* iget v3, v3, Lat;->F:I */
/* if-ne v0, v3, :cond_6 */
v3 = this.g;
/* iget v3, v3, Lat;->G:I */
/* if-ne v2, v3, :cond_6 */
} // :cond_5
v3 = this.g;
v3 = this.u;
/* aget-object v3, v3, v0 */
/* aget-object v3, v3, v2 */
v4 = this.g;
v4 = this.x;
(( com.wiyun.engine.nodes.Sprite ) v3 ).setTexture ( v4 ); // invoke-virtual {v3, v4}, Lcom/wiyun/engine/nodes/Sprite;->setTexture(Lcom/wiyun/engine/opengl/Texture2D;)V
} // :goto_3
v3 = this.g;
v3 = this.u;
/* aget-object v3, v3, v0 */
/* aget-object v3, v3, v2 */
(( com.wiyun.engine.nodes.Sprite ) v3 ).setVisible ( v8 ); // invoke-virtual {v3, v8}, Lcom/wiyun/engine/nodes/Sprite;->setVisible(Z)V
} // :cond_6
v3 = this.g;
v3 = this.u;
/* aget-object v3, v3, v0 */
/* aget-object v3, v3, v2 */
v4 = this.g;
v4 = this.w;
(( com.wiyun.engine.nodes.Sprite ) v3 ).setTexture ( v4 ); // invoke-virtual {v3, v4}, Lcom/wiyun/engine/nodes/Sprite;->setTexture(Lcom/wiyun/engine/opengl/Texture2D;)V
} // .end method
public void of_score_adding_one ( Float p0, Integer p1 ) {
/* .locals 2 */
v0 = this.g;
/* iget v1, v0, Lat;->j:I */
/* add-int/2addr v1, p2 */
/* iput v1, v0, Lat;->j:I */
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_reset_number_show ( ); // invoke-virtual {p0}, Llqh/china/lianliankancgrbw/LayerGame;->of_reset_number_show()V
return;
} // .end method
public void of_set_button_pic_by_status ( ) {
/* .locals 2 */
/* sget-boolean v0, Lay;->m:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* const v0, 0x7f02000b */
com.wiyun.engine.opengl.Texture2D .make ( v0 );
} // :goto_0
v1 = this.sButtonMusic;
(( com.wiyun.engine.nodes.Sprite ) v1 ).setTexture ( v0 ); // invoke-virtual {v1, v0}, Lcom/wiyun/engine/nodes/Sprite;->setTexture(Lcom/wiyun/engine/opengl/Texture2D;)V
v0 = ay .b ( );
if ( v0 != null) { // if-eqz v0, :cond_1
/* const v0, 0x7f02000e */
com.wiyun.engine.opengl.Texture2D .make ( v0 );
} // :goto_1
v1 = this.sButtonSound;
(( com.wiyun.engine.nodes.Sprite ) v1 ).setTexture ( v0 ); // invoke-virtual {v1, v0}, Lcom/wiyun/engine/nodes/Sprite;->setTexture(Lcom/wiyun/engine/opengl/Texture2D;)V
return;
} // :cond_0
/* const v0, 0x7f02000c */
com.wiyun.engine.opengl.Texture2D .make ( v0 );
} // :cond_1
/* const v0, 0x7f02000f */
com.wiyun.engine.opengl.Texture2D .make ( v0 );
} // .end method
public void of_show_message ( ) {
/* .locals 0 */
return;
} // .end method
public void of_show_message ( Integer p0 ) {
/* .locals 6 */
int v5 = 0; // const/4 v5, 0x0
v0 = this.rMessageBox;
int v1 = 4; // const/4 v1, 0x4
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_create_label_sprite ( v0, p1, v1 ); // invoke-virtual {p0, v0, p1, v1}, Llqh/china/lianliankancgrbw/LayerGame;->of_create_label_sprite(Lcom/wiyun/engine/types/WYRect;II)Lcom/wiyun/engine/nodes/Sprite;
/* const/high16 v0, 0x3f000000 # 0.5f */
/* const/16 v1, 0xff */
com.wiyun.engine.actions.FadeTo .make ( v0,v5,v1 );
(( com.wiyun.engine.actions.FadeTo ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/actions/FadeTo;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/actions/IntervalAction; */
(( com.wiyun.engine.actions.IntervalAction ) v0 ).reverse ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/actions/IntervalAction;->reverse()Lcom/wiyun/engine/actions/IntervalAction;
(( com.wiyun.engine.actions.IntervalAction ) v1 ).autoRelease ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/actions/IntervalAction;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v1, Lcom/wiyun/engine/actions/IntervalAction; */
/* const/high16 v2, 0x40400000 # 3.0f */
com.wiyun.engine.actions.DelayTime .make ( v2 );
(( com.wiyun.engine.actions.DelayTime ) v2 ).autoRelease ( ); // invoke-virtual {v2}, Lcom/wiyun/engine/actions/DelayTime;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v2, Lcom/wiyun/engine/actions/IntervalAction; */
int v4 = 2; // const/4 v4, 0x2
/* new-array v4, v4, [Lcom/wiyun/engine/actions/FiniteTimeAction; */
/* aput-object v2, v4, v5 */
int v2 = 1; // const/4 v2, 0x1
/* aput-object v1, v4, v2 */
com.wiyun.engine.actions.Sequence .make ( v0,v4 );
(( com.wiyun.engine.actions.Sequence ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/actions/Sequence;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/actions/IntervalAction; */
(( com.wiyun.engine.nodes.Sprite ) v3 ).runAction ( v0 ); // invoke-virtual {v3, v0}, Lcom/wiyun/engine/nodes/Sprite;->runAction(Lcom/wiyun/engine/actions/Action;)V
(( com.wiyun.engine.nodes.Sprite ) v3 ).autoRelease ( ); // invoke-virtual {v3}, Lcom/wiyun/engine/nodes/Sprite;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
return;
} // .end method
public synchronized void of_timer_gaming ( Float p0 ) {
/* .locals 5 */
int v1 = 1; // const/4 v1, 0x1
/* const v2, 0x3dcccccd # 0.1f */
int v3 = 0; // const/4 v3, 0x0
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.ib_stop_timer;
(( java.lang.Boolean ) v0 ).booleanValue ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
/* :try_end_0 */
v0 = /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_0
} // :goto_0
/* monitor-exit p0 */
return;
} // :cond_1
try { // :try_start_1
v0 = this.g;
/* iget v0, v0, Lat;->d:I */
/* if-ne v0, v1, :cond_0 */
v0 = this.g;
/* iget v1, v0, Lat;->K:F */
/* sub-float/2addr v1, v2 */
/* iput v1, v0, Lat;->K:F */
v0 = this.g;
/* iget v0, v0, Lat;->K:F */
/* const/high16 v1, 0x40400000 # 3.0f */
/* sub-float/2addr v0, v1 */
v0 = java.lang.Math .abs ( v0 );
/* const v1, 0x3d4ccccd # 0.05f */
/* cmpg-float v0, v0, v1 */
/* if-gtz v0, :cond_2 */
ay .a ( v0 );
} // :cond_2
v0 = this.g;
/* iget v0, v0, Lat;->J:F */
/* cmpl-float v0, v0, v3 */
/* if-lez v0, :cond_3 */
v0 = this.g;
/* iget v0, v0, Lat;->K:F */
v1 = this.g;
/* iget v1, v1, Lat;->J:F */
/* div-float/2addr v0, v1 */
v1 = this.sTimeLeft;
(( com.wiyun.engine.nodes.Sprite ) v1 ).setScaleX ( v0 ); // invoke-virtual {v1, v0}, Lcom/wiyun/engine/nodes/Sprite;->setScaleX(F)V
v1 = this.rTimeLeft;
v1 = this.size;
/* iget v1, v1, Lcom/wiyun/engine/types/WYSize;->width:F */
/* mul-float/2addr v0, v1 */
/* const/high16 v1, 0x40000000 # 2.0f */
/* div-float/2addr v0, v1 */
v1 = this.rTimeLeft;
v1 = (( com.wiyun.engine.types.WYRect ) v1 ).minX ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/types/WYRect;->minX()F
/* add-float/2addr v0, v1 */
v1 = this.rTimeLeft;
v1 = (( com.wiyun.engine.types.WYRect ) v1 ).midY ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/types/WYRect;->midY()F
v2 = this.sTimeLeft;
(( com.wiyun.engine.nodes.Sprite ) v2 ).setPosition ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Lcom/wiyun/engine/nodes/Sprite;->setPosition(FF)V
} // :cond_3
v0 = this.g;
/* iget v0, v0, Lat;->K:F */
/* cmpg-float v0, v0, v3 */
/* if-gtz v0, :cond_5 */
v0 = this.g;
v0 = (( at ) v0 ).e ( ); // invoke-virtual {v0}, Lat;->e()Z
if ( v0 != null) { // if-eqz v0, :cond_4
v0 = this.g;
int v1 = 1; // const/4 v1, 0x1
/* iput-boolean v1, v0, Lat;->m:Z */
} // :goto_1
int v0 = 0; // const/4 v0, 0x0
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_finish_one_level ( v0 ); // invoke-virtual {p0, v0}, Llqh/china/lianliankancgrbw/LayerGame;->of_finish_one_level(F)V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // :cond_4
try { // :try_start_2
v0 = this.g;
int v1 = 0; // const/4 v1, 0x0
/* iput-boolean v1, v0, Lat;->m:Z */
} // :cond_5
/* new-instance v0, Lcom/wiyun/engine/utils/TargetSelector; */
final String v1 = "of_timer_gaming(float)"; // const-string v1, "of_timer_gaming(float)"
int v2 = 1; // const/4 v2, 0x1
/* new-array v2, v2, [Ljava/lang/Object; */
int v3 = 0; // const/4 v3, 0x0
/* const v4, 0x3dcccccd # 0.1f */
java.lang.Float .valueOf ( v4 );
/* aput-object v4, v2, v3 */
/* invoke-direct {v0, p0, v1, v2}, Lcom/wiyun/engine/utils/TargetSelector;-><init>(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V */
/* const v1, 0x3dcccccd # 0.1f */
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).scheduleOnce ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Llqh/china/lianliankancgrbw/LayerGame;->scheduleOnce(Lcom/wiyun/engine/utils/TargetSelector;F)V
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* goto/16 :goto_0 */
} // .end method
public void of_touch_main ( Integer p0, Integer p1 ) {
/* .locals 22 */
/* move-object/from16 v0, p0 */
v2 = this.g;
/* iget v2, v2, Lat;->p:I */
/* move/from16 v0, p1 */
/* if-ge v0, v2, :cond_0 */
/* move-object/from16 v0, p0 */
v2 = this.g;
/* iget v2, v2, Lat;->q:I */
/* move/from16 v0, p2 */
/* if-ge v0, v2, :cond_0 */
/* if-ltz p1, :cond_0 */
/* if-gez p2, :cond_1 */
} // :cond_0
} // :goto_0
return;
} // :cond_1
/* move-object/from16 v0, p0 */
v2 = this.g;
/* iget v2, v2, Lat;->D:I */
/* move/from16 v0, p1 */
/* if-ne v0, v2, :cond_2 */
/* move-object/from16 v0, p0 */
v2 = this.g;
/* iget v2, v2, Lat;->E:I */
/* move/from16 v0, p2 */
/* if-eq v0, v2, :cond_0 */
} // :cond_2
/* move-object/from16 v0, p0 */
v2 = this.g;
v2 = this.s;
/* aget-object v2, v2, p1 */
/* aget v2, v2, p2 */
/* if-lez v2, :cond_0 */
/* move-object/from16 v0, p0 */
v3 = this.g;
int v4 = 0; // const/4 v4, 0x0
this.H = v4;
/* move-object/from16 v0, p0 */
v3 = this.g;
/* iget v3, v3, Lat;->D:I */
int v4 = -1; // const/4 v4, -0x1
/* if-eq v3, v4, :cond_36 */
/* move-object/from16 v0, p0 */
v3 = this.g;
v3 = this.s;
/* move-object/from16 v0, p0 */
v4 = this.g;
/* iget v4, v4, Lat;->D:I */
/* aget-object v3, v3, v4 */
/* move-object/from16 v0, p0 */
v4 = this.g;
/* iget v4, v4, Lat;->E:I */
/* aget v3, v3, v4 */
/* if-eq v3, v2, :cond_3 */
/* move-object/from16 v0, p0 */
v2 = this.g;
/* move/from16 v0, p1 */
/* iput v0, v2, Lat;->D:I */
/* move-object/from16 v0, p0 */
v2 = this.g;
/* move/from16 v0, p2 */
/* iput v0, v2, Lat;->E:I */
/* move-object/from16 v0, p0 */
v2 = this.g;
int v3 = -1; // const/4 v3, -0x1
/* iput v3, v2, Lat;->F:I */
/* move-object/from16 v0, p0 */
v2 = this.g;
int v3 = -1; // const/4 v3, -0x1
/* iput v3, v2, Lat;->G:I */
/* move-object/from16 v0, p0 */
v2 = this.g;
int v3 = 0; // const/4 v3, 0x0
/* iput v3, v2, Lat;->I:I */
/* move-object/from16 v0, p0 */
v2 = this.g;
(( at ) v2 ).g ( ); // invoke-virtual {v2}, Lat;->g()V
} // :cond_3
/* move-object/from16 v0, p0 */
v2 = this.g;
/* move/from16 v0, p1 */
/* iput v0, v2, Lat;->F:I */
/* move-object/from16 v0, p0 */
v2 = this.g;
/* move/from16 v0, p2 */
/* iput v0, v2, Lat;->G:I */
/* move-object/from16 v0, p0 */
v2 = this.g;
/* iget v3, v2, Lat;->L:I */
/* add-int/lit8 v3, v3, 0x2 */
/* iput v3, v2, Lat;->L:I */
/* move-object/from16 v0, p0 */
v11 = this.g;
/* move-object/from16 v0, p0 */
v2 = this.g;
/* iget v12, v2, Lat;->D:I */
/* move-object/from16 v0, p0 */
v2 = this.g;
/* iget v13, v2, Lat;->E:I */
/* move-object/from16 v0, p0 */
v2 = this.g;
/* iget v14, v2, Lat;->F:I */
/* move-object/from16 v0, p0 */
v2 = this.g;
/* iget v15, v2, Lat;->G:I */
/* sub-int v2, v12, v14 */
v2 = java.lang.Math .abs ( v2 );
/* sub-int v3, v13, v15 */
v3 = java.lang.Math .abs ( v3 );
/* add-int v16, v2, v3 */
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
/* filled-new-array {v2, v3}, [I */
v3 = java.lang.Integer.TYPE;
java.lang.reflect.Array .newInstance ( v3,v2 );
/* check-cast v2, [[I */
/* sub-int v3, v12, v14 */
v3 = java.lang.Math .abs ( v3 );
int v4 = 1; // const/4 v4, 0x1
/* if-ne v3, v4, :cond_6 */
/* if-ne v13, v15, :cond_6 */
int v2 = 2; // const/4 v2, 0x2
/* new-array v2, v2, [[I */
int v3 = 0; // const/4 v3, 0x0
int v4 = 2; // const/4 v4, 0x2
/* new-array v4, v4, [I */
int v5 = 0; // const/4 v5, 0x0
/* aput v12, v4, v5 */
int v5 = 1; // const/4 v5, 0x1
/* aput v13, v4, v5 */
/* aput-object v4, v2, v3 */
int v3 = 1; // const/4 v3, 0x1
int v4 = 2; // const/4 v4, 0x2
/* new-array v4, v4, [I */
int v5 = 0; // const/4 v5, 0x0
/* aput v14, v4, v5 */
int v5 = 1; // const/4 v5, 0x1
/* aput v15, v4, v5 */
/* aput-object v4, v2, v3 */
} // :cond_4
} // :goto_1
if ( v2 != null) { // if-eqz v2, :cond_5
/* array-length v3, v2 */
/* if-nez v3, :cond_35 */
} // :cond_5
/* move-object/from16 v0, p0 */
v2 = this.g;
/* move/from16 v0, p1 */
/* iput v0, v2, Lat;->D:I */
/* move-object/from16 v0, p0 */
v2 = this.g;
/* move/from16 v0, p2 */
/* iput v0, v2, Lat;->E:I */
/* move-object/from16 v0, p0 */
v2 = this.g;
int v3 = -1; // const/4 v3, -0x1
/* iput v3, v2, Lat;->F:I */
/* move-object/from16 v0, p0 */
v2 = this.g;
int v3 = -1; // const/4 v3, -0x1
/* iput v3, v2, Lat;->G:I */
/* move-object/from16 v0, p0 */
v2 = this.g;
int v3 = 0; // const/4 v3, 0x0
/* iput v3, v2, Lat;->I:I */
/* goto/16 :goto_0 */
} // :cond_6
/* sub-int v3, v13, v15 */
v3 = java.lang.Math .abs ( v3 );
int v4 = 1; // const/4 v4, 0x1
/* if-ne v3, v4, :cond_7 */
/* if-ne v12, v14, :cond_7 */
int v2 = 2; // const/4 v2, 0x2
/* new-array v2, v2, [[I */
int v3 = 0; // const/4 v3, 0x0
int v4 = 2; // const/4 v4, 0x2
/* new-array v4, v4, [I */
int v5 = 0; // const/4 v5, 0x0
/* aput v12, v4, v5 */
int v5 = 1; // const/4 v5, 0x1
/* aput v13, v4, v5 */
/* aput-object v4, v2, v3 */
int v3 = 1; // const/4 v3, 0x1
int v4 = 2; // const/4 v4, 0x2
/* new-array v4, v4, [I */
int v5 = 0; // const/4 v5, 0x0
/* aput v14, v4, v5 */
int v5 = 1; // const/4 v5, 0x1
/* aput v15, v4, v5 */
/* aput-object v4, v2, v3 */
} // :cond_7
v3 = this.s;
/* aget-object v3, v3, v14 */
/* aget v3, v3, v15 */
v4 = this.s;
/* aget-object v4, v4, v14 */
int v5 = 0; // const/4 v5, 0x0
/* aput v5, v4, v15 */
(( at ) v11 ).a ( v12, v13 ); // invoke-virtual {v11, v12, v13}, Lat;->a(II)V
v4 = this.s;
/* aget-object v4, v4, v14 */
/* aput v3, v4, v15 */
v3 = this.y;
/* aget-object v3, v3, v14 */
/* aget v3, v3, v15 */
int v4 = 2; // const/4 v4, 0x2
/* if-ne v3, v4, :cond_4 */
v3 = this.y;
if ( v3 != null) { // if-eqz v3, :cond_8
v3 = this.y;
/* array-length v3, v3 */
if ( v3 != null) { // if-eqz v3, :cond_8
/* iget v3, v11, Lat;->p:I */
/* new-array v3, v3, [I */
this.z = v3;
/* iget v3, v11, Lat;->q:I */
/* new-array v3, v3, [I */
this.A = v3;
int v3 = 0; // const/4 v3, 0x0
/* iput v3, v11, Lat;->B:I */
int v3 = 0; // const/4 v3, 0x0
/* iput v3, v11, Lat;->C:I */
v3 = (( at ) v11 ).f ( ); // invoke-virtual {v11}, Lat;->f()I
/* const/16 v4, 0x64 */
/* if-ge v3, v4, :cond_b */
/* iget v4, v11, Lat;->p:I */
/* iget v5, v11, Lat;->q:I */
/* mul-int/2addr v4, v5 */
/* div-int/lit8 v4, v4, 0x2 */
/* if-ge v3, v4, :cond_b */
/* iget v3, v11, Lat;->p:I */
/* iput v3, v11, Lat;->B:I */
/* iget v3, v11, Lat;->q:I */
/* iput v3, v11, Lat;->C:I */
int v3 = 0; // const/4 v3, 0x0
} // :goto_2
/* iget v4, v11, Lat;->p:I */
/* if-lt v3, v4, :cond_9 */
int v3 = 0; // const/4 v3, 0x0
} // :goto_3
/* iget v4, v11, Lat;->q:I */
/* if-lt v3, v4, :cond_a */
} // :cond_8
} // :goto_4
v17 = (( at ) v11 ).f ( ); // invoke-virtual {v11}, Lat;->f()I
if ( v17 != null) { // if-eqz v17, :cond_4
/* iget v3, v11, Lat;->p:I */
/* iget v4, v11, Lat;->q:I */
/* mul-int/2addr v3, v4 */
/* move/from16 v0, v17 */
/* if-ne v0, v3, :cond_23 */
int v2 = 2; // const/4 v2, 0x2
/* new-array v2, v2, [[I */
int v3 = 0; // const/4 v3, 0x0
int v4 = 2; // const/4 v4, 0x2
/* new-array v4, v4, [I */
int v5 = 0; // const/4 v5, 0x0
/* aput v12, v4, v5 */
int v5 = 1; // const/4 v5, 0x1
/* aput v13, v4, v5 */
/* aput-object v4, v2, v3 */
int v3 = 1; // const/4 v3, 0x1
int v4 = 2; // const/4 v4, 0x2
/* new-array v4, v4, [I */
int v5 = 0; // const/4 v5, 0x0
/* aput v14, v4, v5 */
int v5 = 1; // const/4 v5, 0x1
/* aput v15, v4, v5 */
/* aput-object v4, v2, v3 */
/* goto/16 :goto_1 */
} // :cond_9
v4 = this.z;
/* aput v3, v4, v3 */
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_a
v4 = this.A;
/* aput v3, v4, v3 */
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_b
/* iget v3, v11, Lat;->p:I */
/* new-array v6, v3, [I */
int v3 = 0; // const/4 v3, 0x0
} // :goto_5
/* iget v4, v11, Lat;->p:I */
/* if-lt v3, v4, :cond_d */
int v3 = 0; // const/4 v3, 0x0
} // :goto_6
/* iget v4, v11, Lat;->p:I */
/* if-lt v3, v4, :cond_11 */
/* iget v3, v11, Lat;->q:I */
/* new-array v6, v3, [I */
int v3 = 0; // const/4 v3, 0x0
} // :goto_7
/* iget v4, v11, Lat;->q:I */
/* if-lt v3, v4, :cond_15 */
int v3 = 0; // const/4 v3, 0x0
} // :goto_8
/* iget v4, v11, Lat;->q:I */
/* if-lt v3, v4, :cond_19 */
/* iget v3, v11, Lat;->p:I */
/* iget v4, v11, Lat;->B:I */
/* if-ne v3, v4, :cond_c */
/* iget v3, v11, Lat;->q:I */
/* iget v4, v11, Lat;->C:I */
/* if-eq v3, v4, :cond_8 */
} // :cond_c
/* iget v3, v11, Lat;->p:I */
/* iget v4, v11, Lat;->q:I */
/* filled-new-array {v3, v4}, [I */
v4 = java.lang.Integer.TYPE;
java.lang.reflect.Array .newInstance ( v4,v3 );
/* check-cast v3, [[I */
int v4 = 0; // const/4 v4, 0x0
} // :goto_9
/* iget v5, v11, Lat;->p:I */
/* if-lt v4, v5, :cond_1d */
/* iget v4, v11, Lat;->B:I */
} // :goto_a
/* iget v5, v11, Lat;->p:I */
/* if-lt v4, v5, :cond_1f */
/* iget v4, v11, Lat;->C:I */
} // :goto_b
/* iget v5, v11, Lat;->q:I */
/* if-lt v4, v5, :cond_21 */
this.y = v3;
/* goto/16 :goto_4 */
} // :cond_d
int v5 = 1; // const/4 v5, 0x1
int v4 = 0; // const/4 v4, 0x0
/* aput v4, v6, v3 */
int v4 = 0; // const/4 v4, 0x0
} // :goto_c
/* iget v7, v11, Lat;->q:I */
/* if-lt v4, v7, :cond_f */
/* move v4, v5 */
} // :goto_d
if ( v4 != null) { // if-eqz v4, :cond_e
int v4 = 1; // const/4 v4, 0x1
/* aput v4, v6, v3 */
} // :cond_e
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_f
v7 = this.y;
/* aget-object v7, v7, v3 */
/* aget v7, v7, v4 */
int v8 = 2; // const/4 v8, 0x2
/* if-eq v7, v8, :cond_10 */
int v4 = 0; // const/4 v4, 0x0
} // :cond_10
/* add-int/lit8 v4, v4, 0x1 */
} // :cond_11
/* if-lez v3, :cond_12 */
/* if-eq v3, v12, :cond_12 */
/* if-eq v3, v14, :cond_12 */
/* aget v4, v6, v3 */
int v5 = 1; // const/4 v5, 0x1
/* if-eq v4, v5, :cond_13 */
} // :cond_12
v4 = this.z;
/* iget v5, v11, Lat;->B:I */
/* aput v5, v4, v3 */
/* iget v4, v11, Lat;->B:I */
/* add-int/lit8 v4, v4, 0x1 */
/* iput v4, v11, Lat;->B:I */
} // :goto_e
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_13
/* aget v4, v6, v3 */
int v5 = 1; // const/4 v5, 0x1
/* if-ne v4, v5, :cond_14 */
/* add-int/lit8 v4, v3, -0x1 */
/* aget v4, v6, v4 */
int v5 = 1; // const/4 v5, 0x1
/* if-ne v4, v5, :cond_14 */
v4 = this.z;
v5 = this.z;
/* add-int/lit8 v7, v3, -0x1 */
/* aget v5, v5, v7 */
/* aput v5, v4, v3 */
} // :cond_14
v4 = this.z;
/* iget v5, v11, Lat;->B:I */
/* aput v5, v4, v3 */
/* iget v4, v11, Lat;->B:I */
/* add-int/lit8 v4, v4, 0x1 */
/* iput v4, v11, Lat;->B:I */
} // :cond_15
int v5 = 1; // const/4 v5, 0x1
int v4 = 0; // const/4 v4, 0x0
} // :goto_f
/* iget v7, v11, Lat;->p:I */
/* if-lt v4, v7, :cond_16 */
/* move v4, v5 */
} // :goto_10
if ( v4 != null) { // if-eqz v4, :cond_18
int v4 = 1; // const/4 v4, 0x1
/* aput v4, v6, v3 */
} // :goto_11
/* add-int/lit8 v3, v3, 0x1 */
/* goto/16 :goto_7 */
} // :cond_16
v7 = this.y;
/* aget-object v7, v7, v4 */
/* aget v7, v7, v3 */
int v8 = 2; // const/4 v8, 0x2
/* if-eq v7, v8, :cond_17 */
int v4 = 0; // const/4 v4, 0x0
} // :cond_17
/* add-int/lit8 v4, v4, 0x1 */
} // :cond_18
int v4 = 0; // const/4 v4, 0x0
/* aput v4, v6, v3 */
} // :cond_19
/* if-lez v3, :cond_1a */
/* if-eq v3, v13, :cond_1a */
/* if-eq v3, v15, :cond_1a */
/* aget v4, v6, v3 */
int v5 = 1; // const/4 v5, 0x1
/* if-eq v4, v5, :cond_1b */
} // :cond_1a
v4 = this.A;
/* iget v5, v11, Lat;->C:I */
/* aput v5, v4, v3 */
/* iget v4, v11, Lat;->C:I */
/* add-int/lit8 v4, v4, 0x1 */
/* iput v4, v11, Lat;->C:I */
} // :goto_12
/* add-int/lit8 v3, v3, 0x1 */
/* goto/16 :goto_8 */
} // :cond_1b
/* aget v4, v6, v3 */
int v5 = 1; // const/4 v5, 0x1
/* if-ne v4, v5, :cond_1c */
/* add-int/lit8 v4, v3, -0x1 */
/* aget v4, v6, v4 */
int v5 = 1; // const/4 v5, 0x1
/* if-ne v4, v5, :cond_1c */
v4 = this.A;
v5 = this.A;
/* add-int/lit8 v7, v3, -0x1 */
/* aget v5, v5, v7 */
/* aput v5, v4, v3 */
} // :cond_1c
v4 = this.A;
/* iget v5, v11, Lat;->C:I */
/* aput v5, v4, v3 */
/* iget v4, v11, Lat;->C:I */
/* add-int/lit8 v4, v4, 0x1 */
/* iput v4, v11, Lat;->C:I */
} // :cond_1d
int v5 = 0; // const/4 v5, 0x0
} // :goto_13
/* iget v6, v11, Lat;->q:I */
/* if-lt v5, v6, :cond_1e */
/* add-int/lit8 v4, v4, 0x1 */
/* goto/16 :goto_9 */
} // :cond_1e
v6 = this.z;
/* aget v6, v6, v4 */
/* aget-object v6, v3, v6 */
v7 = this.A;
/* aget v7, v7, v5 */
v8 = this.y;
/* aget-object v8, v8, v4 */
/* aget v8, v8, v5 */
/* aput v8, v6, v7 */
/* add-int/lit8 v5, v5, 0x1 */
} // :cond_1f
int v5 = 0; // const/4 v5, 0x0
} // :goto_14
/* iget v6, v11, Lat;->q:I */
/* if-lt v5, v6, :cond_20 */
/* add-int/lit8 v4, v4, 0x1 */
/* goto/16 :goto_a */
} // :cond_20
/* aget-object v6, v3, v4 */
int v7 = 3; // const/4 v7, 0x3
/* aput v7, v6, v5 */
/* add-int/lit8 v5, v5, 0x1 */
} // :cond_21
int v5 = 0; // const/4 v5, 0x0
} // :goto_15
/* iget v6, v11, Lat;->B:I */
/* if-lt v5, v6, :cond_22 */
/* add-int/lit8 v4, v4, 0x1 */
/* goto/16 :goto_b */
} // :cond_22
/* aget-object v6, v3, v5 */
int v7 = 3; // const/4 v7, 0x3
/* aput v7, v6, v4 */
/* add-int/lit8 v5, v5, 0x1 */
} // :cond_23
/* move/from16 v0, v17 */
/* move/from16 v1, v17 */
/* filled-new-array {v0, v1}, [I */
v4 = java.lang.Integer.TYPE;
java.lang.reflect.Array .newInstance ( v4,v3 );
/* check-cast v3, [[I */
int v4 = 3; // const/4 v4, 0x3
/* move/from16 v0, v17 */
/* filled-new-array {v0, v4}, [I */
v5 = java.lang.Integer.TYPE;
java.lang.reflect.Array .newInstance ( v5,v4 );
/* check-cast v4, [[I */
int v8 = 0; // const/4 v8, 0x0
int v7 = 0; // const/4 v7, 0x0
int v6 = 0; // const/4 v6, 0x0
int v5 = 0; // const/4 v5, 0x0
} // :goto_16
/* iget v9, v11, Lat;->p:I */
/* if-lt v5, v9, :cond_26 */
int v5 = 0; // const/4 v5, 0x0
/* move v6, v5 */
} // :goto_17
/* move/from16 v0, v17 */
/* if-lt v6, v0, :cond_2a */
/* new-instance v12, Ljava/util/ArrayList; */
/* invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V */
java.lang.Integer .valueOf ( v8 );
(( java.util.ArrayList ) v12 ).add ( v5 ); // invoke-virtual {v12, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* move/from16 v0, v17 */
/* new-array v13, v0, [I */
/* move/from16 v0, v17 */
/* new-array v14, v0, [Ljava/util/ArrayList; */
int v5 = 0; // const/4 v5, 0x0
} // :goto_18
/* move/from16 v0, v17 */
/* if-lt v5, v0, :cond_2e */
int v5 = 0; // const/4 v5, 0x0
/* move v10, v5 */
} // :goto_19
/* add-int/lit8 v5, v17, -0x1 */
/* if-lt v10, v5, :cond_30 */
} // :cond_24
/* aget-object v3, v14, v7 */
v6 = (( java.util.ArrayList ) v3 ).size ( ); // invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
/* aget v3, v13, v7 */
/* const v5, 0x1869f */
/* if-ge v3, v5, :cond_25 */
int v2 = 2; // const/4 v2, 0x2
/* filled-new-array {v6, v2}, [I */
v3 = java.lang.Integer.TYPE;
java.lang.reflect.Array .newInstance ( v3,v2 );
/* check-cast v2, [[I */
int v3 = 0; // const/4 v3, 0x0
/* move v5, v3 */
} // :goto_1a
/* if-lt v5, v6, :cond_34 */
} // :cond_25
(( at ) v11 ).a ( v2 ); // invoke-virtual {v11, v2}, Lat;->a([[I)[[I
/* goto/16 :goto_1 */
} // :cond_26
int v9 = 0; // const/4 v9, 0x0
} // :goto_1b
/* iget v10, v11, Lat;->q:I */
/* if-lt v9, v10, :cond_27 */
/* add-int/lit8 v5, v5, 0x1 */
} // :cond_27
v10 = this.y;
/* aget-object v10, v10, v5 */
/* aget v10, v10, v9 */
/* const/16 v18, 0x2 */
/* move/from16 v0, v18 */
/* if-ne v10, v0, :cond_38 */
/* aget-object v10, v4, v6 */
/* const/16 v18, 0x0 */
/* aput v5, v10, v18 */
/* aget-object v10, v4, v6 */
/* const/16 v18, 0x1 */
/* aput v9, v10, v18 */
/* aget-object v10, v4, v6 */
/* const/16 v18, 0x2 */
/* sub-int v19, v5, v12 */
v19 = /* invoke-static/range {v19 ..v19}, Ljava/lang/Math;->abs(I)I */
/* sub-int v20, v9, v13 */
v20 = /* invoke-static/range {v20 ..v20}, Ljava/lang/Math;->abs(I)I */
/* add-int v19, v19, v20 */
/* aput v19, v10, v18 */
v10 = this.z;
/* aget v10, v10, v12 */
/* if-ne v5, v10, :cond_28 */
v10 = this.A;
/* aget v10, v10, v13 */
/* if-ne v9, v10, :cond_28 */
/* move v8, v6 */
} // :cond_28
v10 = this.z;
/* aget v10, v10, v14 */
/* if-ne v5, v10, :cond_29 */
v10 = this.A;
/* aget v10, v10, v15 */
/* if-ne v9, v10, :cond_29 */
/* move v7, v6 */
} // :cond_29
/* add-int/lit8 v6, v6, 0x1 */
/* move v10, v8 */
/* move v8, v7 */
/* move v7, v6 */
} // :goto_1c
/* add-int/lit8 v6, v9, 0x1 */
/* move v9, v6 */
/* move v6, v7 */
/* move v7, v8 */
/* move v8, v10 */
} // :cond_2a
int v5 = 0; // const/4 v5, 0x0
} // :goto_1d
/* move/from16 v0, v17 */
/* if-lt v5, v0, :cond_2b */
/* add-int/lit8 v5, v6, 0x1 */
/* move v6, v5 */
/* goto/16 :goto_17 */
} // :cond_2b
/* aget-object v9, v3, v6 */
/* const v10, 0x1869f */
/* aput v10, v9, v5 */
/* aget-object v9, v4, v6 */
int v10 = 0; // const/4 v10, 0x0
/* aget v9, v9, v10 */
/* aget-object v10, v4, v5 */
int v12 = 0; // const/4 v12, 0x0
/* aget v10, v10, v12 */
/* if-ne v9, v10, :cond_2c */
/* aget-object v9, v4, v6 */
int v10 = 1; // const/4 v10, 0x1
/* aget v9, v9, v10 */
/* aget-object v10, v4, v5 */
int v12 = 1; // const/4 v12, 0x1
/* aget v10, v10, v12 */
/* sub-int/2addr v9, v10 */
v9 = java.lang.Math .abs ( v9 );
int v10 = 1; // const/4 v10, 0x1
/* if-ne v9, v10, :cond_2c */
/* aget-object v9, v3, v6 */
int v10 = 1; // const/4 v10, 0x1
/* aput v10, v9, v5 */
} // :cond_2c
/* aget-object v9, v4, v6 */
int v10 = 1; // const/4 v10, 0x1
/* aget v9, v9, v10 */
/* aget-object v10, v4, v5 */
int v12 = 1; // const/4 v12, 0x1
/* aget v10, v10, v12 */
/* if-ne v9, v10, :cond_2d */
/* aget-object v9, v4, v6 */
int v10 = 0; // const/4 v10, 0x0
/* aget v9, v9, v10 */
/* aget-object v10, v4, v5 */
int v12 = 0; // const/4 v12, 0x0
/* aget v10, v10, v12 */
/* sub-int/2addr v9, v10 */
v9 = java.lang.Math .abs ( v9 );
int v10 = 1; // const/4 v10, 0x1
/* if-ne v9, v10, :cond_2d */
/* aget-object v9, v3, v6 */
int v10 = 1; // const/4 v10, 0x1
/* aput v10, v9, v5 */
} // :cond_2d
/* add-int/lit8 v5, v5, 0x1 */
} // :cond_2e
/* aget-object v6, v3, v8 */
/* aget v6, v6, v5 */
/* aput v6, v13, v5 */
/* new-instance v6, Ljava/util/ArrayList; */
/* invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V */
/* aput-object v6, v14, v5 */
/* aget v6, v13, v5 */
/* const v9, 0x1869f */
/* if-ge v6, v9, :cond_2f */
/* aget-object v6, v14, v5 */
java.lang.Integer .valueOf ( v8 );
(( java.util.ArrayList ) v6 ).add ( v9 ); // invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* aget-object v6, v14, v5 */
java.lang.Integer .valueOf ( v5 );
(( java.util.ArrayList ) v6 ).add ( v9 ); // invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
} // :cond_2f
/* add-int/lit8 v5, v5, 0x1 */
/* goto/16 :goto_18 */
} // :cond_30
/* const v5, 0x1869f */
int v6 = 0; // const/4 v6, 0x0
/* move v9, v8 */
} // :goto_1e
/* move/from16 v0, v17 */
/* if-lt v6, v0, :cond_31 */
java.lang.Integer .valueOf ( v9 );
(( java.util.ArrayList ) v12 ).add ( v5 ); // invoke-virtual {v12, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
int v5 = 0; // const/4 v5, 0x0
/* move v6, v5 */
} // :goto_1f
/* move/from16 v0, v17 */
/* if-lt v6, v0, :cond_32 */
/* aget v5, v13, v7 */
/* move/from16 v0, v16 */
/* if-eq v5, v0, :cond_24 */
/* add-int/lit8 v5, v10, 0x1 */
/* move v10, v5 */
/* goto/16 :goto_19 */
} // :cond_31
java.lang.Integer .valueOf ( v6 );
v15 = (( java.util.ArrayList ) v12 ).contains ( v15 ); // invoke-virtual {v12, v15}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
/* if-nez v15, :cond_37 */
/* aget v15, v13, v6 */
/* if-ge v15, v5, :cond_37 */
/* aget v5, v13, v6 */
/* move v9, v5 */
/* move v5, v6 */
} // :goto_20
/* add-int/lit8 v6, v6, 0x1 */
/* move/from16 v21, v5 */
/* move v5, v9 */
/* move/from16 v9, v21 */
} // :cond_32
java.lang.Integer .valueOf ( v6 );
v5 = (( java.util.ArrayList ) v12 ).contains ( v5 ); // invoke-virtual {v12, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
/* if-nez v5, :cond_33 */
/* aget v5, v13, v6 */
/* aget v15, v13, v9 */
/* aget-object v18, v3, v9 */
/* aget v18, v18, v6 */
/* add-int v15, v15, v18 */
/* if-le v5, v15, :cond_33 */
/* aget v5, v13, v9 */
/* aget-object v15, v3, v9 */
/* aget v15, v15, v6 */
/* add-int/2addr v5, v15 */
/* aput v5, v13, v6 */
/* aget-object v5, v14, v9 */
(( java.util.ArrayList ) v5 ).clone ( ); // invoke-virtual {v5}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;
/* check-cast v5, Ljava/util/ArrayList; */
/* aput-object v5, v14, v6 */
/* aget-object v5, v14, v6 */
java.lang.Integer .valueOf ( v6 );
(( java.util.ArrayList ) v5 ).add ( v15 ); // invoke-virtual {v5, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
} // :cond_33
/* add-int/lit8 v5, v6, 0x1 */
/* move v6, v5 */
} // :cond_34
/* aget-object v8, v2, v5 */
int v9 = 0; // const/4 v9, 0x0
/* aget-object v3, v14, v7 */
(( java.util.ArrayList ) v3 ).get ( v5 ); // invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v3, Ljava/lang/Integer; */
v3 = (( java.lang.Integer ) v3 ).intValue ( ); // invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
/* aget-object v3, v4, v3 */
int v10 = 0; // const/4 v10, 0x0
/* aget v3, v3, v10 */
/* aput v3, v8, v9 */
/* aget-object v8, v2, v5 */
int v9 = 1; // const/4 v9, 0x1
/* aget-object v3, v14, v7 */
(( java.util.ArrayList ) v3 ).get ( v5 ); // invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v3, Ljava/lang/Integer; */
v3 = (( java.lang.Integer ) v3 ).intValue ( ); // invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
/* aget-object v3, v4, v3 */
int v10 = 1; // const/4 v10, 0x1
/* aget v3, v3, v10 */
/* aput v3, v8, v9 */
/* add-int/lit8 v3, v5, 0x1 */
/* move v5, v3 */
/* goto/16 :goto_1a */
} // :cond_35
/* move-object/from16 v0, p0 */
v3 = this.g;
this.H = v2;
/* move-object/from16 v0, p0 */
v2 = this.g;
/* iget v3, v2, Lat;->I:I */
/* add-int/lit8 v3, v3, 0x1 */
/* iput v3, v2, Lat;->I:I */
/* invoke-direct/range {p0 ..p0}, Llqh/china/lianliankancgrbw/LayerGame;->of_play_combo_number()V */
int v2 = 0; // const/4 v2, 0x0
/* move-object/from16 v0, p0 */
(( lqh.china.lianliankancgrbw.LayerGame ) v0 ).of_play_clearing_1 ( v2 ); // invoke-virtual {v0, v2}, Llqh/china/lianliankancgrbw/LayerGame;->of_play_clearing_1(F)V
/* move-object/from16 v0, p0 */
v2 = this.g;
int v3 = -1; // const/4 v3, -0x1
/* iput v3, v2, Lat;->D:I */
/* move-object/from16 v0, p0 */
v2 = this.g;
int v3 = -1; // const/4 v3, -0x1
/* iput v3, v2, Lat;->E:I */
/* move-object/from16 v0, p0 */
v2 = this.g;
int v3 = -1; // const/4 v3, -0x1
/* iput v3, v2, Lat;->F:I */
/* move-object/from16 v0, p0 */
v2 = this.g;
int v3 = -1; // const/4 v3, -0x1
/* iput v3, v2, Lat;->G:I */
/* goto/16 :goto_0 */
} // :cond_36
/* move-object/from16 v0, p0 */
v2 = this.g;
/* move/from16 v0, p1 */
/* iput v0, v2, Lat;->D:I */
/* move-object/from16 v0, p0 */
v2 = this.g;
/* move/from16 v0, p2 */
/* iput v0, v2, Lat;->E:I */
/* move-object/from16 v0, p0 */
v2 = this.g;
int v3 = -1; // const/4 v3, -0x1
/* iput v3, v2, Lat;->F:I */
/* move-object/from16 v0, p0 */
v2 = this.g;
int v3 = -1; // const/4 v3, -0x1
/* iput v3, v2, Lat;->G:I */
/* move-object/from16 v0, p0 */
v2 = this.g;
(( at ) v2 ).g ( ); // invoke-virtual {v2}, Lat;->g()V
/* goto/16 :goto_0 */
} // :cond_37
/* move/from16 v21, v9 */
/* move v9, v5 */
/* move/from16 v5, v21 */
/* goto/16 :goto_20 */
} // :cond_38
/* move v10, v8 */
/* move v8, v7 */
/* move v7, v6 */
/* goto/16 :goto_1c */
} // .end method
public void onButtonHomeClicked ( ) {
/* .locals 1 */
v0 = this.sButtonHome;
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_button_down_imitate ( v0 ); // invoke-virtual {p0, v0}, Llqh/china/lianliankancgrbw/LayerGame;->of_button_down_imitate(Lcom/wiyun/engine/nodes/Sprite;)V
int v0 = 0; // const/4 v0, 0x0
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_dialog_exit ( v0 ); // invoke-virtual {p0, v0}, Llqh/china/lianliankancgrbw/LayerGame;->of_dialog_exit(F)V
return;
} // .end method
public void onButtonMusicClicked ( ) {
/* .locals 4 */
int v3 = 1; // const/4 v3, 0x1
int v2 = 0; // const/4 v2, 0x0
v0 = this.sButtonMusic;
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_button_down_imitate ( v0 ); // invoke-virtual {p0, v0}, Llqh/china/lianliankancgrbw/LayerGame;->of_button_down_imitate(Lcom/wiyun/engine/nodes/Sprite;)V
/* sget-boolean v0, Lay;->m:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
ay.m = (v2!= 0);
v0 = this.g;
v0 = this.a;
final String v1 = "ibmusic"; // const-string v1, "ibmusic"
ax .a ( v0,v1,v2 );
ay .a ( );
} // :goto_0
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_set_button_pic_by_status ( ); // invoke-virtual {p0}, Llqh/china/lianliankancgrbw/LayerGame;->of_set_button_pic_by_status()V
return;
} // :cond_0
ay.m = (v3!= 0);
v0 = this.g;
v0 = this.a;
final String v1 = "ibmusic"; // const-string v1, "ibmusic"
ax .a ( v0,v1,v3 );
v0 = this.g;
v0 = this.a;
ay .a ( v0 );
} // .end method
public void onButtonSoundClicked ( ) {
/* .locals 4 */
int v3 = 1; // const/4 v3, 0x1
int v2 = 0; // const/4 v2, 0x0
v0 = this.sButtonSound;
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_button_down_imitate ( v0 ); // invoke-virtual {p0, v0}, Llqh/china/lianliankancgrbw/LayerGame;->of_button_down_imitate(Lcom/wiyun/engine/nodes/Sprite;)V
v0 = ay .b ( );
if ( v0 != null) { // if-eqz v0, :cond_0
ay .a ( v2 );
v0 = this.g;
v0 = this.a;
final String v1 = "ibsound"; // const-string v1, "ibsound"
ax .a ( v0,v1,v2 );
} // :goto_0
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_set_button_pic_by_status ( ); // invoke-virtual {p0}, Llqh/china/lianliankancgrbw/LayerGame;->of_set_button_pic_by_status()V
return;
} // :cond_0
ay .a ( v3 );
v0 = this.g;
v0 = this.a;
final String v1 = "ibsound"; // const-string v1, "ibsound"
ax .a ( v0,v1,v3 );
} // .end method
public void onFailMenu ( Float p0, java.lang.Object p1 ) {
/* .locals 2 */
v0 = this.g;
int v1 = 4; // const/4 v1, 0x4
/* iput v1, v0, Lat;->d:I */
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_exit ( ); // invoke-virtual {p0}, Llqh/china/lianliankancgrbw/LayerGame;->of_exit()V
return;
} // .end method
public void onFailRetry ( Float p0, java.lang.Object p1 ) {
/* .locals 4 */
int v3 = 1; // const/4 v3, 0x1
v0 = this.g;
v0 = this.a;
v1 = this.g;
/* iget v1, v1, Lat;->e:I */
v2 = this.g;
/* iget v2, v2, Lat;->h:I */
ax .a ( v0,v1,v2 );
v0 = this.g;
v0 = this.a;
v1 = this.g;
/* iget v1, v1, Lat;->e:I */
v2 = this.g;
/* iget v2, v2, Lat;->k:I */
ax .b ( v0,v1,v2 );
v0 = this.g;
/* iput-boolean v3, v0, Lat;->M:Z */
v0 = this.g;
/* iput-boolean v3, v0, Lat;->N:Z */
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_begin_next_restart_layer ( ); // invoke-virtual {p0}, Llqh/china/lianliankancgrbw/LayerGame;->of_begin_next_restart_layer()V
return;
} // .end method
public void onOKButton ( Float p0, java.lang.Object p1 ) {
/* .locals 0 */
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_exit ( ); // invoke-virtual {p0}, Llqh/china/lianliankancgrbw/LayerGame;->of_exit()V
return;
} // .end method
public void onTouchButton ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 1 */
v0 = this.rButtonMusic;
v0 = (( com.wiyun.engine.types.WYRect ) v0 ).containsPoint ( p1 ); // invoke-virtual {v0, p1}, Lcom/wiyun/engine/types/WYRect;->containsPoint(Lcom/wiyun/engine/types/WYPoint;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).onButtonMusicClicked ( ); // invoke-virtual {p0}, Llqh/china/lianliankancgrbw/LayerGame;->onButtonMusicClicked()V
} // :cond_0
v0 = this.rButtonSound;
v0 = (( com.wiyun.engine.types.WYRect ) v0 ).containsPoint ( p1 ); // invoke-virtual {v0, p1}, Lcom/wiyun/engine/types/WYRect;->containsPoint(Lcom/wiyun/engine/types/WYPoint;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).onButtonSoundClicked ( ); // invoke-virtual {p0}, Llqh/china/lianliankancgrbw/LayerGame;->onButtonSoundClicked()V
} // :cond_1
v0 = this.rButtonHome;
v0 = (( com.wiyun.engine.types.WYRect ) v0 ).containsPoint ( p1 ); // invoke-virtual {v0, p1}, Lcom/wiyun/engine/types/WYRect;->containsPoint(Lcom/wiyun/engine/types/WYPoint;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).onButtonHomeClicked ( ); // invoke-virtual {p0}, Llqh/china/lianliankancgrbw/LayerGame;->onButtonHomeClicked()V
} // :cond_2
return;
} // .end method
public void onTouchMain ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 3 */
v0 = this.g;
/* iget v0, v0, Lat;->d:I */
int v1 = 1; // const/4 v1, 0x1
/* if-eq v0, v1, :cond_1 */
} // :cond_0
} // :goto_0
return;
} // :cond_1
v0 = this.rMain;
v0 = (( com.wiyun.engine.types.WYRect ) v0 ).containsPoint ( p1 ); // invoke-virtual {v0, p1}, Lcom/wiyun/engine/types/WYRect;->containsPoint(Lcom/wiyun/engine/types/WYPoint;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget v0, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
v1 = this.rMain;
v1 = (( com.wiyun.engine.types.WYRect ) v1 ).minX ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/types/WYRect;->minX()F
/* sub-float/2addr v0, v1 */
v1 = this.rMain;
v1 = (( com.wiyun.engine.types.WYRect ) v1 ).maxY ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/types/WYRect;->maxY()F
/* iget v2, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* sub-float/2addr v1, v2 */
/* iget v2, p0, Llqh/china/lianliankancgrbw/LayerGame;->boxlength:F */
/* div-float/2addr v1, v2 */
/* float-to-int v1, v1 */
/* iget v2, p0, Llqh/china/lianliankancgrbw/LayerGame;->boxlength:F */
/* div-float/2addr v0, v2 */
/* float-to-int v0, v0 */
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_touch_main ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Llqh/china/lianliankancgrbw/LayerGame;->of_touch_main(II)V
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_reset_sprites ( ); // invoke-virtual {p0}, Llqh/china/lianliankancgrbw/LayerGame;->of_reset_sprites()V
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_reset_number_show ( ); // invoke-virtual {p0}, Llqh/china/lianliankancgrbw/LayerGame;->of_reset_number_show()V
} // .end method
public Boolean wyKeyDown ( android.view.KeyEvent p0 ) {
/* .locals 3 */
int v0 = 1; // const/4 v0, 0x1
v1 = (( android.view.KeyEvent ) p1 ).getKeyCode ( ); // invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I
int v2 = 4; // const/4 v2, 0x4
/* if-ne v1, v2, :cond_1 */
/* iget-boolean v1, p0, Llqh/china/lianliankancgrbw/LayerGame;->ib_can_exit_and_savegame:Z */
/* if-nez v1, :cond_0 */
} // :goto_0
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).of_dialog_exit ( v1 ); // invoke-virtual {p0, v1}, Llqh/china/lianliankancgrbw/LayerGame;->of_dialog_exit(F)V
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean wyTouchesBegan ( android.view.MotionEvent p0 ) {
/* .locals 3 */
com.wiyun.engine.nodes.Director .getInstance ( );
v1 = (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
v2 = (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
(( com.wiyun.engine.nodes.Director ) v0 ).convertToGL ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/wiyun/engine/nodes/Director;->convertToGL(FF)Lcom/wiyun/engine/types/WYPoint;
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).onTouchMain ( v0 ); // invoke-virtual {p0, v0}, Llqh/china/lianliankancgrbw/LayerGame;->onTouchMain(Lcom/wiyun/engine/types/WYPoint;)V
(( lqh.china.lianliankancgrbw.LayerGame ) p0 ).onTouchButton ( v0 ); // invoke-virtual {p0, v0}, Llqh/china/lianliankancgrbw/LayerGame;->onTouchButton(Lcom/wiyun/engine/types/WYPoint;)V
int v0 = 1; // const/4 v0, 0x1
} // .end method
