PGDMP     ,    ,                y            movies    13.1    13.1     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    16394    movies    DATABASE     j   CREATE DATABASE movies WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'English_United States.1252';
    DROP DATABASE movies;
                postgres    false            �            1259    16400 	   bollywood    TABLE     j   CREATE TABLE public.bollywood (
    "s.no" bigint NOT NULL,
    year integer NOT NULL,
    name text[]
);
    DROP TABLE public.bollywood;
       public         heap    postgres    false            �            1259    16398    bollywood_s.no_seq    SEQUENCE     }   CREATE SEQUENCE public."bollywood_s.no_seq"
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 +   DROP SEQUENCE public."bollywood_s.no_seq";
       public          postgres    false    201            �           0    0    bollywood_s.no_seq    SEQUENCE OWNED BY     M   ALTER SEQUENCE public."bollywood_s.no_seq" OWNED BY public.bollywood."s.no";
          public          postgres    false    200            �            1259    16411 	   hollywood    TABLE     n   CREATE TABLE public.hollywood (
    id integer NOT NULL,
    name text NOT NULL,
    year integer NOT NULL
);
    DROP TABLE public.hollywood;
       public         heap    postgres    false            �            1259    16409    hollywood_id_seq    SEQUENCE     �   CREATE SEQUENCE public.hollywood_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 '   DROP SEQUENCE public.hollywood_id_seq;
       public          postgres    false    203            �           0    0    hollywood_id_seq    SEQUENCE OWNED BY     E   ALTER SEQUENCE public.hollywood_id_seq OWNED BY public.hollywood.id;
          public          postgres    false    202            *           2604    16403    bollywood s.no    DEFAULT     t   ALTER TABLE ONLY public.bollywood ALTER COLUMN "s.no" SET DEFAULT nextval('public."bollywood_s.no_seq"'::regclass);
 ?   ALTER TABLE public.bollywood ALTER COLUMN "s.no" DROP DEFAULT;
       public          postgres    false    200    201    201            +           2604    16414    hollywood id    DEFAULT     l   ALTER TABLE ONLY public.hollywood ALTER COLUMN id SET DEFAULT nextval('public.hollywood_id_seq'::regclass);
 ;   ALTER TABLE public.hollywood ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    203    202    203            �          0    16400 	   bollywood 
   TABLE DATA           7   COPY public.bollywood ("s.no", year, name) FROM stdin;
    public          postgres    false    201   �       �          0    16411 	   hollywood 
   TABLE DATA           3   COPY public.hollywood (id, name, year) FROM stdin;
    public          postgres    false    203   �       �           0    0    bollywood_s.no_seq    SEQUENCE SET     C   SELECT pg_catalog.setval('public."bollywood_s.no_seq"', 1, false);
          public          postgres    false    200            �           0    0    hollywood_id_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('public.hollywood_id_seq', 9, true);
          public          postgres    false    202            -           2606    16405    bollywood bollywood_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.bollywood
    ADD CONSTRAINT bollywood_pkey PRIMARY KEY ("s.no");
 B   ALTER TABLE ONLY public.bollywood DROP CONSTRAINT bollywood_pkey;
       public            postgres    false    201            /           2606    16419    hollywood hollywood_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.hollywood
    ADD CONSTRAINT hollywood_pkey PRIMARY KEY (id);
 B   ALTER TABLE ONLY public.hollywood DROP CONSTRAINT hollywood_pkey;
       public            postgres    false    203            �      x�3�420�����2������j�b���� O��      �   n   x�3�t�O����IT(+V���K���K�4202�2���/*I�Q���MJ,��p�d�*�&�eV(�@�L�b�E��)�@Cc.3�Hx~NYjQf^*D���6AKl�1z\\\ ��1k     