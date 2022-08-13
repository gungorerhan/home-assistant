--
-- Name: devices; Type: TABLE; Schema: public; Owner: root
--

CREATE TABLE public.devices (
    id bigint NOT NULL,
    name character varying(255) NOT NULL,
    type character varying(255) NOT NULL,
    description character varying(255)
);


ALTER TABLE public.devices OWNER TO root;

--
-- Name: devices_id_seq; Type: SEQUENCE; Schema: public; Owner: root
--

ALTER TABLE public.devices ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.devices_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);