public class com.a.d.d {
	 /* # static fields */
	 private static java.util.HashMap b;
	 /* # instance fields */
	 public Boolean a;
	 private android.media.SoundPool c;
	 private android.content.Context d;
	 /* # direct methods */
	 public com.a.d.d ( ) {
		 /* .locals 20 */
		 /* invoke-direct/range {p0 ..p0}, Ljava/lang/Object;-><init>()V */
		 int v2 = 1; // const/4 v2, 0x1
		 /* move-object/from16 v0, p0 */
		 /* iput-boolean v2, v0, Lcom/a/d/d;->a:Z */
		 int v2 = 1; // const/4 v2, 0x1
		 /* move-object/from16 v0, p0 */
		 /* iput-boolean v2, v0, Lcom/a/d/d;->a:Z */
		 /* new-instance v2, Landroid/media/SoundPool; */
		 int v3 = 4; // const/4 v3, 0x4
		 int v4 = 3; // const/4 v4, 0x3
		 /* const/16 v5, 0x64 */
		 /* invoke-direct {v2, v3, v4, v5}, Landroid/media/SoundPool;-><init>(III)V */
		 /* move-object/from16 v0, p0 */
		 this.c = v2;
		 /* new-instance v2, Ljava/util/HashMap; */
		 /* invoke-direct {v2}, Ljava/util/HashMap;-><init>()V */
		 /* move-object/from16 v0, p1 */
		 /* move-object/from16 v1, p0 */
		 this.d = v0;
		 /* move-object/from16 v0, p0 */
		 v2 = this.c;
		 /* move-object/from16 v0, p0 */
		 v3 = this.d;
		 /* const v4, 0x7f040005 */
		 int v5 = 0; // const/4 v5, 0x0
		 v2 = 		 (( android.media.SoundPool ) v2 ).load ( v3, v4, v5 ); // invoke-virtual {v2, v3, v4, v5}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I
		 /* move-object/from16 v0, p0 */
		 v3 = this.c;
		 /* move-object/from16 v0, p0 */
		 v4 = this.d;
		 /* const v5, 0x7f040011 */
		 int v6 = 0; // const/4 v6, 0x0
		 v3 = 		 (( android.media.SoundPool ) v3 ).load ( v4, v5, v6 ); // invoke-virtual {v3, v4, v5, v6}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I
		 /* move-object/from16 v0, p0 */
		 v4 = this.c;
		 /* move-object/from16 v0, p0 */
		 v5 = this.d;
		 /* const v6, 0x7f040002 */
		 int v7 = 0; // const/4 v7, 0x0
		 v4 = 		 (( android.media.SoundPool ) v4 ).load ( v5, v6, v7 ); // invoke-virtual {v4, v5, v6, v7}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I
		 /* move-object/from16 v0, p0 */
		 v5 = this.c;
		 /* move-object/from16 v0, p0 */
		 v6 = this.d;
		 /* const v7, 0x7f040008 */
		 int v8 = 0; // const/4 v8, 0x0
		 v5 = 		 (( android.media.SoundPool ) v5 ).load ( v6, v7, v8 ); // invoke-virtual {v5, v6, v7, v8}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I
		 /* move-object/from16 v0, p0 */
		 v6 = this.c;
		 /* move-object/from16 v0, p0 */
		 v7 = this.d;
		 /* const v8, 0x7f04000a */
		 int v9 = 0; // const/4 v9, 0x0
		 v6 = 		 (( android.media.SoundPool ) v6 ).load ( v7, v8, v9 ); // invoke-virtual {v6, v7, v8, v9}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I
		 /* move-object/from16 v0, p0 */
		 v7 = this.c;
		 /* move-object/from16 v0, p0 */
		 v8 = this.d;
		 /* const v9, 0x7f040004 */
		 int v10 = 0; // const/4 v10, 0x0
		 v7 = 		 (( android.media.SoundPool ) v7 ).load ( v8, v9, v10 ); // invoke-virtual {v7, v8, v9, v10}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I
		 /* move-object/from16 v0, p0 */
		 v8 = this.c;
		 /* move-object/from16 v0, p0 */
		 v9 = this.d;
		 /* const/high16 v10, 0x7f040000 */
		 int v11 = 0; // const/4 v11, 0x0
		 v8 = 		 (( android.media.SoundPool ) v8 ).load ( v9, v10, v11 ); // invoke-virtual {v8, v9, v10, v11}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I
		 /* move-object/from16 v0, p0 */
		 v9 = this.c;
		 /* move-object/from16 v0, p0 */
		 v10 = this.d;
		 /* const v11, 0x7f040012 */
		 int v12 = 0; // const/4 v12, 0x0
		 v9 = 		 (( android.media.SoundPool ) v9 ).load ( v10, v11, v12 ); // invoke-virtual {v9, v10, v11, v12}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I
		 /* move-object/from16 v0, p0 */
		 v10 = this.c;
		 /* move-object/from16 v0, p0 */
		 v11 = this.d;
		 /* const v12, 0x7f040001 */
		 int v13 = 0; // const/4 v13, 0x0
		 v10 = 		 (( android.media.SoundPool ) v10 ).load ( v11, v12, v13 ); // invoke-virtual {v10, v11, v12, v13}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I
		 /* move-object/from16 v0, p0 */
		 v11 = this.c;
		 /* move-object/from16 v0, p0 */
		 v12 = this.d;
		 /* const v13, 0x7f04000e */
		 int v14 = 0; // const/4 v14, 0x0
		 v11 = 		 (( android.media.SoundPool ) v11 ).load ( v12, v13, v14 ); // invoke-virtual {v11, v12, v13, v14}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I
		 /* move-object/from16 v0, p0 */
		 v12 = this.c;
		 /* move-object/from16 v0, p0 */
		 v13 = this.d;
		 /* const v14, 0x7f04000f */
		 int v15 = 0; // const/4 v15, 0x0
		 v12 = 		 (( android.media.SoundPool ) v12 ).load ( v13, v14, v15 ); // invoke-virtual {v12, v13, v14, v15}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I
		 /* move-object/from16 v0, p0 */
		 v13 = this.c;
		 /* move-object/from16 v0, p0 */
		 v14 = this.d;
		 /* const v15, 0x7f04000b */
		 /* const/16 v16, 0x0 */
		 v13 = 		 /* invoke-virtual/range {v13 ..v16}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I */
		 /* move-object/from16 v0, p0 */
		 v14 = this.c;
		 /* move-object/from16 v0, p0 */
		 v15 = this.d;
		 /* const v16, 0x7f040009 */
		 /* const/16 v17, 0x0 */
		 v14 = 		 /* invoke-virtual/range {v14 ..v17}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I */
		 /* move-object/from16 v0, p0 */
		 v15 = this.c;
		 /* move-object/from16 v0, p0 */
		 v0 = this.d;
		 /* move-object/from16 v16, v0 */
		 /* const v17, 0x7f040003 */
		 /* const/16 v18, 0x0 */
		 v15 = 		 /* invoke-virtual/range {v15 ..v18}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I */
		 /* move-object/from16 v0, p0 */
		 v0 = this.c;
		 /* move-object/from16 v16, v0 */
		 /* move-object/from16 v0, p0 */
		 v0 = this.d;
		 /* move-object/from16 v17, v0 */
		 /* const v18, 0x7f040006 */
		 /* const/16 v19, 0x0 */
		 v16 = 		 /* invoke-virtual/range {v16 ..v19}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I */
		 v17 = com.a.d.d.b;
		 final String v18 = "click"; // const-string v18, "click"
		 java.lang.Integer .valueOf ( v2 );
		 /* move-object/from16 v0, v17 */
		 /* move-object/from16 v1, v18 */
		 (( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
		 v2 = com.a.d.d.b;
		 final String v17 = "skills_1"; // const-string v17, "skills_1"
		 java.lang.Integer .valueOf ( v3 );
		 /* move-object/from16 v0, v17 */
		 (( java.util.HashMap ) v2 ).put ( v0, v3 ); // invoke-virtual {v2, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
		 v2 = com.a.d.d.b;
		 final String v3 = "buy"; // const-string v3, "buy"
		 java.lang.Integer .valueOf ( v4 );
		 (( java.util.HashMap ) v2 ).put ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
		 v2 = com.a.d.d.b;
		 final String v3 = "gold"; // const-string v3, "gold"
		 java.lang.Integer .valueOf ( v5 );
		 (( java.util.HashMap ) v2 ).put ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
		 v2 = com.a.d.d.b;
		 final String v3 = "hit"; // const-string v3, "hit"
		 java.lang.Integer .valueOf ( v6 );
		 (( java.util.HashMap ) v2 ).put ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
		 v2 = com.a.d.d.b;
		 final String v3 = "change"; // const-string v3, "change"
		 java.lang.Integer .valueOf ( v7 );
		 (( java.util.HashMap ) v2 ).put ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
		 v2 = com.a.d.d.b;
		 final String v3 = "anger"; // const-string v3, "anger"
		 java.lang.Integer .valueOf ( v8 );
		 (( java.util.HashMap ) v2 ).put ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
		 v2 = com.a.d.d.b;
		 final String v3 = "victory"; // const-string v3, "victory"
		 java.lang.Integer .valueOf ( v9 );
		 (( java.util.HashMap ) v2 ).put ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
		 v2 = com.a.d.d.b;
		 final String v3 = "blessing"; // const-string v3, "blessing"
		 java.lang.Integer .valueOf ( v10 );
		 (( java.util.HashMap ) v2 ).put ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
		 v2 = com.a.d.d.b;
		 final String v3 = "pistol"; // const-string v3, "pistol"
		 java.lang.Integer .valueOf ( v11 );
		 (( java.util.HashMap ) v2 ).put ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
		 v2 = com.a.d.d.b;
		 final String v3 = "rifle"; // const-string v3, "rifle"
		 java.lang.Integer .valueOf ( v12 );
		 (( java.util.HashMap ) v2 ).put ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
		 v2 = com.a.d.d.b;
		 final String v3 = "lightgun"; // const-string v3, "lightgun"
		 java.lang.Integer .valueOf ( v13 );
		 (( java.util.HashMap ) v2 ).put ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
		 v2 = com.a.d.d.b;
		 final String v3 = "heavygun"; // const-string v3, "heavygun"
		 java.lang.Integer .valueOf ( v14 );
		 (( java.util.HashMap ) v2 ).put ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
		 v2 = com.a.d.d.b;
		 final String v3 = "cannon"; // const-string v3, "cannon"
		 java.lang.Integer .valueOf ( v15 );
		 (( java.util.HashMap ) v2 ).put ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
		 v2 = com.a.d.d.b;
		 final String v3 = "failure"; // const-string v3, "failure"
		 /* invoke-static/range {v16 ..v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer; */
		 (( java.util.HashMap ) v2 ).put ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 1 */
		 v0 = this.c;
		 (( android.media.SoundPool ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/media/SoundPool;->release()V
		 return;
	 } // .end method
	 public void a ( java.lang.String p0 ) {
		 /* .locals 7 */
		 int v4 = 0; // const/4 v4, 0x0
		 /* iget-boolean v0, p0, Lcom/a/d/d;->a:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.d;
			 final String v1 = "audio"; // const-string v1, "audio"
			 (( android.content.Context ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
			 /* check-cast v0, Landroid/media/AudioManager; */
			 int v1 = 3; // const/4 v1, 0x3
			 v3 = 			 (( android.media.AudioManager ) v0 ).getStreamVolume ( v1 ); // invoke-virtual {v0, v1}, Landroid/media/AudioManager;->getStreamVolume(I)I
			 v0 = com.a.d.d.b;
			 (( java.util.HashMap ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
			 /* check-cast v0, Ljava/lang/Integer; */
			 v1 = 			 (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
			 v0 = this.c;
			 /* int-to-float v2, v3 */
			 /* int-to-float v3, v3 */
			 /* const/high16 v6, 0x3f800000 # 1.0f */
			 /* move v5, v4 */
			 /* invoke-virtual/range {v0 ..v6}, Landroid/media/SoundPool;->play(IFFIIF)I */
		 } // :cond_0
		 return;
	 } // .end method
