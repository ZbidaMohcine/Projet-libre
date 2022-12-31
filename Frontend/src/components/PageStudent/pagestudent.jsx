import React from 'react'
import "./pagestudent.css"
import { students } from "./dummydata"
import styled from '@emotion/styled'


const Heading = styled.div`
    margin-left: 280px;
    padding: 20px 0;
`

const pagestudent = () => {
    return (
        <div className='portail'>

            <div className='portailcontent'>

                <Heading >
                    <h1>Espace Student </h1>
                </Heading>

                <section className='online'>

                    {students.map((val) => (
                        <div className='box'>
                            <div className='img'>
                                <img src={val.cover} />
                                {/* <img src={val.hoverCover} alt='' className='show' /> */}
                            </div>
                            <h1>{val.courseName}</h1>
                            {/* <span>{val.course}</span> */}
                        </div>
                    ))}

                </section>
            </div>
        </div>
    )
}

export default pagestudent;
