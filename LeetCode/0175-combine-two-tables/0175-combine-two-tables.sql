select P.firstName, P.lastName, A.city, A.state
from Person p
left join Address A
ON P.personId = A.personId;