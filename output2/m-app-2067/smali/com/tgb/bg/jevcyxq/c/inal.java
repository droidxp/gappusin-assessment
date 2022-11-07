public class inal implements org.anddev.andengine.entity.scene.Scene$IOnSceneTouchListener {
	 /* # interfaces */
	 /* # instance fields */
	 public Lcom.tgb.bg.jevcyxq.b.r a;
	 com.tgb.bg.jevcyxq.b.r b;
	 private com.tgb.bg.jevcyxq.views.TGBMainGameActivity c;
	 private Integer d;
	 private Boolean e;
	 private Boolean f;
	 private Boolean g;
	 private Boolean h;
	 private com.tgb.bg.jevcyxq.b.r i;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput-boolean v0, p0, Lcom/tgb/bg/jevcyxq/c/z;->e:Z */
		 /* iput-boolean v0, p0, Lcom/tgb/bg/jevcyxq/c/z;->f:Z */
		 /* iput-boolean v0, p0, Lcom/tgb/bg/jevcyxq/c/z;->g:Z */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput-boolean v0, p0, Lcom/tgb/bg/jevcyxq/c/z;->h:Z */
		 int v0 = 0; // const/4 v0, 0x0
		 this.b = v0;
		 this.c = p1;
		 return;
	 } // .end method
	 static com.tgb.bg.jevcyxq.views.TGBMainGameActivity a ( Object p0 ) { //synthethic
		 /* .locals 1 */
		 v0 = this.c;
	 } // .end method
	 private org.anddev.andengine.entity.layer.tiled.tmx.TMXTile a ( Float p0, Float p1 ) {
		 /* .locals 1 */
		 v0 = this.c;
		 (( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v0 ).m ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->m()Lcom/tgb/bg/jevcyxq/c/aa;
		 (( com.tgb.bg.jevcyxq.c.aa ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/c/aa;->a()Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;
		 (( org.anddev.andengine.entity.layer.tiled.tmx.TMXLayer ) v0 ).getTMXTileAt ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->getTMXTileAt(FF)Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;
	 } // .end method
	 private void a ( Object p0, Integer p1 ) {
		 /* .locals 17 */
		 /* move-object/from16 v0, p0 */
		 /* iget-boolean v0, v0, Lcom/tgb/bg/jevcyxq/c/z;->g:Z */
		 /* move v3, v0 */
		 if ( v3 != null) { // if-eqz v3, :cond_0
			 /* new-instance v11, Lorg/anddev/andengine/entity/modifier/ParallelEntityModifier; */
			 int v3 = 2; // const/4 v3, 0x2
			 /* new-array v12, v3, [Lorg/anddev/andengine/entity/modifier/IEntityModifier; */
			 int v3 = 0; // const/4 v3, 0x0
			 /* new-instance v4, Lorg/anddev/andengine/entity/modifier/RotationModifier; */
			 /* const/high16 v5, 0x40000000 # 2.0f */
			 v6 = 			 /* invoke-virtual/range {p1 ..p1}, Lcom/tgb/bg/jevcyxq/b/q;->getRotation()F */
			 v7 = 			 /* invoke-virtual/range {p1 ..p1}, Lcom/tgb/bg/jevcyxq/b/q;->getRotation()F */
			 /* move/from16 v0, p2 */
			 /* int-to-float v0, v0 */
			 /* move v8, v0 */
			 /* add-float/2addr v7, v8 */
			 /* new-instance v8, Lcom/tgb/bg/jevcyxq/c/e; */
			 /* move-object v0, v8 */
			 /* move-object/from16 v1, p0 */
			 /* move-object/from16 v2, p1 */
			 /* invoke-direct {v0, v1, v2}, Lcom/tgb/bg/jevcyxq/c/e;-><init>(Lcom/tgb/bg/jevcyxq/c/z;Lcom/tgb/bg/jevcyxq/b/q;)V */
			 /* invoke-direct {v4, v5, v6, v7, v8}, Lorg/anddev/andengine/entity/modifier/RotationModifier;-><init>(FFFLorg/anddev/andengine/entity/modifier/IEntityModifier$IEntityModifierListener;)V */
			 /* aput-object v4, v12, v3 */
			 int v13 = 1; // const/4 v13, 0x1
			 /* new-instance v14, Lorg/anddev/andengine/entity/modifier/SequenceEntityModifier; */
			 int v3 = 1; // const/4 v3, 0x1
			 /* new-array v15, v3, [Lorg/anddev/andengine/entity/modifier/IEntityModifier; */
			 /* const/16 v16, 0x0 */
			 /* new-instance v3, Lorg/anddev/andengine/entity/modifier/ColorModifier; */
			 /* const/high16 v4, 0x40400000 # 3.0f */
			 /* const/high16 v5, 0x3f800000 # 1.0f */
			 /* const v6, 0x3f051eb8 # 0.52f */
			 /* const/high16 v7, 0x3f800000 # 1.0f */
			 /* const v8, 0x3df5c28f # 0.12f */
			 /* const/high16 v9, 0x3f800000 # 1.0f */
			 /* const v10, 0x3e0f5c29 # 0.14f */
			 /* invoke-direct/range {v3 ..v10}, Lorg/anddev/andengine/entity/modifier/ColorModifier;-><init>(FFFFFFF)V */
			 /* aput-object v3, v15, v16 */
			 /* invoke-direct {v14, v15}, Lorg/anddev/andengine/entity/modifier/SequenceEntityModifier;-><init>([Lorg/anddev/oke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 (( android.content.res.AssetManager ) v3 ).open ( v4 ); // invoke-virtual {v3, v4}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
	 /* new-instance v22, Lcom/csvreader/CsvReader; */
	 java.nio.charset.Charset .defaultCharset ( );
	 /* move-object/from16 v0, v22 */
	 /* move-object v1, v3 */
	 /* move-object v2, v4 */
	 /* invoke-direct {v0, v1, v2}, Lcom/csvreader/CsvReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V */
	 /* invoke-virtual/range {v22 ..v22}, Lcom/csvreader/CsvReader;->readRecord()Z */
	 /* invoke-virtual/range {v22 ..v22}, Lcom/csvreader/CsvReader;->getValues()[Ljava/lang/String; */
	 int v4 = 0; // const/4 v4, 0x0
	 /* aget-object v4, v3, v4 */
	 if ( v4 != null) { // if-eqz v4, :cond_0
		 int v4 = 0; // const/4 v4, 0x0
		 /* aget-object v4, v3, v4 */
		 v4 = 		 (( java.lang.String ) v4 ).length ( ); // invoke-virtual {v4}, Ljava/lang/String;->length()I
		 /* if-gtz v4, :cond_1 */
	 } // :cond_0
	 int v3 = 0; // const/4 v3, 0x0
} // :goto_0
} // :cond_1
int v4 = 0; // const/4 v4, 0x0
/* aget-object v4, v3, v4 */
v23 = com.tgb.bg.jevcyxq.c.x .a ( v4 );
int v4 = 1; // const/4 v4, 0x1
/* aget-object v3, v3, v4 */
com.tgb.bg.jevcyxq.c.x .a ( v3 );
/* invoke-virtual/range {v22 ..v22}, Lcom/csvreader/CsvReader;->readRecord()Z */
int v3 = 6; // const/4 v3, 0x6
/* const/16 v4, 0x8 */
/* filled-new-array {v3, v4}, [I */
/* const-class v4, Lcom/tgb/bg/jevcyxq/b/r; */
java.lang.reflect.Array .newInstance ( v4,v3 );
/* check-cast p2, [[Lcom/tgb/bg/jevcyxq/b/r; */
int v3 = 0; // const/4 v3, 0x0
/* move/from16 v24, v3 */
} // :goto_1
int v3 = 6; // const/4 v3, 0x6
/* move/from16 v0, v24 */
/* move v1, v3 */
/* if-lt v0, v1, :cond_2 */
/* invoke-virtual/range {v22 ..v22}, Lcom/csvreader/CsvReader;->close()V */
/* move-object/from16 v0, v21 */
/* move/from16 v1, v23 */
(( com.tgb.bg.jevcyxq.b.ak ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/tgb/bg/jevcyxq/b/ak;->a(I)V
/* move-object/from16 v0, v21 */
/* move-object/from16 v1, p2 */
(( com.tgb.bg.jevcyxq.b.ak ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/tgb/bg/jevcyxq/b/ak;->a([[Lcom/tgb/bg/jevcyxq/b/r;)V
/* move-object/from16 v3, v21 */
} // :cond_2
int v3 = 0; // const/4 v3, 0x0
/* move/from16 v25, v3 */
} // :goto_2
/* const/16 v3, 0x8 */
/* move/from16 v0, v25 */
/* move v1, v3 */
/* if-lt v0, v1, :cond_3 */
/* add-int/lit8 v3, v24, 0x1 */
/* move/from16 v24, v3 */
} // :cond_3
/* invoke-virtual/range {v22 ..v22}, Lcom/csvreader/CsvReader;->readRecord()Z */
int v3 = 1; // const/4 v3, 0x1
/* move-object/from16 v0, v22 */
/* move v1, v3 */
(( com.csvreader.CsvReader ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Lcom/csvreader/CsvReader;->get(I)Ljava/lang/String;
v3 = com.tgb.bg.jevcyxq.c.x .a ( v3 );
/* invoke-virtual/range {p1 ..p1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->m()Lcom/tgb/bg/jevcyxq/c/aa; */
(( com.tgb.bg.jevcyxq.c.aa ) v4 ).a ( ); // invoke-virtual {v4}, Lcom/tgb/bg/jevcyxq/c/aa;->a()Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;
/* move-object v0, v4 */
/* move/from16 v1, v25 */
/* move/from16 v2, v24 */
(( org.anddev.andengine.entity.layer.tiled.tmx.TMXLayer ) v0 ).getTMXTile ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->getTMXTile(II)Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;
int v4 = 0; // const/4 v4, 0x0
v6 = (( org.anddev.andengine.entity.layer.tiled.tmx.TMXTile ) v5 ).getTileX ( ); // invoke-virtual {v5}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;->getTileX()I
/* int-to-float v6, v6 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v7, v0 */
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v7 ).m ( ); // invoke-virtual {v7}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->m()Lcom/tgb/bg/jevcyxq/c/aa;
(( com.tgb.bg.jevcyxq.c.aa ) v7 ).a ( ); // invoke-virtual {v7}, Lcom/tgb/bg/jevcyxq/c/aa;->a()Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;
v7 = (( org.anddev.andengine.entity.layer.tiled.tmx.TMXLayer ) v7 ).getX ( ); // invoke-virtual {v7}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->getX()F
/* add-float/2addr v6, v7 */
v7 = (( org.anddev.andengine.entity.layer.tiled.tmx.TMXTile ) v5 ).getTileY ( ); // invoke-virtual {v5}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;->getTileY()I
/* int-to-float v7, v7 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v8, v0 */
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v8 ).m ( ); // invoke-virtual {v8}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->m()Lcom/tgb/bg/jevcyxq/c/aa;
(( com.tgb.bg.jevcyxq.c.aa ) v8 ).a ( ); // invoke-virtual {v8}, Lcom/tgb/bg/jevcyxq/c/aa;->a()Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;
v8 = (( org.anddev.andengine.entity.layer.tiled.tmx.TMXLayer ) v8 ).getY ( ); // invoke-virtual {v8}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->getY()F
/* add-float/2addr v7, v8 */
/* packed-switch v3, :pswitch_data_0 */
/* move-object v3, v4 */
} // :goto_3
/* aget-object v4, p2, v24 */
/* aput-object v3, v4, v25 */
/* add-int/lit8 v3, v25, 0x1 */
/* move/from16 v25, v3 */
/* :pswitch_0 */
/* new-instance v3, Lcom/tgb/bg/jevcyxq/b/ai; */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v4 ).g ( ); // invoke-virtual {v4}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->g()Lcom/tgb/bg/jevcyxq/c/w;
int v5 = 2; // const/4 v5, 0x2
(( com.tgb.bg.jevcyxq.c.w ) v4 ).a ( v5 ); // invoke-virtual {v4, v5}, Lcom/tgb/bg/jevcyxq/c/w;->a(I)Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;
/* invoke-direct {v3, v6, v7, v4}, Lcom/tgb/bg/jevcyxq/b/ai;-><init>(FFLorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;)V */
/* :pswitch_1 */
/* new-instance v3, Lcom/tgb/bg/jevcyxq/b/ai; */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v4 ).g ( ); // invoke-virtual {v4}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->g()Lcom/tgb/bg/jevcyxq/c/w;
int v5 = 3; // const/4 v5, 0x3
(( com.tgb.bg.jevcyxq.c.w ) v4 ).a ( v5 ); // invoke-virtual {v4, v5}, Lcom/tgb/bg/jevcyxq/c/w;->a(I)Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;
/* invoke-direct {v3, v6, v7, v4}, Lcom/tgb/bg/jevcyxq/b/ai;-><init>(FFLorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;)V */
/* :pswitch_2 */
/* new-instance v3, Lcom/tgb/bg/jevcyxq/b/ai; */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v4 ).g ( ); // invoke-virtual {v4}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->g()Lcom/tgb/bg/jevcyxq/c/w;
int v5 = 4; // const/4 v5, 0x4
(( com.tgb.bg.jevcyxq.c.w ) v4 ).a ( v5 ); // invoke-virtual {v4, v5}, Lcom/tgb/bg/jevcyxq/c/w;->a(I)Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;
/* invoke-direct {v3, v6, v7, v4}, Lcom/tgb/bg/jevcyxq/b/ai;-><init>(FFLorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;)V */
/* :pswitch_3 */
/* new-instance v3, Lcom/tgb/bg/jevcyxq/b/ai; */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v4 ).g ( ); // invoke-virtual {v4}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->g()Lcom/tgb/bg/jevcyxq/c/w;
int v5 = 5; // const/4 v5, 0x5
(( com.tgb.bg.jevcyxq.c.w ) v4 ).a ( v5 ); // invoke-virtual {v4, v5}, Lcom/tgb/bg/jevcyxq/c/w;->a(I)Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;
/* invoke-direct {v3, v6, v7, v4}, Lcom/tgb/bg/jevcyxq/b/ai;-><init>(FFLorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;)V */
/* :pswitch_4 */
/* new-instance v3, Lcom/tgb/bg/jevcyxq/b/b; */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v5 ).g ( ); // invoke-virtual {v5}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->g()Lcom/tgb/bg/jevcyxq/c/w;
v5 = this.x;
(( org.anddev.andengine.opengl.texture.region.TiledTextureRegion ) v5 ).clone ( ); // invoke-virtual {v5}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->clone()Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;
/* invoke-direct {v3, v6, v7, v4, v5}, Lcom/tgb/bg/jevcyxq/b/b;-><init>(FFLcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;)V */
/* :pswitch_5 */
/* new-instance v3, Lcom/tgb/bg/jevcyxq/b/aj; */
int v4 = 2; // const/4 v4, 0x2
/* move-object/from16 v0, v22 */
/* move v1, v4 */
(( com.csvreader.CsvReader ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Lcom/csvreader/CsvReader;->get(I)Ljava/lang/String;
v6 = com.tgb.bg.jevcyxq.c.x .a ( v4 );
int v4 = 3; // const/4 v4, 0x3
/* move-object/from16 v0, v22 */
/* move v1, v4 */
(( com.csvreader.CsvReader ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Lcom/csvreader/CsvReader;->get(I)Ljava/lang/String;
v7 = com.tgb.bg.jevcyxq.c.x .a ( v4 );
int v4 = 4; // const/4 v4, 0x4
/* move-object/from16 v0, v22 */
/* move v1, v4 */
(( com.csvreader.CsvReader ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Lcom/csvreader/CsvReader;->get(I)Ljava/lang/String;
v8 = com.tgb.bg.jevcyxq.c.x .a ( v4 );
int v4 = 5; // const/4 v4, 0x5
/* move-object/from16 v0, v22 */
/* move v1, v4 */
(( com.csvreader.CsvReader ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Lcom/csvreader/CsvReader;->get(I)Ljava/lang/String;
v9 = com.tgb.bg.jevcyxq.c.x .b ( v4 );
int v4 = 6; // const/4 v4, 0x6
/* move-object/from16 v0, v22 */
/* move v1, v4 */
(( com.csvreader.CsvReader ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Lcom/csvreader/CsvReader;->get(I)Ljava/lang/String;
v10 = com.tgb.bg.jevcyxq.c.x .b ( v4 );
int v4 = 7; // const/4 v4, 0x7
/* move-object/from16 v0, v22 */
/* move v1, v4 */
(( com.csvreader.CsvReader ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Lcom/csvreader/CsvReader;->get(I)Ljava/lang/String;
v11 = com.tgb.bg.jevcyxq.c.x .a ( v4 );
/* const/16 v4, 0x8 */
/* move-object/from16 v0, v22 */
/* move v1, v4 */
(( com.csvreader.CsvReader ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Lcom/csvreader/CsvReader;->get(I)Ljava/lang/String;
v12 = com.tgb.bg.jevcyxq.c.x .a ( v4 );
/* const/16 v4, 0x9 */
/* move-object/from16 v0, v22 */
/* move v1, v4 */
(( com.csvreader.CsvReader ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Lcom/csvreader/CsvReader;->get(I)Ljava/lang/String;
v13 = com.tgb.bg.jevcyxq.c.x .a ( v4 );
/* const/16 v4, 0xa */
/* move-object/from16 v0, v22 */
/* move v1, v4 */
(( com.csvreader.CsvReader ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Lcom/csvreader/CsvReader;->get(I)Ljava/lang/String;
v4 = com.tgb.bg.jevcyxq.c.x .b ( v4 );
java.lang.Boolean .valueOf ( v4 );
/* const/16 v4, 0xb */
/* move-object/from16 v0, v22 */
/* move v1, v4 */
(( com.csvreader.CsvReader ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Lcom/csvreader/CsvReader;->get(I)Ljava/lang/String;
v15 = com.tgb.bg.jevcyxq.c.x .a ( v4 );
/* const/16 v4, 0xc */
/* move-object/from16 v0, v22 */
/* move v1, v4 */
(( com.csvreader.CsvReader ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Lcom/csvreader/CsvReader;->get(I)Ljava/lang/String;
v4 = com.tgb.bg.jevcyxq.c.x .b ( v4 );
java.lang.Boolean .valueOf ( v4 );
/* const/16 v4, 0xd */
/* move-object/from16 v0, v22 */
/* move v1, v4 */
(( com.csvreader.CsvReader ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Lcom/csvreader/CsvReader;->get(I)Ljava/lang/String;
v4 = com.tgb.bg.jevcyxq.c.x .b ( v4 );
java.lang.Boolean .valueOf ( v4 );
/* const/16 v4, 0xe */
/* move-object/from16 v0, v22 */
/* move v1, v4 */
(( com.csvreader.CsvReader ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Lcom/csvreader/CsvReader;->get(I)Ljava/lang/String;
v18 = com.tgb.bg.jevcyxq.c.x .a ( v4 );
/* const/16 v4, 0xf */
/* move-object/from16 v0, v22 */
/* move v1, v4 */
(( com.csvreader.CsvReader ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Lcom/csvreader/CsvReader;->get(I)Ljava/lang/String;
v19 = com.tgb.bg.jevcyxq.c.x .b ( v4 );
/* const/16 v4, 0x10 */
/* move-object/from16 v0, v22 */
/* move v1, v4 */
(( com.csvreader.CsvReader ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Lcom/csvreader/CsvReader;->get(I)Ljava/lang/String;
v20 = com.tgb.bg.jevcyxq.c.x .b ( v4 );
/* move-object/from16 v4, p1 */
/* invoke-direct/range {v3 ..v20}, Lcom/tgb/bg/jevcyxq/b/aj;-><init>(Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;IIIZZIIILjava/lang/Boolean;ILjava/lang/Boolean;Ljava/lang/Boolean;IZZ)V */
/* goto/16 :goto_3 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_5 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_3 */
/* :pswitch_4 */
} // .end packed-switch
} // .end method
/c/g;
(( com.tgb.bg.jevcyxq.c.g ) v0 ).e ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/c/g;->e()Ljava/util/ArrayList;
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/am; */
(( com.tgb.bg.jevcyxq.b.am ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
/* array-length v0, v0 */
/* if-lt v2, v0, :cond_3 */
/* add-int/lit8 v0, v1, 0x1 */
/* move v1, v0 */
} // :cond_3
v0 = this.c;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v0 ).j ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->j()Lcom/tgb/bg/jevcyxq/c/g;
(( com.tgb.bg.jevcyxq.c.g ) v0 ).e ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/c/g;->e()Ljava/util/ArrayList;
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/am; */
(( com.tgb.bg.jevcyxq.b.am ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
/* aget-object v0, v0, v2 */
v0 = (( com.tgb.bg.jevcyxq.b.q ) v0 ).e ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/q;->e()Z
/* if-nez v0, :cond_4 */
/* move v0, v3 */
} // :cond_4
/* add-int/lit8 v0, v2, 0x1 */
/* move v2, v0 */
} // .end method
public final void e ( ) {
/* .locals 5 */
int v4 = 0; // const/4 v4, 0x0
/* move v0, v4 */
} // :goto_0
int v1 = 6; // const/4 v1, 0x6
/* if-lt v0, v1, :cond_0 */
return;
} // :cond_0
/* move v1, v4 */
} // :goto_1
/* const/16 v2, 0x8 */
/* if-lt v1, v2, :cond_1 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
v2 = this.a;
/* aget-object v2, v2, v0 */
/* aget-object v2, v2, v1 */
if ( v2 != null) { // if-eqz v2, :cond_2
v2 = this.a;
/* aget-object v2, v2, v0 */
/* aget-object v2, v2, v1 */
/* instance-of v2, v2, Lcom/tgb/bg/jevcyxq/b/aj; */
if ( v2 != null) { // if-eqz v2, :cond_2
v2 = this.c;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v2 ).e ( ); // invoke-virtual {v2}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->e()Lorg/anddev/andengine/entity/scene/Scene;
v3 = this.a;
/* aget-object v3, v3, v0 */
/* aget-object v3, v3, v1 */
(( org.anddev.andengine.entity.scene.Scene ) v2 ).unregisterTouchArea ( v3 ); // invoke-virtual {v2, v3}, Lorg/anddev/andengine/entity/scene/Scene;->unregisterTouchArea(Lorg/anddev/andengine/entity/scene/Scene$ITouchArea;)Z
} // :cond_2
v2 = this.a;
/* aget-object v2, v2, v0 */
int v3 = 0; // const/4 v3, 0x0
/* aput-object v3, v2, v1 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
public final Boolean onSceneTouchEvent ( org.anddev.andengine.entity.scene.Scene p0, org.anddev.andengine.input.touch.TouchEvent p1 ) {
/* .locals 10 */
int v9 = 0; // const/4 v9, 0x0
int v8 = 1; // const/4 v8, 0x1
/* const/high16 v4, 0x40000000 # 2.0f */
v0 = (( org.anddev.andengine.input.touch.TouchEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Lorg/anddev/andengine/input/touch/TouchEvent;->getAction()I
/* packed-switch v0, :pswitch_data_0 */
} // :cond_0
} // :goto_0
/* :pswitch_0 */
v0 = (( org.anddev.andengine.input.touch.TouchEvent ) p2 ).getX ( ); // invoke-virtual {p2}, Lorg/anddev/andengine/input/touch/TouchEvent;->getX()F
v1 = (( org.anddev.andengine.input.touch.TouchEvent ) p2 ).getY ( ); // invoke-virtual {p2}, Lorg/anddev/andengine/input/touch/TouchEvent;->getY()F
/* invoke-direct {p0, v0, v1}, Lcom/tgb/bg/jevcyxq/c/z;->b(FF)Lcom/tgb/bg/jevcyxq/b/r; */
this.b = v0;
/* :pswitch_1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.b;
/* instance-of v0, v0, Lcom/tgb/bg/jevcyxq/b/b; */
/* if-nez v0, :cond_1 */
v0 = this.b;
/* instance-of v0, v0, Lcom/tgb/bg/jevcyxq/b/aj; */
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.b;
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
v0 = (( com.tgb.bg.jevcyxq.b.aj ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/aj;->a()Z
if ( v0 != null) { // if-eqz v0, :cond_2
} // :cond_1
v0 = this.b;
v1 = (( org.anddev.andengine.input.touch.TouchEvent ) p2 ).getX ( ); // invoke-virtual {p2}, Lorg/anddev/andengine/input/touch/TouchEvent;->getX()F
v2 = this.b;
v2 = (( com.tgb.bg.jevcyxq.b.r ) v2 ).getWidth ( ); // invoke-virtual {v2}, Lcom/tgb/bg/jevcyxq/b/r;->getWidth()F
/* div-float/2addr v2, v4 */
/* sub-float/2addr v1, v2 */
v2 = (( org.anddev.andengine.input.touch.TouchEvent ) p2 ).getY ( ); // invoke-virtual {p2}, Lorg/anddev/andengine/input/touch/TouchEvent;->getY()F
v3 = this.b;
v3 = (( com.tgb.bg.jevcyxq.b.r ) v3 ).getHeight ( ); // invoke-virtual {v3}, Lcom/tgb/bg/jevcyxq/b/r;->getHeight()F
/* div-float/2addr v3, v4 */
/* sub-float/2addr v2, v3 */
(( com.tgb.bg.jevcyxq.b.r ) v0 ).setPosition ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/tgb/bg/jevcyxq/b/r;->setPosition(FF)V
} // :cond_2
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.b;
/* instance-of v0, v0, Lcom/tgb/bg/jevcyxq/b/aj; */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.b;
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
v0 = (( com.tgb.bg.jevcyxq.b.aj ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/aj;->a()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.b;
v1 = (( org.anddev.andengine.input.touch.TouchEvent ) p2 ).getX ( ); // invoke-virtual {p2}, Lorg/anddev/andengine/input/touch/TouchEvent;->getX()F
v2 = this.b;
v2 = (( com.tgb.bg.jevcyxq.b.r ) v2 ).getWidth ( ); // invoke-virtual {v2}, Lcom/tgb/bg/jevcyxq/b/r;->getWidth()F
/* div-float/2addr v2, v4 */
/* sub-float/2addr v1, v2 */
v2 = (( org.anddev.andengine.input.touch.TouchEvent ) p2 ).getY ( ); // invoke-virtual {p2}, Lorg/anddev/andengine/input/touch/TouchEvent;->getY()F
v3 = this.b;
v3 = (( com.tgb.bg.jevcyxq.b.r ) v3 ).getHeight ( ); // invoke-virtual {v3}, Lcom/tgb/bg/jevcyxq/b/r;->getHeight()F
/* div-float/2addr v3, v4 */
/* sub-float/2addr v2, v3 */
(( com.tgb.bg.jevcyxq.b.r ) v0 ).setPosition ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/tgb/bg/jevcyxq/b/r;->setPosition(FF)V
v0 = this.b;
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
(( com.tgb.bg.jevcyxq.b.aj ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/aj;->b()Lorg/anddev/andengine/entity/primitive/Rectangle;
v1 = (( org.anddev.andengine.input.touch.TouchEvent ) p2 ).getX ( ); // invoke-virtual {p2}, Lorg/anddev/andengine/input/touch/TouchEvent;->getX()F
v2 = this.b;
v2 = (( com.tgb.bg.jevcyxq.b.r ) v2 ).getWidth ( ); // invoke-virtual {v2}, Lcom/tgb/bg/jevcyxq/b/r;->getWidth()F
/* div-float/2addr v2, v4 */
/* sub-float/2addr v1, v2 */
v2 = (( org.anddev.andengine.input.touch.TouchEvent ) p2 ).getY ( ); // invoke-virtual {p2}, Lorg/anddev/andengine/input/touch/TouchEvent;->getY()F
v3 = this.b;
v3 = (( com.tgb.bg.jevcyxq.b.r ) v3 ).getHeight ( ); // invoke-virtual {v3}, Lcom/tgb/bg/jevcyxq/b/r;->getHeight()F
/* div-float/2addr v3, v4 */
/* sub-float/2addr v2, v3 */
(( org.anddev.andengine.entity.primitive.Rectangle ) v0 ).setPosition ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/anddev/andengine/entity/primitive/Rectangle;->setPosition(FF)V
/* goto/16 :goto_0 */
/* :pswitch_2 */
v0 = (( org.anddev.andengine.input.touch.TouchEvent ) p2 ).getX ( ); // invoke-virtual {p2}, Lorg/anddev/andengine/input/touch/TouchEvent;->getX()F
v1 = (( org.anddev.andengine.input.touch.TouchEvent ) p2 ).getY ( ); // invoke-virtual {p2}, Lorg/anddev/andengine/input/touch/TouchEvent;->getY()F
/* invoke-direct {p0, v0, v1}, Lcom/tgb/bg/jevcyxq/c/z;->b(FF)Lcom/tgb/bg/jevcyxq/b/r; */
this.i = v0;
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.i;
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = this.b;
/* instance-of v0, v0, Lcom/tgb/bg/jevcyxq/b/b; */
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = this.i;
/* instance-of v0, v0, Lcom/tgb/bg/jevcyxq/b/b; */
/* if-nez v0, :cond_3 */
v0 = this.i;
/* instance-of v0, v0, Lcom/tgb/bg/jevcyxq/b/aj; */
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = this.i;
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
v0 = (( com.tgb.bg.jevcyxq.b.aj ) v0 ).h ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/aj;->h()Z
/* if-nez v0, :cond_3 */
v0 = this.b;
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/b; */
(( com.tgb.bg.jevcyxq.b.b ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/b;->a()V
v0 = (( org.anddev.andengine.input.touch.TouchEvent ) p2 ).getX ( ); // invoke-virtual {p2}, Lorg/anddev/andengine/input/touch/TouchEvent;->getX()F
v1 = (( org.anddev.andengine.input.touch.TouchEvent ) p2 ).getY ( ); // invoke-virtual {p2}, Lorg/anddev/andengine/input/touch/TouchEvent;->getY()F
/* invoke-direct {p0, v0, v1}, Lcom/tgb/bg/jevcyxq/c/z;->a(FF)Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile; */
if ( v0 != null) { // if-eqz v0, :cond_0
v1 = (( org.anddev.andengine.entity.layer.tiled.tmx.TMXTile ) v0 ).getTileRow ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;->getTileRow()I
v0 = (( org.anddev.andengine.entity.layer.tiled.tmx.TMXTile ) v0 ).getTileColumn ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;->getTileColumn()I
v2 = this.c;
/* new-instance v3, Lcom/tgb/bg/jevcyxq/c/c; */
/* invoke-direct {v3, p0, v1, v0}, Lcom/tgb/bg/jevcyxq/c/c;-><init>(Lcom/tgb/bg/jevcyxq/c/z;II)V */
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v2 ).runOnUpdateThread ( v3 ); // invoke-virtual {v2, v3}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->runOnUpdateThread(Ljava/lang/Runnable;)V
/* goto/16 :goto_0 */
} // :cond_3
v0 = (( org.anddev.andengine.input.touch.TouchEvent ) p2 ).getX ( ); // invoke-virtual {p2}, Lorg/anddev/andengine/input/touch/TouchEvent;->getX()F
v1 = (( org.anddev.andengine.input.touch.TouchEvent ) p2 ).getY ( ); // invoke-virtual {p2}, Lorg/anddev/andengine/input/touch/TouchEvent;->getY()F
/* invoke-direct {p0, v0, v1}, Lcom/tgb/bg/jevcyxq/c/z;->a(FF)Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile; */
if ( v0 != null) { // if-eqz v0, :cond_4
/* move v0, v8 */
} // :goto_1
if ( v0 != null) { // if-eqz v0, :cond_5
v0 = this.b;
/* instance-of v0, v0, Lcom/tgb/bg/jevcyxq/b/aj; */
if ( v0 != null) { // if-eqz v0, :cond_5
v0 = this.b;
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
v0 = (( com.tgb.bg.jevcyxq.b.aj ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/aj;->a()Z
if ( v0 != null) { // if-eqz v0, :cond_5
v0 = this.i;
/* if-nez v0, :cond_5 */
v0 = (( org.anddev.andengine.input.touch.TouchEvent ) p2 ).getX ( ); // invoke-virtual {p2}, Lorg/anddev/andengine/input/touch/TouchEvent;->getX()F
v1 = (( org.anddev.andengine.input.touch.TouchEvent ) p2 ).getY ( ); // invoke-virtual {p2}, Lorg/anddev/andengine/input/touch/TouchEvent;->getY()F
/* invoke-direct {p0, v0, v1}, Lcom/tgb/bg/jevcyxq/c/z;->a(FF)Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile; */
v2 = (( org.anddev.andengine.entity.layer.tiled.tmx.TMXTile ) v1 ).getTileRow ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;->getTileRow()I
v3 = (( org.anddev.andengine.entity.layer.tiled.tmx.TMXTile ) v1 ).getTileColumn ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;->getTileColumn()I
v0 = this.b;
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
(( com.tgb.bg.jevcyxq.b.aj ) v0 ).j ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/aj;->j()Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;
v4 = (( org.anddev.andengine.entity.layer.tiled.tmx.TMXTile ) v0 ).getTileRow ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;->getTileRow()I
v5 = (( org.anddev.andengine.entity.layer.tiled.tmx.TMXTile ) v0 ).getTileColumn ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;->getTileColumn()I
v0 = this.a;
/* aget-object v0, v0, v2 */
v6 = this.b;
/* aput-object v6, v0, v3 */
v0 = this.a;
/* aget-object v0, v0, v2 */
/* aget-object v0, v0, v3 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
(( com.tgb.bg.jevcyxq.b.aj ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/tgb/bg/jevcyxq/b/aj;->a(Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;)V
v0 = this.a;
/* aget-object v0, v0, v2 */
/* aget-object v1, v0, v3 */
v0 = this.a;
/* aget-object v0, v0, v2 */
/* aget-object v0, v0, v3 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
(( com.tgb.bg.jevcyxq.b.aj ) v0 ).j ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/aj;->j()Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;
v0 = (( org.anddev.andengine.entity.layer.tiled.tmx.TMXTile ) v0 ).getTileX ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;->getTileX()I
/* int-to-float v0, v0 */
v6 = this.c;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v6 ).m ( ); // invoke-virtual {v6}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->m()Lcom/tgb/bg/jevcyxq/c/aa;
(( com.tgb.bg.jevcyxq.c.aa ) v6 ).a ( ); // invoke-virtual {v6}, Lcom/tgb/bg/jevcyxq/c/aa;->a()Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;
v6 = (( org.anddev.andengine.entity.layer.tiled.tmx.TMXLayer ) v6 ).getX ( ); // invoke-virtual {v6}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->getX()F
/* add-float/2addr v6, v0 */
v0 = this.a;
/* aget-object v0, v0, v2 */
/* aget-object v0, v0, v3 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
(( com.tgb.bg.jevcyxq.b.aj ) v0 ).j ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/aj;->j()Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;
v0 = (( org.anddev.andengine.entity.layer.tiled.tmx.TMXTile ) v0 ).getTileY ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;->getTileY()I
/* int-to-float v0, v0 */
v7 = this.c;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v7 ).m ( ); // invoke-virtual {v7}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->m()Lcom/tgb/bg/jevcyxq/c/aa;
(( com.tgb.bg.jevcyxq.c.aa ) v7 ).a ( ); // invoke-virtual {v7}, Lcom/tgb/bg/jevcyxq/c/aa;->a()Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;
v7 = (( org.anddev.andengine.entity.layer.tiled.tmx.TMXLayer ) v7 ).getY ( ); // invoke-virtual {v7}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->getY()F
/* add-float/2addr v0, v7 */
(( com.tgb.bg.jevcyxq.b.r ) v1 ).setPosition ( v6, v0 ); // invoke-virtual {v1, v6, v0}, Lcom/tgb/bg/jevcyxq/b/r;->setPosition(FF)V
v0 = this.a;
/* aget-object v0, v0, v2 */
/* aget-object v0, v0, v3 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
(( com.tgb.bg.jevcyxq.b.aj ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/aj;->b()Lorg/anddev/andengine/entity/primitive/Rectangle;
v1 = this.a;
/* aget-object v1, v1, v2 */
/* aget-object v1, v1, v3 */
(( org.anddev.andengine.entity.primitive.Rectangle ) v0 ).setPosition ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/entity/primitive/Rectangle;->setPosition(Lorg/anddev/andengine/entity/IEntity;)V
v0 = this.a;
/* aget-object v0, v0, v4 */
/* aput-object v9, v0, v5 */
/* goto/16 :goto_0 */
} // :cond_4
int v0 = 0; // const/4 v0, 0x0
/* goto/16 :goto_1 */
} // :cond_5
v0 = this.b;
/* instance-of v0, v0, Lcom/tgb/bg/jevcyxq/b/aj; */
if ( v0 != null) { // if-eqz v0, :cond_7
v0 = this.b;
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
v0 = (( com.tgb.bg.jevcyxq.b.aj ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/aj;->a()Z
if ( v0 != null) { // if-eqz v0, :cond_7
v1 = this.b;
v0 = this.b;
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
(( com.tgb.bg.jevcyxq.b.aj ) v0 ).j ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/aj;->j()Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;
v0 = (( org.anddev.andengine.entity.layer.tiled.tmx.TMXTile ) v0 ).getTileX ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;->getTileX()I
/* int-to-float v0, v0 */
v2 = this.c;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v2 ).m ( ); // invoke-virtual {v2}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->m()Lcom/tgb/bg/jevcyxq/c/aa;
(( com.tgb.bg.jevcyxq.c.aa ) v2 ).a ( ); // invoke-virtual {v2}, Lcom/tgb/bg/jevcyxq/c/aa;->a()Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;
v2 = (( org.anddev.andengine.entity.layer.tiled.tmx.TMXLayer ) v2 ).getX ( ); // invoke-virtual {v2}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->getX()F
/* add-float/2addr v2, v0 */
v0 = this.b;
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
(( com.tgb.bg.jevcyxq.b.aj ) v0 ).j ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/aj;->j()Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;
v0 = (( org.anddev.andengine.entity.layer.tiled.tmx.TMXTile ) v0 ).getTileY ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;->getTileY()I
/* int-to-float v0, v0 */
v3 = this.c;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v3 ).m ( ); // invoke-virtual {v3}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->m()Lcom/tgb/bg/jevcyxq/c/aa;
(( com.tgb.bg.jevcyxq.c.aa ) v3 ).a ( ); // invoke-virtual {v3}, Lcom/tgb/bg/jevcyxq/c/aa;->a()Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;
v3 = (( org.anddev.andengine.entity.layer.tiled.tmx.TMXLayer ) v3 ).getY ( ); // invoke-virtual {v3}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->getY()F
/* add-float/2addr v0, v3 */
(( com.tgb.bg.jevcyxq.b.r ) v1 ).setPosition ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Lcom/tgb/bg/jevcyxq/b/r;->setPosition(FF)V
v0 = this.b;
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
(( com.tgb.bg.jevcyxq.b.aj ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/aj;->b()Lorg/anddev/andengine/entity/primitive/Rectangle;
v1 = this.b;
(( org.anddev.andengine.entity.primitive.Rectangle ) v0 ).setPosition ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/entity/primitive/Rectangle;->setPosition(Lorg/anddev/andengine/entity/IEntity;)V
} // :cond_6
} // :goto_2
this.b = v9;
/* goto/16 :goto_0 */
} // :cond_7
v0 = this.b;
/* instance-of v0, v0, Lcom/tgb/bg/jevcyxq/b/b; */
if ( v0 != null) { // if-eqz v0, :cond_6
v0 = this.b;
(( com.tgb.bg.jevcyxq.b.r ) v0 ).setInitialPosition ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/r;->setInitialPosition()V
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_2 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        :goto_8
v0 = this.k;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* if-lt v3, v0, :cond_a */
/* add-int/lit8 v0, v2, 0x1 */
/* move v2, v0 */
} // :cond_a
/* move v4, v7 */
} // :goto_9
v0 = this.k;
(( java.util.ArrayList ) v0 ).get ( v3 ); // invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/am; */
(( com.tgb.bg.jevcyxq.b.am ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
/* array-length v0, v0 */
/* if-lt v4, v0, :cond_b */
} // :goto_a
/* add-int/lit8 v0, v3, 0x1 */
/* move v3, v0 */
} // :cond_b
v0 = this.k;
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/am; */
(( com.tgb.bg.jevcyxq.b.am ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
/* aget-object v5, v0, v2 */
v0 = this.k;
(( java.util.ArrayList ) v0 ).get ( v3 ); // invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/am; */
(( com.tgb.bg.jevcyxq.b.am ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
/* aget-object v0, v0, v4 */
v0 = (( com.tgb.bg.jevcyxq.b.q ) v5 ).collidesWith ( v0 ); // invoke-virtual {v5, v0}, Lcom/tgb/bg/jevcyxq/b/q;->collidesWith(Lorg/anddev/andengine/entity/shape/IShape;)Z
if ( v0 != null) { // if-eqz v0, :cond_c
v0 = this.k;
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/am; */
(( com.tgb.bg.jevcyxq.b.am ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
/* aget-object v5, v0, v2 */
v0 = this.k;
(( java.util.ArrayList ) v0 ).get ( v3 ); // invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/am; */
(( com.tgb.bg.jevcyxq.b.am ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
/* aget-object v0, v0, v4 */
v0 = com.tgb.bg.jevcyxq.d.a .a ( v5,v0 );
if ( v0 != null) { // if-eqz v0, :cond_c
/* invoke-direct {p0}, Lcom/tgb/bg/jevcyxq/c/g;->n()V */
v0 = this.c;
(( org.anddev.andengine.entity.particle.ParticleSystem ) v0 ).setParticlesSpawnEnabled ( v9 ); // invoke-virtual {v0, v9}, Lorg/anddev/andengine/entity/particle/ParticleSystem;->setParticlesSpawnEnabled(Z)V
v0 = this.d;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v0 ).i ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->i()Lcom/tgb/bg/jevcyxq/c/z;
(( com.tgb.bg.jevcyxq.c.z ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/c/z;->a()V
v4 = this.n;
v0 = this.k;
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/am; */
(( com.tgb.bg.jevcyxq.b.am ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
/* aget-object v0, v0, v2 */
v5 = (( com.tgb.bg.jevcyxq.b.q ) v0 ).getX ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/q;->getX()F
v0 = this.k;
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/am; */
(( com.tgb.bg.jevcyxq.b.am ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
/* aget-object v0, v0, v2 */
v0 = (( com.tgb.bg.jevcyxq.b.q ) v0 ).getWidth ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/q;->getWidth()F
/* div-float/2addr v0, v8 */
/* add-float/2addr v5, v0 */
v0 = this.k;
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/am; */
(( com.tgb.bg.jevcyxq.b.am ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
/* aget-object v0, v0, v2 */
v6 = (( com.tgb.bg.jevcyxq.b.q ) v0 ).getY ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/q;->getY()F
v0 = this.k;
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/am; */
(( com.tgb.bg.jevcyxq.b.am ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
/* aget-object v0, v0, v2 */
v0 = (( com.tgb.bg.jevcyxq.b.q ) v0 ).getHeight ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/q;->getHeight()F
/* div-float/2addr v0, v8 */
/* add-float/2addr v0, v6 */
(( org.anddev.andengine.entity.particle.emitter.CircleParticleEmitter ) v4 ).setCenter ( v5, v0 ); // invoke-virtual {v4, v5, v0}, Lorg/anddev/andengine/entity/particle/emitter/CircleParticleEmitter;->setCenter(FF)V
v0 = this.d;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v0 ).i ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->i()Lcom/tgb/bg/jevcyxq/c/z;
(( com.tgb.bg.jevcyxq.c.z ) v0 ).a ( v7, v10 ); // invoke-virtual {v0, v7, v10}, Lcom/tgb/bg/jevcyxq/c/z;->a(ZLcom/tgb/bg/jevcyxq/b/am;)V
/* goto/16 :goto_a */
} // :cond_c
/* add-int/lit8 v0, v4, 0x1 */
/* move v4, v0 */
/* goto/16 :goto_9 */
} // :cond_d
/* move v3, v7 */
} // :goto_b
v0 = this.l;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* if-lt v3, v0, :cond_e */
/* add-int/lit8 v0, v2, 0x1 */
/* move v2, v0 */
/* goto/16 :goto_3 */
} // :cond_e
/* move v4, v7 */
} // :goto_c
v0 = this.l;
(( java.util.ArrayList ) v0 ).get ( v3 ); // invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/am; */
(( com.tgb.bg.jevcyxq.b.am ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
/* array-length v0, v0 */
/* if-lt v4, v0, :cond_f */
} // :goto_d
/* add-int/lit8 v0, v3, 0x1 */
/* move v3, v0 */
} // :cond_f
v0 = this.k;
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/am; */
(( com.tgb.bg.jevcyxq.b.am ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
/* aget-object v5, v0, v2 */
v0 = this.l;
(( java.util.ArrayList ) v0 ).get ( v3 ); // invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/am; */
(( com.tgb.bg.jevcyxq.b.am ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
/* aget-object v0, v0, v4 */
v0 = (( com.tgb.bg.jevcyxq.b.q ) v5 ).collidesWith ( v0 ); // invoke-virtual {v5, v0}, Lcom/tgb/bg/jevcyxq/b/q;->collidesWith(Lorg/anddev/andengine/entity/shape/IShape;)Z
if ( v0 != null) { // if-eqz v0, :cond_10
v0 = this.k;
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/am; */
(( com.tgb.bg.jevcyxq.b.am ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
/* aget-object v5, v0, v2 */
v0 = this.l;
(( java.util.ArrayList ) v0 ).get ( v3 ); // invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/am; */
(( com.tgb.bg.jevcyxq.b.am ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
/* aget-object v0, v0, v4 */
v0 = com.tgb.bg.jevcyxq.d.a .a ( v5,v0 );
if ( v0 != null) { // if-eqz v0, :cond_10
/* invoke-direct {p0}, Lcom/tgb/bg/jevcyxq/c/g;->n()V */
v0 = this.c;
(( org.anddev.andengine.entity.particle.ParticleSystem ) v0 ).setParticlesSpawnEnabled ( v9 ); // invoke-virtual {v0, v9}, Lorg/anddev/andengine/entity/particle/ParticleSystem;->setParticlesSpawnEnabled(Z)V
v0 = this.d;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v0 ).i ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->i()Lcom/tgb/bg/jevcyxq/c/z;
(( com.tgb.bg.jevcyxq.c.z ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/c/z;->a()V
v4 = this.n;
v0 = this.k;
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/am; */
(( com.tgb.bg.jevcyxq.b.am ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
/* aget-object v0, v0, v2 */
v5 = (( com.tgb.bg.jevcyxq.b.q ) v0 ).getX ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/q;->getX()F
v0 = this.k;
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/am; */
(( com.tgb.bg.jevcyxq.b.am ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
/* aget-object v0, v0, v2 */
v0 = (( com.tgb.bg.jevcyxq.b.q ) v0 ).getWidth ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/q;->getWidth()F
/* div-float/2addr v0, v8 */
/* add-float/2addr v5, v0 */
v0 = this.k;
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/am; */
(( com.tgb.bg.jevcyxq.b.am ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
/* aget-object v0, v0, v2 */
v6 = (( com.tgb.bg.jevcyxq.b.q ) v0 ).getY ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/q;->getY()F
v0 = this.k;
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/am; */
(( com.tgb.bg.jevcyxq.b.am ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
/* aget-object v0, v0, v2 */
v0 = (( com.tgb.bg.jevcyxq.b.q ) v0 ).getHeight ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/q;->getHeight()F
/* div-float/2addr v0, v8 */
/* add-float/2addr v0, v6 */
(( org.anddev.andengine.entity.particle.emitter.CircleParticleEmitter ) v4 ).setCenter ( v5, v0 ); // invoke-virtual {v4, v5, v0}, Lorg/anddev/andengine/entity/particle/emitter/CircleParticleEmitter;->setCenter(FF)V
v0 = this.d;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v0 ).i ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->i()Lcom/tgb/bg/jevcyxq/c/z;
v0 = this.l;
(( java.util.ArrayList ) v0 ).get ( v3 ); // invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/am; */
(( com.tgb.bg.jevcyxq.c.z ) v4 ).a ( v7, v0 ); // invoke-virtual {v4, v7, v0}, Lcom/tgb/bg/jevcyxq/c/z;->a(ZLcom/tgb/bg/jevcyxq/b/am;)V
v0 = this.d;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v0 ).i ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->i()Lcom/tgb/bg/jevcyxq/c/z;
v0 = this.l;
(( java.util.ArrayList ) v0 ).get ( v3 ); // invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/am; */
(( com.tgb.bg.jevcyxq.c.z ) v4 ).a ( v0 ); // invoke-virtual {v4, v0}, Lcom/tgb/bg/jevcyxq/c/z;->a(Lcom/tgb/bg/jevcyxq/b/am;)V
/* goto/16 :goto_d */
} // :cond_10
/* add-int/lit8 v0, v4, 0x1 */
/* move v4, v0 */
/* goto/16 :goto_c */
} // .end method
public final void i ( ) {
/* .locals 4 */
int v3 = 1; // const/4 v3, 0x1
/* const/16 v2, 0x8 */
v0 = this.d;
v0 = (( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->c()I
v1 = this.d;
v1 = (( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->a()I
/* packed-switch v1, :pswitch_data_0 */
} // :cond_0
} // :goto_0
return;
/* :pswitch_0 */
/* if-eq v0, v3, :cond_1 */
int v1 = 2; // const/4 v1, 0x2
/* if-eq v0, v1, :cond_1 */
int v1 = 3; // const/4 v1, 0x3
/* if-ne v0, v1, :cond_0 */
} // :cond_1
v0 = this.d;
v0 = this.c;
(( android.widget.Button ) v0 ).setVisibility ( v2 ); // invoke-virtual {v0, v2}, Landroid/widget/Button;->setVisibility(I)V
/* :pswitch_1 */
/* if-eq v0, v3, :cond_2 */
/* const/16 v1, 0x10 */
/* if-ne v0, v1, :cond_0 */
} // :cond_2
v0 = this.d;
v0 = this.c;
(( android.widget.Button ) v0 ).setVisibility ( v2 ); // invoke-virtual {v0, v2}, Landroid/widget/Button;->setVisibility(I)V
/* :pswitch_2 */
/* const/16 v1, 0x64 */
/* if-eq v0, v1, :cond_3 */
/* const/16 v1, 0xc8 */
/* if-eq v0, v1, :cond_3 */
/* const/16 v1, 0x12c */
/* if-ne v0, v1, :cond_0 */
} // :cond_3
v0 = this.d;
v0 = this.c;
(( android.widget.Button ) v0 ).setVisibility ( v2 ); // invoke-virtual {v0, v2}, Landroid/widget/Button;->setVisibility(I)V
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
} // .end packed-switch
} // .end method
public final void j ( ) {
/* .locals 5 */
int v4 = 6; // const/4 v4, 0x6
int v3 = 0; // const/4 v3, 0x0
/* move v0, v3 */
} // :goto_0
v1 = this.d;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).j ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->j()Lcom/tgb/bg/jevcyxq/c/g;
v1 = this.l;
v1 = (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
/* if-lt v0, v1, :cond_0 */
/* move v0, v3 */
} // :goto_1
v1 = this.d;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).j ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->j()Lcom/tgb/bg/jevcyxq/c/g;
v1 = this.k;
v1 = (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
/* if-lt v0, v1, :cond_1 */
/* move v1, v3 */
} // :goto_2
v0 = this.p;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* if-lt v1, v0, :cond_2 */
/* move v1, v3 */
} // :goto_3
v0 = this.o;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* if-lt v1, v0, :cond_3 */
return;
} // :cond_0
v1 = this.p;
/* invoke-direct {p0}, Lcom/tgb/bg/jevcyxq/c/g;->p()Lorg/anddev/andengine/entity/particle/ParticleSystem; */
(( java.util.ArrayList ) v1 ).add ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
v1 = this.o;
/* invoke-direct {p0}, Lcom/tgb/bg/jevcyxq/c/g;->p()Lorg/anddev/andengine/entity/particle/ParticleSystem; */
(( java.util.ArrayList ) v1 ).add ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_2
v0 = this.d;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v0 ).e ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->e()Lorg/anddev/andengine/entity/scene/Scene;
(( org.anddev.andengine.entity.scene.Scene ) v0 ).getChild ( v4 ); // invoke-virtual {v0, v4}, Lorg/anddev/andengine/entity/scene/Scene;->getChild(I)Lorg/anddev/andengine/entity/IEntity;
v0 = this.p;
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lorg/anddev/andengine/entity/IEntity; */
/* add-int/lit8 v0, v1, 0x1 */
/* move v1, v0 */
} // :cond_3
v0 = this.d;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v0 ).e ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->e()Lorg/anddev/andengine/entity/scene/Scene;
(( org.anddev.andengine.entity.scene.Scene ) v0 ).getChild ( v4 ); // invoke-virtual {v0, v4}, Lorg/anddev/andengine/entity/scene/Scene;->getChild(I)Lorg/anddev/andengine/entity/IEntity;
v0 = this.o;
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lorg/anddev/andengine/entity/IEntity; */
/* add-int/lit8 v0, v1, 0x1 */
/* move v1, v0 */
} // .end method
public final void k ( ) {
/* .locals 3 */
int v2 = 0; // const/4 v2, 0x0
v0 = this.h;
int v1 = 1; // const/4 v1, 0x1
(( com.tgb.bg.jevcyxq.refurbished.k ) v0 ).setVisible ( v1 ); // invoke-virtual {v0, v1}, Lcom/tgb/bg/jevcyxq/refurbished/k;->setVisible(Z)V
v0 = this.g;
(( com.tgb.bg.jevcyxq.refurbished.k ) v0 ).setVisible ( v2 ); // invoke-virtual {v0, v2}, Lcom/tgb/bg/jevcyxq/refurbished/k;->setVisible(Z)V
/* invoke-direct {p0}, Lcom/tgb/bg/jevcyxq/c/g;->q()V */
/* iput-boolean v2, p0, Lcom/tgb/bg/jevcyxq/c/g;->q:Z */
(( com.tgb.bg.jevcyxq.c.g ) p0 ).j ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/c/g;->j()V
/* invoke-direct {p0}, Lcom/tgb/bg/jevcyxq/c/g;->o()V */
return;
} // .end method
public final void l ( ) {
/* .locals 3 */
/* new-instance v0, Landroid/app/AlertDialog$Builder; */
v1 = this.d;
/* invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
final String v1 = "Show Solution!"; // const-string v1, "Show Solution!"
(( android.app.AlertDialog$Builder ) v0 ).setTitle ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "Are you sure you want to show solution By "; // const-string v2, "Are you sure you want to show solution By "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v2 = this.d;
v2 = (( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v2 ).a ( ); // invoke-virtual {v2}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->a()I
v2 = com.tgb.bg.jevcyxq.a.a .a ( v2 );
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = " Train Points"; // const-string v2, " Train Points"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " ?"; // const-string v2, " ?"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( android.app.AlertDialog$Builder ) v0 ).setMessage ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
final String v1 = "Yes"; // const-string v1, "Yes"
/* new-instance v2, Lcom/tgb/bg/jevcyxq/c/n; */
/* invoke-direct {v2, p0}, Lcom/tgb/bg/jevcyxq/c/n;-><init>(Lcom/tgb/bg/jevcyxq/c/g;)V */
(( android.app.AlertDialog$Builder ) v0 ).setPositiveButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
final String v1 = "No"; // const-string v1, "No"
int v2 = 0; // const/4 v2, 0x0
(( android.app.AlertDialog$Builder ) v0 ).setNegativeButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
(( android.app.AlertDialog$Builder ) v0 ).create ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
(( android.app.AlertDialog ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V
return;
} // .end method
public final void m ( ) {
/* .locals 3 */
/* new-instance v0, Landroid/app/AlertDialog$Builder; */
v1 = this.d;
/* invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
final String v1 = "Not Enough Train Points!"; // const-string v1, "Not Enough Train Points!"
(( android.app.AlertDialog$Builder ) v0 ).setTitle ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
final String v1 = "Do you want to get more Train Points ?"; // const-string v1, "Do you want to get more Train Points ?"
(( android.app.AlertDialog$Builder ) v0 ).setMessage ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
final String v1 = "Yes"; // const-string v1, "Yes"
/* new-instance v2, Lcom/tgb/bg/jevcyxq/c/o; */
/* invoke-direct {v2, p0}, Lcom/tgb/bg/jevcyxq/c/o;-><init>(Lcom/tgb/bg/jevcyxq/c/g;)V */
(( android.app.AlertDialog$Builder ) v0 ).setPositiveButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
final String v1 = "No"; // const-string v1, "No"
int v2 = 0; // const/4 v2, 0x0
(( android.app.AlertDialog$Builder ) v0 ).setNegativeButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
(( android.app.AlertDialog$Builder ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
return;
} // .end method
